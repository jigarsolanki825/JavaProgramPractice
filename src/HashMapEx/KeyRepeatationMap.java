package HashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyRepeatationMap {

    public static void main(String[] args) {
        HashMap<String, String> emailMap = new HashMap<>();
        emailMap.put("jayapandiyan.m@hcl.com","Jay");
        emailMap.put("jayapandiyan.mani@ibm.com","Jay");
        emailMap.put("jayapandiyan.mani@ppd.com","Jay");
        emailMap.put("jigar.solanki@gmail.com","Jigar");
        emailMap.put("jigar.s@citi.com","Jigar");
        emailMap.put("kannan.mani@arcadia.com","Kannan");

        //jay - ["jayapandiyan.m@hcl.com"]
        //list.add(jayapandiyan.mani@ibm.com);

        //"jay" - {"jayapandiyan.m@hcl.com","jayapandiyan.mani@ibm.com","jayapandiyan.mani@ppd.com"}
        //"Jigar" - {}
        //"Kannan" - {}

        Map<String, List<String>> outputMap = new HashMap<>();


        for(Map.Entry<String,String> email : emailMap.entrySet()){

            if(outputMap.containsKey(email.getValue())){
                List<String> exList = outputMap.get(email.getValue());
                List<String> emailList = new ArrayList<>();
                emailList.addAll(exList);
                emailList.add(email.getKey());
                outputMap.put(email.getValue(),emailList);
            } else {
                outputMap.put(email.getValue(), List.of(email.getKey()));
            }

        }

        System.out.println(outputMap);

    }
}
