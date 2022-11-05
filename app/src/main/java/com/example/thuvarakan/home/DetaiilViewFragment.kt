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

class DetaiilViewFragment : Fragment(), OnClickListener {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detaiil_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val back: ImageView = view.findViewById(R.id.iv_back)

        back.setOnClickListener(this)
    }
    companion object {

        fun newInstance(param1: String, param2: String) =
            DetaiilViewFragment().apply {

            }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.iv_back -> {
                navController.navigate(R.id.action_detaiilViewFragment_to_homeFragment)
            }
            R.id.bv_book_now ->{
                navController.navigate(R.id.action_detaiilViewFragment_to_bookNowFragment)
            }

            R.id.iv_back -> navController.popBackStack()
        }
    }
}