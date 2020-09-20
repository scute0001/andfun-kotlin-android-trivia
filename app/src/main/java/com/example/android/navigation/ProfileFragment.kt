package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.navigation.databinding.FragmentProfileBinding

class ProfileFragment: Fragment() {
    val myProfile = MyName("Nori", "Magical Cat")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return inflater.inflate(R.layout.fragment_profile, container, false)
        val binding = DataBindingUtil.inflate<FragmentProfileBinding>(inflater, R.layout.fragment_profile, container, false)
        binding.myName = myProfile
        binding.apply {
            binding.aboutMeVText.text = "I'm ${myProfile.name}!!\n\n" + binding.aboutMeVText.text
            invalidateAll()
        }

        return binding.root
    }
}