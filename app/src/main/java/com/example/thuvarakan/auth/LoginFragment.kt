package com.example.thuvarakan.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.thuvarakan.R
import com.example.thuvarakan.home.MainActivity
import kotlin.math.log

class LoginFragment : Fragment(),View.OnClickListener {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val singUp:TextView = view.findViewById(R.id.tv_signUp)
        val forgotPassword:TextView = view.findViewById(R.id.tv_forgot_password)
        val login:Button = view.findViewById(R.id.btn_login)

        singUp.setOnClickListener(this)
        forgotPassword.setOnClickListener(this)
        login.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id){
            R.id.tv_signUp -> {
                navController.navigate(R.id.action_loginFragment3_to_signUpFragment)
            }

            R.id.tv_forgot_password -> {
                navController.navigate(R.id.action_loginFragment3_to_forgotPasswordFragment)
            }

            R.id.btn_login -> {
                val intent = Intent(context,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

}