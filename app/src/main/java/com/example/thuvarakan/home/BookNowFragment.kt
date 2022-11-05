package com.example.thuvarakan.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.thuvarakan.R



class BookNowFragment : Fragment(),OnClickListener {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_now, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val back: ImageView = view.findViewById(R.id.ic_close)

        back.setOnClickListener(this)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BookNowFragment().apply {

            }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.ic_close -> {
                navController.navigate(R.id.action_bookNowFragment_to_detaiilViewFragment)
            }
        }
    }
}