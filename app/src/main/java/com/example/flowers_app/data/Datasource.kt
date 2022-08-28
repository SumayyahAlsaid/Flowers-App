package com.example.flowers_app.data

import com.example.flowers_app.R
import com.example.flowers_app.model.FlowerMenu

class Datasource {
    fun loadFlowers() : List<FlowerMenu>{
        return listOf(
            FlowerMenu(R.string.see_menu, R.drawable.o),
            FlowerMenu(R.string.see_menu, R.drawable.o),
            FlowerMenu(R.string.see_menu, R.drawable.o),
            FlowerMenu(R.string.see_menu, R.drawable.o),
            FlowerMenu(R.string.see_menu, R.drawable.o),
            FlowerMenu(R.string.see_menu, R.drawable.o)
        )
    }
}