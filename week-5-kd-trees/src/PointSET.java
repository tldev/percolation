import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.SET;
import edu.princeton.cs.algs4.Stack;

/**
 * Created by tjohnell on 7/16/17.
 */
public class PointSET {
    private SET<Point2D> set;

    // construct an empty set of points
    public PointSET() {
        set = new SET<Point2D>();
    }

    // is the set empty?
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // number of points in the set
    public int size() {
        return 0;
    }

    // add the point to the set (if it is not already in the set)
    public void insert(Point2D p) {
        set.add(p);
    }

    // does the set contain point p?
    public boolean contains(Point2D p) {
        return set.contains(p);
    }

    // draw all points to standard draw
    public void draw() {
    }

    // all points that are inside the rectangle
    public Iterable<Point2D> range(RectHV rect) {
        return new Stack<Point2D>();
    }

    // a nearest neighbor in the set to point p; null if the set is empty
    public Point2D nearest(Point2D p) {
        return new Point2D(0.0, 0.0);
    }

    // unit testing of the methods (optional)
    public static void main(String[] args) {
    }
}