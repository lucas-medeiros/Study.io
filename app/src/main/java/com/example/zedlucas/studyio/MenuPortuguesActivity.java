package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuPortuguesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_portugues);

        final TextView tvAtividadesPor= (TextView) findViewById(R.id.tvAtividadesQui);
        final EditText etAtividadesPor = (EditText) findViewById(R.id.etAtividadesQui);
        final TextView tvLembretesPor = (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaPor = (Button) findViewById(R.id.bRespostaPor);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        //String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String lembrete = "Nenhum lembrete";
        tvLembretesPor.setText(lembrete);
        if(alAtividade.isEmpty()){
            tvAtividadesPor.setText("Nenhuma atividade pendente");
        }
        else{
            //  tvAtividadesPor.setText(atividade);
            etAtividadesPor.setVisibility(View.VISIBLE);
            bRespostaPor.setVisibility(View.VISIBLE);
        }

    }
}
