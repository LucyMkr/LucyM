public class Main {
    public static void main(String[] args) {
        String sth = "chem gudum hinch kirem";
        char[] chars = sth.toCharArray();
        String revSth = new String();
        char t;
        for (int i = chars.length - 1; i >= 0; i--) {
            revSth += chars[i];
        }
       System.out.println(revSth);

        //..............................................................................................................
        for (int i = 0; i < chars.length/2; i++) {
            t = chars[i];
            chars[i] = chars[chars.length -i - 1];
            chars[chars.length -i - 1] = t;
        }
        System.out.println(chars);
    }
}
