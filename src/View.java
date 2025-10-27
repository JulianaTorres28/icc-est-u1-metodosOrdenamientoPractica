import java.util.Scanner;

public class View {

    //Variable global privada para el scanner
    private final Scanner scanner;

    public View(){
        System.out.println("Metodos Ordenamiento");
        scanner = new Scanner(System.in);
    }

    public void showMenu(){
        System.out.println("\n--Menú métodos--");
        System.out.println("1. Selection");
        System.out.println("2. Insertion");
        System.out.println("3. Bubble");
        System.out.println("4. Salir");
        System.err.print("Seleccione la opcion: ");
    }

    public int inputOption(int max ){
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                //si ingreso un numero
                option = scanner.nextInt();
                if (option >= 1 && option <= max) 
                    break;
            } else {
                scanner.next();
            }
            System.out.print("Opción inválida, ingrese otra vez: ");
        }
        return option;
    }

    public void showOrderMenu(){
        System.out.println("Seleccione el orden");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        System.err.print("Seleccione la opcion: ");
    }

    public void showPasosMenu(){
        System.out.println("-Quiere ver los pasos-");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.err.print("Seleccione la opcion: ");
    }
}
