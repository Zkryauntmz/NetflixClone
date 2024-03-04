package com.example.netflixclone.ui.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.netflixclone.data.entity.Filmler
import com.example.netflixclone.databinding.FragmentAnasayfaBinding
import com.example.netflixclone.ui.adapter.FilmlerAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentAnasayfaBinding.inflate(inflater, container, false)

        var filmlerListesi = ArrayList<Filmler>()

        // Filmleri yükle
        var f1 = Filmler( 1,"bad","Macera")
        var f2 = Filmler( 2,"blackmirror","Macera")
        var f3 = Filmler( 3, "lacasa","Macera");
        var f4 = Filmler( 4,  "narcos","Macera")
        var f5 = Filmler( 5, "peaky","Macera")
       var f6 = Filmler( 6,  "quin","Macera")
        var f7 = Filmler( 7, "suit","Macera")
        var f8 = Filmler( 8,  "vikings","Macera")

        var f9 = Filmler( 9,  "alice","Macera")


        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)
        filmlerListesi.add(f7)
        filmlerListesi.add(f8)
        filmlerListesi.add(f9)





        val filmlerAdapter = FilmlerAdapter(requireContext(),filmlerListesi)
            binding.rvList.adapter = filmlerAdapter
        binding.rvList.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)



     binding.rv2.adapter = filmlerAdapter
     binding.rv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)











     return binding.root
    }


}