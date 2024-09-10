package com.oscar.Countries.utils

import java.text.NumberFormat

fun formatNumber(number: Int): String {
    val formatter = NumberFormat.getInstance()
    return formatter.format(number)}