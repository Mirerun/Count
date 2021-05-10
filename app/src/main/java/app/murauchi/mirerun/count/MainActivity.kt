package app.murauchi.mirerun.count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //レイアウトファイルを画面に設定,R=resource
        //fun click(view : View){
            //付け足したい機能}
        val list = arrayOf("apple", "banana", "cat", "dog")
        var number: Int = 0
        numberTextView.text = "0"
        listTextView.text = list[number]

        plusButton.setOnClickListener{
            number = number + 1
            numberTextView.text = number.toString()
            if (number < list.size) {
                listTextView.text = list[number]
            } else {
                listTextView.text = "その番号のキーワードは存在しません"
            }

            if (number % 15 == 0) {
                numberTextView.setTextColor(Color.RED)
            } else if (number % 5 == 0) {
                numberTextView.setTextColor(Color.BLUE)
            } else if (number % 3 == 0){
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }
        }
        minusButton.setOnClickListener{
            number = number - 1
            numberTextView.text = number.toString()
            listTextView.text = list[number]
            if (list.size < number) {
                listTextView.text = "その番号のキーワードは存在しません"
            }
            if (number % 15 == 0) {
                numberTextView.setTextColor(Color.RED)
            } else if (number % 5 == 0) {
                numberTextView.setTextColor(Color.BLUE)
            } else if (number % 3 == 0){
                numberTextView.setTextColor(Color.GREEN)
            } else {
                numberTextView.setTextColor(Color.BLACK)
            }
        }
        clearButton.setOnClickListener{
            number = 0
            numberTextView.text = number.toString()
            numberTextView.setTextColor(Color.BLACK)
        }
    }
}