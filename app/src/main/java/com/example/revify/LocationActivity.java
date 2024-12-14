package com.example.revify;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LocationActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        recyclerView = findViewById(R.id.recyclerView);

        // Get the places names from the string array
        String[] places = getResources().getStringArray(R.array.places);

        // Image resources for the list items (replace with actual images)
        Integer[] imgId = {
                R.drawable.eiffel_tower,         // Eiffel Tower
                R.drawable.great_wall_of_china,   // Great Wall of China
                R.drawable.statue_of_liberty,     // Statue of Liberty
                R.drawable.mount_fuji,            // Mount Fuji
                R.drawable.taj_mahal,             // Taj Mahal
                R.drawable.pyramids_of_giza,      // Pyramids of Giza
                R.drawable.sydney_opera_house,    // Sydney Opera House
                R.drawable.machu_picchu,          // Machu Picchu
                R.drawable.christ_the_redeemer,   // Christ the Redeemer
                R.drawable.big_ben,               // Big Ben
                R.drawable.acropolis_of_athens,   // Acropolis of Athens
                R.drawable.colosseum,             // Colosseum
                R.drawable.niagara_falls,         // Niagara Falls
                R.drawable.alhambra,              // Alhambra
                R.drawable.burj_khalifa           // Burj Khalifa
        };


        // Set up RecyclerView
        LocationAdapter adapter = new LocationAdapter(this, places, imgId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  // Set the LayoutManager
        recyclerView.setAdapter(adapter);  // Set the Adapter
    }
}
