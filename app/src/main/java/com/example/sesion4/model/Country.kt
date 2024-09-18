package com.example.sesion4.model

class Country {
    var name: String
    var capital: String

    constructor(name: String, capital: String) {
        this.name = name
        this.capital = capital
    }
    override fun toString():String{
        return name
    }

}