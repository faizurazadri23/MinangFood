package com.faizurazadri.minangfood.ui.register;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.faizurazadri.minangfood.MainActivity;
import com.faizurazadri.minangfood.R;
import com.faizurazadri.minangfood.databinding.ActivityRegisterBinding;
import com.faizurazadri.minangfood.databinding.ToolbarBinding;
import com.faizurazadri.minangfood.model.User;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding registerBinding;
    private ToolbarBinding toolbarBinding;
    private String first_name, last_name, email, password, hp, gender, address;
    private String list_gender[] = {"Laki-Laki", "Perempuan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding = ActivityRegisterBinding.inflate(getLayoutInflater());
        toolbarBinding = registerBinding.toolbar;
        setContentView(registerBinding.getRoot());

        setToolbarBinding();

        ArrayAdapter<String> arrayAdapterGender = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list_gender);

        registerBinding.gender.setAdapter(arrayAdapterGender);


        registerBinding.btnRegister.setOnClickListener(view -> {
            if (registerBinding.edtFirstName.getText().toString().isEmpty()) {
                registerBinding.edtFirstName.setError(getResources().getString(R.string.txt_required));
                registerBinding.edtFirstName.requestFocus();
                return;
            }

            if (registerBinding.edtLastName.getText().toString().isEmpty()) {
                registerBinding.edtLastName.setError(getResources().getString(R.string.txt_required));
                registerBinding.edtLastName.requestFocus();
                return;
            }

            if (registerBinding.edtEmail.getText().toString().isEmpty()) {
                registerBinding.edtEmail.setError(getResources().getString(R.string.txt_required));
                registerBinding.edtEmail.requestFocus();
                return;
            }

            if (registerBinding.edtPassword.getText().toString().isEmpty()) {
                registerBinding.edtPassword.setError(getResources().getString(R.string.txt_required));
                registerBinding.edtPassword.requestFocus();
                return;
            }

            if (registerBinding.edtHp.getText().toString().isEmpty()) {
                registerBinding.edtHp.setError(getResources().getString(R.string.txt_required));
                registerBinding.edtHp.requestFocus();
                return;
            }

            if (registerBinding.edtAddress.getText().toString().isEmpty()) {
                registerBinding.edtAddress.setError(getResources().getString(R.string.txt_required));
                registerBinding.edtAddress.requestFocus();
                return;
            }

            first_name = registerBinding.edtFirstName.getText().toString();
            last_name = registerBinding.edtLastName.getText().toString();
            email = registerBinding.edtEmail.getText().toString();
            password = registerBinding.edtPassword.getText().toString();
            hp = registerBinding.edtHp.getText().toString();
            gender = registerBinding.gender.getText().toString();
            address = registerBinding.edtAddress.getText().toString();

            User user = new User();
            user.setFirst_name(first_name);
            user.setLast_name(last_name);
            user.setEmail(email);
            user.setPassword(password);
            user.setHp(hp);
            user.setGender(gender);
            user.setAddress(address);

            Intent toRegister = new Intent(RegisterActivity.this, MainActivity.class);
            toRegister.putExtra("DATA", user);
            startActivity(toRegister);
        });
    }

    private void setToolbarBinding() {
        Toolbar toolbar = toolbarBinding.toolbar;
        setSupportActionBar(toolbar);
        toolbarBinding.tvTitle.setText(getResources().getString(R.string.txt_register));
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}