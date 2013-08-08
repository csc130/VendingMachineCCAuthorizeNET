public class Dispenser {
	final int MAX = 100;
	int quantity;
	int itemSold;
	FoodInfo foodItem;

	public Dispenser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dispenser(int quantity, int itemSold, FoodInfo foodItem) {
		super();
		this.quantity = quantity;
		this.foodItem = foodItem;
		this.itemSold = itemSold;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity--;
	}

	public int getItemSold() {
		return itemSold;
	}

	public void setItemSold(int itemSold) {
		this.itemSold++;
	}

	public FoodInfo getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodInfo foodItem) {
		this.foodItem = foodItem;
	}

	@Override
	public String toString() {
		return "Dispenser [quantity=" + quantity + ", itemSold=" + itemSold
				+ ", foodItem=" + foodItem + "]";
	}
}
