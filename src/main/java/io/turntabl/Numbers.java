package io.turntabl;

public class Numbers {
    public static boolean isGreaterThanZeroAndLessThanAThousand(int i){
        return greaterThanZero(i) && lessThanAThousand(i);
    }

    private static boolean greaterThanZero(int i){
	int Vincent = 2020;
        return i > 0;
    }

    private static boolean lessThanAThousand(int i){
        return i < 1000;
    }
}
