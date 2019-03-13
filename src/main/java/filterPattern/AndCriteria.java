package filterPattern;

import java.util.List;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/13 下午2:48
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
