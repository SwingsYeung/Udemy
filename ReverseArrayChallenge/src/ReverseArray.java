public class ReverseArray {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8};
        reverse(a);
    }
    private static void reverse(int[] array) {
        System.out.print("Array = [");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]);
            if (i+1 < array.length) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        int test = array.length-1;
        int[] reverseArray = array;
        for (int i=0; i< array.length /2; i++) {
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length -i -1];
            reverseArray[reverseArray.length -i -1] = temp;
        }
        System.out.println("");
        System.out.print("Reversed Array = [");
        for (int i=0; i<array.length; i++) {
            System.out.print(reverseArray[i]);
            if (i+1 < array.length) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }

    }
}
