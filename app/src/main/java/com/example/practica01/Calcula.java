package com.example.practica01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Calcula extends  AppCompatActivity {
    final Aritmetica ari=new Aritmetica();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado = (TextView) findViewById(R.id.resultado);
        final EditText edtNumero1 = (EditText) findViewById(R.id.numero1);
        final EditText edtNumero2 = (EditText) findViewById(R.id.numero2);
        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        Button btnResta = (Button) findViewById(R.id.btnRestar);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String strnumero1=edtNumero1.getText().toString();
                String strnumero2=edtNumero2.getText().toString();
                if(strnumero1.equals("")||strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduzca ambos numeros", Toast.LENGTH_LONG).show();
                    return;
                }
                int numero1=Integer.parseInt(strnumero1);
                int numero2=Integer.parseInt(strnumero2);
                ari.setN1(numero1);
                ari.setN2(numero2);
                txtResultado.setText("Resultado: "+(ari.suma()));
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String strnumero1=edtNumero1.getText().toString();
                String strnumero2=edtNumero2.getText().toString();

                if(strnumero1.equals("")||strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduzca ambos numeros", Toast.LENGTH_LONG).show();
                    return;
                }
                int numero1=Integer.parseInt(strnumero1);
                int numero2=Integer.parseInt(strnumero2);
                ari.setN1(numero1);
                ari.setN2(numero2);
                txtResultado.setText("Resultado: "+(ari.resta()));
            }
        });
    }
}
