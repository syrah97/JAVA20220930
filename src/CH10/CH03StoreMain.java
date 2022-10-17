package CH10;

class Buyer{
	//속성
	int myMoney;
	int appleCnt;
	//기능
	//구매하기
	void Pay(Seller seller,int money){
		myMoney=money;
		int cnt=seller.returnApple(money);
		appleCnt+=cnt;
	}
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
	
}

class Seller{
	//속성
	int myMoney;
	int appleCnt;
	int Price;
	//기능
	int returnApple(int money) {
		myMoney+=money;
		int cnt=money/Price;
		appleCnt-=cnt;
		return cnt;
	}
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		Price = price;
	}
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", Price=" + Price + "]";
	}
	
}

public class CH03StoreMain {

	public static void main(String[] args) {
		Seller seller = new Seller(10000,100,1000);
		Buyer buyer = new Buyer(5000,0);
		buyer.Pay(seller,2000);
		System.out.println(seller);
		System.out.println(buyer);

	}

}
