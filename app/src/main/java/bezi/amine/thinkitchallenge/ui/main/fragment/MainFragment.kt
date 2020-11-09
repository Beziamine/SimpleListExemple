package bezi.amine.thinkitchallenge.ui.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import bezi.amine.thinkitchallenge.R
import bezi.amine.thinkitchallenge.ui.main.adapter.ListAdapter
import bezi.amine.thinkitchallenge.utils.Constants
import bezi.amine.thinkitchallenge.utils.Utils
import kotlinx.android.synthetic.main.fragment_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val recyclerView = rv_main
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        initUsername(Utils.getUsername(context!!))
        initDate()
        initList()
    }

    private fun initUsername(username : String?) {
        tv_second.text = "Welcome, " + username + "!"
    }

    private fun initDate() {
        val date = getCurrentDateTime()
        val dateInString = date.toString("MMMM dd ,yyyy")
        tv_first.text = dateInString
    }

    private fun initList() {
        rv_main.adapter = ListAdapter(view?.context,Constants.getList())
    }

    private fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
        val formatter = SimpleDateFormat(format, locale)
        return formatter.format(this)
    }

    private fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }

}