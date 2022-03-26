package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView itemName = findViewById(R.id.details_ItemName);
        ImageView itemimage = findViewById(R.id.details_ItemImage);

        Bundle bundle = getIntent().getExtras();
        Items delevereditems = (Items)bundle.getSerializable("Item");

        itemName.setText(delevereditems.getItemName());
        itemimage.setImageResource(delevereditems.getItemImage());

    }
}