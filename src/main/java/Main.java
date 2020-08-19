import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");

            JSONTokener tokener = new JSONTokener(url.openStream());
            JSONObject object = new JSONObject(tokener);

            JSONArray data = object.getJSONArray("data");

            List<Employee> employees = new ArrayList<>();

            for (int i = 0; i < data.length(); i++) {
                Employee employee = new Employee();

                String fullName = data.getJSONObject(i).getString("employee_name");

                employee.setId(data.getJSONObject(i).getInt("id"));
                employee.setName(fullName.split(" ")[0]);
                employee.setSurName(fullName.split(" ")[1]);
                employee.setSalary(data.getJSONObject(i).getDouble("employee_salary"));
                employee.setAge(data.getJSONObject(i).getInt("employee_age"));
                employee.setImageUrl(data.getJSONObject(i).getString("profile_image"));

                employees.add(employee);
            }
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            System.out.println();

            List<Employee> employees2 = Mapper.mapToListFromJson(object);
            for (Employee employee : employees2) {
                System.out.println(employee);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
