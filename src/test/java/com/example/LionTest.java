package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest{
     @Mock
     Feline feline;
     @Test (expected = Exception.class)
    public void doesHaveManeLionException() throws Exception {

           new Lion("НЕсамка", feline);

    }
    @Test
    public void getFoodLionTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        assertEquals(food, lion.getFood());
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
       assertEquals("Передав пол Самец, ожидаем значение true ", true, lion.doesHaveMane());
    }
    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

}