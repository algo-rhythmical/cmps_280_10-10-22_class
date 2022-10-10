public class Orange implements Comparable<Orange> {
    private double weight;
    private double diameter;
    private int ripeLevel;


    public Orange(double weight, double diameter, int ripeLevel) {
        if (weight > 0)
            this.weight = weight;
        else
            this.weight = 1;
        this.diameter = diameter;
        this.ripeLevel = ripeLevel;
    }

    public String toString(){
        return "orange(weight:" + weight + ", diameter:" + diameter;
    }

    public int compareTo(Orange other) {
        if (this.weight < other.weight)
            return -1;
        else
            if (this.weight == other.weight)
                return 0;
            else
                return 1;
    }
}
