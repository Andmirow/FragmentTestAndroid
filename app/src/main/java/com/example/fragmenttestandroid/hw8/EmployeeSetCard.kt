package com.example.fragmenttestandroid.hw8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.fragmenttestandroid.R
import kotlinx.android.synthetic.main.employee_card.*
import kotlinx.android.synthetic.main.employee_set_card.*
import timber.log.Timber


class EmployeeSetCard : AppCompatActivity() {

    lateinit var employee: Employee
    var position: Int = 0
    lateinit var imageUrl : String
    lateinit var name : String
    lateinit var departament : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel : MainViewModel by viewModels()
        setContentView(R.layout.employee_set_card)

        employee = intent.getParcelableExtra(EXTRA_Employee)!!
        position = intent.getIntExtra(EXTRA_Position,0)

        val ivf = findViewById<ImageView>(R.id.iv_foto)
        val edn = findViewById<EditText>(R.id.et_name)
        val edu = findViewById<EditText>(R.id.et_image)
        val edd = findViewById<EditText>(R.id.et_departament)
        val but_set = findViewById<Button>(R.id.but_set_img)
        val but_save = findViewById<Button>(R.id.but_save_eml)

        edn.setText(employee.name)
        edd.setText(employee.department)
        edu.setText(employee.photoUrl)

        //setImageFoto(employee.photoUrl)

        Glide.with(ivf.context)
            .load(employee.photoUrl)
            .centerCrop()
            .into(ivf)


        but_set.setOnClickListener {
            //setImageFoto(edu.text.toString())
            Glide.with(ivf.context)
                .load(edu.text.toString())
                .centerCrop()
                .into(ivf)
        }


        but_save.setOnClickListener{
            employee.photoUrl = edu.text.toString()
            employee.department = edd.text.toString()
            employee.name = edn.text.toString()
            //viewModel.setEmployee(position,employee)
            val intent = Intent(this, ActivityHw8::class.java)
            intent.putExtra(EXTRA_Employee,employee)
            intent.putExtra(EXTRA_Position, position)
            startActivity(intent)
        }

    }


//    private fun setImageFoto(context : String){
//        Glide.with(ivf.context)
//            .load(context)
//            .centerCrop()
//            .into(ivf)
//        }
    }







