package org.example;

public class QuickSort {
    /*
     * Diese Methode implementiert den QuickSort-Algorithmus, wie in den
     * Vorlesungen beschrieben.
     * @param arr Das zu sortierende Array
     */
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /*
     * Diese Methode implementiert den QuickSort-Algorithmus. Sie nimmt das Array und
     * sortiert es rekursiv, nachdem ein 'Pivot'-Element ausgewählt wurde, das zur
     * Partitionierung des Arrays in zwei Teilarrays verwendet wird.
     * @param arr Das zu sortierende Array
     * @param low Die untere Grenze des zu sortierenden Arrays
     * @param high Die obere Grenze des zu sortierenden Arrays
     */
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /*
     * Diese Methode wählt ein Pivot-Element aus und ordnet dann das Array so um, dass
     * alle Elemente kleiner als das Pivot links davon und alle größeren
     * Elemente rechts davon sind.
     * @param arr Das zu sortierende Array
     * @param low Die untere Grenze des zu sortierenden Arrays
     * @param high Die obere Grenze des zu sortierenden Arrays
     * @return Das Pivot-Element
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    /*
     * Diese Methode tauscht zwei Elemente in einem Array aus.
     * @param arr Das Array, in dem die Elemente getauscht werden
     * @param i Der Index des ersten Elements
     * @param j Der Index des zweiten Elements
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}