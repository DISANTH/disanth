package com.example.databindingone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    ActivityMainBinding binding;
    Employee employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main );
        user = new User( "Disanth", "Nagidi",16);
        binding.setUser( user );
        binding.setMain(new HanleClick());
    }
    public class HanleClick
    {
        public void onTriggered(View view)
        {
            user = new User("Khaja","Shaik",26);
            Toast.makeText( MainActivity.this, "Hello", Toast.LENGTH_SHORT ).show();
            employee.lastname.set("Shaik");
            employee.firstName.set("Khaja");
            binding.setUser(user);
        }
    }
    private class Employee
    {
        public final ObservableField<String> firstName = new ObservableField<>();
        public final ObservableField<String> lastname = new ObservableField<>();
        public final ObservableInt age = new ObservableInt();
    }
}
