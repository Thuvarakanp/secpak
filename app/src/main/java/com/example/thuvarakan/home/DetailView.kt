package com.example.thuvarakan.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.thuvarakan.R


class DetailView : Fragment(),View.OnClickListener {
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detail_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val detailView: CardView = view.findViewById(R.id.action_detailView_to_homeFragment)
        val back: ImageView = view.findViewById(R.id.iv_back)

        detailView.setOnClickListener(this)
        back.setOnClickListener(this)
    }


    override fun onClick(view: View) {
        when (view.id) {
            R.id.iv_back -> {
                navController.navigate(R.id.action_detailView_to_homeFragment)
            }

            R.id.iv_back -> navController.popBackStack()
        }
    }
}