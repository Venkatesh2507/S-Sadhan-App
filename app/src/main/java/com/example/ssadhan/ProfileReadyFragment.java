package com.example.ssadhan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ssadhan.databinding.FragmentProfileBinding;
import com.example.ssadhan.databinding.FragmentProfileReadyBinding;

public class ProfileReadyFragment extends Fragment {

    public FragmentProfileReadyBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileReadyBinding.inflate(getLayoutInflater());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_profileReadyFragment_to_enterPinFragment2);
            }
        });


        return binding.getRoot();
    }
}