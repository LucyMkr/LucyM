public class Main {
    public static void main(String[] args) {
        ForArr myArr = new ForArr(new int[]{8, 16, 20, });
        int smallest = myArr.getSmallest(myArr.arr);
        System.out.println(myArr.getDivisor(myArr.arr));
    }

}

class ForArr {
    int[] arr;

    ForArr(int[] a) {
        arr = a;
    }

    int getSmallest(int[] theSmallest) {
        int t;
        for (int i = 0; i < theSmallest.length; i++) {
            for (int j = i + 1; j < theSmallest.length; j++) {
                if (theSmallest[i] > theSmallest[j]) {
                    t = theSmallest[i];
                    theSmallest[i] = theSmallest[j];
                    theSmallest[j] = t;
                }
            }
        }
        return theSmallest[0];
    }

    int getDivisor(int[] b) {
        int minimum = b[0];
        int largestDivisor = 1;
        while (minimum > 0) {
            boolean thereIsDivisor = true;
            for (int i = 0; i < b.length; i++) {
                if (b[i] % minimum != 0) {
                    thereIsDivisor = false;
                    break;
                }
            }
            if (thereIsDivisor) {
                largestDivisor = minimum;
                break;
            } else {
                minimum--;
            }
        }
        return minimum;
    }
}
