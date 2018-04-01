package com.company;

import java.util.Scanner;

public class ColLesson02 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[10];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");

        //テスト用
        //for(int i=0; i<3;i++){
        for(int i=0; i<10;i++){
            Scanner sc  = new Scanner(System.in);
            String input = sc.nextLine();

            if(!input.equals("e")){
                // ここから記述してください
                // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
                String[] tmp = input.split(" ");

                Word word = new Word();
                word.setWord(tmp[0]);
                word.setMeaning(tmp[1]);
                words[i] = word;

                System.out.println("次の単語と意味を入力して下さい。”e”で終了します。");
            }else{
                sc.close();
                for(int j=0; j<i; j++){
//                    words[j].toString(words[j].getWord(),words[j].getMeaning());
                    System.out.println(words[j].toString());
                }
                System.out.println(i + "件、登録しました。");
                break;
            }
        }
    }
}