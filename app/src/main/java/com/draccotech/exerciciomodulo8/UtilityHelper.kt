package com.draccotech.exerciciomodulo8

object UtilityHelper {

    private var current: Background = Background.BACKGROUND1

    fun getCurrent(): Background{
        return this.current
    }

    fun getResource(): Int{
        return this.current.id
    }

    fun setCurrent(resource: Background){
        this.current = resource
    }

    fun changeBackground(changeBack: Background): Background {
        return when(changeBack){
            Background.BACKGROUND1 -> Background.BACKGROUND2
            Background.BACKGROUND2 -> Background.BACKGROUND3
            Background.BACKGROUND3 -> Background.BACKGROUND4
            Background.BACKGROUND4 -> Background.BACKGROUND5
            Background.BACKGROUND5 -> Background.BACKGROUND6
            Background.BACKGROUND6 -> Background.BACKGROUND7
            Background.BACKGROUND7 -> Background.BACKGROUND8
            Background.BACKGROUND8 -> Background.BACKGROUND9
            Background.BACKGROUND9 -> Background.BACKGROUND10
            Background.BACKGROUND10 -> Background.BACKGROUND11
            Background.BACKGROUND11 -> Background.BACKGROUND12
            Background.BACKGROUND12 -> Background.BACKGROUND13
            Background.BACKGROUND13 -> Background.BACKGROUND14
            Background.BACKGROUND14 -> Background.BACKGROUND15
            Background.BACKGROUND15 -> Background.BACKGROUND16
            Background.BACKGROUND16 -> Background.BACKGROUND17
            Background.BACKGROUND17 -> Background.BACKGROUND18
            Background.BACKGROUND18 -> Background.BACKGROUND19
            Background.BACKGROUND19 -> Background.BACKGROUND20
            Background.BACKGROUND20 -> Background.BACKGROUND1
        }
    }
}