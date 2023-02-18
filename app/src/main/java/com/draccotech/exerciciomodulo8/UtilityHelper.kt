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
            Background.BACKGROUND3 -> Background.BACKGROUND1
        }
    }
}