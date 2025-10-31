public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();

        final int[] original ={19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45};
        SortSelection sortSelection = new SortSelection();
        SortInsertion sortInsertion = new SortInsertion();
        SortBubble sortBubble = new SortBubble();

        while (true) {
            int[] numeros = original.clone(); 

            view.showMenu();
            int option = view.inputOption(4);

            if (option == 4) {
                System.out.println("Adiós");
                break; 
            }

            view.showOrderMenu();
            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.inputOption(2);

            switch (option) {
                case 1:
                    System.out.println("Método Seleccion");

                    System.out.print("Arreglo original: ");
                    view.printArray(numeros);

                    sortSelection.sort(numeros, ordenOpt, pasos == 1, view);

                    System.out.print("Arreglo final: ");
                    view.printArray(numeros);

                    break;

                case 2:
                    System.out.println("Método Insercion");

                    System.out.print("Arreglo original: ");
                    view.printArray(numeros);

                    sortInsertion.sort(numeros, ordenOpt, pasos == 1, view);

                    System.out.print("Arreglo final: ");
                    view.printArray(numeros);

                    break;
                case 3:
                    System.out.println("Método Burbuja");

                    System.out.print("Arreglo original: ");
                    view.printArray(numeros);

                    sortBubble.sort(numeros, ordenOpt, pasos == 1, view);

                    System.out.print("Arreglo final: ");
                    view.printArray(numeros);

                    break;
            }


        }
    }
}
