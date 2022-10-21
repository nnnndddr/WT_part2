package task3.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ThirdIterator implements Iterator<Double>, Iterable<Double> {

    private double current;
    private final double end;
    private final double step;

    public ThirdIterator(double start, double end, double step){
        current = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public boolean hasNext() {
        return current <= end;
    }

    @Override
    public Double next() {
        if (current > end) throw new NoSuchElementException("Range has no more elements");

        var temp = current;
        current += step;
        return temp;
    }

    @Override
    public Iterator<Double> iterator() { return this; }
}
