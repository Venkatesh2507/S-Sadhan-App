package com.example.ssadhan;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.FragmentMutualFundSipTransactBinding;


public class SIPFragment extends Fragment {
    public FragmentMutualFundSipTransactBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMutualFundSipTransactBinding.inflate(getLayoutInflater());
        return binding.getRoot();


    }
}