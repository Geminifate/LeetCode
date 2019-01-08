import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int importance=0;
        List<Integer> info =new ArrayList();
    	for (int i=0;i<employees.size();i++) {
			if (employees.get(i).id==id) {
				importance=employees.get(i).importance;
				info=employees.get(i).subordinates;
			}
		}
    	for (int i = 0; i < info.size(); i++) {
    		int temp =getImportance(employees,info.get(i));
    		importance+=temp;
		}
    	return importance;
    }
}