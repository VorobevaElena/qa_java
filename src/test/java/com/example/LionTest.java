package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest{
     Predator predator = new Feline();

    @Test
    public void doesHaveManeLionException() {
        try {
            Lion lion = new Lion("НЕсамец", predator);
        } catch (Exception exception) {
            assertEquals("При создании класса Lion использовался не верный аргумент", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самка", predator);
        Assert.assertEquals("Лев относится к хищникам, питается мясом", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", predator);
        Assert.assertEquals("Передав пол Самец, ожидаем значение true ", true, lion.doesHaveMane());
    }
    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самец", predator);
        int actual = lion.getKittens();
        assertEquals("Вызывая метод ожидаем: 1 ", 1, actual);
    }

}