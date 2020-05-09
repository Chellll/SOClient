package com.example.soclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.soclient.databinding.FragmentAboutBinding;

public class FragmentAbout extends Fragment {

    FragmentAboutBinding mBinding;

    public static FragmentAbout newInstance() {
        return new FragmentAbout();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false);

        return mBinding.getRoot();
    }
}
