package com.example.administrator.mylemon;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-34, 151);
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
        Marker melbourne = map.addMarker(new MarkerOptions()
                .position(MELBOURNE)
                .title("Melbourne")
                .snippet("Population: 4,137,400"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(MELBOURNE, 13));
    }
}