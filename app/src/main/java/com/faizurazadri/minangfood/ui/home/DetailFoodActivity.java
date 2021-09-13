package com.faizurazadri.minangfood.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.faizurazadri.minangfood.R;
import com.faizurazadri.minangfood.databinding.ActivityDetailFoodBinding;

public class DetailFoodActivity extends AppCompatActivity {

    public static String EXTRA_DETAIL_URL = "url";
    private ActivityDetailFoodBinding detailFoodBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailFoodBinding = ActivityDetailFoodBinding.inflate(getLayoutInflater());
        setContentView(detailFoodBinding.getRoot());



        detailFoodBinding.detailFoodWebview.loadUrl(getIntent().getStringExtra(EXTRA_DETAIL_URL));
        detailFoodBinding.detailFoodWebview.setWebViewClient(new WebViewClient());



    }

    @Override
    public void onBackPressed() {
        if (detailFoodBinding.detailFoodWebview.canGoBack()) {
            detailFoodBinding.detailFoodWebview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}