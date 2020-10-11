import java.util.Calendar;
 
public class CalenderApp {
 
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
 
        System.out.println("Current year is :- " + calendar.get(Calendar.YEAR));
        System.out.println("Current month is :- " + calendar.get(Calendar.MONTH));
        System.out.println("Current date is :- " + calendar.get(Calendar.DATE));
 
        int year = 1993;
        int month = 8;
        int date = 27;
 
        calendar.set(year, month, date);
 
        System.out.println("Changed year is :- " + calendar.get(Calendar.YEAR));
        System.out.println("Changed month is :- " + calendar.get(Calendar.MONTH));
        System.out.println("Changed date is :- " + calendar.get(Calendar.DATE));
    }
}
