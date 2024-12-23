package com.example.ssadhan;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.FragmentMutualFundBinding;
import com.example.ssadhan.databinding.FragmentSIPBinding;

public class SIPFragment extends Fragment {
    public FragmentSIPBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSIPBinding.inflate(getLayoutInflater());
        return binding.getRoot();


    }
}