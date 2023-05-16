package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails (List<String> emails) {
        List<String> freeDomens = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return emails
                .stream()
                .filter(mail -> freeDomens.contains(mail.split("@")[1]))
                .count();
    }
}
// END
