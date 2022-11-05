package com.example.thuvarakan.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.thuvarakan.R
import com.example.thuvarakan.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), OnClickListener {
    private lateinit var navController: NavController

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.itemClick1.setOnClickListener(this)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.item_click1 -> {
                navController.navigate(R.id.action_homeFragment_to_detaiilViewFragment)
            }

            R.id.item_click2 -> {
                navController.navigate(R.id.action_homeFragment_to_detaiilViewFragment)
            }

            R.id.item_click3 -> {
                navController.navigate(R.id.action_homeFragment_to_detaiilViewFragment)
            }

            R.id.item_click4 -> {
                navController.navigate(R.id.action_homeFragment_to_detaiilViewFragment)
            }

            R.id.item_click5 -> {
                navController.navigate(R.id.action_homeFragment_to_detaiilViewFragment)
            }
        }
    }
}