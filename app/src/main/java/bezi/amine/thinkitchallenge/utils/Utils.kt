package bezi.amine.thinkitchallenge.utils

import android.content.Context

object Utils {

    fun setFirstLaunch(context : Context, value :Boolean){
        val preference = context.getSharedPreferences("FirstLaunch", Context.MODE_PRIVATE)
        val editor= preference.edit()
        editor.putBoolean("IsFirstLaunch",value)
        editor.commit()
    }

    fun getFirstLaunch(context : Context) : Boolean {
        val preference = context.getSharedPreferences("FirstLaunch",Context.MODE_PRIVATE)
        return preference.getBoolean("IsFirstLaunch",true)
    }


    fun setUsername(context : Context, mode: String){
        val preference = context.getSharedPreferences("Username",Context.MODE_PRIVATE)
        val editor= preference.edit()
        editor.putString("Username",mode)
        editor.commit()
    }

    fun getUsername(context : Context) : String? {
        val preference = context.getSharedPreferences("Username",Context.MODE_PRIVATE)
        return preference.getString("Username","")
    }

}