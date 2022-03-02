package com.nikhileshsinha.paymentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.nikhileshsinha.paymentapplication.databinding.FragmentPasswordBinding

class PasswordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // todo: main code
        val args = PasswordFragmentArgs.fromBundle(requireArguments())
        binding.name.text = args.name
        binding.amount.text = args.amount.toString()

        binding.btnConform.setOnClickListener{
            if(binding.pinTxt.text.toString() == "1234"){
                val nameOfreceptant = args.name
                val money = args.amount
                val direct123 = PasswordFragmentDirections.actionPasswordFragmentToStatusFragment( nameOfreceptant, money)
                findNavController().navigate(direct123)
            }
            else{
                Toast.makeText(activity, "Enter correct PIN",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}