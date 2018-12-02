package com.simplemobiletools.gallery.pro.dialogs

import androidx.appcompat.app.AlertDialog
import com.simplemobiletools.commons.activities.BaseSimpleActivity
import com.simplemobiletools.commons.extensions.setupDialogStuff
import com.simplemobiletools.gallery.pro.R
import kotlinx.android.synthetic.main.dialog_other_aspect_ratio.view.*

class OtherAspectRatioDialog(val activity: BaseSimpleActivity, val callback: (aspectRatio: Pair<Int, Int>) -> Unit) {
    private val dialog: AlertDialog

    init {
        val view = activity.layoutInflater.inflate(R.layout.dialog_other_aspect_ratio, null).apply {
            other_aspect_ratio_2_1.setOnClickListener { ratioPicked(Pair(2, 1)) }
            other_aspect_ratio_3_2.setOnClickListener { ratioPicked(Pair(3, 2)) }
            other_aspect_ratio_4_3.setOnClickListener { ratioPicked(Pair(4, 3)) }
            other_aspect_ratio_5_3.setOnClickListener { ratioPicked(Pair(5, 3)) }
            other_aspect_ratio_16_9.setOnClickListener { ratioPicked(Pair(16, 9)) }
            other_aspect_ratio_19_9.setOnClickListener { ratioPicked(Pair(19, 9)) }

            other_aspect_ratio_1_2.setOnClickListener { ratioPicked(Pair(1, 2)) }
            other_aspect_ratio_2_3.setOnClickListener { ratioPicked(Pair(2, 3)) }
            other_aspect_ratio_3_4.setOnClickListener { ratioPicked(Pair(3, 4)) }
            other_aspect_ratio_3_5.setOnClickListener { ratioPicked(Pair(3, 5)) }
            other_aspect_ratio_9_16.setOnClickListener { ratioPicked(Pair(9, 16)) }
            other_aspect_ratio_9_19.setOnClickListener { ratioPicked(Pair(9, 19)) }
        }

        dialog = AlertDialog.Builder(activity)
                .setNegativeButton(R.string.cancel, null)
                .create().apply {
                    activity.setupDialogStuff(view, this)
                }
    }

    private fun ratioPicked(pair: Pair<Int, Int>) {
        callback(pair)
        dialog.dismiss()
    }
}