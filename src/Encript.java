
public class Encript {
	String mensaje="HEIL PACO";
	String palabras[];
	String mensajeCifrado="";
	public Encript(){
		palabras=mensaje.split("");
		
		
	}
	public void encriptaMensaje(){
			for(int i = palabras.length-1; i >=0;i--){
				palabras[i]=palabras[i].substring(palabras[i].length()/2, palabras[i].length())+palabras[i].substring(0, palabras[i].length()/2);
				mensajeCifrado+=palabras[i];
			}
	}
	public void muestraMensaje(){
		System.out.println(mensajeCifrado);
	}
		
}

