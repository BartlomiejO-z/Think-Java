public class Data {

    public static void main(String[] args) {
        System.out.println("321, Hello Bartek!");
        System.out.println("What date is today?");

        String day;
        String day2;
        int date;
        String month;
        String month2;
        int year;

        day = "Tuesday, ";
        day2 = "Tuesday ";
        month = "june ";
        month2 = " june ";
        date = 9;
        year = 2020;

        // American format
        System.out.print(day);
        System.out.print(month);
        System.out.print("9, ");
        System.out.print(year);

        // European format

        System.out.println();

        System.out.print(day2);
        System.out.print(date);
        System.out.print(month2);
        System.out.print(year);



    }
}
