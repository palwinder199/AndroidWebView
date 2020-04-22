package com.palwinder199.app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String s;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        wv = (WebView)findViewById(R.id.wv1);

        wv.setWebViewClient(new WebViewClient());

        wv.setWebChromeClient(new WebChromeClient());

        wv.clearCache(true);

        wv.clearHistory();

        wv.getSettings().setJavaScriptEnabled(true);

        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        wv.loadUrl("http://www.palwinder199.com");

        s = "<html><body><h1>Hello</h1></body></html>";

        //wv.loadData(s,"text/html",null);
    }

    public void getS(){
        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_BACK &&  this.wv.canGoBack())
        {
            wv.goBack();
            return true;
        }
        else
        {
            return super.onKeyDown(keyCode, event);
        }

    }
}
