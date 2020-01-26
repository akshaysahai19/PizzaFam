package com.test.pizzafam.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import com.test.pizzafam.R;
import com.test.pizzafam.databinding.AddPizzaDialogBinding;

public class AddPizzaDialog extends Dialog {

    AddPizzaDialogBinding addPizzaDialogBinding;

    public AddPizzaDialog(@NonNull Context context) {
        super(context);
        addPizzaDialogBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.add_pizza_dialog,null,false);
        setContentView(addPizzaDialogBinding.getRoot());
    }
}
