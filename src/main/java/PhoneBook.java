import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private final HashMap<String, HashSet<String>> hmPhoneBook;

    public PhoneBook () {
        hmPhoneBook = new HashMap<>();
    }

    public void add (String fio, String phone) {
        if (!hmPhoneBook.containsKey(fio)) {
            hmPhoneBook.put(fio, new HashSet<>());
        }
        hmPhoneBook.get(fio).add(phone);
    }

    public Set<String> getPhoneNumbersByFio (String fio) {
        return hmPhoneBook.get(fio);
    }

    public Set<String> getAllFio () {
        return hmPhoneBook.keySet();
    }

    }
