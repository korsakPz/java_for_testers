package ru.korsak.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CollectionTests {

    @Test
    void arrayTests(){
        //var array = new String[]{"a","b","c"};
        var array = new String[3];
        Assertions.assertEquals("a",array[0]);

        array[0] = "d";
        Assertions.assertEquals("d",array[0]);

    }
}
