package com.example.ex9;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText eWeb;
    Button click ;
    WebView wV;
    String stringUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV=(WebView) findViewById(R.id.wV);
        eWeb=(EditText) findViewById(R.id.eWeb);
        click= (Button) findViewById(R.id.click);

        wV.getSettings().setJavaScriptEnabled(true);
        wV.loadUrl(stringUrl);
        wV.setWebViewClient(new MyWebViewClient());

    }

    public void go(View view) {
        stringUrl= eWeb.getText().toString();
        wV.loadUrl(stringUrl);

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}