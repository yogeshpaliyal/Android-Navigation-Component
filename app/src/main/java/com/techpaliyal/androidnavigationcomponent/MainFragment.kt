package com.techpaliyal.androidnavigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.techpaliyal.androidnavigationcomponent.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        binding.btnBasic.setOnClickListener {
            findNavController().navigate(R.id.basicFragment)
        }

        binding.btnArgumented.setOnClickListener {
            val action = MainFragmentDirections.startArgumentedFragment("Yogesh")
            findNavController().navigate(action)
        }

        return binding.root
    }



}
