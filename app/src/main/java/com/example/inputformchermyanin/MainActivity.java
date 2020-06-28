package com.example.inputformchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView subscription;
    EditText name;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subscription = findViewById(R.id.subscription);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        init();
    }

    private void init() {
        Button btnOk = findViewById(R.id.btnOk);
        Button btnClear = findViewById(R.id.btnClear);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                subscription.setText("Подписка на рассылку успешно оформлена для пользователя "
                        + name.getText() +
                        " на электронный адрес " + email.getText());
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subscription = findViewById(R.id.subscription);
                subscription.setText("");
            }
        });
    }
}