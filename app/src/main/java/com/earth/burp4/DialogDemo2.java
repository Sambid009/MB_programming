package com.earth.burp4;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DialogDemo2 extends AppCompatActivity {
    Button btn_CustomDialog, btn_positive, btn_negative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dialog_demo2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_CustomDialog = findViewById(R.id.CustomDialog);

        btn_CustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DialogDemo2.this);

                dialog.setContentView(R.layout.custom_alert_dialog_layout);

                btn_positive  = dialog.findViewById(R.id.btnPositive);
                btn_negative  = dialog.findViewById(R.id.btnNegative);

                btn_positive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(DialogDemo2.this, "Ok Button Clicked", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                btn_negative.setOnClickListener(new View.OnClickListener() {
                  @Override
                 public void onClick(View v) {
                 Toast.makeText(DialogDemo2.this, "Cancel Button Clicked", Toast.LENGTH_SHORT).show();
                 dialog.dismiss();
                  }
                 });

                //dialog.setCancelable(false);
                dialog.show();

            }
        });







    }
}