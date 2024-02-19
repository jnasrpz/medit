package com.moiseeva.test.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.moiseeva.test.R
import com.moiseeva.test.recadapters.FeelRecycler
import com.moiseeva.test.recadapters.feel.MyFeel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        //var feelRec : View = inflater.inflate(R.layout.feel_adapter,container,false)
        val root: View = inflater.inflate(R.layout.fragment_home,container, false)

        val feel_rec: RecyclerView = root.findViewById(R.id.feel_rec)
        feel_rec.layoutManager = LinearLayoutManager(feel_rec.context, LinearLayoutManager.HORIZONTAL,false)
        feel_rec.adapter = FeelRecycler(requireContext(), MyFeel().list)
        return (root)
    }
}