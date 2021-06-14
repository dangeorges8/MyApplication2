package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SendAlerts extends AppCompatActivity {

    private ImageButton buttonBuraco;
    private ImageButton buttonIluminacao;
    private ImageButton buttonOnibus;
    private ImageButton buttonAcidente;
    private ImageButton buttonBloqueio;
    private ImageButton buttonPreco;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_alerts);

        final View.OnClickListener onClickListenerGeral = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlertaGeralActivity();
            }
        };

        buttonBuraco = (ImageButton) findViewById(R.id.imageButton);
        buttonIluminacao = (ImageButton) findViewById(R.id.imageButton2);
        buttonAcidente = (ImageButton) findViewById(R.id.imageButton7);
        buttonBloqueio = (ImageButton) findViewById(R.id.imageButton8);
        buttonOnibus = (ImageButton) findViewById(R.id.imageButton5);
        buttonPreco = (ImageButton) findViewById(R.id.imageButton9);

        buttonBuraco.setOnClickListener(onClickListenerGeral);
        buttonIluminacao.setOnClickListener(onClickListenerGeral);
        buttonAcidente.setOnClickListener(onClickListenerGeral);
        buttonBloqueio.setOnClickListener(onClickListenerGeral);
        buttonOnibus.setOnClickListener(view -> openAlertaOnibusActivity());
        buttonPreco.setOnClickListener(view -> openAlertaPrecoActivity());
    }

    private void openAlertaPrecoActivity() {
        Intent intent = new Intent(this, DescricaoPreco.class);
        startActivity(intent);
    }

    public void openAlertaOnibusActivity() {
        Intent intent = new Intent(this, DescricaoOnibus.class);
        startActivity(intent);
    }

    public void openAlertaGeralActivity() {
        Intent intent = new Intent(this, DescricaoGeral.class);
        startActivity(intent);
    }
}
