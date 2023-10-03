package com.example.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationkullanimi.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        binding.buttonSwitchToB.setOnClickListener {
            val transition = AFragmentDirections.bTransition(message = "Hello")
            Navigation.findNavController(it).navigate(transition)
        }
        return binding.root
    }
}