package com.example.rolldice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var start: Button = findViewById(R.id.button)
        var diceZero: ImageView = findViewById(R.id.imageView11)
        var diceOne: ImageView = findViewById(R.id.imageView)
        var diceTwo: ImageView = findViewById(R.id.imageView7)
        var diceTri: ImageView = findViewById(R.id.imageView8)
        var switch1: Switch = findViewById(R.id.switch1)

        start.setOnClickListener{
            var random = (1..6).random()

            diceTwo.isVisible= false
            diceTri.isVisible= false
            diceOne.isVisible= true

            when(random){
                1-> diceZero.setImageResource(R.drawable.dice_1)
                2-> diceZero.setImageResource(R.drawable.dice_2)
                3-> diceZero.setImageResource(R.drawable.dice_3)
                4-> diceZero.setImageResource(R.drawable.dice_4)
                5-> diceZero.setImageResource(R.drawable.dice_5)
                6-> diceZero.setImageResource(R.drawable.dice_6)
            }
        }
        switch1.setOnCheckedChangeListener{ compoundButton, onSwitch ->
            if (onSwitch)
                start.setOnClickListener{
                    var random = (1..6).random()
                    var random1 = (1..6).random()

                    diceZero.isVisible= false
                    diceOne.isVisible= false
                    diceTwo.isVisible= true
                    diceTri.isVisible= true

                    when(random){
                        1-> diceTwo.setImageResource(R.drawable.dice_1)
                        2-> diceTwo.setImageResource(R.drawable.dice_2)
                        3-> diceTwo.setImageResource(R.drawable.dice_3)
                        4-> diceTwo.setImageResource(R.drawable.dice_4)
                        5-> diceTwo.setImageResource(R.drawable.dice_5)
                        6-> diceTwo.setImageResource(R.drawable.dice_6)
                    }
                    when(random1){
                        1-> diceTri.setImageResource(R.drawable.dice_1)
                        2-> diceTri.setImageResource(R.drawable.dice_2)
                        3-> diceTri.setImageResource(R.drawable.dice_3)
                        4-> diceTri.setImageResource(R.drawable.dice_4)
                        5-> diceTri.setImageResource(R.drawable.dice_5)
                        6-> diceTri.setImageResource(R.drawable.dice_6)
                    }

                }
            else
                start.setOnClickListener{
                    var random = (1..6).random()

                        diceZero.isVisible= false
                        diceTwo.isVisible= false
                        diceTri.isVisible= false
                        diceOne.isVisible= true

                    when(random){
                        1-> diceOne.setImageResource(R.drawable.dice_1)
                        2-> diceOne.setImageResource(R.drawable.dice_2)
                        3-> diceOne.setImageResource(R.drawable.dice_3)
                        4-> diceOne.setImageResource(R.drawable.dice_4)
                        5-> diceOne.setImageResource(R.drawable.dice_5)
                        6-> diceOne.setImageResource(R.drawable.dice_6)
                    }
                }
        }
    }
}