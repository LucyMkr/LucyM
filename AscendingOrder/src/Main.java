public class Main {
    public static void main(String[] args) {
        int[] arr = AscendingOrder(new int[]{5, 5 , 5 , 12, 12, -23, -23});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] AscendingOrder(int[] myArr){
        int t;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] > myArr[j]) {
                    t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }
            }
        }
        return myArr;

    }

}