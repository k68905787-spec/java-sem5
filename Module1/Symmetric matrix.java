class SymmetricMatrix {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = false;
                }
            }
        }

        if (flag)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not a Symmetric Matrix");
    }
}
