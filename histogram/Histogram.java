public class Histogram {
    public static int[] histogram(int[][] a, int high) {
        int[] hist = new int[high + 1];
        for (int i = 0; i <= high; i++) {
            hist[i] = 0;
        }
        System.out.println(hist);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                hist[a[i][j]] += 1;
            }
        }
        return hist;
    }
    public static void main(String[] args) { 
        int[][] a = {{0,1,2,3,2},{1,2,3,2,1},{2,3,2,1,0}};
        System.out.println(histogram(a, 3));
        System.out.println("Hello, World");
    }
}
