package app;


public class Main {
    public static void main(String[] args) {

//        тест судоку
//        int[][] matrix = {
//                {11, 11, 11, 11},
//                {11, 11, 11, 11},
//                {11, 11, 11, 11},
//                {11, 11, 11, 11}

        int[][] matrix = {
                {11, 2, 33, 22},
                {24, 15, 6, 31},
                {17, 18, 9, 45},
                {27, 38, 19, 41}
        };
        System.out.println("Матриця 4x4:");


        printMatrix(matrix);
        sumaParn(matrix);
        sumaNeParn(matrix);
        dobutokParnSt(matrix);
        dobutokNeParnSt(matrix);
        sudoku(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumaParn(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }

            }

        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sum);
    }

    public static void sumaNeParn(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {

                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }

            }

        }
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sum);
    }

    public static void dobutokParnSt(int[][] matrix) {
        long dob = 1;

        for (int i = 0; i < matrix.length; i++) {


            for (int j = 0; j < matrix[i].length; j++) {

                if (j % 2 == 0) {
                    dob *= matrix[i][j];
                }

            }

        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2):" + dob);
    }

    public static void dobutokNeParnSt(int[][] matrix) {
        long dob = 1;

        for (int i = 0; i < matrix.length; i++) {


            for (int j = 0; j < matrix[i].length; j++) {

                if (j % 2 != 0) {
                    dob *= matrix[i][j];
                }

            }

        }
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3):" + dob);
    }

    public static void sudoku(int[][] matrix) {
        int n = matrix.length;

        int targetSum = 0;
        for (int j = 0; j < n; j++) {
            targetSum += matrix[0][j];
        }

        boolean isMagic = true;


        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) {
                isMagic = false;
                break;
            }
        }


        if (isMagic) {
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != targetSum) {
                    isMagic = false;
                    break;
                }
            }
        }


        if (isMagic) {
            int mainDiagSum = 0;
            for (int i = 0; i < n; i++) {
                mainDiagSum += matrix[i][i];
            }
            if (mainDiagSum != targetSum) {
                isMagic = false;
            }
        }


        if (isMagic) {
            int secondaryDiagSum = 0;
            for (int i = 0; i < n; i++) {
                secondaryDiagSum += matrix[i][n - 1 - i];
            }
            if (secondaryDiagSum != targetSum) {
                isMagic = false;
            }
        }


        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}







