package com.jy.quizappfirebase.core.di

import android.util.Log

object Utils {
    fun debugLog (tag: String = "debugging"): (Any) -> Unit {
        return { Log.d(tag, it.toString()) }
    }
}