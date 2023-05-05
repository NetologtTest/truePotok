import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    protected Map<String, String> map = new HashMap<>();

    public int add(String name, String number) {
        if (!map.containsKey(name)) {

            map.put(name, number);
        }

        return map.size();
    }

    public String findByNumber(String name) {
        return map.get(name);
    }


    public String findByName(String name) {
        return map.entrySet().stream().filter((x) -> x.getValue().equals(name)).map(Map.Entry::getKey).findFirst().get();
    }

}
