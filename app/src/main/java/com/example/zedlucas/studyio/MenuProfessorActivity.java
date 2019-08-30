package com.example.zedlucas.studyio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MenuProfessorActivity extends AppCompatActivity {

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_professor);

        final Button bNovaAtividade = (Button) findViewById(R.id.bNovaAtividade);
        final Button bCorrigirAtividade = (Button) findViewById(R.id.bCorrigirAtividade);
        final EditText etAtividade3 = (EditText) findViewById(R.id.etAtividade3);
        final TextView tvAtividade3 = (TextView) findViewById(R.id.tvAtividade3);
        final EditText etTitulo = (EditText) findViewById(R.id.etTitulo);
        //final ArrayList<Atividade> alAtividade = new ArrayList<Atividade>();

        bNovaAtividade.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Context context = getApplicationContext();
                //etAtividade3.setVisibility(View.VISIBLE);
                final String atividade = etAtividade3.getText().toString();
                final String titulo = etTitulo.getText().toString();

                if(atividade.isEmpty() || (titulo.isEmpty())){
                    Toast emBranco = Toast.makeText(context, "Campos em branco", Toast.LENGTH_SHORT);
                    emBranco.show();
                }
                else {
                    DatabaseReference classe = mRootRef.child("Atividades");
                    DatabaseReference objeto = classe.child(titulo);
                    DatabaseReference enunciado = objeto.child("Enunciado");enunciado.setValue(atividade);

                    Toast sucesso = Toast.makeText(context, "Exercício adicionado com sucesso", Toast.LENGTH_SHORT);
                    sucesso.show();
                }
            }
        });
/*
        bCorrigirAtividade.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                if(alAtividade.isEmpty()){
                    tvAtividade3.setText("Nenhuma atividade pendente");
                    tvAtividade3.setVisibility(View.VISIBLE);
                }
                else{

                }
            }
        }); */
    }
}
