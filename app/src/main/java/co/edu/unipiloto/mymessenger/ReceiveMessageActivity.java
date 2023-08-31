package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String Extra_Message="mensaje";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String texto_mensaje=intent.getStringExtra(Extra_Message);
        TextView messageView=findViewById(R.id.mensaje);
        messageView.setText(texto_mensaje);
    }

}