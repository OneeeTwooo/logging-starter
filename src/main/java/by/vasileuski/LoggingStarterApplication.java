package by.vasileuski;

public class LoggingStarterApplication {

    public static void println(final String message) {
        System.out.println("Вызвано из библиотеки gradle: " + message);
    }
}