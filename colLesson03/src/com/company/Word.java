package com.company;

public class Word {
    private String word;
    private String meaning;

    public Word(String word,String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
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

//    public void toString(String word,String meaning) {
//        System.out.println("単語:"+ word +" 意味:"+ meaning);
//    }
    @Override
    public String toString() {
        return "単語:"+ this.word +"意味:"+ this.meaning;
    }


}