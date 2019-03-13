package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/13 下午2:06
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
