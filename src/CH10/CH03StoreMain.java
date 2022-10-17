package CH10;

class Buyer{
	//속성
	int myMoney;
	int appleCnt;
	//기능
	//구매하기
	void Pay(Seller seller,int money){
		//보유금액에 금액 차감
		myMoney-=money;
		//seller에 money 전달 사과 개수 리턴받음
		int cnt=seller.returnApple(money);
		//내 사과개수에 누적
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
		//보유금액에 금액 누적
		myMoney+=money;
		//사과개수 계산 후 보유개수에서 차감
		int cnt=money/Price;
		appleCnt-=cnt;
		//사과개수 리턴
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
