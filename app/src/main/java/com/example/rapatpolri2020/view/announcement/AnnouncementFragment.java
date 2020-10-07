package com.example.rapatpolri2020.view.announcement;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.rapatpolri2020.R;

import butterknife.ButterKnife;

public class AnnouncementFragment extends Fragment {
    private View view;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_announcement, container, false);
        ButterKnife.bind(this, view);

        return view;
    }
}
