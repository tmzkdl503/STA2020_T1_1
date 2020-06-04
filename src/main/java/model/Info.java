package model;

public class Info {
    public final static int A = 0, B = 1, C = 2, D = 3, LONGB = 4, LONGC = 5, LONGD = 6;

    public final static int TIMEKEEPING = 00, TIMEKEEPINGSET = 01;
    public final static int TIMER = 10;
    public final static int STOPWATCH = 20;
    public final static int ALARM = 30, ALARMSET = 31;
    public final static int WORLDTIME = 40;
    public final static int SCHEDULE = 50, SCHEDULESET = 51;

    public final static int SELECTMODE = 60;
    public final static int BEEPALARM = 70, BEEPTIMER = 71;

//    final static int TIME_TYPE_CURRENT_TIME = 0;
//    final static int TIME_TYPE_TIMER = 1;
//    final static int TIME_TYPE_STOPWATCH = 2;
//    final static int TIME_TYPE_CURRENT_TIME = 0;
//    final static int TIME_TYPE_TIMER = 1;
//    final static int TIME_TYPE_STOPWATCH = 2;

    public final static int TIME_POINTER_NULL = 0;
    public final static int TIME_POINTER_HOUR = 1;
    public final static int TIME_POINTER_MINUTE = 2;
    public final static int TIME_POINTER_SECOND = 3;
    public final static int TIME_POINTER_SCHETYPE = 3;
    public final static int TIME_POINTER_YEAR = 4;
    public final static int TIME_POINTER_MONTH = 5;
    public final static int TIME_POINTER_DAY = 6;


    public final static int DAY_OF_MONTH[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Jan. check
}
