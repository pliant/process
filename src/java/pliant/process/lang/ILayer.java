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
import clojure.lang.Namespace;

/**
 * Represents a layer in a process.
 * 
 * @author Daniel Rugg
 */
public interface ILayer {
	
	Namespace getNamespace();
	
	String getName();
	
	IFn getFn();
}
