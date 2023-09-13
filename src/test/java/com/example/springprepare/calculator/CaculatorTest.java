package com.sparta.springprepare.calculator;

import com.example.springprepare.calculator.Caculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CaculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Caculator calculator = new Caculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Caculator calculator = new Caculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test3() {
        Caculator calculator = new Caculator();
        Double result = calculator.operate(8, "*", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(16, result);
    }
}