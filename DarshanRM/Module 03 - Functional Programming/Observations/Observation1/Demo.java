package org.darshan.Observations.Observation1;

public class Demo {
    public int a;
    public int b;

    public Demo() {
        this.a = 10;
        this.b = 20;
    }

    public boolean equals(Demo obj) {
        return (this.a == obj.a && this.b == obj.b);
    }
}
