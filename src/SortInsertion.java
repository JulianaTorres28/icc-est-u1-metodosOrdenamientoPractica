public class SortInsertion {

    public SortInsertion() {
    }

    public void sort(int[] numeros, boolean ascendente, boolean pasos, View view) {
        if (ascendente) {
            sortAscendente(numeros, pasos, view);
        } else {
            sortDescendente(numeros, pasos, view);
        }
    }

    public void sortAscendente(int[] numeros, boolean pasos, View view) {
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];

            if (pasos) {
                System.out.println("i: " + i + " ,j: " + j + " ,aux:" + aux);
            }

            while (j >= 0 && numeros[j] > aux) {
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);

                numeros[j + 1] = numeros[j];
                if (pasos)
                    view.printArray(numeros);

                j--;
                if (pasos)
                    System.out.println("Mueve numeros[ " + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }

            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.print("Estado Actual: ");
                view.printArray(numeros);
            }
        }
    }

    public void sortDescendente(int[] numeros, boolean pasos, View view) {
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int aux = numeros[i];

            if (pasos) {
                System.out.println("i: " + i + " ,j: " + j + " ,aux:" + aux);
            }

            while (j >= 0 && numeros[j] < aux) {
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con numeros[" + j + "]: " + numeros[j]);

                numeros[j + 1] = numeros[j];
                if (pasos)
                    view.printArray(numeros);

                j--;
                if (pasos)
                    System.out.println("Mueve numeros[ " + (j + 1) + "] a numeros [" + (j + 2) + "]");
            }

            numeros[j + 1] = aux;
            if (pasos) {
                System.out.println("Inserta aux: " + aux + " en la posicion " + (j + 1));
                System.out.print("Estado Actual: ");
                view.printArray(numeros);
            }
        }
    }

}
