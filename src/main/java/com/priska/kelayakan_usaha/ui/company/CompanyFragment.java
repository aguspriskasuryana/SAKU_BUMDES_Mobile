package com.priska.kelayakan_usaha.ui.company;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.priska.kelayakan_usaha.databinding.FragmentCompanyBinding;

public class CompanyFragment extends Fragment {

    private FragmentCompanyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CompanyViewModel companyViewModel =
                new ViewModelProvider(this).get(CompanyViewModel.class);

        binding = FragmentCompanyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        companyViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}