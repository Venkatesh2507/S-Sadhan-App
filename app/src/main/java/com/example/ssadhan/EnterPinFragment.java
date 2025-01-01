package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssadhan.databinding.FragmentPinLoginBinding;

public class EnterPinFragment extends Fragment {

    public FragmentPinLoginBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPinLoginBinding.inflate(getLayoutInflater());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_enterPinFragment2_to_MFKYCOnboradingFragment2);
            }
        });

        return binding.getRoot();
    }
}