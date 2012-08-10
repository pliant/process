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

/**
 * An API for wrapping the ability to invoke a function or multiple functions with a single set 
 * of arguments.
 * 
 * @author Daniel Rugg
 */
public interface IInvoker {

	/**
	 * Invokes the provided method with the previously configured arguments.
	 * @param fn The function to invoke.
	 * @return
	 */
	Object invoke(IFn fn);

	/**
	 * Invokes the provided method with the previously configured arguments, passing the arguments using the 
	 * Utils.ret1(arg, arg=null) method to pass the arguments to the function.
	 * @param fn The function to invoke.
	 * @return
	 */
	Object invokeFinal(IFn fn);
}
