package com.example.rapatpolri2020.view.session;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.viewpager2.widget.ViewPager2;

import com.example.rapatpolri2020.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SessionFragment extends Fragment {

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;

    @BindView(R.id.view_pager)
    ViewPager2 viewPager;

    private View view;

    SessionFragmentAdapter sessionFragmentAdapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_session, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        sessionFragmentAdapter = new SessionFragmentAdapter(this);
        viewPager.setAdapter(sessionFragmentAdapter);
    }
}
