/**
 * Copyright (c) Daniel Rugg. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 (http://opensource.org/licenses/eclipse-1.0.php),
 * which accompanies this distribution.
 * 
 * By using this software in any fashion, you are agreeing to be bound by the terms
 * of this license.
 * 
 * You must not remove this notice, or any other, from this software.
 */
package pliant.process.lang;

import clojure.lang.IFn;
import clojure.lang.Util;

/**
 * Factory for generating {@link IInvoker}s for any number of arguments.
 * 
 * @author Daniel Rugg
 */
public class InvokerFactory {
	public static IInvoker invoker() {
		return new Invoker0();
	}

	public static IInvoker invoker(Object arg1) {
		return new Invoker1(arg1);
	}

	public static IInvoker invoker(Object arg1, Object arg2) {
		return new Invoker2(arg1, arg2);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3) {
		return new Invoker3(arg1, arg2, arg3);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4) {
		return new Invoker4(arg1, arg2, arg3, arg4);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
		return new Invoker5(arg1, arg2, arg3, arg4, arg5);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
		return new Invoker6(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7) {
		return new Invoker7(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8) {
		return new Invoker8(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9) {
		return new Invoker9(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10) {
		return new Invoker10(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11) {
		return new Invoker11(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12) {
		return new Invoker12(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
		return new Invoker13(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14) {
		return new Invoker14(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15) {
		return new Invoker15(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16) {
		return new Invoker16(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17) {
		return new Invoker17(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18) {
		return new Invoker18(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19) {
		return new Invoker19(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20) {
		return new Invoker20(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20);
	}

	public static IInvoker invoker(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20, Object... more) {
		return new Invoker20More(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, more);
	}

}


class Invoker0 implements IInvoker{
	Invoker0() {
		super();
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke();
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke();
	}
}

class Invoker1 implements IInvoker{
	private Object arg1;
	
	Invoker1(Object arg1) {
		super();
		this.arg1=arg1;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null));
	}
}

class Invoker2 implements IInvoker{
	private Object arg1, arg2;
	
	Invoker2(Object arg1, Object arg2) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null));
	}
}

class Invoker3 implements IInvoker{
	private Object arg1, arg2, arg3;
	
	Invoker3(Object arg1, Object arg2, Object arg3) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null));
	}
}

class Invoker4 implements IInvoker{
	private Object arg1, arg2, arg3, arg4;
	
	Invoker4(Object arg1, Object arg2, Object arg3, Object arg4) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null));
	}
}

class Invoker5 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5;
	
	Invoker5(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null));
	}
}

class Invoker6 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6;
	
	Invoker6(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null));
	}
}

class Invoker7 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7;
	
	Invoker7(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null));
	}
}

class Invoker8 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8;
	
	Invoker8(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null));
	}
}

class Invoker9 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9;
	
	Invoker9(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null));
	}
}

class Invoker10 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10;
	
	Invoker10(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null));
	}
}

class Invoker11 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11;
	
	Invoker11(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null));
	}
}

class Invoker12 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;
	
	Invoker12(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null));
	}
}

class Invoker13 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13;
	
	Invoker13(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null));
	}
}

class Invoker14 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14;
	
	Invoker14(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null));
	}
}

class Invoker15 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15;
	
	Invoker15(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null));
	}
}

class Invoker16 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16;
	
	Invoker16(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
		this.arg16=arg16;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null), Util.ret1(arg16,arg16=null));
	}
}

class Invoker17 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17;
	
	Invoker17(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
		this.arg16=arg16;
		this.arg17=arg17;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null), Util.ret1(arg16,arg16=null), Util.ret1(arg17,arg17=null));
	}
}

class Invoker18 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18;
	
	Invoker18(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
		this.arg16=arg16;
		this.arg17=arg17;
		this.arg18=arg18;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null), Util.ret1(arg16,arg16=null), Util.ret1(arg17,arg17=null), Util.ret1(arg18,arg18=null));
	}
}

class Invoker19 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19;
	
	Invoker19(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
		this.arg16=arg16;
		this.arg17=arg17;
		this.arg18=arg18;
		this.arg19=arg19;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null), Util.ret1(arg16,arg16=null), Util.ret1(arg17,arg17=null), Util.ret1(arg18,arg18=null), Util.ret1(arg19,arg19=null));
	}
}

class Invoker20 implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20;
	
	Invoker20(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
		this.arg16=arg16;
		this.arg17=arg17;
		this.arg18=arg18;
		this.arg19=arg19;
		this.arg20=arg20;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null), Util.ret1(arg16,arg16=null), Util.ret1(arg17,arg17=null), Util.ret1(arg18,arg18=null), Util.ret1(arg19,arg19=null), Util.ret1(arg20,arg20=null));
	}
}


class Invoker20More implements IInvoker{
	private Object arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20;
	private Object[] more;
	
	Invoker20More(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20, Object... more) {
		super();
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
		this.arg4=arg4;
		this.arg5=arg5;
		this.arg6=arg6;
		this.arg7=arg7;
		this.arg8=arg8;
		this.arg9=arg9;
		this.arg10=arg10;
		this.arg11=arg11;
		this.arg12=arg12;
		this.arg13=arg13;
		this.arg14=arg14;
		this.arg15=arg15;
		this.arg16=arg16;
		this.arg17=arg17;
		this.arg18=arg18;
		this.arg19=arg19;
		this.arg20=arg20;
		this.more = more;
	}
	
	@Override
	public Object invoke(IFn fn) {
		return fn.invoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, more);
	}
	@Override
	public Object invokeFinal(IFn fn) {
		return fn.invoke(Util.ret1(arg1,arg1=null), Util.ret1(arg2,arg2=null), Util.ret1(arg3,arg3=null), Util.ret1(arg4,arg4=null), Util.ret1(arg5,arg5=null), Util.ret1(arg6,arg6=null), Util.ret1(arg7,arg7=null), Util.ret1(arg8,arg8=null), Util.ret1(arg9,arg9=null), Util.ret1(arg10,arg10=null), Util.ret1(arg11,arg11=null), Util.ret1(arg12,arg12=null), Util.ret1(arg13,arg13=null), Util.ret1(arg14,arg14=null), Util.ret1(arg15,arg15=null), Util.ret1(arg16,arg16=null), Util.ret1(arg17,arg17=null), Util.ret1(arg18,arg18=null), Util.ret1(arg19,arg19=null), Util.ret1(arg20,arg20=null), Util.ret1(more,more=null));
	}
}
