package com.company;

public class Word {
    public String word;
    public String meaning;


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "単語:"+ this.word +" 意味:"+ this.meaning;
    }

}