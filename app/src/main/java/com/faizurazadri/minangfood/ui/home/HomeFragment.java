package com.faizurazadri.minangfood.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.faizurazadri.minangfood.R;
import com.faizurazadri.minangfood.adapter.AdapterFood;
import com.faizurazadri.minangfood.databinding.FragmentHomeBinding;
import com.faizurazadri.minangfood.model.Food;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ArrayList<Food> foodArrayList = new ArrayList<>();
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        foodArrayList.addAll(FoodData.getListData());
        showFoodData();

    }

    private void showFoodData() {
        binding.rvFood.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.rvFood.setHasFixedSize(true);
        AdapterFood adapterFood = new AdapterFood(foodArrayList, getActivity());
        adapterFood.notifyDataSetChanged();
        binding.rvFood.setAdapter(adapterFood);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}