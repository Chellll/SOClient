package com.example.soclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.soclient.databinding.FragmentAllQuestionBinding;

public class FragmentAllQuestion extends Fragment {

    FragmentAllQuestionBinding mBinding;

    public static FragmentAllQuestion newInstance() {
        return new FragmentAllQuestion();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_all_question, container, false);

        return mBinding.getRoot();
    }
}
