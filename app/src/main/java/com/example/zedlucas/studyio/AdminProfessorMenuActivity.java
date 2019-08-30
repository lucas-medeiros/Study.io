package com.example.zedlucas.studyio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AdminProfessorMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_professor_menu);

        final Button bAdicionarUsuario = (Button) findViewById(R.id.bAdicionarUsuario);
        final Button bRemoveUsuario = (Button) findViewById(R.id.bRemoveUsuario);
        final Button bNovaAtividade1 = (Button) findViewById(R.id.bNovaAtividade1);
        final Button bCorrigirAtividade = (Button) findViewById(R.id.bCorrigirAtividade);
        final EditText etAtividade1  = (EditText) findViewById(R.id.etAtividade1);
        final TextView tvAtividade1 = (TextView) findViewById(R.id.tvAtividade1);



        bAdicionarUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(AdminProfessorMenuActivity.this, RegisterActivity.class);
                AdminProfessorMenuActivity.this.startActivity(registerIntent);
            }
        });

        bRemoveUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               /* if(alAluno.isEmpty()){
                    tvAtividade1.setText("Nenhum aluno listado");
                    tvAtividade1.setVisibility(View.VISIBLE);
                }
                else {

                }*/
            }
        });

        bNovaAtividade1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                etAtividade1.setVisibility(View.VISIBLE);
            }
        });



    }
}
