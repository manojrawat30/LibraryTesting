package com.nivesh.production.mytoastlibrary

import android.content.Context
import android.widget.Toast

class Util {

    companion object {
        fun msg(context: Context?, msg: String?) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}