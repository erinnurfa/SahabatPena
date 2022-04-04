package com.erin.sahabatpena

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erin.sahabatpena.databinding.ActivityPenggunaBinding

class PenggunaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPenggunaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengguna)

        // menampilkan layout: activity_pengguna menggunakan konsep/metode binding
        binding = ActivityPenggunaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // memberikan klik listener pada button dengan id: tombolQuotes
        // saat button diklik akan menjalankan fungsi cekQuotes
        binding.tombolQuotes.setOnClickListener { cekQuotes() }

        binding.tombolPuisi.setOnClickListener { cekPuisi() }

        binding.tombolCerpen.setOnClickListener { cekCerpen() }
    }

    private fun cekCerpen() {
        // menyiapkan variabel intentPengguna dari class Intent, konfigurasi/parameter yang digunakan
        // dari activity yang aktif sekarang (PenggunaActivity ke class CerpenActivity)
        val intentCerpen = Intent( this, CerpenActivity::class.java)
        // activity dijalankan
        startActivity(intentCerpen)
    }

    private fun cekPuisi() {
        // menyiapkan variabel intentPengguna dari class Intent, konfigurasi/parameter yang digunakan
        // dari activity yang aktif sekarang (PenggunaActivity ke class PuisiActivity)
        val intentPuisi = Intent(this, PuisiActivity::class.java)
        // activity dijalankan
        startActivity(intentPuisi)
    }

    private fun cekQuotes() {
        // menyiapkan variabel intentPengguna dari class Intent, konfigurasi/parameter yang digunakan
        // dari activity yang aktif sekarang (PenggunaActivity ke class QuotesActivity)
        val intentQuotes = Intent(this, QuotesActivity::class.java)
        // activity dijalankan
        startActivity(intentQuotes)
    }
}



