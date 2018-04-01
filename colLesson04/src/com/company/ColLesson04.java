package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        List<Word> words = new ArrayList<>();

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        try {
            while (!input.equals("e")) {
                String[] tmp = input.split(" ");
                Word wd = new Word(tmp[0], tmp[1]);
                words.add(wd);
                index++;
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                input = sc.nextLine();
            }
         }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
        }
        for (int i = 0; i < index; i++) {
            System.out.println(words.get(i));
        }
        System.out.println(words.size() + "件、登録しました。");
    }
}


//public class ColLesson04 {
//    public static void main(String[] args) {
//        // Wordクラスのインスタンス配列
//        List<Word> words = new ArrayList<Word>();
//
//        // コマンドラインから入力
//        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
//
//        for(int i=0; i<5;i++){
//            Scanner sc  = new Scanner(System.in);
//            String input = sc.nextLine();
//
//            if(!input.equals("e")){
//                // ここから記述してください
//                // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
//                String[] tmp = input.split(" ");
//
//                Word word = new Word();
//                word.setWord(tmp[0]);
//                word.setMeaning(tmp[1]);
//                words.add(word);
//                if(i<4){
//                    System.out.println("次の単語と意味を入力して下さい。”e”で終了します。");
//                }
//            }else{
//                sc.close();
//                for(int j=0; j<i; j++){
//                    words.get(j).toString(words.get(j).getWord(),words.get(j).getMeaning());
//                }
//                System.out.println(i + "件、登録しました。");
//                break;
//            }
//        }
//        System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
//        System.out.println(" ");
//        for(int k=0; k<words.size(); k++){
//            words.get(k).toString(words.get(k).getWord(),words.get(k).getMeaning());
//        }
//        System.out.println( words.size() + "件、登録しました。");
//
//
//    }
//}
