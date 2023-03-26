package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest{

    @Test
    public void doesHaveManeLionException() {
        try {
            Lion lion = new Lion("НЕсамец");
        } catch (Exception exception) {
            assertEquals("При создании класса Lion использовался не верный аргумент", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самка");
        Assert.assertEquals("Лев относится к хищникам, питается мясом", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertEquals("Передав пол Самец, ожидаем значение true ", true, lion.doesHaveMane());
    }
    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens();
        assertEquals("Вызывая метод ожидаем: 1 ", 1, actual);
    }

}