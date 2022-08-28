package com.example.flowers_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.flowers_app.R
import com.example.flowers_app.databinding.FragmentTypeBinding
import com.example.flowers_app.model.OrderViewModel


class TypeFragment : Fragment() {

    private var binding: FragmentTypeBinding? = null

    // reference to the shared view model
    private val sharedViewModel : OrderViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentTypeBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            typeFragment = this@TypeFragment
        }
    }

    fun goToNextScreen() {
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_typeFragment_to_pickupFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}