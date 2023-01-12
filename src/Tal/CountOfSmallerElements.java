package Tal;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        long n = 7;
        long a[] = {1, 2, 2, 2, 5, 7, 9};
        long k = 2;

        CountOfSmallerElementsSolution obj = new CountOfSmallerElementsSolution();
        System.out.println(obj.countOfElements(a, n, k));
    }
}
