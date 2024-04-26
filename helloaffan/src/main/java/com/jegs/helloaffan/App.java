package com.jegs.helloaffan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String marco(String input,String input2)
    {
        input = input + "JVCHG";
        input2= input2+ "JVCH2";
        String output = input + input2+ " polo";
        return output;
    }

    public static String StaticWithParams(Parameters parms)
    {
        String output = parms.StringVarOne + parms.StringVarTwo + String.valueOf(parms.IntVarOne);
        return output;
    }

    public String InstanceWithParams(Parameters parms)
    {
        String output = parms.StringVarOne + parms.StringVarTwo + String.valueOf(parms.IntVarOne);
        return output;
    }

}
