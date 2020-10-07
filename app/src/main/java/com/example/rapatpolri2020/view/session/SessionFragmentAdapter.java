package com.example.rapatpolri2020.view.session;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SessionFragmentAdapter extends FragmentStateAdapter {

    public SessionFragmentAdapter(Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return null;
    }


    @Override
    public int getItemCount() {
        return 0;
    }
}
