public class Driver{
		public static void main(String[] args) {
				LList l = new LList();
				l.add("hello");
				l.add("world");
				for (int i=0;i<5;i++){
						l.add(""+i);
				}
				System.out.println(l);
				l.add(1, "a");
				System.out.println(l);
				l.add(0, "b");
				System.out.println(l);
				System.out.println(l.get(5));
				l.remove(3);
				System.out.println(l);
		}
}
