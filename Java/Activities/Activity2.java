package activities;

public class Activity2 {

    public static void main(String[] args) {
        int[] i = {10, 77, 10, 54, -11, 10};

        int searchNum = 10;
        int totalNum = 30;

        System.out.println("Result: " + result(i, searchNum, totalNum));
            }

    public static boolean result(int[] numbers, int searchNum, int totalNum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > totalNum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == totalNum;
    }
}
