package com.example.soclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.soclient.databinding.FragmentAskQuestionBinding;

public class FragmentAskQuestion extends Fragment {

    FragmentAskQuestionBinding mBinding;

    public static FragmentAskQuestion newInstance() {
        return new FragmentAskQuestion();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_ask_question, container, false);

        return mBinding.getRoot();
    }
}
