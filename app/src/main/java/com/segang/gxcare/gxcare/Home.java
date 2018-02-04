package com.segang.gxcare.gxcare;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private Button emergencyContact;
    private Button emergency;

    public Home() {
        // Required empty public constructor
    }

    public static Home newInstance() {
        Home home = new Home();
        return home;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        emergencyContact = view.findViewById(R.id.emergency_contact);
        emergency = view.findViewById(R.id.emergency);

        emergencyContact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                call("7054718331");
            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                call("7054718331");
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void call(String number) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + number));
        System.out.println(number);
        if (ActivityCompat.checkSelfPermission(getActivity(),
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }

}
