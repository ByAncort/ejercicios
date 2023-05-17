package verificador;
import java.util.Scanner;

public class Verificador {


    public static void main(String[] args) {

  
 Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese el RUT sin dígito verificador:");
        String rut = myObj.nextLine();

        int sum = 0;
        int multiplier = 2;

        // Calcula la suma ponderada de los dígitos del RUT
        for (int i = rut.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(rut.charAt(i));
            sum += digit * multiplier;
            multiplier = (multiplier % 7 == 0) ? 2 : multiplier + 1;
        }

        int remainder = sum % 11;
        int identifier = 11 - remainder;

        String identifierDigit;
        if (identifier == 11) {
            identifierDigit = "0";
        } else if (identifier == 10) {
            identifierDigit = "K";
        } else {
            identifierDigit = String.valueOf(identifier);
        }

        String fullRut = rut + "-" + identifierDigit;
        System.out.println("RUT completo: " + fullRut);
    }
        
        
    }
