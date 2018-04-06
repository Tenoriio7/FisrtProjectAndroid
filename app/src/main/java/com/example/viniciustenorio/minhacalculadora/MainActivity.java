package com.example.viniciustenorio.minhacalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String msgValidacao = "";
                final EditText Nota1 =  findViewById(R.id.et_nota1);
                final EditText Nota2 =  findViewById(R.id.et_nota2);
                final EditText Nota3 =  findViewById(R.id.et_nota3);
                String n1 = Nota1.getText().toString();
                double nota1D = Double.parseDouble(n1);
                String n2 = Nota2.getText().toString();
                double nota2D = Double.parseDouble(n2);
                String n3 = Nota3.getText().toString();
                double nota3D = Double.parseDouble(n3);
                double media = (nota1D+nota2D+nota3D) / 3;

                if(media >= 6){
//                    Toast.makeText(MainActivity.this, "Aprovado", Toast.LENGTH_SHORT).show();
                    view.setBackgroundColor(0xff00ff00);
                    TextView tv_Resultado = (TextView)findViewById(R.id.tv_resultado);
                    tv_Resultado.setText("Aprovado");
                }

                else if(media <= 4){
                    Toast.makeText(MainActivity.this, "Reprovado", Toast.LENGTH_SHORT).show();
                    view.setBackgroundColor(0xffff0000);
                    TextView tv_Resultado = (TextView)findViewById(R.id.tv_resultado);
                    tv_Resultado.setText("Reprovado");
                }

                else{
                    Toast.makeText(MainActivity.this, "Recuperação", Toast.LENGTH_SHORT).show();
                    view.setBackgroundColor(0xffffff00);
                    TextView tv_Resultado = (TextView)findViewById(R.id.tv_resultado);
                    tv_Resultado.setText("Recuperação");
                }

            }
        });
    }




}
