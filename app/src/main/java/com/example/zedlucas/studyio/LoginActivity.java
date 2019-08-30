package com.example.zedlucas.studyio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.R.attr.id;

public class LoginActivity extends AppCompatActivity {


    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mUsuarioRef = mRootRef.child("Usuario");


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final TextView tvRegisterLink = (TextView) findViewById(R.id.tvRegisterHere);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView tvBDPass = (TextView) findViewById(R.id.tvBDPass);
        final TextView tvBDName = (TextView) findViewById(R.id.tvBDName);


        String password1 = "admin", username1 = "admin", username2 = "lucas", password2 = "1234";
        String username3 = "professor", password3 = "professor", username4 = "adminprofessor", password4 = "adminprofessor";
        String username5 = "luiz", username6 = "leandro";

        final ArrayList<String> alUsername = new ArrayList<String>();
        final ArrayList<String> alPassword = new ArrayList<String>();
        alPassword.add(password1);
        alPassword.add(password2);
        alPassword.add(password3);
        alPassword.add(password4);
        alUsername.add(username1);
        alUsername.add(username2);
        alUsername.add(username3);
        alUsername.add(username4);
        alUsername.add(username5);
        alUsername.add(username6);

        tvRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String LoginFailed1 = "Username not found", LoginFailed2 = "Wrong password", LoginSucess = "Login successful";
                Context contexto = getApplicationContext();
                int duracao = Toast.LENGTH_SHORT;
                final Toast toast1 = Toast.makeText(contexto, LoginFailed1, duracao);
                final Toast toast2 = Toast.makeText(contexto, LoginFailed2, duracao);
                final Toast toast3 = Toast.makeText(contexto, LoginSucess, duracao);
                final Toast toast4 = Toast.makeText(contexto, "Login failed", duracao);

                boolean foundusername = false, foundpassword = false;
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                try{
                    DatabaseReference usuario = mUsuarioRef.child(username);
                    usuario.child("Nome").addValueEventListener(new ValueEventListener() {
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String texto = "Nome: "+dataSnapshot.getValue(String.class);
                        }
                        public void onCancelled(DatabaseError databaseError) {
                            toast4.show();
                        }
                    });
                    usuario.child("Login").addValueEventListener(new ValueEventListener() {
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String texto = "Login: "+dataSnapshot.getValue(String.class);
                            tvBDName.setText(texto);
                        }
                        public void onCancelled(DatabaseError databaseError) {
                            toast4.show();
                        }
                    });
                    usuario.child("Senha").addValueEventListener(new ValueEventListener() {
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String tPass = dataSnapshot.getValue(String.class);
                            tvBDPass.setText(tPass);
                            String texto ="Senha: "+dataSnapshot.getValue(String.class);
                        }
                        public void onCancelled(DatabaseError databaseError) {
                            toast2.show();
                        }
                    });
                    usuario.child("Aluno").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            boolean boo = dataSnapshot.getValue(Boolean.class);
                        }
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    usuario.child("Professor").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            boolean boo = dataSnapshot.getValue(Boolean.class);
                        }
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                    usuario.child("Admin").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            boolean boo = dataSnapshot.getValue(Boolean.class);
                        }

                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });
                }catch (Exception e){
                    toast4.show();
                }




                for (int i = 0; i < alUsername.size(); i++){
                    if(username.compareTo(alUsername.get(i)) == 0){
                       foundusername = true;
                        for(int j = 0; j < alPassword.size(); j++){
                            if(password.compareTo(alPassword.get(j)) == 0){
                                foundpassword = true;
                            }
                        }
                    }
                }
                if(foundusername && foundpassword){
                    //login
                    toast3.show();
                    if (username.compareTo("lucas") == 0){
                        Intent registerIntent = new Intent(LoginActivity.this, MenuAlunoActivity.class);
                        LoginActivity.this.startActivity(registerIntent);
                    }
                    else if (username.compareTo("admin") == 0){
                        Intent registerIntent = new Intent(LoginActivity.this, MenuAdminActivity.class);
                        LoginActivity.this.startActivity(registerIntent);
                    }
                    else if (username.compareTo("professor") == 0){
                        Intent registerIntent = new Intent(LoginActivity.this, MenuProfessorActivity.class);
                        LoginActivity.this.startActivity(registerIntent);
                    }
                    else if(username.compareTo("adminprofessor") == 0){
                        Intent registerIntent = new Intent(LoginActivity.this, AdminProfessorMenuActivity.class);
                        LoginActivity.this.startActivity(registerIntent);
                    }
                    else {
                        Intent registerIntent = new Intent(LoginActivity.this, UserAreaActivity.class);
                        LoginActivity.this.startActivity(registerIntent);
                    }
                }else if(foundusername && (foundpassword == false)){
                    //senha incorreta
                    toast2.show();
                }else{
                    //usuario nao existe
                    toast1.show();
                }
            }
        });
    }
}