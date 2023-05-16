package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans (List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted((user1, user2) -> {
                    LocalDate birtday1 = LocalDate.parse(user1.get("birthday"));
                    LocalDate birtday2 = LocalDate.parse(user2.get("birthday"));
                    return birtday1.compareTo(birtday2);
                })
                .map(user -> user.get("name"))
                .toList();
    }
}
// END
