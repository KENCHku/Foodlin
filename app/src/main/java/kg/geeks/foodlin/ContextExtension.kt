package kg.geeks.foodlin

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide


fun Context.makeToastMsg(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun ImageView.glideLoadImg(url: String){
    Glide.with(this).load(url).into(this)
}