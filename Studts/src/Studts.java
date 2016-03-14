import java.util.Scanner;


public class Studts {

	private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
      
        System.out.print("Enter number of studts: ");
        int nos = input.nextInt();
        String[] studtname = new String[nos];
        String[] stid = new String[nos];
        float[] stuscore = new float[nos];
       float average=0,bg1=0,bg=0,stuscore2=0,first,second;
        //int first,second;
       first=second=Integer.MAX_VALUE;
        for(int i = 0; i < nos; i++) {
            System.out.print("Enter the studt's Id,studtname,score ");
             stid[i]=input.next();
             studtname[i]= input.next();
            
             stuscore[i] = input.nextFloat();
        }
        for(int i = 0; i < nos; i++) {
        	
        	average=average+stuscore[i];
        	if(stuscore[i]>bg1){
        		bg=stuscore[i];
        		stuscore2=bg1;
        		bg1=stuscore[i];
        	}
        }
             for (int i = 0; i <nos  ; i ++)
                {
                    if (stuscore[i] < first)
                    {
                        second = first;
                        first = stuscore[i];
                    }
         
                    /* If arr[i] is in between first and second
                       then update second  */
                    else if (stuscore[i] < second && stuscore[i] != first)
                        second = stuscore[i];
                }
                
            
        	
        
        float averages=average/nos;
        System.out.println("The average score is:"+averages);
        for(int i = 0; i < nos; i++) {
        	
        	if(stuscore[i]==bg){
        		System.out.println("studt with highest score:"+stid[i]+"  "+studtname[i]+"  " +stuscore[i]);
             	}
        }
        for(int i = 0; i < nos; i++) {
        		if(stuscore[i]==stuscore2){
            		System.out.println("studt with second highest score:"+stid[i]+"  "+studtname[i]+"  " +stuscore[i]);
        		}
        }
        for(int i = 0; i < nos; i++) {
        		if(stuscore[i]==first){
                		System.out.println("studt with lowest score:"+stid[i]+"  "+studtname[i]+"  " +stuscore[i]);
            		}
        }
       for(int i = 0; i < nos; i++) {
        		if(stuscore[i]==second){
                		System.out.println("studt with second lowest score:"+stid[i] +"  "+studtname[i]+"  " +stuscore[i]);	
                		}
        }
        System.out.println("studts with a"
        		+ "bove the average scores are:");
        for(int i=0;i<nos;i++) {
        	if(stuscore[i]>averages){
        		System.out.println(stid[i] +"  "+studtname[i]+"  " +stuscore[i]);
		}
        }
    }

}

   

