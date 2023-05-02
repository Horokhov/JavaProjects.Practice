public class BinarySearch {
    public static void main(String[] args) {

        int[] ints = {1,2,3,4,5,6,8,9,10};
        System.out.println(binarySearch(ints, 9));
    }
    private static int binarySearch(int[] numbers, int numberToFind) {
        int leftPointer = 0;
        int rightPointer = numbers.length-1;

        while(leftPointer <= rightPointer) {
            int middleIndex = (leftPointer+rightPointer)/2;
            int middleNumber = numbers[middleIndex];

            if(numberToFind == middleNumber) {
                return middleIndex;
            }
            if(numberToFind<middleNumber) {
                rightPointer = middleIndex - 1;
            }else{
                leftPointer = middleIndex + 1;
            }
        }
        return -1;
    }
}
