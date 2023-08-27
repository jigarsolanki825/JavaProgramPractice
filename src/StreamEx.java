import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx {

    //List of values, jigar is exists or not. if not then return jigar solanki using java 8. if available then return jigar.

    public static void main(String[] args) {

        List<String> stringList = List.of("jigar1","solanki","jay");

        String stringOptional = Optional.ofNullable(stringList).filter(nameList-> nameList.size()>0)
                .filter(nameList-> nameList.contains("jigar")).map(nameList->{

                    if (nameList.contains("jigar")){
                        return "jigar";
                    }
                    return null;
                }).orElseThrow(()->new RuntimeException("name is not matching"));
        System.out.println(stringOptional);
    }
}
