package com.example.adapters

import android.view.View

interface OnItemViewClickListener<T> {
    fun onItemViewClick(item: T, rootView: View, view: View)
}