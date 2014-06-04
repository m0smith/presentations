
//
package com.m0smith;

/**
 *  Implement a date object
 */

public class FunctionalDate 
    implements Comparable<FunctionalDate>
{
    /**
     * number of milliseconds since January 1, 1970, 00:00:00 GMT
     */
    private long value;


    public FunctionalDate(long v) {
        value = v;
    }

    @Override
    public int compareTo(FunctionalDate l) {
        if (value == l.value)
            return 0;
        return value > l.value ? 1 : -1;
    }

}
