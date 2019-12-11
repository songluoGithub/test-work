package com.test.generic;

/**
 * 泛型类
 * @author luosong
 *
 * @param <T>
 */
public class Generic<T> {
	private T key;
	
	public Generic(){
		
	}
	
	public Generic(T key){
		this.key=key;
	}
	
	public T getKey(){
		return this.key;
	}
	
//	public static void main(String[] args) {
//		//泛型只在编译阶段有效
//		//泛型的类型参数只能是类类型，不能是简单类型。
//		//不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。 不能对泛型进行判断对象的操作
//		//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
//		Generic<Integer> genericInteger = new Generic<Integer>(12345);
//		Generic<String> genericString = new Generic<String>("key_value");
//		/**
//		 * 定义的泛型类，就一定要传入泛型类型实参么？并不是这样，在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，
//		 * 此时泛型才会起到本应起到的限制作用。如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
//		 */
//		Generic generic = new Generic("111111");
//		Generic generic1 = new Generic(4444);
//		Generic generic2 = new Generic(55.55);
//		Generic generic3 = new Generic(false);
//		
//		System.out.println(genericInteger.getKey());
//		System.out.println(genericString.getKey());
//	}
	
	//?泛型通配符
	public static void showKeyValue1(Generic<?> obj){
	    System.out.println("泛型测试,key value is " + obj.getKey());
	}
	
	public static void main(String[] args) {
		Generic<Integer> gInteger = new Generic<Integer>(123);
		Generic<Number> gNumber = new Generic<Number>(456);

		showKeyValue1(gNumber);
	}
}
