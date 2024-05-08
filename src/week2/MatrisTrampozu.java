package week2;

public class MatrisTrampozu {
    public static void main(String[] args) {

        int[][] matris = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] trampoz = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*****");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                trampoz[i][j] = matris[j][i];
                System.out.print(trampoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

