package com.example.colorbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.colorbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnRed.setOnClickListener {
                imgBox1.setOnClickListener {
                    imgBox1.setImageResource(R.drawable.btn_shp)
                }
                imgBox2.setOnClickListener {
                    imgBox2.setImageResource(R.drawable.btn_shp)
                }
                imgBox3.setOnClickListener {
                    imgBox3.setImageResource(R.drawable.btn_shp)
                }
                imgBox4.setOnClickListener {
                    imgBox4.setImageResource(R.drawable.btn_shp)
                }
                imgBox5.setOnClickListener {
                    imgBox5.setImageResource(R.drawable.btn_shp)
                }
            }
        }
        binding.apply {
            btnYellow.setOnClickListener {
                imgBox1.setOnClickListener {
                    imgBox1.setImageResource(R.drawable.btn_shp2)
                }
                imgBox2.setOnClickListener {
                    imgBox2.setImageResource(R.drawable.btn_shp2)
                }
                imgBox3.setOnClickListener {
                    imgBox3.setImageResource(R.drawable.btn_shp2)
                }
                imgBox4.setOnClickListener {
                    imgBox4.setImageResource(R.drawable.btn_shp2)
                }
                imgBox5.setOnClickListener {
                    imgBox5.setImageResource(R.drawable.btn_shp2)
                }
            }
        }
        binding.apply {
            btnGreen.setOnClickListener {
                imgBox1.setOnClickListener {
                    imgBox1.setImageResource(R.drawable.btn_shp3)
                }
                imgBox2.setOnClickListener {
                    imgBox2.setImageResource(R.drawable.btn_shp3)
                }
                imgBox3.setOnClickListener {
                    imgBox3.setImageResource(R.drawable.btn_shp3)
                }
                imgBox4.setOnClickListener {
                    imgBox4.setImageResource(R.drawable.btn_shp3)
                }
                imgBox5.setOnClickListener {
                    imgBox5.setImageResource(R.drawable.btn_shp3)
                }
            }
        }
    }
}