package hw02;

public class SoftwareSystem {

	private StoreStrategy storeStrategy;
	
	public SoftwareSystem(StoreStrategy storeStrategy) {
		this.storeStrategy = storeStrategy;
	}
	
	public void store(String data) {
		this.storeStrategy.storeData(data);
	}
	
	public void setStoreStrategy(StoreStrategy storeStrategy) {
		this.storeStrategy = storeStrategy;
	}
	
}
