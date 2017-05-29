package encriptador;

public class EncriptadorCopado extends EncriptadorNaive {

	@Override
	public String encriptar(String texto) {
		String res = "";
		int len = texto.length();
		char c;
		for (int i = 0; i < len; i++) {
			c = texto.charAt(i);
			c += 10;
			res += c;
		}
		return res;
	}

	@Override
	public String desencriptar(String texto) {
		String res = "";
		int len = texto.length();
		char c;
		for (int i = 0; i < len; i++) {
			c = texto.charAt(i);
			c -= 10;
			res += c;
		}
		return res;
	}

}
