package com.fauzan.covid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import com.fauzan.covid.R
import com.fauzan.covid.model.QuestionModel
import kotlinx.android.synthetic.main.row_qna.view.*

class QuestionAdapter(private val questionList: ArrayList<QuestionModel>): RecyclerView.Adapter<QuestionAdapter.QuestionHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_qna, parent, false)
        return QuestionHolder(view)
    }

    override fun getItemCount(): Int = questionList.size

    override fun onBindViewHolder(holder: QuestionHolder, position: Int) {

        val isExpand : Boolean = questionList[position].expand

        holder.bind(questionList[position])
        holder.expandableLayout.visibility = if (isExpand) View.VISIBLE else View.GONE

        holder.linearLayout.setOnClickListener{
            val quest = questionList[position]
            quest.expand = !quest.expand
            notifyItemChanged(position)
        }
    }

    inner class QuestionHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(model: QuestionModel) {
            with(itemView){
                tv_qna_title.text = model.question
                tv_qna_answer.text = model.answer
            }
        }

        var linearLayout: LinearLayout = itemView.findViewById(R.id.linear_layout)
        var expandableLayout: RelativeLayout = itemView.findViewById(R.id.expend_layout)
    }
}