package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.BottomSheetKycInProgressBinding;

public class KYCCheckFragment extends Fragment {


    public BottomSheetKycInProgressBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = BottomSheetKycInProgressBinding.inflate(getLayoutInflater());

        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_KYCCheckFragment_to_KYCCheckCompletionFragment);
            }
        });

        return binding.getRoot();
    }
}