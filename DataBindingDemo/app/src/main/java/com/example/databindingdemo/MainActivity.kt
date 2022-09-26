package com.example.databindingdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val person1 = PersonObservableField(ObservableField("Person 1"), ObservableInt(23))
    private val person2 = PersonObservableExtend("Person 2", 24)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            personObservableField = this@MainActivity.person1
            personObservableExtend = this@MainActivity.person2
            btnUpdate.setOnClickListener {
                person1.name.set("Name change: ABC")
                person2.name = "Name change: DEF"
                person2.notifyPropertyChanged(BR.name)
            }
            btnShowList.setOnClickListener {
                val intent = Intent(applicationContext, ShowListPeopleActivity::class.java)
                startActivity(intent)
            }
        }
    }
}