package com.ly.test.simple.thread;

import java.util.LinkedList;

/**
 * <pre>
 * 
 *  Accela Automation
 *  File: ThreadPool.java
 * 
 *  Accela, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: ThreadPool.java 72642 2009-01-01 20:01:57Z ACHIEVO\Levi.Lu $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  Mar 13, 2015		Levi.Lu		Initial.
 *  
 * </pre>
 */
public class ThreadPool implements Pool
{
	private boolean isShutdown;
	
	private int poolSize = 5;
	
	private LinkedList<Executor> pool;
	
	public ThreadPool()
	{
		pool = new LinkedList<Executor>();
		for (int i=0; i < poolSize; i++)
		{
			ExecutorImpl exec = new ExecutorImpl();
			pool.push(exec);
		}
	}

	@Override
	public void destroy()
	{
		synchronized (pool)
		{
			isShutdown = true;
			pool.clear();
		}
	}

	@Override
	public Executor getExecutor()
	{
		synchronized (pool)
		{
			return pool.pop();
		}
	}
	
	private class ExecutorImpl<T> extends Thread implements Executor
	{
		private Task<T> currentTask;
		@Override
		public void run()
		{
			while (!isShutdown)
			{
				synchronized (this)
				{
					try
					{
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				currentTask.process();
				
				synchronized (pool)
				{
					pool.push(ExecutorImpl.this);
				}
			}
		}

		@Override
		public void execute()
		{
			synchronized (this)
			{
				this.notifyAll();
			}
		}

		@Override
		public void setTask(Task task)
		{
			currentTask = task;
		}
	}

}

/*
*$Log: av-env.bat,v $
*/