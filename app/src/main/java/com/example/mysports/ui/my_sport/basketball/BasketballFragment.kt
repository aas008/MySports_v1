package com.example.mysports.ui.my_sport.basketball

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mysports.databinding.FragmentBasketballBinding

class BasketballFragment : Fragment() {

    private var _binding: FragmentBasketballBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(BasketballViewModel::class.java)

        _binding = FragmentBasketballBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBasketball
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

