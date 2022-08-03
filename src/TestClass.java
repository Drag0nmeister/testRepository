import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestClass {
    public static void main(String[] args) {
        currentDate();
    }
   public static void currentDate(){
       System.out.println(LocalDate.now());
    LocalTime localTime = LocalTime.now();
       System.out.println("Сейчас " + localTime + " пора спать");
    }

}
