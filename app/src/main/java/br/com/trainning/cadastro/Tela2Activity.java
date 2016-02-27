package br.com.trainning.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView txtNome;
    TextView txtIdade;
    TextView txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String telefone = intent.getStringExtra("telefone");

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtTelefone = (TextView) findViewById(R.id.txtTelefone);

        txtNome.setText(" " + nome);
        txtIdade.setText(" " + idade);
        txtTelefone.setText(" " + telefone);

    }

}
