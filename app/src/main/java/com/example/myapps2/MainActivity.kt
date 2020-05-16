package com.example.myapps2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imgMain: ImageView
    lateinit var ShowRand:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btngo: Button= findViewById(R.id.btnStart)
        btngo.setOnClickListener {
            Shufle()
        }
        imgMain = findViewById(R.id.imgMain)
        ShowRand=findViewById(R.id.textVshow)
    }

    fun Shufle(){
        val randNum = Random.nextInt(6)+1
        val shufleImage = when(randNum){
            1-> R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice
        }
        ShowRand.text= "Your Score: $randNum"

        imgMain.setImageResource(shufleImage)
    }
}
