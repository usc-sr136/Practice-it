class Grid {
    public static void main(String[] args) {
        printGrid(3, 6);
        printGrid(5, 3);
        printGrid(4, 1);
        printGrid(1, 3);
    }
    public static void printGrid(int row, int col) {
        for (int i = 1; i <= row; i++) {
            System.out.print(i);
            for (int j = 1; j < col; j++) {
                int next = i + row * i;
                System.out.print(", " + next);
            }

            System.out.println();

        }

    }

}
