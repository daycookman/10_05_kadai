package com.company;

public class Word {
    //フィールドの宣言
    //受け渡し役(DTO)はprivate
    //値を保存する場所
    private String word;
    private String meaning;

    //コンストラクタ
    //オブジェクトの初期値宣言
//    public Word(String word , String meaning){
//        this.setWord(word);
//        this.setMeaning(meaning);
//    }

    //getter,setterの設定
    //メソッド名の前が出口
    public String getWord() {
        return word;
    }
    //メソッド名の後ろ（）が入り口
    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }



}