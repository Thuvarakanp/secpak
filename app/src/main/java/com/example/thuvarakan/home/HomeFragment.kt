package com.example.thuvarakan.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.thuvarakan.R
class HomeFragment : Fragment(), View.OnClickListener {
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val detailView:CardView = view.findViewById(R.id.item_click)
        detailView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.item_click -> {
                navController.navigate(R.id.action_homeFragment_to_detailView)
            }
        }
    }
}