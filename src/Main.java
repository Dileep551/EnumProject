import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        DayOfTheWeek weekDay = DayOfTheWeek.TUES;

        System.out.println(weekDay);

        for(int i = 0; i < 10; i ++){

            weekDay = getRandomDay();

            switchDayOfWeek(weekDay);

//            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.FRI){
//                System.out.println("Found Friday");
//            }
        }

        for (Topping topping : Topping.values()) {

            System.out.println(topping.name() +" "+topping.getPrice());
        }

    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){

        int weekDayInteger = weekDay.ordinal() + 1;

        System.out.print("-".repeat(30));

        System.out.println("weekDayInteger" + weekDayInteger);

        switch (weekDay){
            case WED -> System.out.println("Wednesday is the Day" + weekDayInteger);
            case SAT -> System.out.println("Saturday is the Day" + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        System.out.println("The random number I got is & Day " + randomInteger +" "+ allDays[randomInteger]);

        return allDays[randomInteger];


    }
}