import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        DayOfTheWeek weekDay = DayOfTheWeek.TUES;

        System.out.println(weekDay);

        for(int i = 0; i < 10; i ++){

            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

            if(weekDay == DayOfTheWeek.FRI){
                System.out.println("Found Friday");
            }
        }

    }

    public static DayOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];


    }
}