package com.granular8.specification.sample.spec;

import com.granular8.specification.sample.domain.Region;
import com.granular8.specification.sample.domain.Car;
import com.granular8.specification.spec.AbstractSpecification;

import java.util.Set;

public class CarOwnerRegionSpecification extends AbstractSpecification {
  private Set<Region> authorizedRegions;

  public CarOwnerRegionSpecification(Set<Region> authorizedRegions) {
    this.authorizedRegions = authorizedRegions;
  }

  public boolean isSatisfiedBy(Object o) {
    if (o instanceof Car) {
      Car car = (Car) o;
      return authorizedRegions.contains(car.owner().homeAddress().region());
    } else {
      throw new ClassCastException("I only deal with cars, you gave me: " +
         o.getClass().getCanonicalName());
    }
  }
}
