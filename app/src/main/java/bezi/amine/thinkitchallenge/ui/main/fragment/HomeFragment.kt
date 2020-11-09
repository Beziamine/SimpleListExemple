package bezi.amine.thinkitchallenge.ui.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.utils.Utils
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_home.setOnClickListener{
            if(et_first.text.isNotEmpty()){
                Utils.setUsername(context!!,et_first.text.toString())
                it.findNavController().navigate(R.id.action_navigation_home_to_main)
            }else{
                Toast.makeText(context!!, "Your name is empty !", Toast.LENGTH_SHORT).show()
            }
        }
    }
}