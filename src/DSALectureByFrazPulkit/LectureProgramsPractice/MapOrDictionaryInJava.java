package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrDictionaryInJava {
	public static void main(String[] arg)
	{
		//Dictionary or Map 
		Map<String, Integer> studentRoll = new HashMap<>();
		studentRoll.put("Alok", 137901);
		studentRoll.put("Anjali", 137913);
		studentRoll.put("Tony", 137910);
		
		for (int i = 0; i < studentRoll.size();i++)
		{
			System.out.print(studentRoll.get("Alok")+" ");
		}
		
		for (Map.Entry<String, Integer> entry : studentRoll.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		var a ="";
		
		for (String key : studentRoll.keySet()) {
            System.out.println(key + " : " + studentRoll.get(key));
        }
	}
}
