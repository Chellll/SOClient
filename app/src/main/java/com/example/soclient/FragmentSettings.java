package com.example.soclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.soclient.databinding.FragmentSettingsBinding;

public class FragmentSettings extends Fragment {

    FragmentSettingsBinding mBinding;

    public static FragmentSettings newInstance() {
        return new FragmentSettings();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false);

        return mBinding.getRoot();
    }
}
