package com.example.MetricsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codahale.metrics.RatioGauge;
import com.codahale.metrics.jvm.FileDescriptorRatioGauge;

@SpringBootApplication
public class MetricsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricsTestApplication.class, args);
		RatioGauge ratioGauge = new FileDescriptorRatioGauge();
		ratioGauge.getValue();
	}
}
