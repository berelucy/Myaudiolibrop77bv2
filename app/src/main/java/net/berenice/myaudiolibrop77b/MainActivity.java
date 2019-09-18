package net.berenice.myaudiolibrop77b;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    //se instanceam
    private RecyclerView recyclerView;

    //mostrar en grilla o lineal
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        AdaptadorLibros adp  = new AdaptadorLibros(this, Libro.ejemploLibros());
        recyclerView.setAdapter(adp);

        adp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String item = ((TextView)v.findViewById(R.id.titulo)).getText().toString();
                Toast.makeText(MainActivity.this, "Se disparo el clicl item: " + item, Toast.LENGTH_LONG).show();
            }
        });

    }
}
