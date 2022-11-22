package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView Lista;
    private String[] itens = {
            "Desconto Imperdivel", "Camisetas em oferta", "Venha conferir os nossos preços", "Moletons em oferta", "Venha conferir as ofertas"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lista = findViewById(R.id.Lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );

        Lista.setAdapter(adapter);

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String nomeSelecionado = Lista.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), nomeSelecionado, Toast.LENGTH_SHORT).show();
            }
        });
    }

}