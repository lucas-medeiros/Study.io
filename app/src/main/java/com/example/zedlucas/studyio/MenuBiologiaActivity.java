package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuBiologiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_biologia);

        final TextView tvAtividadesBio = (TextView) findViewById(R.id.tvAtividadesFis);
        final EditText etAtividadesBio = (EditText) findViewById(R.id.etAtividadesBio);
        final TextView tvLembretesBio = (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaBio = (Button) findViewById(R.id.bRespostaBio);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        //String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String lembrete = "Nenhum lembrete";
        tvLembretesBio.setText(lembrete);
        if(alAtividade.isEmpty()){
            tvAtividadesBio.setText("Nenhuma atividade pendente");
        }
        else{
            //tvAtividadesBio.setText(atividade);
            etAtividadesBio.setVisibility(View.VISIBLE);
            bRespostaBio.setVisibility(View.VISIBLE);
        }
    }
}
