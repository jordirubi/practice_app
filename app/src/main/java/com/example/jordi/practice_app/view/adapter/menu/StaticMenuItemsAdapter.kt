package com.example.jordi.practice_app.view.adapter.menu

import android.view.View
import com.example.jordi.practice_app.R
import com.example.jordi.practice_app.model.StaticMenuItemView
import com.example.jordi.practice_app.view.adapter.RootAdapter
import kotlinx.android.synthetic.main.item_menu_static.view.*

class StaticMenuItemsAdapter(onItemClickListener: (StaticMenuItemView) -> Unit)
    : RootAdapter<StaticMenuItemView>(onItemClickListener = onItemClickListener) {

    override val itemLayoutId: Int = R.layout.item_menu_static

    override fun viewHolder(view: View): RootViewHolder<StaticMenuItemView> = StaticMenuItemViewHolder(view)

    class StaticMenuItemViewHolder(itemView: View) : RootViewHolder<StaticMenuItemView>(itemView) {
        override fun bind(model: StaticMenuItemView) {
            itemView.icon.setImageResource(model.iconId)
            itemView.name.setText(model.nameId)
        }
    }
}