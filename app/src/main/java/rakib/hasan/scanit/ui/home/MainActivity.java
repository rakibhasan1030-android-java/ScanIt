package rakib.hasan.scanit.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import rakib.hasan.scanit.R;
import rakib.hasan.scanit.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }

}