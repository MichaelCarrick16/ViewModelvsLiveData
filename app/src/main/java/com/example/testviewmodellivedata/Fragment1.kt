package com.example.testviewmodellivedata

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.frag_01.*

class Fragment1 : Fragment() {
    private lateinit var viewModel : CountViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag_01,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(CountViewModel::class.java)

        viewModel.count.observe(requireActivity(), Observer {
            tv_count.setText(viewModel.count.value.toString())
        })

        bt_count.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                viewModel.count.value = viewModel.count.value?.plus(1)
            }

        })
    }
}