package com.example.bai01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView edt_KQ;
    EditText edtA,edtB;
    Button btn_Tong,btn_Hieu,btn_Tich,btn_Thuong,btn_UCLN,btn_Thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edt_KQ = findViewById(R.id.edt_KQ);
        btn_Tong=findViewById(R.id.btn_Tong);
        btn_Hieu=findViewById(R.id.btn_Hieu);
        btn_Tich=findViewById(R.id.btn_Tich);
        btn_Thuong=findViewById(R.id.btn_Thuong);
        btn_UCLN=findViewById(R.id.btn_UCLN);
        btn_Thoat=findViewById(R.id.btn_Thoat);
        btn_Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a + b;
                edt_KQ.setText(c + "");
            }
        });
        btn_Hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a - b;
                edt_KQ.setText(c + "");
            }
        });
        btn_Tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a *b;
                edt_KQ.setText(c + "");
            }
        });
        btn_Thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c = a / b;
                edt_KQ.setText(c + "");
            }
        });
        btn_UCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());

            }
        });

        btn_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}