package com.example.inputformchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Button btnOk = findViewById(R.id.btnOk);
        Button btnClear = findViewById(R.id.btnClear);

        TextView nameUser = findViewById(R.id.nameUser);
        TextView emailUser = findViewById(R.id.emailUser);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView subscription = findViewById(R.id.subscription);
                EditText name = findViewById(R.id.name);
                EditText email = findViewById(R.id.email);
                subscription.setText("Подписка на рассылку успешно оформлена для пользователя "
                        + name.getText() +
                        " на электронный адрес " + email.getText());
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView subscription = findViewById(R.id.subscription);
                subscription.setText("");
            }
        });
    }
}