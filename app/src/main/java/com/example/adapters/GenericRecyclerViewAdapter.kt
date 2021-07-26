package com.example.adapters

import androidx.annotation.LayoutRes

class GenericRecyclerViewAdapter <T> (
    @LayoutRes private val layoutId: Int,
    items: List<T> = emptyList()
): BaseRecyclerViewAdapter<T>(items) {

    override fun getItemViewType(position: Int): Int = layoutId

}