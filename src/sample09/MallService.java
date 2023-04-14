package sample09;

import java.util.List;

public class MallService {

	// 사용자 정보를 제공하는 저장소 객체
	private UserRepository userRepo = new UserRepository();
	// 상품 정보를 제공하는 저장소 객체
	private ProductRepository productRepo = new ProductRepository();
	// 주문 정보를 제공하는 저장소 객체
	private OrderRepository orderRepo = new OrderRepository();
	
	/*
	 * 모든 상품정보 목록을 반환한다.
	 * 	반환타입: List<Product>
	 * 	메소드이름: getAllProducts
	 * 	매개변수: 없음
	 */
	public List<Product> getAllProducts(){
		List<Product> productList = productRepo.getProducts();
		return productList;
	}
	
	
}
