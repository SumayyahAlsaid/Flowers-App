package com.example.flowers_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flowers_app.adapter.FlowersAdapter
import com.example.flowers_app.data.Datasource
import com.example.flowers_app.databinding.FragmentFlowersMenuBinding
import com.example.flowers_app.databinding.FragmentNumberFlowersBinding

class FlowersMenuFragment() : Fragment() {

    private var _binding: FragmentFlowersMenuBinding? = null

    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFlowersMenuBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.rvFlowerMenu
        recyclerView.adapter = FlowersAdapter(Datasource().loadFlowers(),context)
        recyclerView.layoutManager = LinearLayoutManager(context)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}