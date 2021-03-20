package com.example.collegetourapp;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng>arrayList=new ArrayList<LatLng>();

    String[] namesList = new String[]{"Open Audi", "PU College", "Block 1", "Block 2", "Block 3", "Block 4", "Block 5", "Devadan Hall" };

    LatLng openAudi = new LatLng(12.862700, 77.438594);
    LatLng puCollege = new LatLng(12.860271, 77.437214);
    LatLng block1 = new LatLng(12.862959, 77.437947);
    LatLng block2 = new LatLng(12.862784, 77.438296);
    LatLng block3 = new LatLng(12.862412, 77.438782);
    LatLng block4 = new LatLng(12.862241, 77.439269);
    LatLng block5 = new LatLng(12.861780, 77.438497);
    LatLng devadanHall = new LatLng(12.860247, 77.439468);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(openAudi);
        arrayList.add(puCollege);
        arrayList.add(block1);
        arrayList.add(block2);
        arrayList.add(block3);
        arrayList.add(block4);
        arrayList.add(block5);
        arrayList.add(devadanHall);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        // Add a marker in Sydney and move the camera
        for(int i=0; i<arrayList.size();i++){
            mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title(namesList[i]));
        }
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(block5, 17.0f));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(openAudi));
    }
}