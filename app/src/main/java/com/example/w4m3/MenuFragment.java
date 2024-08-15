package com.example.w4m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w4m3.Model;
import com.example.w4m3.OnItemClick;
import com.example.w4m3.RVFragment;
import com.example.w4m3.databinding.FragmentMenuBinding;

import java.util.ArrayList;

public class MenuFragment extends Fragment implements OnItemClick {

    FragmentMenuBinding binding;
    com.example.w4m3.MenuAdapter adapter;
    ArrayList<Model> item = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapter = new com.example.w4m3.MenuAdapter(item, this);
        binding.rvView.setAdapter(adapter);
    }
    private void loadData(){
        item.add(new Model("Pizza", "https://cdn-icons-png.flaticon.com/512/1046/1046873.png"));
        item.add(new Model("Hamburger", "https://cdn-icons-png.flaticon.com/512/6488/6488946.png"));
        item.add(new Model("Combo", "https://cdn.icon-icons.com/icons2/3772/PNG/512/illustration_vector_xmas_roast_chicken_tasty_food_icon_231711.png"));
        item.add(new Model("Drinks", "https://cdn-icons-png.flaticon.com/512/66/66398.png"));
    }

    @Override
    public void onClick(int position) {
        RVFragment rvFragment = new RVFragment();
        Bundle bundle = new Bundle();
        if (position == 0) {
            bundle.putString("menu_item", "Pizza");
        } else if (position == 1) {
            bundle.putString("menu_item", "Hamburger");
        } else if (position == 2) {
            bundle.putString("menu_item", "Combo");
        } else if (position == 3) {
            bundle.putString("menu_item", "Drinks");
        }
        rvFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.ct_title, rvFragment).addToBackStack(null).commit();
    }
}