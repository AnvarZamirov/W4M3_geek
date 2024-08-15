package com.example.w4m3;

import com.example.w4m3.PizzaModel;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.w4m3.databinding.FragmentRVBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class RVFragment extends Fragment implements com.example.w4m3.OnItemClick {

    private FragmentRVBinding binding;
    private com.example.w4m3.PizzaAdapter adapter;
    private ArrayList<com.example.w4m3.PizzaModel> pizzaModel = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRVBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String menuItem = getArguments() != null ? getArguments().getString("menu_item") : "";

        loadDataMain(menuItem);
        adapter = new com.example.w4m3.PizzaAdapter(pizzaModel, this);
        binding.rvPizza.setAdapter(adapter);
    }

    public void loadDataMain(String menuItem) {
        pizzaModel.clear();
        if (menuItem.equals("Pizza")) {
            pizzaModel.add(new com.example.w4m3.PizzaModel("Peperoni", "https://www.allrecipes.com/thmb/9UTj7kZBJDqory0cdEv_bw6Ef_0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/48727-Mikes-homemade-pizza-DDMFS-beauty-2x1-BG-2976-d5926c9253d3486bbb8a985172604291.jpg", "Peperoni good pizza", "17"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Margarita", "https://imag.bonviveur.com/pizza-margarita.jpg", "Margarita good pizza", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Italian", "https://www.allrecipes.com/thmb/9UTj7kZBJDqory0cdEv_bw6Ef_0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/48727-Mikes-homemade-pizza-DDMFS-beauty-2x1-BG-2976-d5926c9253d3486bbb8a985172604291.jpg", "Italian good pizza", "14"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Italian", "https://www.allrecipes.com/thmb/9UTj7kZBJDqory0cdEv_bw6Ef_0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/48727-Mikes-homemade-pizza-DDMFS-beauty-2x1-BG-2976-d5926c9253d3486bbb8a985172604291.jpg", "Italian good pizza", "19"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Italian", "https://www.allrecipes.com/thmb/9UTj7kZBJDqory0cdEv_bw6Ef_0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/48727-Mikes-homemade-pizza-DDMFS-beauty-2x1-BG-2976-d5926c9253d3486bbb8a985172604291.jpg", "Italian good pizza", "9"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Italian", "https://www.allrecipes.com/thmb/9UTj7kZBJDqory0cdEv_bw6Ef_0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/48727-Mikes-homemade-pizza-DDMFS-beauty-2x1-BG-2976-d5926c9253d3486bbb8a985172604291.jpg", "Italian good pizza", "13"));
        } else if (menuItem.equals("Hamburger")) {
            pizzaModel.add(new com.example.w4m3.PizzaModel("Classic burger","https://chefrestoran.ru/wp-content/uploads/2018/10/604655519.jpg", "Good Burger", "20"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Cheeseburger","https://chefrestoran.ru/wp-content/uploads/2018/10/1053796058.jpg", "The name of the dish comes from the English “cheese”. A cheeseburger has the same composition as a hamburger.", "25"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Black burger","https://chefrestoran.ru/wp-content/uploads/2018/10/333977423.jpg", "Good Burger", "17"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Chickenburger","https://chefrestoran.ru/wp-content/uploads/2018/10/1029888517.jpg", "Good Burger", "15"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Fishburger","https://chefrestoran.ru/wp-content/uploads/2018/10/549443638.jpg", "Good Burger", "21"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Crab burger","https://avatars.dzeninfra.ru/get-zen_doc/4776500/pub_603fc364afc00e4c65766e70_603fc43e0ea3ae5d4c43e734/scale_1200", "Bun with sesame seeds and tender crab meat.", "20"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Caesar burger","https://avatars.dzeninfra.ru/get-zen_doc/3987860/pub_603fc364afc00e4c65766e70_603fc4ecafc00e4c6579bc8e/scale_1200", "The bun is stuffed with iceberg lettuce leaves and pieces of fried chicken fillet.", "20"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Base Burger","https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/M6HASPARCZHYNN4XTUYT7H6PTE.jpg", "Good Burger", "20"));
        } else if (menuItem.equals("Combo")) {
            pizzaModel.add(new com.example.w4m3.PizzaModel("Combo1", "https://pizzaexpress44.ru/media/cache/product_popup/images/product/sytnyi.jpg", "TUDASUDA", "50"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Combo1", "https://pizzaexpress44.ru/media/cache/product_popup/images/product/sytnyi.jpg", "TUDASUDA", "50"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Combo1", "https://pizzaexpress44.ru/media/cache/product_popup/images/product/sytnyi.jpg", "TUDASUDA", "50"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Combo1", "https://pizzaexpress44.ru/media/cache/product_popup/images/product/sytnyi.jpg", "TUDASUDA", "50"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Combo1", "https://pizzaexpress44.ru/media/cache/product_popup/images/product/sytnyi.jpg", "TUDASUDA", "50"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Combo1", "https://pizzaexpress44.ru/media/cache/product_popup/images/product/sytnyi.jpg", "TUDASUDA", "50"));
        } else if (menuItem.equals("Drinks")) {
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));
            pizzaModel.add(new com.example.w4m3.PizzaModel("Coca cola", "https://embargo.kg/wp-content/uploads/coca-cola-original-12-ounce-can.jpg", "0.5 l", "5"));

        }
    }

    @Override
    public void onClick(int position) {
        com.example.w4m3.PizzaModel pizza = pizzaModel.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("pizza", pizza);
        SecondRVFragment fragment = new SecondRVFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.ct_title, fragment).addToBackStack(null).commit();
    }
}