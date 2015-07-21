package com.example.administrator.mylemon;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


import MyFragments.PostFragment_2;
//  TODO: set up return button
// TODO: Delete MainUI_BottomButtons when add postfragment
// TODO: find a similar UI for postfragment
// TODO: why transaction.replace  did not replace map fragment? just add new fragment on the top
// TODO: put buttons on mapview, and make mapview full screen.

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    LocationManager MylocManager;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //  调用 GPS获得 当前位置信息,然后通过Post按钮传递到Post页面，以准备上传到后端
        MylocManager = (LocationManager) getSystemService(
                Context.LOCATION_SERVICE
        );


        // initialise buttons
        final Button button = (Button) findViewById(R.id.button_post);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Perform action on click
// Create new fragment and transaction
                Fragment newFragment = new PostFragment_2( );
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
                transaction.replace(R.id.map, newFragment);

                transaction.addToBackStack(null);

// Commit the transaction
                transaction.commit();
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Sydney, Australia, and move the camera.
       Location MyLocation = MylocManager .getLastKnownLocation(LocationManager.GPS_PROVIDER);
        LatLng MyGPSLocation = new LatLng(MyLocation.getLatitude(),MyLocation.getLongitude() );
       /* LatLng sydney = new LatLng(-34, 151);
        LatLng sydney2 = new LatLng(-34, 152);
        map.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
       // map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
        map.addMarker(new MarkerOptions().position(sydney2).title("Marker in Sydney 2"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2, 13));

        map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.message_icon))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(41.889, -87.622)));


         final LatLng MELBOURNE = new LatLng(-37.81319, 144.96298);
         */
        Marker melbourne = map.addMarker(new MarkerOptions()
                .position(MyGPSLocation)
                .title("MyLocation")
                .snippet("This is current test location"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(MyGPSLocation, 13));
    }


}