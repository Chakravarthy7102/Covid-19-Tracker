package android.example.kotlinclone

import com.google.gson.annotations.SerializedName
import java.util.*

data class CovidData(
    val dateChecked:Date,
    val negativeIncrease:Int,
    val positiveIncrease:Int,
    val deathIncrease :Int,
    val state :String
)


