package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuGeografiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_geografia);

        final TextView tvAtividadesGeo = (TextView) findViewById(R.id.tvAtividadesQui);
        final EditText etAtividadesGeo = (EditText) findViewById(R.id.etAtividadesQui);
        final TextView tvLembretesGeo = (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaGeo = (Button) findViewById(R.id.bRespostaGeo);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        //String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String lembrete = "Nenhum lembrete";
        tvLembretesGeo.setText(lembrete);
        if(alAtividade.isEmpty()){
            tvAtividadesGeo.setText("Nenhuma atividade pendente");
        }
        else{
            //  tvAtividadesGeo.setText(atividade);
            etAtividadesGeo.setVisibility(View.VISIBLE);
            bRespostaGeo.setVisibility(View.VISIBLE);
        }

    }
}
