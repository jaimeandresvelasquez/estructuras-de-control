import java.util.Scanner;

public class If_Switch {
    public static void main(String[] args) {
    //Número positivo, negativo o cero: Escribe un programa que lea un número y determine si es positivo, negativo o cero.
//        System.out.println("introduce un numero: ");
//        Scanner consola = new Scanner(System.in);
//        int numero = consola.nextInt();
//        if (numero == 0){
//            System.out.println("el numero << " + numero + " >> es cero");
//        } else if (numero > 0) {
//            System.out.println("el numero << " + numero + " >> es Positivo");
//        }else {
//            System.out.println("el numero << " + numero + " >> es Negativo");
//        }
    //Número par o impar: Escribe un programa que determine si un número ingresado es par o impar.
//        System.out.println("Introduce un numero: ");
//        Scanner consola = new Scanner(System.in);
//        int numero = consola.nextInt();
//        if (numero%2 == 0){
//            System.out.println("Numero par");
//        }else {
//            System.out.println("numero impar");
//        }

   //Año bisiesto: Escribe un programa que verifique si un año dado es bisiesto
//
//        System.out.println("Año: ");
//        Scanner consola = new Scanner(System.in);
//        String bisiesto = consola.nextLine();
//
//        String ultimoDosNumero = bisiesto.substring(2, 4);
//        int anoEntero = Integer.parseInt(ultimoDosNumero);
//
//        if (anoEntero % 4 == 0){
//            System.out.println("El Año " + bisiesto + " es bisiesto");
//        }else {
//            System.out.println("El Año " + bisiesto + " NO bisiesto");
//        }

    //Sistema de votación: Crea un programa que verifique si una persona puede votar,
    //tiene que ser mayor de 18 años y no haber cometido delitos en los últimos 5 años.

//        System.out.println("sistema de votación ");
//        System.out.println("ingrese su nombre: ");
//        Scanner consola = new Scanner(System.in);
//        String nombre = consola.nextLine();
//        System.out.println("Año de nacimiento: ");
//        Scanner consola2 = new Scanner(System.in);
//        int edad = consola2.nextInt();
//        System.out.println("ingrese a cometido algún delito true o false: ");
//        Scanner consola3 = new Scanner(System.in);
//        Boolean delito = consola3.nextBoolean();
//
//        int anoActual = 2024;
//
//        if ((anoActual-edad) >= 18){
//            if (!delito){
//                System.out.println("Sr "+nombre+" puedes votar");
//            }else {
//                System.out.println("Año del delito: ");
//                Scanner consola4 = new Scanner(System.in);
//                int delitoAno = consola4.nextInt();
//                if ((anoActual-delitoAno)>=5){
//                    System.out.println("Sr "+nombre+" puedes votar");
//                }else {
//                    System.out.println("no puedes votar -5 años para votar");
//                }
//            }
//        }else {
//            System.out.println("no puedes votar menor de edad");
//        }
    //Descuento en tienda: Calcula el precio final de un producto después de aplicar varios descuentos en función del tipo de cliente
    //(estudiante, adulto mayor, miembro VIP) y el monto total de la compra.
//
//        int desEstu = 10;
//        int desAdulto = 20;
//        int desVIP = 40;
//
//        System.out.println("nombre del cliente: ");
//        Scanner consola = new Scanner(System.in);
//        String nombre = consola.nextLine();
//        System.out.println("tipo de cliente: ");
//        System.out.println("A. Estudiante");
//        System.out.println("B. Adulto mayor");
//        System.out.println("C. VIP");
//        Scanner consola2 = new Scanner(System.in);
//        String cliente = consola2.nextLine();
//
//        System.out.println("Valor de la compra");
//        Scanner consola3 = new Scanner(System.in);
//        int compra = consola3.nextInt();
//
//        System.out.println("***** factura de venta *****");
//        System.out.println("");
//        System.out.println("cliente: "+nombre);
//        System.out.println("Valor compra: "+compra);
//        System.out.println("");
//        if ("A".equals(cliente)){
//            System.out.println("cliente Estudiante");
//            float descuento = (compra*(100-desEstu))/100;
//            System.out.println("descuento es de " + (compra - descuento));
//            System.out.println("valor a pagar"+descuento);
//        }else if ("B".equals(cliente)){
//            System.out.println("cliente Adulto mayor");
//            float descuento = (compra*(100-desAdulto))/100;
//            System.out.println("descuento es de " + (compra - descuento));
//            System.out.println("valor a pagar"+descuento);
//        }else if ("C".equals(cliente)){
//            System.out.println("cliente VIP");
//            float descuento = (compra*(100-desVIP))/100;
//            System.out.println("descuento es de " + (compra - descuento));
//            System.out.println("valor a pagar"+descuento);
//        }else {
//            System.out.println("Opcion equivocada");
//        }

    // Conversor de unidades: Implementa un conversor que convierta entre diferentes unidades de medida
    // (p.ej., metros a kilómetros, gramos a kilogramos).

//        System.out.println("conversor de unidades.");
//        System.out.println("unidades a convertir");
//        System.out.println("A. C => F");
//        System.out.println("B. F => C");
//        System.out.println("C. C => K");
//        System.out.println("D. K => C");
//        Scanner consola = new Scanner(System.in);
//        String op = consola.nextLine();
//        System.out.println("Temperatura es:");
//        Scanner consola2 = new Scanner(System.in);
//        int valTem = consola2.nextInt();
//        switch (op){
//            case "A":
//                System.out.println("la conversion de C a F es: ");
//                float F;
//                F=(((valTem*9)/5)+32);
//                System.out.println(F+" °F");
//                break;
//            case "B":
//                System.out.println("la conversion de F a C es: ");
//                float C;
//                C=(((valTem-32)*5)/9);
//                System.out.println(C+" °C");
//                break;
//            case "C":
//                System.out.println("la conversion de C a K es: ");
//                float K;
//                K=valTem+273;
//                System.out.println(K+" °K");
//                break;
//            case "D":
//                System.out.println("la conversion de K a C es: ");
//                C=valTem-273;
//                System.out.println(C+" °C");
//                break;
//            default:
//                System.out.println("opcion equivocada");
//                break;
//        }

    }
}
