import java.util.SortedMap;
public class SwitchCase {
    public static void main(String[] args) {
        String nameOfMontch = "July";
        switch (nameOfMontch) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "Sempember":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown montch");
        }
    }
}
