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
        binding.btnRed.setOnClickListener {
            binding.imgBox1.setOnClickListener {
                binding.imgBox1.setImageResource(R.drawable.btn_shp)

            }
            binding.imgBox2.setOnClickListener {
                binding.imgBox2.setImageResource(R.drawable.btn_shp)

            }
            binding.imgBox3.setOnClickListener {
                binding.imgBox3.setImageResource(R.drawable.btn_shp)

            }
            binding.imgBox4.setOnClickListener {
                binding.imgBox4.setImageResource(R.drawable.btn_shp)

            }
            binding.imgBox5.setOnClickListener {
                binding.imgBox5.setImageResource(R.drawable.btn_shp)

            }
        }
        binding.btnYellow.setOnClickListener {
            binding.imgBox1.setOnClickListener {
                binding.imgBox1.setImageResource(R.drawable.btn_shp2)

            }
            binding.imgBox2.setOnClickListener {
                binding.imgBox2.setImageResource(R.drawable.btn_shp2)

            }
            binding.imgBox3.setOnClickListener {
                binding.imgBox3.setImageResource(R.drawable.btn_shp2)

            }
            binding.imgBox4.setOnClickListener {
                binding.imgBox4.setImageResource(R.drawable.btn_shp2)

            }
            binding.imgBox5.setOnClickListener {
                binding.imgBox5.setImageResource(R.drawable.btn_shp2)

            }
        }
        binding.btnGreen.setOnClickListener {
            binding.imgBox1.setOnClickListener {
                binding.imgBox1.setImageResource(R.drawable.btn_shp3)

            }
            binding.imgBox2.setOnClickListener {
                binding.imgBox2.setImageResource(R.drawable.btn_shp3)

            }
            binding.imgBox3.setOnClickListener {
                binding.imgBox3.setImageResource(R.drawable.btn_shp3)

            }
            binding.imgBox4.setOnClickListener {
                binding.imgBox4.setImageResource(R.drawable.btn_shp3)

            }
            binding.imgBox5.setOnClickListener {
                binding.imgBox5.setImageResource(R.drawable.btn_shp3)

            }
        }
    }
}