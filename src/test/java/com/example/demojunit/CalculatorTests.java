package com.example.demojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {

    Calculator c = new Calculator();
   //Testfall 1
    @Test
    void ResultOfAdd(){
        //given
        int number1 = 2;
        int number2 = 3;
        //when

        int result = c.add(number1,number2);
        //then
        Assertions.assertEquals(5,result);
    }
    //Testfall 2
    @Test
    void ResultOfSubtract(){
    //given
        int number1 = 5;
        int number2 = 3;
    //when
        int result = c.subtract(number1, number2);
    //then
        Assertions.assertEquals(2,result);
    }
    //Testfall 3
    @Test
    void ResultOfMultiply(){
    //given
        int number1 = 5;
        int number2 = 3;
    //when
        int result = c. multiply(number1,number2);
    //then
        Assertions.assertEquals(14,result);
    }

    //Testfall 4
    @Test
    void ResultOfDivide(){
    //given
        int number1 = 6;
        int number2 = 3;
    //when
        double result = c.divide(number1,number2);
    //then
        Assertions.assertEquals(2,result);
    }

    //Testfall 5

    @Test
    void ResultOfSquareRootOf(){
    //given
        int number = 4;
    //when
        double result = c.squareRootOf(number);
    //then
        Assertions.assertEquals(2,result);
    }

    //Testfall 6
    @Test
    void ResultOfGetArea(){
    //given
        int number = 5;
    //when
        double result = c.getArea(number);
    //then
        Assertions.assertEquals(78.54,result);

    }

    //Testfall 7
    @Test
    void ResultOfGetArea_NotEquals(){
        //given
        int number = 4;
        //when
        double result = c.getArea(number);
        //then
        Assertions.assertNotEquals(78.54,result);

    }

    //Testfall 8
    @Test
    void ResultOfGetCircumference(){
    //given
        int number = 5;
    //when
        double result = c.getCircumference(number);
    //then
        Assertions.assertEquals(31.42,result);
    }
    //Testfall 9
    @Test
    void ResultOfGetCircumference_NotEquals(){
        //given
        int number = 4;
        //when
        double result = c.getCircumference(number);
        //then
        Assertions.assertNotEquals(31.42,result);
    }



}
