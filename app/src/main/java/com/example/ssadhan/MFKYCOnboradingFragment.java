package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.BottomSheetKycVerifyBinding;

public class MFKYCOnboradingFragment extends Fragment {


    public BottomSheetKycVerifyBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = BottomSheetKycVerifyBinding.inflate(inflater, container, false);


        binding.proceedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_MFKYCOnboradingFragment2_to_MFKYCOpenFragment);
            }
        });
        return binding.getRoot();
    }
}