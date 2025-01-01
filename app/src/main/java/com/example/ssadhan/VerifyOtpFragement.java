package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.ssadhan.databinding.FragmentVerifyOtpBinding;


import java.util.ArrayList;


public class VerifyOtpFragement extends Fragment {
    public FragmentVerifyOtpBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentVerifyOtpBinding.inflate(getLayoutInflater());

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.image_slider_4, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.image_slider_2, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.image_slider_1, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.image_slider_3, ScaleTypes.CENTER_INSIDE));
        binding.sliderIv.setImageList(imageList);


        binding.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_verifyOtpFragement_to_profileReadyFragment);
            }
        });

        return binding.getRoot();
    }
}