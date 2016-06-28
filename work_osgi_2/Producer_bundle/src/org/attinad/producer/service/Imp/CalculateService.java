package org.attinad.producer.service.Imp;

import org.attinad.producer.service.ProducerService;

public class CalculateService implements ProducerService{

	@Override
	public int sum(int a, int b) {
		
		return a+b;
	}

}
