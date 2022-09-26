package com.example.databindingdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingdemo.databinding.ItemPersonBinding

class ItemPersonAdapter: RecyclerView.Adapter<ItemPersonAdapter.ViewHolder>() {

    private val listPeople = listOf(
        Person("Person 1", 23),
        Person("Person 2", 24),
        Person("Person 3", 25),
        Person("Person 4", 26),
        Person("Person 5", 27),
        Person("Person 6", 28),
    )

    inner class ViewHolder(private val binding: ItemPersonBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(person: Person) {
            binding.itemPerson = person
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(listPeople[position])
    }

    override fun getItemCount() = listPeople.size

}