package com.fauzan.covid.ui.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fauzan.covid.R
import com.fauzan.covid.adapter.QuestionAdapter
import com.fauzan.covid.model.QuestionData
import com.fauzan.covid.model.QuestionModel
import kotlinx.android.synthetic.main.fragment_questions.*

class QuestionsFragment : Fragment() {

    private val questionList = ArrayList<QuestionModel>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_questions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showQuestionList()

    }

    private fun showQuestionList() {
        rv_title.layoutManager = LinearLayoutManager(context)
        val questionAdapter = QuestionAdapter(questionList)
        rv_title.adapter = questionAdapter
        questionList.addAll(QuestionData.list)
        rv_title.setHasFixedSize(true)
    }
}