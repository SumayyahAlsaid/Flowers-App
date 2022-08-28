package com.example.flowers_app.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.flowers_app.R
import com.example.flowers_app.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var binding: FragmentStartBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.startFragment = this
    }

    fun seeMenu() {
        findNavController().navigate(R.id.action_startFragment_to_flowersMenuFragment)
    }

    fun orderNow() {
        findNavController().navigate(R.id.action_startFragment_to_numberFlowersFragment)
    }

    fun showLocation() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("geo:24.633333,46.716667"))
        var intentChooser = Intent.createChooser(intent,"Show flowers shop map")
        startActivity(intentChooser)
    }

    fun showPhoneNumber(){
        val phoneNumber = +966342974532
        val intent = Intent(Intent.ACTION_CALL)
        intent.data = Uri.parse("tel:$phoneNumber")
        startActivity(intent)
    }


}