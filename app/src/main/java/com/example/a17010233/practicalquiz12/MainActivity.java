package com.example.a17010233.practicalquiz12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spn1;
    WebView wvPage;
    TextView tvName;
    ArrayList<String> alWeb;
    ArrayAdapter<String> aaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn1 = findViewById(R.id.spinner);
        wvPage = findViewById(R.id.WebViewPage);
        tvName = findViewById(R.id.textViewName);

        wvPage.setWebViewClient(new WebViewClient());

//        alWeb = new ArrayList<>();
//
//        aaWeb = new ArrayAdapter<String>(this,
//                android.R.layout.simple_spinner_dropdown_item, alWeb);

//        String[] strCat = getResources().getStringArray(R.array.web);
//        alWeb.addAll(Arrays.asList(strCat));

//        spn1.setAdapter(aaWeb);


        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        String url = "https://www.google.com.sg";
                        wvPage.loadUrl(url);
                        break;

                    case 1:
                        String url2 = "https://www.rp.edu.sg/soi/full-time-diplomas/details/r47";
                        wvPage.loadUrl(url2);
                        break;
                }

                //aaWeb.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
