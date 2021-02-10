package com.dkit.sd2a.johnloane;

/**
 * SD2a Regular Expressions - we care about regular expressions because they will allow us to sanitise user input e.g email -> something@somthing.something
 * (087)-1234567
 */
public class App 
{
    public static void main( String[] args )
    {
        basicStringRegex();
        alphaNumericStringRegex();
        alphaNumericStringMatchesRegex();
        alphaNumericStringEndMultipleCharsRegex();
    }

    private static void alphaNumericStringEndMultipleCharsRegex()
    {
        String alphanumeric = "adcDeeeF12Ghhiiiiijkl99z";
        //$ is the opposite of ^ and indicates the end of the string
        System.out.println(alphanumeric.replaceAll("ijkl99z$", "END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));

        //Challenge - write regex to remove all a, e or i that are followed by and F or j and replace with X
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

    }

    private static void alphaNumericStringMatchesRegex()
    {
        String alphanumeric = "adcDeeeF12Ghhiiiiijkl99z";
        System.out.println(alphanumeric.matches("^hello"));
        //matches looks for a match with the entire string
        System.out.println(alphanumeric.matches("^adcDeeeF12Ghhiiiiijkl99z"));
    }

    private static void alphaNumericStringRegex()
    {
        String alphanumeric = "adcDeeeF12GhhadcDeeeiiiiijkl99z";
        System.out.println(alphanumeric);
        // . will match any character
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        //^ means that the regex has to appear at the start of the string
        System.out.println(alphanumeric.replaceAll("^adcDeee", "YYY"));
    }

    private static void basicStringRegex()
    {
        String testString = "I like trains. So I do";
        System.out.println(testString);
        //A string is a regular expression
        String secondString = testString.replaceAll("I", "You");
        System.out.println(secondString);
    }
}
