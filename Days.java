public enum Days {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    private final int numDays;
    Days(int dayNum){
        this.numDays = dayNum;
    }

    public int getNumDays(){
        return this.numDays;
    }
}
