package dddy.gin.bean.factory.hierarchical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HierarchicalBeanFactoryTest {
	public static void main(String[] args) {

		ApplicationContext parent = new ClassPathXmlApplicationContext(
				"classpath:bean/factory/hierarchical/parent.xml"
		);
		ApplicationContext child = new ClassPathXmlApplicationContext(
				new String[]{"classpath:bean/factory/hierarchical/beans.xml"},parent
		);


		SimpleTarget target1 = (SimpleTarget) child.getBean("target1");
		SimpleTarget target2 = (SimpleTarget) child.getBean("target2");
		SimpleTarget target3 = (SimpleTarget) child.getBean("target3");

		System.out.println(target1.getVal());
		System.out.println(target2.getVal());
		System.out.println(target3.getVal());
	}
}
