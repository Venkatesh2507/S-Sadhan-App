package com.example.ssadhan;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssadhan.databinding.FragmentMutualFundTransactionBinding;

public class MutualFundFragment extends Fragment {

    public FragmentMutualFundTransactionBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentMutualFundTransactionBinding.inflate(getLayoutInflater());


       binding.tvSip.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

       binding.performanceCv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

        return binding.getRoot();


    }
}