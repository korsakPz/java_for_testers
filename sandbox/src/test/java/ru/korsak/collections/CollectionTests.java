package ru.korsak.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTests {

    @Test
    void arrayTests(){
        var array = new String[]{"a","b","c"};
        Assertions.assertEquals(3, array.length);

        array[0] = "a";
        Assertions.assertEquals("a",array[0]);

        array[0] = "d";
        Assertions.assertEquals("d",array[0]);

    }

    @Test
    void listTests() {
        //var list = List.of("x", "w", "z");
        var list = new ArrayList<>(List.of("x", "w", "z"));

        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals("x", list.get(0));

        list.set(0, "z");
        Assertions.assertEquals("z", list.get(0));

    }
}
