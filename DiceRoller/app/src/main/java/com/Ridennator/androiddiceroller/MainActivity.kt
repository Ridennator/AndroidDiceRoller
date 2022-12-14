package com.Ridennator.androiddiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find button
        var rollDicebt: Button =findViewById(R.id.GenerateNumberButton)
        //define that the button will react to click
        rollDicebt.setOnClickListener{
            //add a message to screen when you press the button
            Toast.makeText(this,"The button was pressed", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage = findViewById<ImageView>(R.id.DiceView)
    }

    private fun rollDice() {
        var randomValue = Random.nextInt(6)+1
        var resultText = findViewById<TextView>(R.id.GeneratedNumberView)
        resultText.text=randomValue.toString()

        //choose the dice image
        var drawableResource = when(randomValue){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6

            else -> {R.drawable.empty_dice}
        }
        // assign image
        //var diceImage=findViewById<ImageView>(R.id.DiceView)
        diceImage.setImageResource(drawableResource)
    }


}