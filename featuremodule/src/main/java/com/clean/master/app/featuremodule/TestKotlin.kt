package com.clean.master.app.featuremodule

import android.util.Log

class TestKotlin {
    init {
        dummy()
    }

    private fun dummy() {
        Log.d("sample","testkotlin")
    }

    fun geKotlinMessage(): String {
        return "Kotlin"
    }
}