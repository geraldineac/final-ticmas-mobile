package com.curso.android.app.comparar.textos.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.comparar.textos.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText1: EditText =
            findViewById(R.id.editText1)
        val editText2: EditText =
            findViewById(R.id.editText2)
        val compareButton: Button =
            findViewById(R.id.compareButton)
        val resultadoTextView: TextView =
            findViewById(R.id.resultadoTextView)


        compareButton.setOnClickListener {
            val textoCampo1 =
                editText1.text.toString()
            val textoCampo2 =
                editText2.text.toString()

            if (textoCampo1 == textoCampo2){
               resultadoTextView.text = "Los campos son iguales"
                 } else {
                    resultadoTextView.text = "Los campos son diferentes"
                }
            }
        }
    }
