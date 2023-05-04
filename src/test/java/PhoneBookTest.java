import org.hamcrest.Matcher;
import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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

        phoneBook.add(name, number);
        mapTest = phoneBook.map;
        assertThat(mapTest, not(IsMapContaining.hasEntry("Имя", "7777777")));
    }

}


