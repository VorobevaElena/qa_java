package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetFoodsAnimalWithParameterized {

    private final String animalKind;
    private final List expected;

    public GetFoodsAnimalWithParameterized(String animalKind, List expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void shouldCheckGetFood() throws Exception {
        Animal animal = new Animal();
        List actual = animal.getFood(animalKind);
        assertEquals("Питание каждого вида отличается (getFood для класса Animal)", expected, actual);
    }

}
