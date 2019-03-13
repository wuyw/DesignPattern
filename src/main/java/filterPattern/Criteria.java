package filterPattern;

import java.util.List;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/13 下午1:36
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
