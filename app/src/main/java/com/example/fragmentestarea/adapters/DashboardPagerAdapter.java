package com.example.fragmentestarea.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fragmentestarea.fragments.HistorialFragment;
import com.example.fragmentestarea.fragments.PrestamoFragment;
import com.example.fragmentestarea.fragments.RecepcionFragment;

public class DashboardPagerAdapter extends FragmentStateAdapter {
    public DashboardPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PrestamoFragment();
            case 1:
                return new RecepcionFragment();
            case 2:
                return new HistorialFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
