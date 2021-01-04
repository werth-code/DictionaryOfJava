package com.werth;

public class ZComparablePerson implements Comparable<ZComparablePerson> {
    private String name;
    private Integer age;
    private Double weight;

    public ZComparablePerson(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(ZComparablePerson o) {
        return Integer.compare(getAge(), o.getAge());
    }
}
