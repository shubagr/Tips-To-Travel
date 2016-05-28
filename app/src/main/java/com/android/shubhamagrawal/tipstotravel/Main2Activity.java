package com.android.shubhamagrawal.tipstotravel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends MainActivity {


    Button about, images, tips,mustvisit;
    boolean viewchanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        about = (Button) findViewById(R.id.about_country);
        images = (Button) findViewById(R.id.images_country);
        tips = (Button) findViewById(R.id.tips_country);
        mustvisit = (Button) findViewById(R.id.must_visit_country);

        setContentView(R.layout.activity_main2);

            Bundle bundle = getIntent().getExtras();



    }

    @Override
    public void onBackPressed() {

        if(viewchanged ){
            setContentView(R.layout.activity_main2);
            viewchanged = false;
        }else {
            super.onBackPressed();
        }
    }
    //    public void tipscountry()

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle app bar item clicks here. The app bar
        // automatically handles clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // to call the text view of the country


    public void aboutcountry(View view) {
        viewchanged = true;
        setContentView(R.layout.about_country1);

    }

    public void countryimages(View view) {
        viewchanged = true;
        setContentView(R.layout.images_country1);

    }

    public void tipscountry(View view) {
        viewchanged = true;
        setContentView(R.layout.tips_country1);

    }
    public void mapscountry(View view)
    {
        //start an intent for maps
        Uri gmmIntentUri = Uri.parse("geo:25.025885,-78.035889?z=8");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
    public void mustvisit(View view)
    {
        viewchanged = true;
        setContentView(R.layout.must_visit);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

}
