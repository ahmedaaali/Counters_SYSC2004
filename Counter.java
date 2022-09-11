/**
 * Counter counts up.
 *
 * @author Ahmed Ali (101181126)
 * @version 1.0 March 16, 2022
 */
public class Counter
{
    /** The current value of this counter. */
    private int count;

    /** The minimum value of this counter. */
    private int minimumCount;

    /** The maximum value of this counter. */
    private int maximumCount;

    /** The default minimum value of this counter. */
    private static final int DEFAULT_MINIMUM = 0;

    /** The default maximum value of this counter. */
    private static final int DEFAULT_MAXIMUM = 999;

    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
     */
    public Counter()
    {
        minimumCount = DEFAULT_MINIMUM;
        maximumCount = DEFAULT_MAXIMUM;
        count = minimumCount;
    }

    /**
     * Constructs a new RollOverCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     * 
     * @param minCount The starting point of the counting
     * @param maxCount The ending point of the counting
     */
    public Counter(int minCount, int maxCount)
    {
        minimumCount = minCount;
        maximumCount = maxCount;
        count = minimumCount;
    }

    /**
     * Returns the maximum value of this counter.
     * 
     * @return maximum number in the counter.
     */
    public int maximumCount()
    {
        return maximumCount;
    }

    /**
     * Returns the minimum value of this counter.
     * 
     * @return minimum number in the counter.
     */
    public int minimumCount()
    {
        return minimumCount;
    }

    /**
     * Returns this counter's current count.
     * 
     * @return number in the counter.
     */
    public int count()
    {
        return count;
    }

    /**
     * Returns true if this counter is at its minimum value.
     * 
     * @return True if at minimum number in the counter. False otherwise.
     */
    public boolean isAtMinimum()
    {
         return (count == minimumCount);
    }

    /**
     * Returns true if this counter is at its maximum value.
     * 
     * @return True if at maximum number in the counter. False otherwise.
     */
    public boolean isAtMaximum()
    {
        return (count == maximumCount);
    }

    /**
     * Resets this counter to its minimum value.
     */
    public void reset()
    {
        count = minimumCount;
    }

    /**
    * Increment this counter by 1.
    */
    public void incrementCount()
    {
        count++;
    }
}