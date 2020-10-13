package com.example.fragmentshomework.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentshomework.R
import com.example.fragmentshomework.extensions.navigate
import kotlinx.android.synthetic.main.main_layout.*

class ChatFragment : Fragment() {
    companion object {
        private const val TAG = "ChatFragment"
        private const val TITLE = "Chat"
    }

    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView")
        return inflater.inflate(R.layout.main_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated")
        activity?.title = TITLE
        count = ChatFragmentArgs.fromBundle(requireArguments()).count
        data_to_show.text = count.toString()
        button.setOnClickListener {
            navigate(ChatFragmentDirections.actionChatFragmentSelf2(count + 1))
        }
    }
}