package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)

        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->
            val intent = Intent(this, ContactDetailActivity::class.java)

            //Passando os dados para a proxima tela
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            intent.putExtra("description", contact.description)

            startActivity(intent)
        }
    }
}

val contacts = listOf(
    Contact(
        "Renan",
        "(+353) 083 2024401",
        R.drawable.sample8,
        "NBLA BLA BLA BLA LA LASALDAISD AOSIDHAOSIDHAOSDHAOSIDHOAISDHOASIDHOASIHD"

    ),

    Contact(
        "Lais",
        "(+55) 11 99876-4321",
        R.drawable.sample1,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Pedro",
        "(+1) 310-555-7890",
        R.drawable.sample2,
        "HHASD{KAS{PDJASPDI HAPSODBAPSODINASPOD INASPODIA POSIDJ POIDSAPSOID JPAOSID JPASOID JAPSOIDJ PAOSIDJ "

    ),

    Contact(
        "Alice",
        "(+33) 6 12 34 56 78",
        R.drawable.sample3,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Maria",
        "(+49) 1512 3456789",
        R.drawable.sample4,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Joana",
        "(+44) 7911 123456",
        R.drawable.sample5,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Jessica",
        "(+86) 138 0013 8000",
        R.drawable.sample6,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Bruna",
        "(+34) 612 345 678",
        R.drawable.sample7,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Gustavo",
        "(+81) 090-1234-5678",
        R.drawable.sample8,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Samuel",
        "(+7) 912 345-67-89",
        R.drawable.sample9,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Rafael",
        "(+351) 912 345 678",
        R.drawable.sample10,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Bianca",
        "(+1) 212-555-0199",
        R.drawable.sample11,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Robson",
        "(+61) 412 345 678",
        R.drawable.sample12,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Ana",
        "(+39) 345 678 9012",
        R.drawable.sample13,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Lucas",
        "(+47) 412 34 567",
        R.drawable.sample14,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Carolina",
        "(+27) 82 123 4567",
        R.drawable.sample15,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    ),

    Contact(
        "Barbara",
        "(+66) 81 234 5678",
        R.drawable.sample16,
        "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."

    )
)