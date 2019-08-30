package com.example.zedlucas.studyio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuMateriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materia);

        final TextView tvAtividade = (TextView) findViewById(R.id.tvAtividade);
        final EditText etAtividade = (EditText) findViewById(R.id.etAtividade);

        ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();
        String atividade = "ex 1: Calcule a função f(x) = 2x + 1, em x = 5";
        if(alAtividade.isEmpty()){
            tvAtividade.setText("Nenhuma atividade pendente");
        }
        else{
            tvAtividade.setText(atividade);
            etAtividade.setVisibility(View.VISIBLE);
        }
    }
}
