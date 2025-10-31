public class SortBubble {

    public SortBubble() {
    }

    public void sort(int[] numero, boolean ascendente, boolean pasos, View view) {
        if (ascendente) {
            sortAscendente(numero, pasos, view);
        } else {
            sortDescendente(numero, pasos, view);
        }
    }

    public void sortAscendente(int[] numeros, boolean pasos, View view) {
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;

            if (pasos) {
                System.out.println("Iteración externa i = " + i);
            }

            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (pasos) {
                    System.out.println("  Compara numeros[" + j + "] = " + numeros[j] + " con numeros[" + (j + 1)
                            + "] = " + numeros[j + 1]);
                }

                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    swapped = true;

                    if (pasos) {
                        System.out.println("  Intercambia → [" + j + "] y [" + (j + 1) + "]");
                        System.out.print("  Estado actual: ");
                        view.printArray(numeros);
                    }
                }
            }

            if (!swapped) {
                if (pasos) {
                    System.out.println("  No hubo intercambios, el arreglo ya está ordenado.");
                }
                break;
            }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos, View view) {
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;

            if (pasos) {
                System.out.println("Iteración externa i = " + i);
            }

            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (pasos) {
                    System.out.println("  Compara numeros[" + j + "] = " + numeros[j] + " con numeros[" + (j + 1)
                            + "] = " + numeros[j + 1]);
                }

                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    swapped = true;

                    if (pasos) {
                        System.out.println("  Intercambia → [" + j + "] y [" + (j + 1) + "]");
                        System.out.print("  Estado actual: ");
                        view.printArray(numeros);
                    }
                }
            }

            if (!swapped) {
                if (pasos) {
                    System.out.println("  No hubo intercambios, el arreglo ya está ordenado.");
                }
                break;
            }
        }
    }

}
