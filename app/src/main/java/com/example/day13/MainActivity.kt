package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    //creating KEY
    companion object
    {
        const val KEY = "com.example.day13.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        orderBtn.setOnClickListener {
            val placedOrder =ETorder1.text.toString() + "\n\n"+ETorder2.text.toString()+"\n\n"+ETorder3.text.toString()+"\n\n"+ETorder4.text.toString();

            intent = Intent(this, OrderList::class.java)
            intent.putExtra(MainActivity.KEY,placedOrder)
            startActivity(intent)
        }
    }
}