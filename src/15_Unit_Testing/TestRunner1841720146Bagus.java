/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.*;

/**
 *
 * @author ROG SERIES
 */
public class TestRunner1841720146Bagus {

    private static boolean failures;

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720146Bagus.class);
        showMessageResult(mResult, MessageProcessorTest1841720146Bagus.class.getSimpleName());

    }

    private static void showMessageResult(Result mResult, String className) {
        if (mResult.wasSuccessful()) {

            System.out.format("The Result from %s : %s\n", className, mResult.wasSuccessful());

        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failures);
            }
        }
    }
}
