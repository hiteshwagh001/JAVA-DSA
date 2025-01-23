class Patterns {

    public void block(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }

    public void leftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

    void leftNumberTriangle1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

    void leftNumberTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

    void inverseLeftTraingle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    void inverseLeftNumberTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n - j + 1);
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

    void inversePyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }

    void upperAndLowerPyramid(int n) {
        for (int i = 0; i < n * 2 - 1; i++) {
        }
    }

}

class StarPattern {
    public static void main(String[] args) {
        int n = 5;

        Patterns obj = new Patterns();
        obj.block(n);
        obj.leftTriangle(n);
        obj.leftNumberTriangle1(n);
        obj.leftNumberTriangle2(n);
        obj.inverseLeftTraingle(n);
        obj.inverseLeftNumberTriangle(n);
        obj.pyramid(n);
        obj.inversePyramid(n);
    }
}