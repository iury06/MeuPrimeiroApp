package br.senac.go.iuryalves;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);


        //recuperando a estancia da view
        Button openBT = findViewById(R.id.button3);
        openBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CronogramaActivity.class);
    intent.putExtra("teste",R.id.textView9);
                startActivity(intent);
            }
        });
    }
    }

