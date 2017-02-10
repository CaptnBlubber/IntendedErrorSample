package com.example.android.testing.espresso.BasicSample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
public class WebLinkActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weblink);

    }

    public void onOpenLink(View view) {
        startActivity(createWebLinkIntent());
    }

    private Intent createWebLinkIntent() {
        return new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
    }
}
