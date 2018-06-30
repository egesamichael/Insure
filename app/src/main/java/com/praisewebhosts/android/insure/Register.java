package com.praisewebhosts.android.insure;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goToProfile (View view) {

        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }

}
