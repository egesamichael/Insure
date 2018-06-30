package com.praisewebhosts.android.insure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void findAgent (View view) {

        Intent goToAgent = new Intent (this, FindAnAgent.class);
        startActivity(goToAgent);

    }
}
