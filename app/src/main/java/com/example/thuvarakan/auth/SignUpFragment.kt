package com.example.thuvarakan.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.thuvarakan.R

class SignUpFragment : Fragment(),View.OnClickListener {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val signUp:Button = view.findViewById(R.id.btn_signUp)
        val login:TextView = view.findViewById(R.id.tv_login)
        val back:ImageView = view.findViewById(R.id.iv_back)

        signUp.setOnClickListener(this)
        login.setOnClickListener(this)
        back.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when (p0.id){
            R.id.btn_signUp -> navController.navigate(R.id.action_signUpFragment_to_otpFragment)

            R.id.tv_login -> navController.popBackStack()

            R.id.iv_back -> navController.popBackStack()
        }
    }
}