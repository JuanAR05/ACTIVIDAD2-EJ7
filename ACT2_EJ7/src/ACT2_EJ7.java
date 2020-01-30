import java.io.*;

public class ACT2_EJ7 {
		/**Declaracion de variables
		 * 
		 * @param args
		 */
	public static void main(String[] args) {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaLeida;

		// 1) Declaracion de variables
		short shDorsal;
		float fPeso, fAltura;
		

		// 2) Pido dorsal
		shDorsal = pedirDorsal(teclado);

		// 3) Pido peso
		fPeso = pedirPeso(teclado);

		// 4) Pido altura
		fAltura = pedirAltura(teclado);

		// 2) Imprimir el resultado
		mostrarResultado(shDorsal, fPeso, fAltura);

	}
		/**
		 * @param shDorsal
		 * @param fPeso
		 * @param fAltura
		 * El Main, aqui devolvemos los valores que el usuario ha escrito
		 */
	private static void mostrarResultado(short shDorsal, float fPeso, float fAltura) {
		System.out.println("El dorsal número "+shDorsal+" mide "+fAltura+"m y pesa "+fPeso+"kg. ");
	}
		/**
		 * @param teclado
		 * Pedimos un dorsal al usuario
		 * @return
		 */
	private static short pedirDorsal(BufferedReader teclado) {
		String cadenaLeida;
		short shDorsal;
		System.out.println("Introduce el dorsal (1...9999): ");
		try {
			cadenaLeida = teclado.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}

		// Conversion String --> short
		shDorsal = Short.parseShort(cadenaLeida);
		return shDorsal;
	}
		/**
		 * @param teclado
		 * Pedimos la altura
		 * @return
		 */
	private static float pedirAltura(BufferedReader teclado) {
		String cadenaLeida;
		float fAltura;
		System.out.println("Introduce el altura (1.40 ... 2.10): ");
		try {
			cadenaLeida = teclado.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}

		// Conversion String --> short
		fAltura = Float.parseFloat(cadenaLeida);
		return fAltura;
	}
		/**
		 * @param teclado
		 * Pedimos ahora el peso
		 * @return
		 */
	private static float pedirPeso(BufferedReader teclado) {
		String cadenaLeida;
		float fPeso;
		System.out.println("Introduce el peso (40...150): ");
		try {
			cadenaLeida = teclado.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}

		// Conversion String --> short
		fPeso = Float.parseFloat(cadenaLeida);
		return fPeso;
	}

}
