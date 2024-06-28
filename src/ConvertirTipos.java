import java.util.Scanner;

public class ConvertirTipos {
    public static void main(String[] args) {

        /*
        Convertir tipo String a int
         */

        var edades = Integer.parseInt("20");
        System.out.println("edad: " + (edades + 1));

        var PI = Double.parseDouble("3.145");
        System.out.println("pi: "+PI);

        System.out.println("edad: ");
        var consola = new Scanner(System.in);
        var edad = Integer.parseInt(consola.nextLine());
        System.out.printf("edad: "+(edad + 1));

        /*
        Convertir tipo int a String
         */
        var edadString = String.valueOf(20);


    }
}