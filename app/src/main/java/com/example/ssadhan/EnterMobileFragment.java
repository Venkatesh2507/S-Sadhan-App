package com.example.ssadhan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.ssadhan.databinding.FragmentLoginBinding;

import java.util.ArrayList;


public class EnterMobileFragment extends Fragment {
    private FragmentLoginBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(getLayoutInflater());


        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.image_slider_4, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.image_slider_2, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.image_slider_1, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.image_slider_3, ScaleTypes.CENTER_INSIDE));
        binding.sliderIv.setImageList(imageList);


        binding.agreementTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://backend.sadhanwealth.com/termAndConditions-en"));
                startActivity(intent);
            }
        });
        binding.textInputLayout.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                binding.getOtpBtn.setBackgroundResource(R.drawable.button_background);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.getOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_enterMobileFragment_to_verifyOtpFragement);
            }
        });

        return binding.getRoot();
    }
}