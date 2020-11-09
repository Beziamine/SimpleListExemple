package bezi.amine.thinkitchallenge.ui.main.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import androidx.navigation.fragment.NavHostFragment
import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        if(Utils.getFirstLaunch(this)){
            Utils.setFirstLaunch(this,false)
            setFirstNavigation()
        } else {
            setSecondNavigation()
        }
    }

    private fun setFirstNavigation(){
        val navHostFragment: NavHostFragment = nav_host_fragment as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        val graph = inflater.inflate(R.navigation.navigation_mobile)
        navHostFragment.navController.graph = graph
    }


    private fun setSecondNavigation(){
        val navHostFragment: NavHostFragment = nav_host_fragment as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        val graph = inflater.inflate(R.navigation.second_navigation_mobile)
        navHostFragment.navController.graph = graph
    }


    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (currentFocus != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }
}