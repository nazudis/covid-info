package com.fauzan.covid.model

data class IndonesiaData (
    val confirmed : ConfirmedId,
    val recovered : RecoveredId,
    val deaths : DeathsId
)

class DeathsId (val value : Int)

class RecoveredId (val value: Int)

class ConfirmedId (val value: Int)
