package com.pemobile.ujianmidgis;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Add a marker in Pertamina Imam Bonjol and move the camera
        LatLng im = new LatLng(-0.893883, 119.855693);
        mMap.addMarker(new MarkerOptions().position(im).title("Pertamina Imam Bonjol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(im));

        // Add a marker in Pertamina Sisingamangaraja and move the camera
        LatLng sigma = new LatLng(-0.893196, 119.886155);
        mMap.addMarker(new MarkerOptions().position(sigma).title("Pertamina Sisingamangaraja"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sigma));
        
        // Add a marker in Pertamina Pramuka and move the camera
        LatLng pramuka = new LatLng(-0.893256, 119.868214);
        mMap.addMarker(new MarkerOptions().position(pramuka).title("Pertamina Pramuka"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pramuka));

        // Add a marker in Pertamina Diponegoro and move the camera
        LatLng diponegoro = new LatLng(-0.886293, 119.847020);
        mMap.addMarker(new MarkerOptions().position(diponegoro).title("Pertamina Diponegoro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(diponegoro));

        // Add a marker in Pertamina Gunung Nokilalaki and move the camera
        LatLng noki = new LatLng(-0.900874, 119.879931);
        mMap.addMarker(new MarkerOptions().position(noki).title("Pertamina Gunung Nokilalaki"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(noki));

        // Add a marker in Pertamina Jalur II Mohammad Yamin and move the camera
        LatLng yamin = new LatLng(-0.907391, 119.889003);
        mMap.addMarker(new MarkerOptions().position(yamin).title("Pertamina Jalur II Mohammad Yamin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yamin));

        // Add a marker in Pertamina Maluku and move the camera
        LatLng maluku = new LatLng(-0.904860, 119.872652);
        mMap.addMarker(new MarkerOptions().position(maluku).title("Pertamina Maluku"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(maluku));

        // Add a marker in Pertamina Soekarno Hatta Tondo and move the camera
        LatLng sh = new LatLng(-0.847026, 119.891120);
        mMap.addMarker(new MarkerOptions().position(sh).title("Pertamina Soekarno Hatta Tondo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sh));

        // Add a marker in Pertamina Tavanjuka and move the camera
        LatLng tavanjuka = new LatLng(-0.921977, 119.863278);
        mMap.addMarker(new MarkerOptions().position(tavanjuka).title("Pertamina Tavanjuka"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tavanjuka));

        // Add a marker in Pertamina Talise and move the camera
        LatLng talise = new LatLng(-0.860110, 119.881241);
        mMap.addMarker(new MarkerOptions().position(talise).title("Pertamina Talise"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(talise));

        // Add a marker in Pertamina RA Kartini and move the camera
        LatLng kartini = new LatLng(-0.900109, 119.879560);
        mMap.addMarker(new MarkerOptions().position(kartini).title("Pertamina RA Kartini"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kartini));

        // Add a marker in Pertamina Towua and move the camera
        LatLng towua = new LatLng(-0.919334, 119.877768);
        mMap.addMarker(new MarkerOptions().position(towua).title("Pertamina Towua"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(towua));

        // Add a marker in Pertamina Kayumalue and move the camera
        LatLng kayumalue = new LatLng(-0.743016, 119.863676);
        mMap.addMarker(new MarkerOptions().position(kayumalue).title("Pertamina Kayumalue"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kayumalue));
    }
}