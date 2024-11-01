package com.salsabilazahrasarwo.maps_mi2c

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salsabilazahrasarwo.maps_mi2c.adapter.adapterwisata
import com.salsabilazahrasarwo.maps_mi2c.model.modelwisata

class ListMapActivity : AppCompatActivity() {
    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: adapterwisata
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_map)
        val menuIcons = listOf(
            modelwisata(
                R.drawable.jam_gadang,
                "Jam gadang Bukittinggi",
                "Bukittinggi, Sumatera Barat",
                "Jam Gadang adalah menara jam yang menjadi penanda atau ikon Kota Bukittinggi Sumatera Barat Indonesia. Menara jam ini menjulang setinggi 27 meter dan diresmikan pembangunannya pada 25 Juli 1927",
                -0.3049441760037679,
                100.36948795756079
            ),
            modelwisata(
                R.drawable.pink_beach,
                "Pink Beach",
                "Pulau Komodo, Nusa Tenggara Timur",
                "Pink Beach atau Pantai Merah adalah pantai yang memiliki pasir berwarna merah muda.Pink Beach juga merupakan bagian dari Taman Nasional Komodo, yang merupakan situs warisan dunia UNESCO. Di Pulau Komodo, Anda juga bisa melihat hewan komodo, hewan purba yang selamat dari letusan Gunung Krakatau",
                -8.601181872327755,
                119.51978299471368
            ),
            modelwisata(
                R.drawable.banda_neira,
                "Banda Neira",
                "Kepulauan Banda, Kabupaten Maluku Tengah, Provinsi Maluku.",
                "Banda Neira merupakan salah satu tujuan wisata yang populer di Indonesia. Pulau ini menawarkan berbagai macam atraksi wisata, seperti snorkeling, diving, hiking, dan wisata sejarah. 6. Banda Neira memiliki julukan sebagai Surga Kecil di Timur Indonesia",
                -4.517483285242597,
                129.9039979575612
            ),
            modelwisata(
                R.drawable.bromo,
                "Bromo",
                "Jawa Timur",
                "Wisata Gunung Bromo adalah salah satu tempat wisata di indonesia yang menjadi favorit bagi wisatawan baik dalam negeri maupun luar negeri. Gunung Bromo terletak di Kabupaten Probolinggo. Gunung Bromo memiliki ketinggian sekitar 2392 mdpl.",
                -7.941592884759805,
                112.95321508448089
            ),

        )
        RecyclerViewMenu = findViewById(R.id.rvwisata)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = adapterwisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}