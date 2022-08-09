package com.example.fragmenttestandroid.hw8

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttestandroid.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ActivityHw8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rr)

        val viewModel : MainViewModel by viewModels()
        val adapter = EmployeeAdapter(viewModel::deleteEmployee)
        val fab = findViewById<FloatingActionButton>(R.id.add_button)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val dividerItemDecorationVERTICAL = DividerItemDecoration(recyclerView.context, GridLayoutManager.VERTICAL)
        val dividerItemDecorationHORIZONTAL = DividerItemDecoration(recyclerView.context, GridLayoutManager.HORIZONTAL)


        recyclerView.layoutManager = GridLayoutManager(this, 2)// LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(dividerItemDecorationVERTICAL)
        recyclerView.addItemDecoration(dividerItemDecorationHORIZONTAL)

        viewModel.employees.observe(this){
            adapter.reloadList(it)
        }

        fab.setOnClickListener {
            viewModel.addRandomEmployee()
        }

    }
}