package com.ltp.gradesubmission;

import java.util.UUID;

public class Grade {
  public String name;
  public String subject;
  public String score;
  public String id;


  public Grade() {
    this.id = UUID.randomUUID().toString();
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getScore() {
    return this.score;
  }

  public void setScore(String score) {
    this.score = score;
  }


  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", subject='" + getSubject() + "'" +
      ", score='" + getScore() + "'" +
      "}";
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
