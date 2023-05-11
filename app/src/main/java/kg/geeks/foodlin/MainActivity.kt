package kg.geeks.foodlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hide app title
        supportActionBar?.hide()
        navigation()
    }

    private fun navigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view_main) as NavHostFragment
        val navController = navHostFragment.navController
        navController.navigate(R.id.mainFragment)
    }
}