import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Job_Sequencing_problem {
    public static void main(String[] args) {
        int jobs[][]={{4,20},{1,10},{1,40},{1,30}};
        Arrays.sort(jobs,Comparator.comparingDouble(o -> o[1]));
        ArrayList<Integer> ans=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.length;i++){
            if(jobs[i][0]>time){
                time++;
                ans.add(jobs[i][1]);
            }
        }
        for(int i=0;i<ans.size();i++){
             for(int j=0;j<ans.size();j++)
            System.out.println(jobs[i][j]);
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
