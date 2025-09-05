package Assignment6;


public class Toy implements Comparable<Toy>{
		private int prod_id;
		private String name;
		private double price;
		private String category;
		private int age;
		private int purchase_year;
		private int purchase_month;
		
		public Toy(int prod_id, String name, double price, String category, int age, int purchase_year,int purchase_month) {
			super();
			this.prod_id = prod_id;
			this.name = name;
			this.price = price;
			this.category = category;
			this.age = age;
			this.purchase_year = purchase_year;
			this.purchase_month = purchase_month;
		}

		

		public int getProd_id() {
			return prod_id;
		}

		public void setProd_id(int prod_id) {
			this.prod_id = prod_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getPurchase_year() {
			return purchase_year;
		}

		public void setPurchase_year(int purchase_year) {
			this.purchase_year = purchase_year;
		}
		
		public int getPurchase_month() {
			return purchase_month;
		}
		
		public void setPurchase_month(int purchase_month) {
			this.purchase_month = purchase_month;
		}

		@Override
		public String toString() {
			return "Toy [prod_id=" + prod_id + ", name=" + name + ", price=" + price + ", category=" + category
					+ ", age=" + age + ", purchase_year=" + purchase_year +", purchase_month=" + purchase_month+ "]";
		}



		public boolean isOlderThanOneYear(int currentYear, int currentMonth) {
		int yearsOld = currentYear - this.purchase_year;
		int monthsOld = currentMonth - this.purchase_month;
		
		if (yearsOld > 1) {
			return true;
			
		} if (yearsOld==1 && monthsOld >=0) {
			return true;
		}
			return false;
		}



		@Override
		public int compareTo(Toy o) {
			return Double.compare(this.price, o.price);
			
		}
		
		
		
		
}
		
		

