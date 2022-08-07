package com.example.fragmenttestandroid

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel : MainViewModel by viewModels()
        val adapter = EmployeeAdapter(viewModel::deleteEmployee)
        val fab = findViewById<FloatingActionButton>(R.id.add_button)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)// LinearLayoutManager(this)
        recyclerView.adapter = adapter

        viewModel.employees.observe(this){
            adapter.reliadList(it)
        }

        fab.setOnClickListener {
            viewModel.addRandomEmployee()
        }

    }
}