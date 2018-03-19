package com.valkyrie.nabeshimamac.leders_countapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    //MainActivityクラスは、AppCpmpatActivityクラスを継承、アプリの一画面の挙動をプログラミングするには、
    // Activityクラスを継承したクラスじゃないとNG


    private lateinit var numberTextView: TextView
    //現在のカウントを表示させるためのtextView

    private lateinit var plus: Button
    private lateinit var minus: Button
    private lateinit var reset: Button
    //現在のボタンを表示させるためのButton（今回はいらない）

    private var number: Int by Delegates.notNull()
    //現在の値を保存しておくための変数


    override fun onCreate(savedInstanceState: Bundle?) {
        //onCreate()はActivity（画面）を立ち上げた際に最初に呼ばれるメソッド、onCreate()をMainActivityにてオーバーライド（上書き）することで、
        // アプリを立ち上げた際にするべきことを指示することが出来る。Bundleオブジェクトというのは画面を起動する際に、
        // なんらかの状態を引き継いで起動したい時に渡す為の容器

        super.onCreate(savedInstanceState)
        //親クラスであるActivityクラスのonCreate()を呼んでいる

        setContentView(R.layout.activity_main)
        //引数に渡したレイアウト定義用xmlファイルを読み込んで、画面に表示してくれる

        numberTextView = findViewById(R.id.number_textView)
        numberTextView.setText("0")
//        画面内のIDがtextViewのテキストとnumberTextViewを関連づけ、0の表示にする


//        Int関数の初期値を0に設定
        number = 0

        numberCheck()
//        色の確認

        plus = findViewById(R.id.buttonPlus)
        minus = findViewById(R.id.buttonMinus)
        reset = findViewById(R.id.buttonReset)
        //  画面内のIDとButtonを関連づけるんだけど、今回はいらないかな。一応書いたけど


    }

    //    plusというボタンの命令書を作る
    fun plus(view: View) {
        number = number + 1
        //numberはアクションが行われるとplus1される

        numberTextView.setText(Integer.toString(number))
        //textにInt型のnumberをString型に変換した文字列を表示する

        numberCheck()
        //色の確認

    }

    //    minusというボタンの命令書を作る
    fun minus(view: View) {

        number = number - 1
        //numberはアクションが行われるとminus1される

        numberTextView.setText(Integer.toString(number))
        //textにInt型のnumberをString型に変換した文字列を表示する

        numberCheck()
        //色の確認

    }

    //    値をリセットするボタンの命令書を作る
    fun reset(view: View) {
        number = 0
        //numberはアクションが行われると0になる
        numberTextView.setText("0")
        //textに0と表示する
        numberCheck()
        //色の確認
    }

    //    10以上で文字をだんだん赤にするClassを作る
    private fun numberCheck() {

//        whenにより場合分けが簡単になる
        when (number) {
            in 10..20 -> numberTextView.setTextColor(resources.getColor(R.color.red_100))
            in 21..30 -> numberTextView.setTextColor(resources.getColor(R.color.red_200))
            in 31..40 -> numberTextView.setTextColor(resources.getColor(R.color.red_300))
            in 41..50 -> numberTextView.setTextColor(resources.getColor(R.color.red_400))
            in 51..60 -> numberTextView.setTextColor(resources.getColor(R.color.red_500))
            in 61..70 -> numberTextView.setTextColor(resources.getColor(R.color.red_600))
            in 71..80 -> numberTextView.setTextColor(resources.getColor(R.color.red_700))
            in 81..90 -> numberTextView.setTextColor(resources.getColor(R.color.red_800))
            in 91..100 -> numberTextView.setTextColor(resources.getColor(R.color.red_900))

//            それ以外だったら色を黒に
            else -> numberTextView.setTextColor(resources.getColor(R.color.colorPrimaryText))
        }

//      101以上だったら赤色を固定に
        if (number >= 101) numberTextView.setTextColor(resources.getColor(R.color.red_dark))
    }

}
