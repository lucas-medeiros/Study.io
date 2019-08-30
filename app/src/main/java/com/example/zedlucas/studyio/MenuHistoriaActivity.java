package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuHistoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_historia);

        final TextView tvAtividadesHis = (TextView) findViewById(R.id.tvAtividadesQui);
        final EditText etAtividadesHis = (EditText) findViewById(R.id.etAtividadesQui);
        final TextView tvLembretesHis = (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaHis = (Button) findViewById(R.id.bRespostaHis);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        //String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String lembrete = "Nenhum lembrete";
        tvLembretesHis.setText(lembrete);
        if(alAtividade.isEmpty()){
            tvAtividadesHis.setText("Nenhuma atividade pendente");
        }
        else{
            //  tvAtividadesGeo.setText(atividade);
            etAtividadesHis.setVisibility(View.VISIBLE);
            bRespostaHis.setVisibility(View.VISIBLE);
        }
    }
}
