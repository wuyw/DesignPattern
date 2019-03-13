package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/13 下午1:50
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> list = new ArrayList<>();

        for (Person person :persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                list.add(person);
            }
        }
        return list;
    }
}
