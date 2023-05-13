package kg.geeks.foodlin.main.stuffs_adapter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Stuff(
    val title: String,
    val isOpen: String,
    val reviewGrade: Double,
    val numReviews: Int,
    val adjective:String,
    val stuff: String,
    val deliveryPrice: String,
    val minPrice: Double,
    val distance: Double,
    val cookTime: String,
    val image: Int
): Parcelable
