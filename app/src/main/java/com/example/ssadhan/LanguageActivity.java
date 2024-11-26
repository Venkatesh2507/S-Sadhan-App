package com.example.ssadhan;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.ssadhan.databinding.ActivityLanguageBinding;


public class LanguageActivity extends AppCompatActivity {
    public ActivityLanguageBinding binding;
    private int selectedCV = 0;
    ConstraintLayout layout;
    TextView textView1,textView2;
    ImageView rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLanguageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.englishCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedCV == 0){
                    binding.submitBtn.setBackgroundResource(R.drawable.button_background);
                    binding.englishLayout.setBackgroundResource(R.drawable.button_selected_background);
                    binding.englishTv.setTextColor(Color.BLUE);
                    binding.englishTv2.setTextColor(Color.BLUE);
                    binding.englishRb.setVisibility(View.VISIBLE);
                    rb = binding.englishRb;
                    layout = binding.englishLayout;
                    textView1 = binding.englishTv;
                    textView2 = binding.englishTv2;
                    selectedCV = 1;
                }
                else{
                    layout.setBackgroundResource(R.drawable.cardview_background);
                    textView1.setTextColor(Color.BLACK);
                    textView2.setTextColor(Color.BLACK);
                    rb.setVisibility(View.INVISIBLE);
                    binding.englishLayout.setBackgroundResource(R.drawable.button_selected_background);
                    binding.englishTv.setTextColor(Color.BLUE);
                    binding.englishTv2.setTextColor(Color.BLUE);
                    binding.englishRb.setVisibility(View.VISIBLE);
                    layout = binding.englishLayout;
                    textView1 = binding.englishTv;
                    textView2 = binding.englishTv2;
                    rb = binding.englishRb;
                    selectedCV = 1;
                }
            }
        });
        binding.marathiCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedCV == 0){
                    binding.submitBtn.setBackgroundResource(R.drawable.button_background);
                    binding.marathiLayout.setBackgroundResource(R.drawable.button_selected_background);
                    binding.marathiTv.setTextColor(Color.BLUE);
                    binding.marathiTv2.setTextColor(Color.BLUE);
                    binding.marathiRb.setVisibility(View.VISIBLE);
                    rb = binding.marathiRb;
                    textView1 = binding.marathiTv;
                    textView2 = binding.marathiTv2;
                    layout = binding.marathiLayout;
                    selectedCV = 1;
                }
                else{
                    layout.setBackgroundResource(R.drawable.cardview_background);
                    textView1.setTextColor(Color.BLACK);
                    textView2.setTextColor(Color.BLACK);
                    rb.setVisibility(View.INVISIBLE);
                    binding.marathiLayout.setBackgroundResource(R.drawable.button_selected_background);
                    binding.marathiTv.setTextColor(Color.BLUE);
                    binding.marathiTv2.setTextColor(Color.BLUE);
                    binding.marathiRb.setVisibility(View.VISIBLE);
                    layout = binding.marathiLayout;
                    textView1 = binding.marathiTv;
                    textView2 = binding.marathiTv2;
                    rb = binding.marathiRb;
                    selectedCV = 1;
                }
            }
        });
        binding.hindiCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedCV == 0){
                    binding.submitBtn.setBackgroundResource(R.drawable.button_background);
                    binding.hindiLayout.setBackgroundResource(R.drawable.button_selected_background);
                    binding.hindiTv.setTextColor(Color.BLUE);
                    binding.hindiTv2.setTextColor(Color.BLUE);
                    binding.hindiRb.setVisibility(View.VISIBLE);
                    rb = binding.hindiRb;
                    textView1 = binding.hindiTv;
                    textView2 = binding.hindiTv2;
                    layout = binding.hindiLayout;
                    selectedCV = 1;
                }
                else{
                    layout.setBackgroundResource(R.drawable.cardview_background);
                    textView1.setTextColor(Color.BLACK);
                    textView2.setTextColor(Color.BLACK);
                    rb.setVisibility(View.INVISIBLE);
                    binding.hindiLayout.setBackgroundResource(R.drawable.button_selected_background);
                    binding.hindiTv.setTextColor(Color.BLUE);
                    binding.hindiTv2.setTextColor(Color.BLUE);
                    binding.hindiRb.setVisibility(View.VISIBLE);
                    layout = binding.hindiLayout;
                    textView1 = binding.hindiTv;
                    textView2 = binding.hindiTv2;
                    rb = binding.hindiRb;
                    selectedCV = 1;
                }
            }
        });

    }
}