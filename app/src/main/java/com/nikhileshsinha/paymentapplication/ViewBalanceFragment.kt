package com.nikhileshsinha.paymentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nikhileshsinha.paymentapplication.databinding.FragmentViewBalanceBinding


class ViewBalanceFragment : Fragment() {
    private var _binding: FragmentViewBalanceBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewBalanceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // todo: main code
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}