package com.techpaliyal.androidnavigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.techpaliyal.androidnavigationcomponent.databinding.FragmentArgumentedBinding


class ArgumentedFragment : Fragment() {

    val params : ArgumentedFragmentArgs by navArgs()

    lateinit var binding : FragmentArgumentedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_argumented, container, false)
        binding.txt.text = params.firstName
        return binding.root
    }



}
