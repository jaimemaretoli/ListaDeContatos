package com.example.jaimemaretoli.listadecontatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAdicionar;
    Button btnListaContatos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MAPEAMENTO DE BOTOES
        btnAdicionar = (Button) findViewById(R.id.btnAdicionar);
        btnListaContatos = (Button) findViewById(R.id.btnListaContatos);
    }

    // CHAMANDO A TELA PARA ADICIONAR CONTATO PELO BOTAO
    public void chamaTelaAdicionar(View v) {
        Intent it = new Intent(MainActivity.this, AdicionarContato.class);
        startActivity(it);
    }

    // CHAMANDO A TELA PARA LISTAR CONTATOS PELO BOTAO
    public void chamaTelaListaContatos(View v){
        Intent it = new Intent(MainActivity.this, ListaDeContatos.class);
        startActivity(it);
    }
}
