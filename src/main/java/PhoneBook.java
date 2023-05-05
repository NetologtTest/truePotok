import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    protected Map<String, String> map = new HashMap<>();

    public int add(String number, String name) {
        if (!map.containsKey(number)) {

            map.put(number, name);
        }

        return map.size();
    }

    public String findByNumber(String name) {
        return map.entrySet().stream().filter((x) -> x.getValue().equals(name)).map(Map.Entry::getKey).findFirst().get();
    }


    public String findByName(String number) {
        return map.get(number);

    }

    public List<String> printAllNames() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        return list;
    }
}
