package com.oscar.several_petition.data.model.country

import com.google.gson.annotations.SerializedName

data class RespuestaDto(
    @SerializedName("Resultado") val resultado: Boolean,
    @SerializedName("Entidades") val entidades: ArrayList<CountryDto>,
    @SerializedName("Mensajes") val mensajes: List<Any>,
    @SerializedName("TipoNotificacion") val tipoNotificacion: Int
)
