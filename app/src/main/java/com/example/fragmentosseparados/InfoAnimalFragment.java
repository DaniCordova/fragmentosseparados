package com.example.fragmentosseparados;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoAnimalFragment extends Fragment {

    private String description;
    private int idImage;
    private String animal;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();

        if (arguments!=null){
            animal = arguments.getString("animal");
        }
        obtenerInformacion();
    }

    public void obtenerInformacion(){
        if (animal == null){
            animal="Perro";
        }

        switch (animal){
            case "Perro":
                description = "Los perros son animales muy fieles";
                idImage = R.drawable.ic_dog;
                break;
            case "Gato":
                description = "los gatos son compañeros de casa";
                idImage = R.drawable.ic_cat;
                break;
            case "Raton":
                description = "los ratones son mascotas pequeñas";
                idImage = R.drawable.ic_mouse;
                break;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.info_animal_fragment,container,false);

        ImageView imageViewPhoto = view.findViewById(R.id.imageView_photo);
        TextView textViewDescription = view.findViewById(R.id.textView_description);

        imageViewPhoto.setImageResource(idImage);
        textViewDescription.setText(description);

        return view;
    }
}
