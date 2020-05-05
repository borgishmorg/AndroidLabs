package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setButtonListeners()
    }

    private fun setButtonListeners(){
        plus.setOnClickListener {
            val n1 = getNumber1()
            val n2 = getNumber2()
            if (n1 != null && n2 != null)
                result.text = (n1+n2).toString()
            else
                result.text = ""
        }
        minus.setOnClickListener {
            val n1 = getNumber1()
            val n2 = getNumber2()
            if (n1 != null && n2 != null)
                result.text = (n1-n2).toString()
            else
                result.text = ""
        }
        multiply.setOnClickListener {
            val n1 = getNumber1()
            val n2 = getNumber2()
            if (n1 != null && n2 != null)
                result.text = (n1*n2).toString()
            else
                result.text = ""
        }
        divide.setOnClickListener {
            val n1 = getNumber1()
            val n2 = getNumber2()
            if (n1 != null && n2 != null)
                if (n2 != 0f)
                    result.text = (n1/n2).toString()
                else
                    printMessage("Деление на ноль")
            else
                result.text = ""
        }
    }

    private fun getNumber1():Float?{
        val n1 = number1.text.toString().toFloatOrNull()
        if (n1 == null)
            printMessage("Вы не ввели первое число")
        return n1
    }

    private fun getNumber2():Float?{
        val n2 = number2.text.toString().toFloatOrNull()
        if (n2 == null)
            printMessage("Вы не ввели второе число")
        return n2
    }

    private fun printMessage(msg: String){
        Snackbar.make(result, msg, Snackbar.LENGTH_SHORT).show()
    }
}
