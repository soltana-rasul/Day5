public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = Integer.parseInt(args[0]);
		int j =3;
		
		try {
			j = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(i + j);

		
		// more practice

		try {
			for (j = 1; j<=0; j++) {
				System.out.println(i/j);
			}
		}catch (Exception e2) {
			System.out.println(e2.getMessage());
			e2.printStackTrace();
			
		}
	}

}
