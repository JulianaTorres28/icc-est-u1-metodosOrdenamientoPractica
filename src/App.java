public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            int[] numeros ={3, 4, 5, 5};
            switch (option) {
                case 1:
                    System.out.println("Método Seleccion");
                    view.showOrderMenu();
                    int orden = view.inputOption(2);
                    boolean ordenOpt = orden == 1;
                    view.showPasosMenu();
                    int pasos = view.inputOption(2);
                    MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
                    metodoSeleccion.sort(numeros, ordenOpt, pasos == 1);

                    break;
                case 2:
                    System.out.println("Método Inserción");
                    break;
                case 3:
                    System.out.println("Método Burbuja");
                    break;
                case 4:
                    System.out.println("Adiós");
                    System.exit(option);
                    break;
                default:
                    break;
            }


        }
    }
}
