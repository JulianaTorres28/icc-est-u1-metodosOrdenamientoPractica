public class SortSelection {

    public SortSelection() {
    }

    public void sort(int[] numeros, boolean ascendente, boolean pasos, View view) {
        if (ascendente) {
            sortAscendente(numeros, pasos, view);
        } else {
            sortDescendente(numeros, pasos, view);
        }
    }

    public void sortAscendente(int[] numeros, boolean pasos, View view) {
        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;

            if (pasos) {
                System.out.println("Iteración i = " + i);
            }

            for (int j = i + 1; j < numeros.length; j++) {
                if (pasos) {
                    System.out.println("  Compara numeros[" + j + "] = " + numeros[j] + " con numeros[" + indiceMenor
                            + "] = " + numeros[indiceMenor]);
                }

                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                    if (pasos) {
                        System.out.println("  Nuevo menor encontrado en posición " + j);
                    }
                }
            }

            if (i != indiceMenor) {
                int aux = numeros[indiceMenor];
                numeros[indiceMenor] = numeros[i];
                numeros[i] = aux;

                if (pasos) {
                    System.out.println("  Intercambia numeros[" + i + "] con numeros[" + indiceMenor + "]");
                    System.out.print("  Estado actual: ");
                    view.printArray(numeros);
                }
            } else if (pasos) {
                System.out.println("  No se necesita intercambio");
            }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos, View view) {
        for (int i = 0; i < numeros.length; i++) {
            int indiceMayor = i;

            if (pasos) {
                System.out.println("Iteración i = " + i);
            }

            for (int j = i + 1; j < numeros.length; j++) {
                if (pasos) {
                    System.out.println("  Compara numeros[" + j + "] = " + numeros[j] + " con numeros[" + indiceMayor
                            + "] = " + numeros[indiceMayor]);
                }

                if (numeros[j] > numeros[indiceMayor]) {
                    indiceMayor = j;
                    if (pasos) {
                        System.out.println("  Nuevo mayor encontrado en posición " + j);
                    }
                }
            }

            if (i != indiceMayor) {
                int aux = numeros[indiceMayor];
                numeros[indiceMayor] = numeros[i];
                numeros[i] = aux;

                if (pasos) {
                    System.out.println("  Intercambia numeros[" + i + "] con numeros[" + indiceMayor + "]");
                    System.out.print("  Estado actual: ");
                    view.printArray(numeros);
                }
            } else if (pasos) {
                System.out.println("  No se necesita intercambio");
            }
        }
    }

}
