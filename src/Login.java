import com.opensymphony.xwork2.ModelDriven;

public class Login implements ModelDriven<Product>{
	private Product p;

	public Product getProduct() {
		return p;
	}
	public void setProduct(Product name) {
		this.p = name;
	}
	public String execute() throws Exception{
		if(p.getName().equals("keo")) {
			return "success";
		}
		else return "error";
	}
	
	public Product getModel() {
		p=new Product();
		return p;
	}
}
