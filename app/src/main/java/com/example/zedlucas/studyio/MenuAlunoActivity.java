package com.example.zedlucas.studyio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuAlunoActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_aluno);

        final Button bMatematica = (Button) findViewById(R.id.bMatematica);
        final Button bFisica = (Button) findViewById(R.id.bFisica);
        final Button bQuimica = (Button) findViewById(R.id.bQuimica);
        final Button bBiologia = (Button) findViewById(R.id.bBiologia);
        final Button bHistoria = (Button) findViewById(R.id.bHistoria);
        final Button bGeografia = (Button) findViewById(R.id.bGeografia);
        final Button bPortugues = (Button) findViewById(R.id.bPortugues);

        bMatematica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuMatematicaActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });

        bFisica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuFisicaActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });

        bQuimica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuQuimicaActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });

        bBiologia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuBiologiaActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });

        bHistoria.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuHistoriaActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });

        bGeografia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuGeografiaActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });

        bPortugues.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAlunoActivity.this, MenuPortuguesActivity.class);
                MenuAlunoActivity.this.startActivity(registerIntent);
            }
        });
    }
}
