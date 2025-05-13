package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)
    }
}

val contacts = listOf(
    Contact(
        "Renan",
        "(+353) 083 2024401",
        R.drawable.sample8
    ),

    Contact(
        "Lais",
        "(+55) 11 99876-4321",
        R.drawable.sample1
    ),

    Contact(
        "Pedro",
        "(+1) 310-555-7890",
        R.drawable.sample2
    ),

    Contact(
        "Alice",
        "(+33) 6 12 34 56 78",
        R.drawable.sample3
    ),

    Contact(
        "Maria",
        "(+49) 1512 3456789",
        R.drawable.sample4
    ),

    Contact(
        "Joana",
        "(+44) 7911 123456",
        R.drawable.sample5
    ),

    Contact(
        "Jessica",
        "(+86) 138 0013 8000",
        R.drawable.sample6
    ),

    Contact(
        "Bruna",
        "(+34) 612 345 678",
        R.drawable.sample7
    ),

    Contact(
        "Gustavo",
        "(+81) 090-1234-5678",
        R.drawable.sample8
    ),

    Contact(
        "Samuel",
        "(+7) 912 345-67-89",
        R.drawable.sample9
    ),

    Contact(
        "Rafael",
        "(+351) 912 345 678",
        R.drawable.sample10
    ),

    Contact(
        "Bianca",
        "(+1) 212-555-0199",
        R.drawable.sample11
    ),

    Contact(
        "Robson",
        "(+61) 412 345 678",
        R.drawable.sample12
    ),

    Contact(
        "Ana",
        "(+39) 345 678 9012",
        R.drawable.sample13
    ),

    Contact(
        "Lucas",
        "(+47) 412 34 567",
        R.drawable.sample14
    ),

    Contact(
        "Carolina",
        "(+27) 82 123 4567",
        R.drawable.sample15
    ),

    Contact(
        "Barbara",
        "(+66) 81 234 5678",
        R.drawable.sample16
    )
)