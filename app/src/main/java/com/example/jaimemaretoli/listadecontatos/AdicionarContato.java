package com.example.jaimemaretoli.listadecontatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdicionarContato extends AppCompatActivity implements Serializable{

    List<Map<String, String>> list = new ArrayList<>();

    EditText edtNome, edtTelefone;
    Button btnAdicionar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_contato);

        //MAPEAMENTO DOS CAMPOS DA TELA
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        btnAdicionar = (Button) findViewById(R.id.btnAdicionar);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
    }

    // VOLTANDO PARA A TELA PRINCIPAL
    public void chamaTelaPrincipal(View v){
        Intent it = new Intent(AdicionarContato.this, MainActivity.class);
        startActivity(it);
    }

    public void enviaDados(View v){
        Map<String, String> enviaDado = new HashMap<>();
        enviaDado.put("nome", edtNome.getText().toString());
        enviaDado.put("telefone", edtTelefone.getText().toString());
        list.add(enviaDado);

        Intent intent = new Intent(this, ListaDeContatos.class);

        intent.putExtra("nome", edtNome.getText().toString());
        intent.putExtra("telefone", edtTelefone.getText().toString());

        startActivity(intent);
    }
}
