import jdk.jfr.Timespan;

public class Time {

    public static void main(String[] args) {
        System.out.println("123, Hello Bartek!");
        System.out.println("What time is it?");

        int hour = 15;
        int minute = 48;
        int second = 31;

        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);

        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour * 3600 + 2880 +31);

        // Number of seconds since midnight is 56911

        int hour2 = 8;
        int minute2 = 11;
        int second2 = 29;

        int secondMidnight = 56911;

        System.out.print("Number of second remaining in the day: ");
        System.out.println(hour2 * 3600 + 660 + 29);

        System.out.print("percentage of the day that has passed: ");
        System.out.println(secondMidnight * 100 / 84000) ;

        int hour3 = 17;
        int minute3 = 15;
        int second3 = 24;

        System.out.print("The finish time is: ");
        System.out.print(hour3);
        System.out.print(":");
        System.out.print(minute3);
        System.out.print(":");
        System.out.println(second3);

        System.out.print("finishSecond: ");
        System.out.println(hour3 * 3600 + 900 * 24);

        int a = 56911;
        int b = 82800;

        System.out.print(a - b);











    }
}
