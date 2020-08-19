import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    static List<Employee> mapToListFromJson(JSONObject jsonObject) {
        List<Employee> employeeList = new ArrayList<>();

        JSONArray employees = jsonObject.getJSONArray("data");

        for (Object employee : employees) {
            JSONObject employeeObject = (JSONObject) employee;

            Employee myEmployee = new Employee();

            String fullName = employeeObject.getString("employee_name");

            myEmployee.setName(fullName.split(" ")[0]);
            myEmployee.setSurName(fullName.split(" ")[1]);
            myEmployee.setImageUrl(employeeObject.getString("profile_image"));
            myEmployee.setId(employeeObject.getInt("employee_age"));
            myEmployee.setSalary(employeeObject.getDouble("employee_salary"));
            myEmployee.setId(employeeObject.getInt("employee_age"));

            employeeList.add(myEmployee);
        }
        return employeeList;
    }
}
