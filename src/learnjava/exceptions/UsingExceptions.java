/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava.exceptions;

/**
 *
 * @author HP
 */
public class UsingExceptions {

    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) // exception thrown by throwException
        {
            System.err.println("Exception handled in main");
        }

        doesNotThrowException();
    }

    // demonstrate try...catch...finally
    public static void throwException() throws Exception {
        try // throw an exception and immediately catch it
        {
            System.out.println("Method throwException");
            throw new Exception(); // generate exception
        } catch (Exception exception) // catch exception thrown in try
        {
            System.err.println(
                    "Exception handled in method throwException");
            throw exception; // rethrow for further processing
// code here would not be reached; would cause compilation errors
        } // code here would not be reached; would cause compilation errors
        finally // executes regardless of what occurs in try...catch
        {
            System.err.println("Finally executed in throwException");
        }
 
    }

    // demonstrate finally when no exception occurs
    public static void doesNotThrowException() {
        try // try block does not throw an exception
        {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) // does not execute
        {
            System.err.println(exception);
        } finally // executes regardless of what occurs in try...catch
        {
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
