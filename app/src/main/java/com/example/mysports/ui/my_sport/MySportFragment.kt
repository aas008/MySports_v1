package com.example.mysports.ui.my_sport

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.mysports.R
import com.example.mysports.databinding.FragmentMysportsBinding

class MySportFragment : Fragment() {

    private var _binding: FragmentMysportsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(MySportViewModel::class.java)

        _binding = FragmentMysportsBinding.inflate(inflater, container, false)
       val root: View = binding.root

        val textView: TextView = binding.textMySport
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

      return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
//        val B = findViewById<Button>(R.id.button_basketball)
//        B.setOnClickListener {
//            val fragmentManager=supportFragmentManager
//            val fragmentTransaction=fragmentManager.beginTransaction()
//            fragmentTransaction.replace(R.id.fragment_mysports,fragment_basketball)
//            fragmentTransaction.commit()
//        }
//}
//        val view = inflater.inflate(R.layout.fragment_basketball,  container, false)
//        view.findViewById<Button> (R.id.button_basketball)?.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.navigation_basketball, null)
//        )