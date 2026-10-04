class DiagonalSum {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int p = 0;
        int s = 0;

        for (int i = 0; i < 3; i++) {
            p = p + a[i][i];
            s = s + a[i][2 - i];
        }

        System.out.println("Principal diagonal sum = " + p);
        System.out.println("Secondary diagonal sum = " + s);
        System.out.println("Total = " + (p + s));
    }
}
