import java.util.Scanner;

public class Ej7 {
    public static void main (String[] args){
        System.out.println("Datos a rellenar");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce tu apellido");
        String apellido = lector.nextLine();
        System.out.println("Introduce tu ciudad");
        String ciudad = lector.nextLine();
        System.out.println("Introduce tu edad");
        int edad = lector.nextInt();

        System.out.println("¡Hola! Me llamo "+nombre+ " " +apellido);
        System.out.println("Tengo "+edad+ " años y vivo en "+ciudad);

    }
}
