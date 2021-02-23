package emp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main{
  public static void main(String args[])
  {
    list<Emp> array=new ArrayList<>();
    array.add(new Emp("Marry","QEA"));
    array.add(new Emp("Jose","ADM"));
    array.add(new Emp("vicky","CIS"));
    array.add(new Emmp("Aris","SAP"));
    
    Collections.sort(arr,new sortname());
    for(Emp e:arr)
    {
      System.out.println("Name:"+getEmpName());
      System.out.println("DepartmentId:"+getDeptId());}
  }
}
    
