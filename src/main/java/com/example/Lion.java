package com.example;

import java.util.List;

public class Lion {
    private Predator predator;
    boolean hasMane;
    public Lion(String sex, Predator predator) throws Exception {
        {
            this.predator = predator;
        }

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }



    public int getKittens() {
         return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.getFood("Хищник");
    }
}
