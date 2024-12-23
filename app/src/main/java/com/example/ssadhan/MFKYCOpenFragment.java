package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.FragmentMFKYCOpenBinding;

public class MFKYCOpenFragment extends Fragment {


    public FragmentMFKYCOpenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMFKYCOpenBinding.inflate(getLayoutInflater());

        binding.btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_MFKYCOpenFragment_to_KYCCheckFragment);
            }
        });

        return binding.getRoot();
    }
}