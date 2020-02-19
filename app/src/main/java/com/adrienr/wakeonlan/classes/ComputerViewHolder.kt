package com.adrienr.wakeonlan.classes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adrienr.wakeonlan.R

class ComputerViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.computer_list_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.textViewLine1)
        mYearView = itemView.findViewById(R.id.textViewLine2)
    }

    fun bind(computer: Computer) {
        mTitleView?.text = computer.ip;
        mYearView?.text = computer.mac;
    }

}