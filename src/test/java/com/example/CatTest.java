package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline feline;
    @Test
    public void getSoundTest() {
        feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Звук кошки - Мяу", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatTest() throws Exception {
        feline = new Feline();
        Feline felineSpy  = Mockito.spy(feline);
        Cat cat = new Cat(felineSpy);
        Assert.assertEquals("Кошки - это хищники.", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
