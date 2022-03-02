package com.nikhileshsinha.paymentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.nikhileshsinha.paymentapplication.databinding.FragmentSendMoneyBinding


class SendMoneyFragment : Fragment() {

    private var _binding: FragmentSendMoneyBinding? =null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSendMoneyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // todo: main code
        binding.btnNext.setOnClickListener{
            val nam = binding.nameOfSender.text.toString()
            val amount = binding.fillAmount.text.toString().toFloat()

            if(nam == null || amount == null){
                Toast.makeText(activity,"Empty UPI id or amount will not allowed", Toast.LENGTH_SHORT).show()
                binding.nameOfSender.requestFocus()
            }
            else{
                val dir1 = SendMoneyFragmentDirections.actionSendMoneyFragmentToPasswordFragment(nam, amount)
                findNavController().navigate(dir1)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}