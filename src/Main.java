public class Main {
    public static void main(String[] args) {
        int result = 0;
        int[] intArray;
        intArray = new int[]{21, 44, 56, 28};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            result = result + intArray[i];
        }
        System.out.println(result/intArray.length);
    }
}