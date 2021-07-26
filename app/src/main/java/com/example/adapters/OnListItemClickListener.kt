package com.example.adapters

import android.view.View

interface OnListItemClickListener <T> {
    fun onItemClick(obj: T, position: Int, view: View)
}