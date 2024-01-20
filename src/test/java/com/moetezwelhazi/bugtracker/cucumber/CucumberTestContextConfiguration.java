package com.moetezwelhazi.bugtracker.cucumber;

import com.moetezwelhazi.bugtracker.IntegrationTest;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
