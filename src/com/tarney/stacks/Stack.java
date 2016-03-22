/************************************************************************
 *
 * 1. This software is for the purpose of demonstrating one of many
 * ways to implement the algorithms in Introduction to Algorithms,
 * Second edition, by Thomas H. Cormen, Charles E. Leiserson, Ronald
 * L. Rivest, and Clifford Stein.  This software has been tested on a
 * limited set of test cases, but it has not been exhaustively tested.
 * It should not be used for mission-critical applications without
 * further testing.
 *
 * 2. McGraw-Hill licenses and authorizes you to use this software
 * only on a microcomputer located within your own facilities.
 *
 * 3. You will abide by the Copyright Law of the United Sates.
 *
 * 4. You may prepare a derivative version of this software provided
 * that your source code indicates that it based on this software and
 * also that you have made changes to it.
 *
 * 5. If you believe that you have found an error in this software,
 * please send email to clrs-java-bugs@mhhe.com.  If you have a
 * suggestion for an improvement, please send email to
 * clrs-java-suggestions@mhhe.com.
 * 
 * Modified/used by Brandon Tarney for Johns Hopkins 605.421 Algorithms course
 * 
 * @author Tarney
 * @version 2.0 3/21/16
 *
 ***********************************************************************/

package com.tarney.stacks;

/** Interface for a stack. */

public interface Stack
{
    /**
     * Pushes an String onto the stack.
     *
     * @param x String to be pushed.
     */
    public void push(String x);

    /** Pops an String from the stack, returning the popped String. */
    public String pop();
    
    /** Returns the "top" String of the stack */
    public String peek();
    
    /** Pops a given number of items from the stack and returns the last item popped */
    public String multiPop(int howManyPops);

    /** Returns <code>true</code> if the stack is empty,
     * <code>false</code> otherwise. */
    public boolean isEmpty();
    
    /** Get the size of the stack     */
    public int getSize();
}

