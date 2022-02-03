public class PersonaDi implements Comparable<PersonaDi> {
	String nombre;
	String apellido;
	String alias;
	char tipoTel;
	int clavePais;
	String numeroTel;
	//Constructor de las personas del directorio
	public PersonaDi (String n, String a, String al, char tipo, int c, String num ){
		nombre = n;
		apellido=a;
		alias=al;
		tipoTel=tipo;
		clavePais=c;
		numeroTel=num;
	}
	//Metodos varios
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public char getTipoTel() {
		return tipoTel;
	}
	public void setTipoTel(char tipoTel) {
		this.tipoTel = tipoTel;
	}
	public int getClavePais() {
		return clavePais;
	}
	public void setClavePais(int clavePais) {
		this.clavePais = clavePais;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	//Metodo toString
	public String toString(){
		return nombre+""+"\t\t"+""+ apellido+""+"\t\t"+alias+""+"\t\t\t\t"+tipoTel+""+"\t\t"+clavePais+""+"\t\t"+numeroTel;
	}
	//Metodo para decir como vamos a ordenar la lista
	public int compareTo(PersonaDi p) {
		return nombre.compareTo(p.getNombre());
	}

}
