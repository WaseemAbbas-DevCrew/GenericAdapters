package com.example.adapters

class HomeRecyclerViewAdapter(
    items: List<Any> = emptyList()
) : BaseRecyclerViewAdapter<Any>(items)  {

    override fun getItemViewType(position: Int): Int =
        if (position%2 == 0) R.layout.item_student else R.layout.item_teacher
}