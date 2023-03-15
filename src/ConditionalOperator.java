public class ConditionalOperator {
       public static void main(String[] args) {
//            int temp = 30;
//            if (temp > 25) {
//                System.out.println("Кондиционер включен");
//            } else if (temp < 22) {
//                System.out.println("Кондиционер выключен");
//            } else {
//                System.out.println("Кондиционер ничего не делает");


//           int temp = 30;
//           boolean hot  = temp >= 25;
//           boolean cold = temp <= 22;
//           int time = 23;
//           boolean isNight = time  > 22 || time < 6;
//           if (hot && !isNight) {
//               System.out.println("Кондиционер включен");
//           } else if (cold) {
//               System.out.println("Кондиционер выключен");
//           } else {
//               System.out.println("Кондиционер ничего не делает");

           boolean isGoodWeather = false;
           boolean isNight = true;
           if (isNight) {
               System.out.println("Спать");
           }
           if (!isNight && isGoodWeather) {
               System.out.println("Гулять");
           }
           if (!isNight && !isGoodWeather) {
               System.out.println("Читать книгу");

           }

       }
}