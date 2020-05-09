package com.example.soclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.soclient.databinding.FragmentMyQuestionBinding;

public class FragmentMyQestion extends Fragment {

    FragmentMyQuestionBinding mBinding;

    public static FragmentMyQestion newInstance() {
        return new FragmentMyQestion();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_question, container, false);

        return mBinding.getRoot();
    }
}
