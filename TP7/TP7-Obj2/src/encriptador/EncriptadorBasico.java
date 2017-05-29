package encriptador;

public class EncriptadorBasico extends EncriptadorNaive {

	@Override
	public String encriptar(String texto) {
		return reversa(texto);		
	}
	
	private String reversa(String texto) {
	    char[] in = texto.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}

	@Override
	public String desencriptar(String texto) {
		return reversa(texto);
	}

}
