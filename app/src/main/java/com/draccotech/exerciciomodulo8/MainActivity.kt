package com.draccotech.exerciciomodulo8

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numClicks : Int = 0

    var viewMain : RelativeLayout? = null
    var editNome : EditText? = null
    var textNome : TextView? = null
    var util = UtilityHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewMain = findViewById(R.id.view_main)
        editNome = findViewById(R.id.edit_nome)
        textNome = findViewById(R.id.txt_nome_defined)
        val btnChangeImage = findViewById<Button>(R.id.btn_change_image)

        viewMain?.setBackgroundResource(util.getResource())


        btnChangeImage.setOnClickListener {
            onClick()
        }

    }

    fun onClick(){
        textNome?.text = buildString {
            append(editNome?.text)
            append(" ")
            append(numClicks)
        }
        numClicks++


        util.setCurrent(util.changeBackground(util.getCurrent()))
        println(util.getCurrent())
        viewMain?.setBackgroundResource(util.getResource())

    }



}