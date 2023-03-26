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

   @Mock
    Feline feline;
    @Test
    public void getSoundTest() {
        feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        Assert.assertEquals("Звук кошки - Мяу", "Мяу", cat.getSound());
    }
    @Spy
    Feline felineS;
    @Test
    public void getFoodCatTest() throws Exception {
        felineS = new Feline();
        Feline felineSpy  = Mockito.spy(felineS);
        Cat cat = new Cat(felineSpy);
        Assert.assertEquals("Кошки - это хищники.", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
