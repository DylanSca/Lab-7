/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }
    
    public String busiestHour(){
        //15
        int busiestHour= -1;
        int maxCount= 0;
        for(int i=0; i< hourCounts.length;i++){
            if(hourCounts[i]> maxCount){
                maxCount = hourCounts[i];
                busiestHour=i;
            }
        }
         return " "+ busiestHour + "is the busiest hour";
    }
    
    public String quiestestHour(){
        //16
        int lowCount = hourCounts[0];
        int quiestestHour = 0;
        for(int i=1; i< hourCounts.length;i++){
            if(hourCounts[i]< lowCount){
                lowCount = hourCounts[i];
                quiestestHour=i;
            }
        }
         return quiestestHour + "is the quietest hour";
    }
    
    
    public int numberOfAccesses(){
        //14
        int total=0;
        for(int count : hourCounts){
            total+= count;
        }
        return total;
    }
    
    public void test(){
        //11
        int[] marks={1,3,4,5};
        for(int index=0;index<marks.length;index++){
            if(marks[index]>0){
                System.out.println(marks[index]);
            }
        }
    }
    
    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        //10
        int hour=0;
        while( hour < hourCounts. length){
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
/*
 * 1) Busiest time of the say is hour 18
 * 2) private int [] person = {};
 * 3) private boolean {} vacant = {};
 * 5) 1. the [] before the int 
 *    2. boolean [] occupied = new boolean[500];
 * 6) double[] readings = new double[] 60;
 *    String[] urls = New String = [90];
 *    TicketMachine[] machines = new Ticketmachine =[5];
 * 7) 20 Strings
 * 8) It should be new double[50];
 * 9) Its out of bonds 24
 * 13) for (int count : hourCounts){
 *     total 
 }
 * 
 * 
 * 
 * 
 * 
 * 
 */