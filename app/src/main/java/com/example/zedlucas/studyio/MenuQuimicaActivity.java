package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuQuimicaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quimica);

        final TextView tvAtividadesQui = (TextView) findViewById(R.id.tvAtividadesQui);
        final EditText etAtividadesQui = (EditText) findViewById(R.id.etAtividadesQui);
        final TextView tvLembretesQui = (TextView) findViewById(R.id.tvLembretesFis);
        final Button bRespostaQui = (Button) findViewById(R.id.bRespostaQui);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        //String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        String lembrete = "Nenhum lembrete";
        tvLembretesQui.setText(lembrete);
        if(alAtividade.isEmpty()){
            tvAtividadesQui.setText("Nenhuma atividade pendente");
        }
        else{
            //  tvAtividadesPor.setText(atividade);
            etAtividadesQui.setVisibility(View.VISIBLE);
            bRespostaQui.setVisibility(View.VISIBLE);
        }

    }
}
