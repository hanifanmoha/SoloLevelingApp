package com.hanifanm.sololevelingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.webkit.WebView
import android.webkit.WebViewClient



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://hanifanm.github.io/solo-leveling-app/"
        wvContainer.loadUrl(url)
        wvContainer.settings.javaScriptEnabled = true
        wvContainer.settings.domStorageEnabled = true
        wvContainer.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return false
            }
        })
    }
}
