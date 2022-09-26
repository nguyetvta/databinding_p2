package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding
import com.example.databindingdemo.databinding.ActivityShowListPeopleBinding

class ShowListPeopleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowListPeopleBinding

    private val peopleAdapter = ItemPersonAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_show_list_people)
        binding.rcvPeople.adapter = peopleAdapter
    }
}