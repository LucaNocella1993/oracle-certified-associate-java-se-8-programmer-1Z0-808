package oca.examples;

public interface InterfaceTest {
public static final int X = 10;
int Y = 10;
public abstract int getInt();
public int getInt2();
public default int gettInt() {return 5;}
public static int getttInt() {return 6;}
}
