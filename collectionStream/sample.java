package collectionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sample {
	public static void main(String[]args) {
		ArrayList<String>s1=new ArrayList<>();
		s1.add("mani");		
		s1.add("mukesh");
		s1.add("murali");
		s1.add("vignesh");
//		s1.stream().map(x->x.toUpperCase()).forEach(z->System.out.println(z));
//		s1.stream().map(x->x.length()>2).forEach(z->System.out.println(z));
//		s1.stream().map(x->x.substring(0, 3)).forEach(z->System.out.println(z));
//		s1.stream().map(r->r.charAt(r.length()-1)).forEach(z->System.out.println(z));
//
//		List<String>h=s1.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//		List<Boolean>v=s1.stream().map(x->x.length()>2).collect(Collectors.toList());
//		List<String>k=s1.stream().map(x->x.substring(0,x.length())).collect(Collectors.toList());
//		for(String s:h) {
//			System.out.println(s);
//		}
//		v.forEach(x->System.out.println(x));
//		k.forEach(s->System.out.println(s));
		s1.stream().filter(x->x.length()>6).forEach(y->System.out.println(y));
		List<String>v=s1.stream().filter(x->x.contains("a")).collect(Collectors.toList());
		v.forEach(x->System.out.println(x));
		
	}
	}
      

	


