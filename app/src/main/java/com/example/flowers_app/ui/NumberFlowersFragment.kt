package com.example.flowers_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flowers_app.R
import com.example.flowers_app.data.Datasource
import com.example.flowers_app.databinding.FragmentNumberFlowersBinding
import com.example.flowers_app.databinding.FragmentStartBinding
import com.example.flowers_app.model.OrderViewModel


class NumberFlowersFragment : Fragment() {

    private var binding: FragmentNumberFlowersBinding? = null

    private val sharedViewModel : OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentNumberFlowersBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.numberFlowersFragment = this
    }

    fun orderFlowers(quantity: Int) {
        sharedViewModel.setQuantity(quantity)
        if (sharedViewModel.hasNoFlavorSet()){
            sharedViewModel.setFlavor(getString(R.string.vanilla))
        }
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_flavorFragment)
    }


    fun startNow() {
        if (sharedViewModel.hasNoFlavorSet()){
            sharedViewModel.setFlavor(getString(R.string.vanilla))
        }
        // Nav Controller, Navigation action
        findNavController().navigate(R.id.action_startFragment_to_flavorFragment)
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}