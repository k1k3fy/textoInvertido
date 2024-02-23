package textoinvertido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();

        String textoAlReves = reverseString(texto);
        System.out.println("Texto al revés: " + textoAlReves);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();

	}

}
