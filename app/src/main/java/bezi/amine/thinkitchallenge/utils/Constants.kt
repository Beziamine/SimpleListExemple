package bezi.amine.thinkitchallenge.utils

import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.ui.main.model.ListEntity

object Constants {

    fun getList() : List<ListEntity>{

        val list = mutableListOf<ListEntity>()
        val listEntity1 = ListEntity()
        val listEntity2 = ListEntity()
        val listEntity3 = ListEntity()
        val listEntity4 = ListEntity()

        listEntity1.firstTitle = "Living Room"
        listEntity1.secondTitle = "4 Devices"
        listEntity1.image = R.drawable.livingroom

        listEntity2.firstTitle = "Media Room"
        listEntity2.secondTitle = "6 Devices"
        listEntity2.image = R.drawable.mediaroom

        listEntity3.firstTitle = "Bathroom"
        listEntity3.secondTitle = "1 Device"
        listEntity3.image = R.drawable.bathroom

        listEntity4.firstTitle = "Bedroom"
        listEntity4.secondTitle = "3 Devices"
        listEntity4.image = R.drawable.bedroom

        list.add(listEntity1)
        list.add(listEntity2)
        list.add(listEntity3)
        list.add(listEntity4)

        return list
    }
}