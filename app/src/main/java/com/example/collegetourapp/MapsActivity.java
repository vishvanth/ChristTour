package com.example.collegetourapp;
//sparta5
import androidx.fragment.app.FragmentActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList = new ArrayList<LatLng>();

    String[] namesList = new String[]{"Open Audi", "PU College", "Block 1", "Block 2", "Block 3", "Block 4", "Block 5", "Devadan Hall", "Architecture Block"
            , "Main Ground", "Basketball Ground", "Band Stand", "Solar Panel", "Amphitheater"};

    LatLng openAudi = new LatLng(12.8630615, 77.4386741); //done
    LatLng puCollege = new LatLng(12.8604500, 77.4370274); //done
    LatLng block1 = new LatLng(12.8630785, 77.4379522); //done
    LatLng block2 = new LatLng(12.8629131, 77.4383522); //done
    LatLng block3 = new LatLng(12.8627212, 77.4388792); //done
    LatLng block4 = new LatLng(12.8625567, 77.4392073); //done
    LatLng block5 = new LatLng(12.861780, 77.438497);
    LatLng devadanHall = new LatLng(12.8604251, 77.4393860);
    LatLng archi = new LatLng(12.8602868, 77.4396068);
    LatLng mainground = new LatLng(12.8616224, 77.4363119);
    LatLng basketground = new LatLng(12.8616224, 77.4363119);
    LatLng bandstand = new LatLng(12.8627918, 77.4364783);
    LatLng solar = new LatLng(12.8612432, 77.4414635);
    LatLng amphi = new LatLng(12.8614043, 77.4379488);


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
        arrayList.add(archi);
        arrayList.add(mainground);
        arrayList.add(basketground);
        arrayList.add(bandstand);
        arrayList.add(solar);
        arrayList.add(amphi);


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

        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(

                            this, R.raw.mapstyle));

            if (!success) {
                Log.e("map", "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e("mapError", "Can't find style. Error: ", e);
        }

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        // Add a marker in Sydney and move the camera
        for (int i = 0; i < arrayList.size(); i++) {
            mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title(namesList[i]));
        }
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(amphi, 17.0f));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(openAudi));
    }
}