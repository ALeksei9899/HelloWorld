public class Array {
    public static void main(String[] args) {
//        String[] namesOfMonths = new String[12];
//        namesOfMonths[0] = "January";
//        namesOfMonths[1] = "February";
//        namesOfMonths[2] = "March";
//        namesOfMonths[3] = "April";
//        namesOfMonths[4] = "May";
//        namesOfMonths[5] = "June";
//        namesOfMonths[6] = "July";
//        namesOfMonths[7] = "August";
//        namesOfMonths[8] = "Sertember";
//        namesOfMonths[9] = "October";
//        namesOfMonths[10] = "November";
//        namesOfMonths[11] = "December";
//        for (int i = 0; i < namesOfMonths.length; i++) {
//            System.out.print(namesOfMonths[i]);
//            if (i < namesOfMonths.length - 1) {
//                System.out.print(", ");
//            } else {
//                System.out.print(".");
//            }
//        }
        int[] numbers = {4, 1, 34, 45, 13, 13};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }

    }
}