package com.example.zedlucas.studyio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.zedlucas.studyio.R.id.bAdicionarUsuario;

public class MenuAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);

        final Button bAdicionarUsuario = (Button) findViewById(R.id.bAdicionarUsuario);
        final Button bRemoveUsuario = (Button) findViewById(R.id.bRemoveUsuario);
        final TextView tvAdmin = (TextView) findViewById(R.id.tvAdmin);


        bAdicionarUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuAdminActivity.this, RegisterActivity.class);
                MenuAdminActivity.this.startActivity(registerIntent);
            }
        });

        bRemoveUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*if(alAluno.isEmpty()){
                    tvAdmin.setText("Nenhum aluno listado");
                    tvAdmin.setVisibility(View.VISIBLE);
                }
                else {

                }
                */
            }
        });
    }
}
