/**
 * Counter counts up.
 *
 * @author Ahmed Ali (101181126)
 * @version 1.0 March 16, 2022
 */
public class LimitedCounter extends Counter
{
    /**
     * Constructs a new LimitedCounter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
     */
    public LimitedCounter()
    {
        super();
    }

    /**
     * Constructs a new LimitedCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     * 
     * @param minCount The starting point of the counting
     * @param maxCount The ending point of the counting
     */
    public LimitedCounter(int minCount, int maxCount)
    {
        super(minCount, maxCount);
    }

    /**
     * Increment this counter by 1. Stops if at maximum.
     */
    public void countUp()
    {
        // If we've reached the maximum count, invoking this
        // method doesn't change the state of the counter.
        if (super.count() != super.maximumCount()) {
            super.incrementCount();
        }
    }
}
