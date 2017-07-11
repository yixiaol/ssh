package pdomain;

/**
 * user 对象
 * @author yixl
 *
 */
public class User {

	private String name; //姓名
	private String address;
	private int age;
	private int sex;
	
	/**
	 * 获得姓名
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置姓名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获得地址
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 设置地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 获得年龄
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 设置年龄
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 获得性别
	 * @return
	 */
	public int getSex() {
		return sex;
	}
	
	/**
	 * 设置性别
	 * @param sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	
}
