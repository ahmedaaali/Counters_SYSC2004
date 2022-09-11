/**
 * Counter counts up. then rolls over at maximum.
 *
 * @author Ahmed Ali (101181126)
 * @version 1.0 March 16, 2022
 */
public class RollOverCounter extends Counter
{
    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
     */
    public RollOverCounter()
    {
        super();
    }

    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     * 
     * @param minCount The starting point of the counting
     * @param maxCount The ending point of the counting
     */
    public RollOverCounter(int minCount, int maxCount)
    {
        super(minCount, maxCount);
    }

    /**
     * Increment this counter by 1. Rolls over if at maximum.
     */
    public void countUp()
    {
        // If we've reached the maximum count, invoking this
        // method rolls the counter over to its minimum value.
        if (super.count() == super.maximumCount()) {
            super.reset();
        } else {
            super.incrementCount();;
        }
    }
}
