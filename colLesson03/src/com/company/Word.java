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

    public void toString(String word,String meaning) {
        System.out.println("単語:"+ word +" 意味:"+ meaning);
    }


}