package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.FragmentKYCCheckCompletionBinding;

public class KYCCheckCompletionFragment extends Fragment {

    public FragmentKYCCheckCompletionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKYCCheckCompletionBinding.inflate(getLayoutInflater());

        binding.exploreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_KYCCheckCompletionFragment_to_homeActivity);
            }
        });

        return binding.getRoot();
    }
}