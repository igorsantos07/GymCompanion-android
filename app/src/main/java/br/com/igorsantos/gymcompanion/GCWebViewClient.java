package br.com.igorsantos.gymcompanion;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GCWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Uri uri = Uri.parse(url);

        if (uri.getScheme().contains("http") && uri.getHost().contains(".paypal.")) {
            return false;
        }
        else {
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            view.getContext().startActivity(intent);
            return true;
        }
    }

}
