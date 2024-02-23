public class Weekdays {

    public void nameOfDay(String code) {
        switch (code.toUpperCase()) {
            case "ONE":
                System.out.println("Monday");
                break;
            case "TWO":
                System.out.println("Tuesday");
                break;
            case "THREE":
                System.out.println("Wednesday");
                break;
            case "FOUR":
                System.out.println("Thursday");
                break;
            case "FIVE":
                System.out.println("Friday");
                break;
            case "SIX":
                System.out.println("Saturday");
                break;
            case "SEVEN":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}