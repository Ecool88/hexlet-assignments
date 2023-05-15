package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble (String symbols1, String symbols2) {
        if (symbols1 == "") {
            return false;
        }

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (String symbol : symbols1.split("")) {
            list1.add(symbol.toLowerCase());
        }
        for (String symbol : symbols2.split("")) {
            list2.add(symbol.toLowerCase());
        }

        for (var symbol : list2) {
            var position = list1.indexOf(symbol);
            if (position == -1) {
                return false;
            } else {
                list1.remove(position);
            }
        }

        return true;
    }
}
//END

