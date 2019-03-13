package filterPattern;

import lombok.Data;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/13 上午11:17
 */
@Data
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
