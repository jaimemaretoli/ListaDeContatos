package com.example.jaimemaretoli.listadecontatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaDeContatos extends AppCompatActivity implements Serializable {

    ListView lstContatos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_contatos);

        lstContatos = (ListView) findViewById(R.id.lstContatos);

        Map<String, String> valores = new HashMap<String, String>();
        String[] keys = {"text1", "text2"};
        int[] values = {android.R.id.text1,android.R.id.text2};
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        Bundle bud = getIntent().getExtras();

        if(bud != null && !bud.isEmpty()) {
            ListaTelefone.getInstancia().getValores().put(bud.getString("nome"), bud.getString("telefone"));
        }

        for(String key : ListaTelefone.getInstancia().getValores().keySet()){

            valores = new HashMap<String, String>();
            valores.put("text1", key);
            valores.put("text2", ListaTelefone.getInstancia().getValores().get(key));

            list.add(valores);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, list, android.R.layout.simple_list_item_2, keys, values);

        lstContatos.setAdapter(adapter);

        this.lstContatos.setAdapter(adapter);
        // ArrayList<Tipo> dados = getIntent().getParcelableArrayListExtra("dados");
    }
}
