package com.example.navigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationkullanimi.databinding.FragmentABinding
import com.example.navigationkullanimi.databinding.FragmentBBinding

class BFragment : Fragment() {
    private lateinit var binding : FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        val bundle : BFragmentArgs by navArgs()
        var incomingMessage = bundle.message
        binding.textViewMessage.text = incomingMessage

        return (binding.root)
    }
}