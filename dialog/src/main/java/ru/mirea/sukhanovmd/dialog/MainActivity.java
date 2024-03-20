package ru.mirea.sukhanovmd.dialog;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAlertDialog(View view) {
        MyAlertDialogFragment dialogFragment = new MyAlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "AlertDialogFragment");
    }

    public void onClickTimeDialog(View view) {
        MyTimeDialogFragment dialogFragment = new MyTimeDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "TimePickerDialogFragment");
    }

    public void onClickDateDialog(View view) {
        MyDateDialogFragment dialogFragment = new MyDateDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DatePickerDialogFragment");
    }

    public void onClickProgressDialog(View view) {
        MyProgressDialogFragment dialogFragment = new MyProgressDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "ProgressDialogFragment");
    }

    public void onOkClicked() {
        showSnackbar("Вы выбрали кнопку \"Иду дальше\"!");
    }

    public void onCancelClicked() {
        showSnackbar("Вы выбрали кнопку \"Нет\"!");
    }

    public void onNeutralClicked() {
        showSnackbar("Вы выбрали кнопку \"На паузе\"!");
    }

    public void showSnackbar(String message) {
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }
}