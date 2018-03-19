package com.valkyrie.nabeshimamac.leders_countapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by NabeshimaMAC on 2018/03/20.
 */

/**
 * 注意！）Java版は起動しないよ
 */

public class MainActivity_java extends AppCompatActivity {
    //MainActivityクラスは、AppCpmpatActivityクラスを継承、アプリの一画面の挙動をプログラミングするには、
    // Activityクラスを継承したクラスじゃないとNG

    TextView numberTextView;
    //現在のカウントを表示させるためのtextView
    int number;
    //現在の値を保存しておくための変数

    Button plus, minus, reset;
    //現在のボタンを表示させるためのButton（今回はいらない）

    /**
     * onCreateはコメントアウトしないとKotlin版と被ってしまうので止むを得ずやってます
     * 色分けで見たかったらコメントアウトを外して
     */

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        //onCreate()はActivity（画面）を立ち上げた際に最初に呼ばれるメソッド、onCreate()をMainActivityにてオーバーライド（上書き）することで、
//        // アプリを立ち上げた際にするべきことを指示することが出来る。Bundleオブジェクトというのは画面を起動する際に、
//        // なんらかの状態を引き継いで起動したい時に渡す為の容器
//
//        super.onCreate(savedInstanceState);
//        //親クラスであるActivityクラスのonCreate()を呼んでいる
//
//        setContentView(R.layout.activity_main);
//        //引数に渡したレイアウト定義用xmlファイルを読み込んで、画面に表示してくれる
//
//        numberTextView = (TextView) findViewById(R.id.number_textView);
//        numberTextView.setText("0");
//        //  画面内のIDがtextViewのテキストとnumberTextViewを関連づけ、0の表示にする
//
//        //  Int関数の初期値を0に設定
//        number = 0;
//
//        numberCheck();
//        //  色の確認
//
//        plus = findViewById(R.id.buttonPlus);
//        minus = findViewById(R.id.buttonMinus);
//        reset = findViewById(R.id.buttonReset);
//        //  画面内のIDとButtonを関連づけるんだけど、今回はいらないかな。一応書いたけど
//
//    }

    //plusというボタンの命令書を作る
    public void plus(View v) {
        number = number + 1;
        //numberはアクションが行われるとplus1される

        numberTextView.setText(String.valueOf(number));
        //textにInt型のnumberをString型に変換した文字列を表示する

        numberCheck();
        //色の確認

    }

    //minusというボタンの命令書を作る
    public void minus(View v) {

        number = number - 1;
        //numberはアクションが行われるとminus1される

        numberTextView.setText(String.valueOf(number));
        //textにInt型のnumberをString型に変換した文字列を表示する

        numberCheck();
        //色の確認

    }

    //    値をリセットするボタンの命令書を作る
    public void reset(View v) {

        number = 0;
        //numberはアクションが行われると0になる

        numberTextView.setText("0");
        //textに0と表示する

        numberCheck();
        //色の確認

    }

    //    10以上で文字をだんだん赤にするClassを作る
    public void numberCheck() {

//        if文を書くのが面倒。&&により~~以上~~以下という条件式が書ける
        if (10 <= number && number <= 20) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_100));
        } else if (21 <= number && number <= 30) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_200));
        } else if (31 <= number && number <= 40) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_300));
        } else if (41 <= number && number <= 50) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_400));
        } else if (51 <= number && number <= 60) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_500));
        } else if (61 <= number && number <= 70) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_600));
        } else if (71 <= number && number <= 80) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_700));
        } else if (81 <= number && number <= 90) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_800));
        } else if (91 <= number && number <= 100) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_900));
        } else {

//            それ以外だったら色を黒に
            numberTextView.setTextColor(getResources().getColor(R.color.red_900));
        }


//      101以上だったら赤色を固定に
        if (number >= 101) {
            numberTextView.setTextColor(getResources().getColor(R.color.red_dark));
        }

    }

}