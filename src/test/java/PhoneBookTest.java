import org.hamcrest.Matcher;
import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();

        String name = "Имя";
        String number = "7777777";

        int countTest = phoneBook.add(name, number);
        Map<String, String> mapTest = new HashMap<>();
        mapTest = phoneBook.map;

        assertThat(mapTest, IsMapContaining.hasEntry("Имя", "7777777"));
        assertEquals(1, countTest);


    }

    @Test
    public void findByNumberTest() {
        PhoneBook phoneBook = new PhoneBook();


        String name = "Имя";
        String number = "7777777";

        phoneBook.add(name, number);
        phoneBook.add(number, name);

        String result = phoneBook.findByNumber(name);
        assertEquals(number, result);
    }

    @Test
    public void findByNameTest() {
        PhoneBook phoneBook = new PhoneBook();


        String name = "Имя";
        String number = "7777777";

        phoneBook.add(number, name);
        phoneBook.add(name, number);

        String result = phoneBook.findByName(number);
        assertEquals(name, result);
    }

    @Test
    public void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("7777", "АААААА");
        phoneBook.add("77777", "ББББББ");

        List<String> list = phoneBook.printAllNames();
        assertEquals(list.get(0), "АААААА");

    }
}


