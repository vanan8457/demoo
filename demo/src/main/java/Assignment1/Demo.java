package Assignment1;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@Slf4j
public class Demo {
    public static void main(String[] args) {
        List<Integer>ds= Arrays.asList(8,7,6,9,12,5,3,8,12,3);
//        System.out.println(ds);
//        log.info(String.valueOf(ds.indexOf(5)));
//        Collections.sort(ds,Collections.reverseOrder());
//        ds.forEach(v-> log.info(String.valueOf(v)));
        Map<Integer,Integer> countByNumber = new HashMap<Integer,Integer>();
        int maxcount=0;
        for(Integer n:ds)
        {
            Integer count = countByNumber.get(n);
            if (count != null) {
                if(count+1>maxcount){
                    maxcount=count+1;
                }
                countByNumber.put(n,count+1 );
            }
            else {
                countByNumber.put(n,1);
            }
        }
       System.out.println(countByNumber);
        Iterator it = countByNumber.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((Integer) pair.getValue()==maxcount){
                System.out.println(pair.getKey() + " = " + pair.getValue());

            }


        }



//




//     Map<Integer,Long>result=ds.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//    result.forEach((k,v)-> System.out.println(k+":"+v));
//       int numOfRepeat=1;
//        for (int i=0;i<ds.size();i++){
//            int count=1;
//            int num=ds.get(i);
//            for (int j=i+1;j< ds.size();j++){
//                if((i!=j)&&num==ds.get(j)){
//                    count++;
//                }
//            }
//            if(count>numOfRepeat){
//               numOfRepeat=count;
//            }
//        }
//        List<Integer> repeatlist=new ArrayList<>();
//        for (int i=0;i<ds.size();i++){
//            int count=1;
//            int num=ds.get(i);
//            for (int j=i+1;j< ds.size();j++){
//                if((i!=j)&&num==ds.get(j)){
//                    count++;
//                }
//            }
//            if(count==numOfRepeat){
//                boolean findnumber=false;
//                for (int k=0;k< repeatlist.size();k++){
//                    if(repeatlist.get(k)==num){
//                        findnumber=true;
//                    }
//                }
//                if(!findnumber){
//                    repeatlist.add(num);
//                }
//            }
//     }
//        log.info("List best repeat number{},number of repeat {}",repeatlist,numOfRepeat);




  }



}
