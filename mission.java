package com.company;

import java.util.Scanner;

public class mission {
    public static void main(String[] args) {
        System.out.println("あなたの転職度合いをチェックする「転職テスト」");
        System.out.println("");
        System.out.println("下記の質問に該当したら1を、該当しないなら2を入力してEnterキーを押してください。");
        System.out.println("");
        String[] question = {"会社でよく顔を合わせる同僚に苦手な人がいる", "朝起きて仕事に行きたくない日が週に３回以上ある", "休日の21時以降に明日の仕事への出勤の事を考えると憂鬱になる事がある", "業務時間の定時を過ぎたら一刻も早く退社したいと思う", "自分のやっている仕事に対し給料は少ないと感じる", "仕事をしている時に理不尽だと感じる事が多々ある","学生時代の同級生と比べ給料が低いと感じる事がある","職場で頑張っているのは自分１人だけで周りの同僚の働き方が物足りないと感じる事がある","今の会社の上司を見てあぁはなりたくないよな。と思う事がある","自分はもっと評価されるべき、仕事でもっと対価を得れると感じる事がある"};
        String[] answers = {"(1)はい (2)いいえ"};
        String[] ans = new String[10];



            for (int i = 0; i < question.length; i++) {
                System.out.println(question[i]);
                System.out.println("(1)はい (2)いいえ");
                Scanner scanner = new Scanner(System.in);
                ans[i] = scanner.next();

            }
           /* for (int i = 0; i < ans.length; i++){
                System.out.println(ans[i]);
            }*/
//            System.out.println(ans);

            int result = 0;
            for (int i =0; i < ans.length; i++) {
//                int first =
                // result = result + first;
                int first = Integer.parseInt(ans[i]);
                if(first == 1){
                    result = result + first;
                }
                /*result += Integer.parseInt(ans[i]);
                i++;*/
            }
         if(result < 4 ){
             System.out.println("");
            System.out.println("チェックの数が０～３個だった方。\n");
            System.out.println("あなたは現在の会社や仕事に満足しています。転職などせずに今の会社でそのまま勤め続けましょう。");
            System.out.println("ただ現在バブル期以来の求人売り手市場ですので今以上に良い条件の会社がある可能性が高いです。");
            System.out.println("転職エンジニアなどから電話の掛かって こない転職サービスに登録だけしておいて求人情報を興味本位で見てみるのもいいでしょう。");
        }else if(result > 3  && result< 7){
             System.out.println("");
             System.out.println("チェックの数が４～６個だった方\n");
            System.out.println("あなたは現在の働き方に少なからず疑問をお持ちのようです。");
            System.out.println("世の中にはあなたが思っている以上に様々な会社が求人募集をしております。");
            System.out.println("まずは煩わしい電話などが来ない転職サービスに登録してみて実際の求人情報をごらんになってみても良いのではないでしょうか？");
        }else if(result > 6) {
                System.out.println("");
                System.out.println("チェックの 7 個以上だった方\n");
                System.out.println("あなたは現在の仕事に対し非常に大きなストレスを抱えているようです。");
                System.out.println("日本人は人生の「３０～５０％」の時間を仕事に費やしています。起きている時間だけで考えるとおよそ「６０～７０％」もの時間を仕事に費やします。");
                System.out.println("その仕事でこれほどまでにストレスを抱えてしまうと心が病んでしまう可能性もあります。");
                System.out.println("幸運な事に現在日本の求人市場はバブル期以来の売り手市場です。様々な企業が様々な求人募集をしています。");
                System.out.println("あなたの場合は専属のエージェントが付く転職サービスに登録するのはもちろんの事、システムがマッチングしてくれる転職サービスも両方登録し一刻も早く転職活動を始めるべきです。");
            };





        }
    }

