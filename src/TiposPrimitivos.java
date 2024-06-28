//Número positivo, negativo o cero: Escribe un programa que lea un número y determine si es positivo, negativo o cero.
public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos primitivos enteros
        Enteros: byte, short, int, log
         */
        byte numeroByte = 10;
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 10;
        System.out.println("valor minimo Short: " + Short.MIN_VALUE);
        System.out.println("valor maximo Short: " + Short.MAX_VALUE);

        short numeroInt = 10;
        System.out.println("valor minimo Int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo Int: " + Integer.MAX_VALUE);

        long numeroLong = (int)534335345345345346L;
        System.out.println("valor minimo Long: " + Long.MIN_VALUE);
        System.out.println("valor maximo Long: " + Long.MAX_VALUE);

        /*
        Tipos primitivos flotantes
        float y double
         */

        float numeroFloat = (float) 111.32;
        System.out.println("valor minimo Float: " + Float.MIN_VALUE);
        System.out.println("valor maximo Float: " + Float.MAX_VALUE);



    }
}
