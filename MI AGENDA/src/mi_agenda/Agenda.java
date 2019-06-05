package mi_agenda;

public class Agenda {	
	//Atributos
	Contacto[] lista;	
	
	//Metodos Constructores
	public Agenda(int tamanio_agenda){
		this.lista= new Contacto[tamanio_agenda]; 
	}
	
	public Agenda(){
		this.lista= new Contacto[10]; 
	}	
	
	//Metodos
	
	//Metodo insertar contactos
	public void setContacto(Contacto c){		
		int indice=buscar_indice_vacio();
		for(int i=0;i<(this.lista).length;i++){
			if(indice<0){
				System.out.println("");
				System.out.println("Importante: Agenda llena!");
			}else {
				this.lista[indice]=c;
			}
		}
	}
	
	//Buscando un vacio
	private int buscar_indice_vacio() {		
		int indice=0;		
		while(this.lista[indice]!=null){			
			indice++;
			if(indice > (this.lista).length-1){
				return -1;
			}				
		}		
		return indice;				
	}
	
	//Metodo eliminar contacto
		public void eliminarContacto(String nombre) {
			boolean encontrado=false;
			for (int i=0;i<lista.length;i++) {
				if (!encontrado && this.lista[i]!=null && this.lista[i].getNombre().equalsIgnoreCase(nombre)) {
					this.lista[i]=null;
					encontrado=true;
				}
			}
			if (!encontrado) {
				System.out.println("El contacto no existe");
			}
		}
		
		//Metodo editar contacto
		public void editarContacto(int indice,Contacto newc) {
			if (indice>0 && indice<=this.lista.length) {
				this.lista[indice-1]=newc;
			}else {
				 System.out.println("El contacto no existe");
				 }
		}
	
	//Metodo listar contactos
	public void listarContactos(){
		System.out.println("");
		System.out.println("Lista de contactos");
		for(int i=0;i<(this.lista).length;i++){
			if(this.lista[i]!=null){
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.lista[i]).DatosContacto();
			}
		}			
	}
	 
	//Metodo buscar contacto
	public void buscarContactos(String nombre) {
		boolean encontrado=false;
		 for (int i=0;i<lista.length;i++) {
			 if (!encontrado && this.lista[i]!=null && lista[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.lista[i]).DatosContacto();
				encontrado=true;
			 }
		 }
		 if (!encontrado) {
			 System.out.println("No se ha encontrado el contacto ingresado");
		 }
	}
	
}