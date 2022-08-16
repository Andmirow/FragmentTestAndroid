package com.example.fragmenttestandroid.hw8

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenttestandroid.R
import com.example.fragmenttestandroid.hw5.ReceiverFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.employee_card.*


const val EXTRA_Employee = "Employee"
const val EXTRA_Position = "position"
class ActivityHw8 : AppCompatActivity() {

    //private val viewModel : MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("стартТест","старт")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rr)

        val viewModel : MainViewModel by viewModels()
        val adapter = EmployeeAdapter(viewModel::deleteEmployee,this::setEmployee)
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

    override fun onRestart() {
        Log.d("стартТест","рестарт")
        super.onRestart()
    }

    fun setEmployee(employee: Employee, position: Int){
        val intent = Intent(this, EmployeeSetCard::class.java)
        intent.putExtra(EXTRA_Employee,employee)
        intent.putExtra(EXTRA_Position, position)
        startActivity(intent)
    }




}


