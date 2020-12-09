package com.srang03.checkyourphysical

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

open class InfoView @JvmOverloads constructor (context: Context,
                                               attrs: AttributeSet? = null,
                                               defStyleAttr: Int = 0)
    : LinearLayout(context, attrs, defStyleAttr) {
    init {
        inflate(context, R.layout.view_info, this)
    }

}