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

import java.util.ArrayList;
import java.util.LinkedList;

import clojure.lang.AFn;
import clojure.lang.IFn;
import clojure.lang.Namespace;

/**
 * Defines a process function that will execute a specific layer of logic depending upon the parameters 
 * that are provided in the execution of the function.  This is essentially the inverse of a multi method, 
 * where the multi method defines a single dispatching function to operate on each method registered with 
 * it, a process lets the layers provide their own dispatch function
 * 
 * @author Daniel Rugg
 */
public class ProcessFn extends AFn{
	
	final String name;
	final public IFn processFn;
	
	ArrayList<ILayer> layers = new ArrayList<ILayer>();

	public ProcessFn(String name, IFn processFn) {
		this.name = name;
		this.processFn = processFn;
	}

	/**
	 * Adds a layer to the process.
	 * @param namespace The namespace the function lives in..
	 * @param name The name of the function.
	 * @param layerFn The layer function.
	 * @return The layer function that was passed in.
	 */
	synchronized public IFn addLayer(Namespace namespace, String name, IFn layerFn) {
		ProcessLayer layer = new ProcessLayer(namespace, name, layerFn);
		layers.add(layer);
		return layerFn;
	}
    
	/**
	 * Reorders the layers so that the layer with the function provided in the first argument executes before 
	 * the function provided in the second argument.
	 * @param first
	 * @param second
	 */
	public void before(IFn first, IFn second){
		ArrayList<ILayer> temp = new ArrayList<ILayer>();
		ILayer pull = null;
		for(ILayer layer : layers){
			if(layer.getFn() == first){
				if(pull == null){
					return;
				}
				else{
					temp.add(layer);
					temp.add(pull);
				}
			}
			else if(layer.getFn() == second){
				pull = layer;
			}
			else{
				temp.add(layer);
			}
		}
		layers = temp;
	}
	
	/**
	 * Process any callbacks that have been requested.
	 * @param callbacks
	 * @param value
	 * @return
	 */
	Object callback(LinkedList<ICallback> callbacks, Object value){
		while (callbacks != null && callbacks.size() > 0){
			value = callbacks.removeLast().invoke(value);
		}
		return value;
	}
	
    /**
     * Performs the dispatching process to the layers.
     * @param invoker The {@link IInvoker} used to invoke the layer functions with.
     * @return The value returned by the tiger-blood drinking layer.
     */
	Object invoke(IInvoker invoker){
		LinkedList<ICallback> callbacks = null;
		Object value = null;
		
		if(layers.size() > 0){
			Skipper skipper = new Skipper();
			callbacks = new LinkedList<ICallback>();
			for(ILayer layer : layers){
				if(!skipper.skip(layer)){
					value = invoker.invoke(layer.getFn());
					if(value == null || !(value instanceof IContinue)){
						return callback(callbacks, value);
					}
					
					if(value instanceof ICallback){
						callbacks.add((ICallback)value);
					}
					
					if(value instanceof ISkip){
						skipper.add((ISkip)value);
					}
				}
			}
		}
		
		if(processFn != null){
			value = invoker.invoke(processFn);
		}
		return callback(callbacks, value);
	}
	
	public Object invoke() {
		return invoke(InvokerFactory.invoker());
	}
		
	public Object invoke(Object arg1) {
		return invoke(InvokerFactory.invoker(arg1));
	}
		
	public Object invoke(Object arg1, Object arg2) {
		return invoke(InvokerFactory.invoker(arg1, arg2));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19));
	}
		
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20));
	}
	
	public Object invoke(Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15, Object arg16, Object arg17, Object arg18, Object arg19, Object arg20, Object... more) {
		return invoke(InvokerFactory.invoker(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, more));
	}
}

class Skipper {
	ArrayList<ISkip> skips = new ArrayList<ISkip>();
	void add(ISkip skip){
		skips.add(skip);
	}
	boolean skip(ILayer layer){
		for(ISkip skip : skips){
			if(skip.skip(layer)){
				return true;
			}
		}
		return false;
	}
}

class ProcessLayer implements ILayer{
	final Namespace namespace;
	final String name;
	final IFn fn;
	
	public ProcessLayer(Namespace namespace, String name, IFn fn) {
		this.namespace = namespace;
		this.name = name;
		this.fn = fn;
	}

	@Override
	public Namespace getNamespace() {
		return namespace;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IFn getFn() {
		return fn;
	}
}
