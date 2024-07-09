package com.earth.burp4;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;




public class MainActivity extends AppCompatActivity {

    Button btnNews,btnSports,btnScience,btnBusiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        btnNews = findViewById(R.id.btnNews);
        btnSports = findViewById(R.id.btnSports);
        btnScience = findViewById(R.id.btnScience);
        btnBusiness = findViewById(R.id.btnBusiness);



        //for button News
        btnNews.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, NewsFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)

                        .commit();


            }



        });

        //for button Sports
        btnSports.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, SportsFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)

                        .commit();


            }



        });

        //for button Science
        btnScience.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, ScienceFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)

                        .commit();


            }



        });

        //for btn business
        btnBusiness.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, BusinessFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)

                        .commit();


            }

        });


        }//end of method onCreate

    //------------------------for options menu-------------------------------------

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menue, menu);
        return true;
    }

        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();

            if (id == R.id.setting) {

                Toast.makeText(this, "Settings_clicked", Toast.LENGTH_LONG).show();

            } else if (id == R.id.save) {
                Toast.makeText(this, "Save clicked", Toast.LENGTH_LONG).show();
            } else if (id == R.id.edit) {
                Toast.makeText(this, "Edit clicked", Toast.LENGTH_LONG).show();
            } else if (id == R.id.delete) {
                Toast.makeText(this, "Delete clicked", Toast.LENGTH_LONG).show();
            }

            return super.onOptionsItemSelected(item);
        }





//----------------------NOT WORKING CODE--------------------------------
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        switch (id){
//            case R.id.setting:
//                Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.save:
//                Toast.makeText(this, "Save_clicked", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.edit:
//                Toast.makeText(this, "Edit_clicked", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.delete:
//                Toast.makeText(this, "Delete_clicked", Toast.LENGTH_LONG).show();
//                return true;
//
//                default:
//                return super.onOptionsItemSelected(item);
//
//
//        }
    //________-------------------------------------------------------------






}//end of class
