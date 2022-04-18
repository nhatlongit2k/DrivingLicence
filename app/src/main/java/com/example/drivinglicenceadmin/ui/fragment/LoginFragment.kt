package com.example.drivinglicenceadmin.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drivinglicenceadmin.R
import com.example.drivinglicenceadmin.databinding.FragmentLoginBinding
import com.example.drivinglicenceadmin.ui.activity.HomeActivity
import com.example.drivinglicenceadmin.ui.activity.LoginActivity

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.btFragmentloginLogin.setOnClickListener {
            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
        return binding.root
    }
}