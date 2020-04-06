package org.senac.lancamentodado

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var dadoComponent : ImageView
    private lateinit var valoresDado : Map<Int, Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dadoComponent = findViewById<ImageView>(R.id.iv_dado)

        valoresDado = mapOf(
            1 to R.drawable.dice_1,
            2 to R.drawable.dice_2,
            3 to R.drawable.dice_3,
            4 to R.drawable.dice_4,
            5 to R.drawable.dice_5,
            6 to R.drawable.dice_6
        )

        dadoComponent.setImageResource(R.drawable.dice_6)
    }

    fun jogarDado(view: View) {
        val valorRandocimo = Random.nextInt(1, 6)
        dadoComponent.setImageResource(valoresDado.get(valorRandocimo)!!)
    }
}
