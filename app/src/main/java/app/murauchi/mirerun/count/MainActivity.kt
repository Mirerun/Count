package app.murauchi.mirerun.count

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //画面遷移準備
        val weedIntent: Intent = Intent(this, start::class.java)

        //STARTボタンがタップされたら
        startButton.setOnClickListener {
            //プレイ画面に移動
            startActivity(weedIntent)
        }
    }
}