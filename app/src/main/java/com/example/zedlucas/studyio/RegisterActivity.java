package com.example.zedlucas.studyio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterActivity extends AppCompatActivity {

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mUsuarioRef = mRootRef.child("Usuario");
    DatabaseReference mIDRef = mRootRef.child("ID");

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etUsername = (EditText) findViewById(R.id.etUserName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
        final EditText etFunction = (EditText) findViewById(R.id.etFunction);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 0;
               // final int ID = Integer.parseInt(etID.getText().toString());
                final String name = etName.getText().toString();
                final String username = etUsername.getText().toString();
                final String confirmPassword = etConfirmPassword.getText().toString();
                final String password = etPassword.getText().toString();
                final String function = etFunction.getText().toString();
                Context context = getApplicationContext();


                if (!password.equals(confirmPassword)){
                    Toast pass = Toast.makeText(context, "As senhas devem ser iguais", Toast.LENGTH_SHORT);
                    pass.show();
                }
                else if((name.isEmpty()) || (username.isEmpty()) || (password.isEmpty()) || (confirmPassword.isEmpty())){
                    Toast emBranco = Toast.makeText(context, "Campos em branco", Toast.LENGTH_SHORT);
                    emBranco.show();
                }
                else{

                    mRootRef.child("Config").child("id").setValue(""+(i+1));
                    Usuario usuario1 = new Usuario(""+i, name, username, password);
                    if(function.equals("Aluno")){
                        usuario1.setAluno(true);
                    }else if(function.equals("Professor")){
                        usuario1.setProfessor(true);
                    } else if(function.equals("Admin")){
                        usuario1.setAdmim(true);
                    }else{
                        Toast FunctionFailed = Toast.makeText(context, "O usuário foi criado sem uma função", Toast.LENGTH_LONG);
                        FunctionFailed.show();
                    }
                    DatabaseReference classe = mRootRef.child("Usuario");
                    DatabaseReference objeto = classe.child("" + (usuario1.getLogin()));
                    DatabaseReference nome = objeto.child("Nome");nome.setValue(usuario1.getNome());
                    DatabaseReference login = objeto.child("Login");login.setValue(usuario1.getLogin());
                    DatabaseReference senha = objeto.child("Senha");senha.setValue(usuario1.getSenha());
                    DatabaseReference notificações = objeto.child("Notificações acumuladas");notificações.setValue(usuario1.getNotificações());
                    DatabaseReference aluno = objeto.child("Aluno");aluno.setValue(usuario1.isAluno());
                    DatabaseReference professor = objeto.child("Professor");professor.setValue(usuario1.isProfessor());
                    DatabaseReference admin = objeto.child("Admin");admin.setValue(usuario1.isAdmim());

                    Toast sucesso = Toast.makeText(context, "Usuario adicionado com sucesso", Toast.LENGTH_SHORT);
                    sucesso.show();
                    Intent registerIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    RegisterActivity.this.startActivity(registerIntent);
                }
            }
        });
    }

}