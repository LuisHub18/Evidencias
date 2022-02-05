import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ConexionPostgreSQL {
       
    public static void main(String[] args) {
        Connection conexion=null;
        String url="jdbc:postgresql://localhost:5432/nomina_2021";
        String user="postgres";
        String password="25DPR0956Z";
        Statement st;
        ResultSet rs;
        try{
            Class.forName("org.postgresql.Driver");
            conexion= DriverManager.getConnection(url,user,password);
            System.out.println("Conectado");
        }catch (Exception ex){
            System.out.println("No");
        }
        List<Actividades> listAct = new ArrayList<>();
        try {
            st=conexion.createStatement();
            String sql="SELECT codigo,nombre FROM actividades ORDER BY codigo;";
            rs=st.executeQuery(sql);
            
           
            while(rs.next()) {
                Integer codigo=rs.getInt("codigo");
                String nombre=rs.getString("nombre");
                listAct.add(new Actividades(codigo,nombre));
            }
            rs.close();
            st.close();
            conexion.close();
            
           
        } catch (Exception ex) {
                System.out.println("Noaaaaaaaaa");
            
        }
        for (int j = 0; j < listAct.size(); j++) {
            System.out.println(listAct.get(j));
        }
    
    }
    
}