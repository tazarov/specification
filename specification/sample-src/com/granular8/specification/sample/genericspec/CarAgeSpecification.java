package com.granular8.specification.sample.genericspec;

import com.granular8.specification.sample.domain.Car;
import com.granular8.specification.genericspec.AbstractSpecification;

public class CarAgeSpecification extends AbstractSpecification<Car> {
  public boolean isSatisfiedBy(Car car) {
    throw new UnsupportedOperationException();
  }
}
