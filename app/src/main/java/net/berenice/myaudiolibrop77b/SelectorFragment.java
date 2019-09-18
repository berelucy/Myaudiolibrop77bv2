package net.berenice.myaudiolibrop77b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class SelectorFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdaptadorLibros adaptadorLibros;
    Vector<Libro> vectorLibros;
    AppCompatActivity actividad;


    //El onAttach
    @Override
    public void onAttach(Context ctx) {
        super.onAttach(ctx);
        if (ctx instanceof AppCompatActivity) {

            actividad = (AppCompatActivity) ctx;
            vectorLibros = Libro.ejemploLibros();

            adaptadorLibros = new AdaptadorLibros(actividad, vectorLibros);
        }

    }

}
