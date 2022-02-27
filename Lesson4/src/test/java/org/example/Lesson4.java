package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson4 {

    @Test
     void Test() throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertEquals(50,exampleClass.someMethod(10,10));
        Assertions.assertThrows(MyException.class,()-> exampleClass.someMethod(-10,20));
    }

}
