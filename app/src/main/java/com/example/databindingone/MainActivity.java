package com.example.databindingone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.widget.Toast;

import com.example.databindingone.databinding.ActivityMainBinding;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    User user;
    ActivityMainBinding binding;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main );
        user = new User( "Disanth", "Nagidi",16);
        binding.setUser( user );
        binding.setMain(new HanleClick());
    }
    public class HanleClick {
        public void onTriggered(View view) {
            String[] first = new String[]{"Disanth","Khaja","Vishnu","Bulli","Avinsah"};
            String[] last = new String[]{"Nagidi","Shaik","Vatala","pulavarthi","thota"};
            i++;
            user.setFirstName(first[i%5]);
            user.setLastName(last[i%5]);
        }
    }
}
