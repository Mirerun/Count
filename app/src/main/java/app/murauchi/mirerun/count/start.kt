package app.murauchi.mirerun.count

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_start.*

class start : AppCompatActivity() {

    var second = 10
    val timer : CountDownTimer = object : CountDownTimer(10000,1000) {
        override fun onFinish() {
            finishText.isVisible = true
            clearButton.isVisible = true
            //残り時間をリセット
            second = 10
            //時間の表示をもとに戻す
            TimerTextView.text = second.toString()
        }
        override fun onTick(millisUntilFinished: Long) {
            //残り時間を1秒ずつ減らす
            second = second - 1
            //残り時間表示
            TimerTextView.text = second.toString()
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val weedIntent: Intent = Intent(this, MainActivity::class.java)

        clearButton.isVisible = false
        timer.start()
        TimerTextView.text = second.toString()
        var count: Int = 0
        CountTextView.text = "0"

        //for文使いたいけどボタンの設定大丈夫？
        grass1.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass1.isVisible = false
        }
        grass2.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass2.isVisible = false
        }
        grass3.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass3.isVisible = false
        }
        grass4.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass4.isVisible = false
        }
        grass5.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass5.isVisible = false
        }
        grass6.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass6.isVisible = false
        }
        grass7.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass7.isVisible = false
        }
        grass8.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass8.isVisible = false
        }
        grass9.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass9.isVisible = false
        }
        grass10.setOnClickListener{
            count = count + 1
            CountTextView.text = count.toString()
            grass10.isVisible = false
        }
        eco1.setOnClickListener{
            count = count - 1
            CountTextView.text = count.toString()
        }
        eco2.setOnClickListener{
            count = count - 1
            CountTextView.text = count.toString()
        }
        eco3.setOnClickListener{
            count = count - 1
            CountTextView.text = count.toString()
        }
        eco4.setOnClickListener{
            count = count - 1
            CountTextView.text = count.toString()
        }

        clearButton.setOnClickListener{
            startActivity(weedIntent)
        }
    }
}