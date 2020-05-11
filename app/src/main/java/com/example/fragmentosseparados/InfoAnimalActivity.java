package com.example.fragmentosseparados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class InfoAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_animal);

        Intent intent = getIntent();
        if(intent != null){
            String animal = intent.getStringExtra("animal");
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            InfoAnimalFragment infoAnimalFragment = new InfoAnimalFragment();
            Bundle args = new Bundle();
            args.putString("animal", animal);
            infoAnimalFragment.setArguments(args);

            fragmentTransaction.replace(R.id.fragment_info_animal, infoAnimalFragment);
            fragmentTransaction.commit();
        }
    }
}
