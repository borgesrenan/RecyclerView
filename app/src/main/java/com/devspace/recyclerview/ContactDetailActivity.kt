package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContactDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)

        //Recuperando as views:
        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvPhone = findViewById<TextView>(R.id.tv_phone)
        val image = findViewById<ImageView>(R.id.image)
        val tvShare = findViewById<TextView>(R.id.tv_share)
        val tvDescription = findViewById<TextView>(R.id.tv_description)

        //Recuperando os dados da tela anterior
        val name = intent.getStringExtra("name") //- Passando a mesma chave, nao pode ser diferente
        val phone = intent.getStringExtra("phone")
        val description = intent.getStringExtra("description")
        val icon = intent.getIntExtra("icon", R.drawable.sample8) // Obrigatorio um
        // valor default, zero ou um drawable

        //Fazendo o biding manualmente
        tvName.text = name
        tvPhone.text = phone
        tvDescription.text = description
        image.setImageResource(icon)

        tvShare.setOnClickListener {
            //Intent implicita

            val sendIntent: Intent = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$name $phone")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

    }
}
