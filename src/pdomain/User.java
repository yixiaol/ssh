package pdomain;

/**
 * user ����
 * @author yixl
 *
 */
public class User {

	private String name; //����
	private String address;
	private int age;
	private int sex;
	
	/**
	 * �������
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ��������
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ��õ�ַ
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * ���õ�ַ
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * �������
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * ��������
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * ����Ա�
	 * @return
	 */
	public int getSex() {
		return sex;
	}
	
	/**
	 * �����Ա�
	 * @param sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	
}
