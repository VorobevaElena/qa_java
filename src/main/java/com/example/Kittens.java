package com.example;

import java.util.List;

public interface Kittens {
    int getKittens();
    int getKittens(int kittensCount);
    List<String> getFood() throws Exception;
}
