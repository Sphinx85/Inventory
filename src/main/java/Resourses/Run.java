package Resourses;
import Config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.*;
import org.springframework.format.datetime.joda.LocalDateParser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        runProgram();
    }

    private static void runProgram() {
        System.out.println("Все работает!");
        User user1 = new User();
        user1.voice();
        //User user2 = sitdown.userSeat();
    }
}
