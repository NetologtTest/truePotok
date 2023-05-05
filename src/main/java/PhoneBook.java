import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    protected int count = 0;
    protected Map<String, String> map = new HashMap<>();

    public int add(String name, String number) {
        if (!map.containsKey(name) || !map.containsValue(number)) {

            map.put(name, number);
            count++;
        }

        return count;
    }

    public String findByNumber(String name) {
        return map.get(name);
    }
}
