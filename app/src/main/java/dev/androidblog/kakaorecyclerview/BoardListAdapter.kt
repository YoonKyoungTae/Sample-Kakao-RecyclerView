package dev.androidblog.kakaorecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BoardListAdapter : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(parent)

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //
    }

}

class ViewHolder(parent: ViewGroup) : BaseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.listitem_board, parent, false)) {

    override fun bind() {
        //
    }

}