 package com.example.magicball2;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.ImageView;
 import android.widget.TextView;
 import android.widget.Toast;
 import androidx.appcompat.app.AppCompatActivity;


 import java.util.Random;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView ball;
    private TextView respuesta;
    //variable de respuesta
    private String[] respuestaArray = {"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia imagen
        ball = findViewById(R.id.boton);

        //segundo texto
        respuesta = findViewById(R.id.respuesta);

        ball.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Buscando tu destino!!", Toast.LENGTH_SHORT).show();
    }
    @Override
     public void onClick(View v){
        // metodo de respuesta aleatoria
        switch (v.getId()){
            case R.id.boton:
                int random = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[random]);
                break;
        }

    }

}
