package com.editor;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "word1='" + word1 + '\'' +
                ", word2='" + word2 + '\'' +
                '}';
    }

    private String word1;
    private String word2;

}
