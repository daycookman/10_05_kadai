package com.company;

import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        final int max_size = 5;
        // Wordクラスのインスタンス配列
        Word[] words = new Word[max_size];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        try {
            while (!input.equals("e")) {
//                if (index > max_size) {
//                }
                String[] tmp = input.split(" ");
                Word wd = new Word(tmp[0], tmp[1]);
                words[index] = wd;
                index++;
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                input = sc.nextLine();
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("登録制限を越えました。登録済みのデータは以下になります。");

        }
        for (int i = 0; i < index; i++) {
            System.out.println(words[i]);
        }
        System.out.println(index + "件、登録しました。");
    }
}


//        for(int i=0; i<5;i++) {
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//
//            if (!input.equals("e")) {
//                // ここから記述してください
//                // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
//                String[] tmp = input.split(" ");
//
//                Word word = new Word();
//                word.setWord(tmp[0]);
//                word.setMeaning(tmp[1]);
//                words[i] = word;
//                index++;
//                if (i < 4) {
//                    System.out.println("次の単語と意味を入力して下さい。”e”で終了します。");
//                }
//            }else if(i < 5){
//                    System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
//                    System.out.println(" ");
//                    for (int k = 0; k < words.length; k++) {
//                        //words[k].toString(words[k].getWord(),words[k].getMeaning());
//                        System.out.println(words[k].toString());
//                        }
//            }else {
//                sc.close();
//                for (int j = 0; j < i; j++) {
//                   //words[j].toString(words[j].getWord(),words[j].getMeaning());
//                    System.out.println(words[j].toString());
//                }
//                System.out.println(i + "件、登録しました。");
//                break;
//                }
//            }
//        }
//    }

