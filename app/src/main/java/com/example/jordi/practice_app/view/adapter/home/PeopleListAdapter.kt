package com.example.jordi.practice_app.view.adapter.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.jordi.practice_app.R
import com.example.jordi.practice_app.model.PersonView
import kotlinx.android.synthetic.main.item_person.view.*

class PeopleListAdapter(var items: MutableList<PersonView> = mutableListOf(),
                        val onItemClick: (PersonView) -> Unit)
    : RecyclerView.Adapter<PeopleListAdapter.PersonViewHolder>() {

    fun addPeople(personView: PersonView) {
        this.items.add(personView)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view,
                onItemClick = { onItemClick(items[it]) })
    }

    override fun onBindViewHolder(holder: PersonViewHolder?, position: Int) {
        holder?.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class PersonViewHolder(itemView: View,
                           private val onItemClick: (Int) -> Unit) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener { onItemClick(adapterPosition) }
        }

        fun bind(personView: PersonView) {
            itemView.personName.text = personView.name
            itemView.birthYear.text = personView.birth_year
        }
    }
}