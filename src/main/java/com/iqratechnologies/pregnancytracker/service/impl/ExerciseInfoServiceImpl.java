package com.iqratechnologies.pregnancytracker.service.impl;

import com.iqratechnologies.pregnancytracker.service.ExerciseInfoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Data
@AllArgsConstructor
@Service
@Transactional
public class ExerciseInfoServiceImpl implements ExerciseInfoService {
}
