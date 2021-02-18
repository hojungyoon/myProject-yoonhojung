package com.mypr.pms.domain;

import java.sql.Date;

public class BodyCheckMenu {
  private int num;
  private double badyWeight;
  private double tall;
  private double bodyFatMass;
  private double muscleMass;
  private Date date;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(badyWeight);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(bodyFatMass);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((date == null) ? 0 : date.hashCode());
    temp = Double.doubleToLongBits(muscleMass);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + num;
    temp = Double.doubleToLongBits(tall);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BodyCheckMenu other = (BodyCheckMenu) obj;
    if (Double.doubleToLongBits(badyWeight) != Double.doubleToLongBits(other.badyWeight))
      return false;
    if (Double.doubleToLongBits(bodyFatMass) != Double.doubleToLongBits(other.bodyFatMass))
      return false;
    if (date == null) {
      if (other.date != null)
        return false;
    } else if (!date.equals(other.date))
      return false;
    if (Double.doubleToLongBits(muscleMass) != Double.doubleToLongBits(other.muscleMass))
      return false;
    if (num != other.num)
      return false;
    if (Double.doubleToLongBits(tall) != Double.doubleToLongBits(other.tall))
      return false;
    return true;
  }

  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  public double getBadyWeight() {
    return badyWeight;
  }
  public void setBadyWeight(double badyWeight) {
    this.badyWeight = badyWeight;
  }
  public double getTall() {
    return tall;
  }
  public void setTall(double tall) {
    this.tall = tall;
  }
  public double getBodyFatMass() {
    return bodyFatMass;
  }
  public void setBodyFatMass(double bodyFatMass) {
    this.bodyFatMass = bodyFatMass;
  }
  public double getMuscleMass() {
    return muscleMass;
  }
  public void setMuscleMass(double muscleMass) {
    this.muscleMass = muscleMass;
  }
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    String s = String.format("[ Date : %s ]"
        + "\n[ 키 ]> %dCm"
        + "\n[ 몸무게 ]> %.1f Kg"
        + "\n[ 골격근량 ]> %.1f %"
        + "\n[ 체지방 ]> %.1f %"
        + "\n=========================\n"
        , date, tall, badyWeight, muscleMass, bodyFatMass);
    return s;
  }

}