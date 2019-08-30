package com.example.zedlucas.studyio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuMatematicaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_matematica);

        final TextView tvAtividadesMat = (TextView) findViewById(R.id.tvAtividadesQui);
        final EditText etAtividadesMat = (EditText) findViewById(R.id.etAtividadesQui);
        final TextView tvLembretesMat = (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaMat = (Button) findViewById(R.id.bRespostaMat);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        Atividade ex1 = new Atividade();
        alAtividade.add(ex1);
        String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String Slembrete = "Nenhum lembrete", lembrete1 = "Responder o ex 1, valendo um ponto";
        Context contexto = getApplicationContext();
        int duracao = Toast.LENGTH_SHORT;

        final Toast toast1 = Toast.makeText(contexto, "Resposta submetida ao sistema" ,duracao);
        tvLembretesMat.setText(lembrete1);
        if(alAtividade.isEmpty()){
            tvAtividadesMat.setText("Nenhuma atividade pendente");
        }
        else{
            tvAtividadesMat.setText(atividade);
            etAtividadesMat.setVisibility(View.VISIBLE);
            bRespostaMat.setVisibility(View.VISIBLE);
            bRespostaMat.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    toast1.show();
                }
            });

        }
    }
}
