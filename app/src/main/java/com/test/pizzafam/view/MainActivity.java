package com.test.pizzafam.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.test.pizzafam.R;
import com.test.pizzafam.databinding.ActivityMainBinding;
import com.test.pizzafam.model.PizzaInfo;
import com.test.pizzafam.viewmodel.PizzaViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    PizzaViewModel pizzaViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaViewModel = ViewModelProviders.of(this).get(PizzaViewModel.class);
        pizzaViewModel.getPizzas().observe(this, new Observer<PizzaInfo>() {
            @Override
            public void onChanged(@Nullable PizzaInfo pizzaInfo) {

                System.out.println("pizzas - "+pizzaInfo);
//                activityMainBinding.title.setText(pizzaInfo.getName());
//                activityMainBinding.description.setText(pizzaInfo.getDescription());
                if (pizzaInfo.isVeg()) {
                    activityMainBinding.vegNonveg.setColorFilter(ContextCompat.getColor(MainActivity.this,
                            R.color.veg), android.graphics.PorterDuff.Mode.SRC_IN);
                } else {
                    activityMainBinding.vegNonveg.setColorFilter(ContextCompat.getColor(MainActivity.this,
                            R.color.nonveg), android.graphics.PorterDuff.Mode.SRC_IN);
                }
            }
        });
    }
}
