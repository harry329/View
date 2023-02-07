package com.example.a6rivertest

data class TimeModelResponse(val id :String? , val currentDateTime : String, val utcOffset : String,
                             val isDayLightSavingsTime : Boolean, val dayOfTheWeek : String,
                             val timeZoneName : String, val  currentFileTime : Int,
                             val ordinalDate : String, val serviceResponse : String? )
