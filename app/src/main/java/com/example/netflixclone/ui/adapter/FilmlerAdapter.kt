package com.example.netflixclone.ui.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixclone.data.entity.Filmler
import com.example.netflixclone.databinding.CardTasarimiBinding

class FilmlerAdapter(var mContext: Context, var FilmlerListesi: ArrayList<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: CardTasarimiBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimiBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {//0,1,2
        val film = this.FilmlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))


        //val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi = kisi)
        //Navigation.findNavController(it).navigate(gecis)
    }

    override fun getItemCount(): Int {
        return FilmlerListesi.size
    }
}