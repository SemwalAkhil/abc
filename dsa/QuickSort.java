
public class QuickSort {
    static void sort(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            sort(a, low, p - 1);
            sort(a, p + 1, high);
        }
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[high];
        a[high] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3};
        sort(a, 0, a.length - 1);
        for (int x : a)
            System.out.print(x + " ");
    }
}
