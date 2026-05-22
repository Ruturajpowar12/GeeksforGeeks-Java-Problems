import java.time.*;
class Solution {
    static String findDay(int Day, int Month, int Year) {
        // Code Here
        
         LocalDate date = LocalDate.of(Year, Month, Day);

        return date.getDayOfWeek().toString();
    }
}