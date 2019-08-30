package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuFisicaActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fisica);

        final TextView tvAtividadesFis = (TextView) findViewById(R.id.tvAtividadesFis);
        final EditText etAtividadesFis =  (EditText) findViewById(R.id.etAtividadesFis);
        final TextView tvLembretesFis =  (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaFis = (Button) findViewById(R.id.bRespostaFis);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        //String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String lembrete = "Nenhum lembrete";
        tvLembretesFis.setText(lembrete);
        if(alAtividade.isEmpty()){
            tvAtividadesFis.setText("Nenhuma atividade pendente");
        }
        else{
          //  tvAtividadesFis.setText(atividade);
            etAtividadesFis.setVisibility(View.VISIBLE);
            bRespostaFis.setVisibility(View.VISIBLE);
        }

    }
}
