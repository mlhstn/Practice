package week2;

public class TekrarEdenCiftSayi {
    static boolean isFind(int[] arr, int value){

        for (int i : arr){
            if (i == value){
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {2,2,5,4,7,9,8,4,3,5,1,8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j] && list[i] % 2 == 0 )){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
