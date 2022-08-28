package com.example.flowers_app.data

import com.example.flowers_app.R
import com.example.flowers_app.model.FlowerMenu

class Datasource {
    fun loadFlowers() : List<FlowerMenu>{
        return listOf(
            FlowerMenu(R.string.orchid, R.drawable.orchid),
            FlowerMenu(R.string.Tulip, R.drawable.tulip),
            FlowerMenu(R.string.Gardenia, R.drawable.gardenia),
            FlowerMenu(R.string.Lavender, R.drawable.lavender),
            FlowerMenu(R.string.Iris, R.drawable.iris),
            FlowerMenu(R.string.damascene, R.drawable.damascene)
        )
    }
}