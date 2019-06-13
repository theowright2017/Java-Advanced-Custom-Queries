package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> returnAllWhiskiesByYear(int year);

    List<Whisky> returnAllWhiskyOfCertainAgeFromCertainDistillery(String distillery, int age);
}
