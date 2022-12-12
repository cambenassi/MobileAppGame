/*
Mobile App Development I -- COMP.4630 Honor Statement
The practice of good ethical behavior is essential for maintaining good
order in the classroom, providing an enriching learning experience for
students, and training as a practicing computing professional upon
graduation. This practice is manifested in the University's Academic
Integrity policy. Students are expected to strictly avoid academic
dishonesty and adhere to the Academic Integrity policy as outlined in the
course catalog. Violations will be dealt with as outlined therein. All
programming assignments in this class are to be done by the student alone
unless otherwise specified. No outside help is permitted except the
instructor and approved tutors.
I certify that the work submitted with this assignment is mine and was
generated in a manner consistent with this document, the course academic
policy on the course website on Blackboard, and the UMass Lowell academic
code.
Date: 11/16/2022
Name: Anil Rao
*/


package com.mobileapp.lecture17exeranil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.mobileapp.lecture17exeranil.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);
    }
}