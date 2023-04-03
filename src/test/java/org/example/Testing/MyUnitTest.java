package org.example.Testing;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyUnitTest {


    @Test
    public  void testConcatenate (){
        //    Arrange
        MyUnit myUnit = new MyUnit();

        //    Act
        String result = myUnit.concatenate("one", "two");

//    Assert
        assertEquals("onetwo", result);


    }
}
