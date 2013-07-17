package org.cytoscape.work;

/**
 * An observer that gets notified when an <code>ObservableTask</code> finishes
 * executing.  If the task does not start or finish processing, this observer
 * is not notified.  If the task does finish, <code>taskFinished()</code> is
 * called with whatever result the task produces, if any. 
 *
 * @param <R> The type of the result this observer is expected to receive.
 * 
 * @CyAPI.Spi.Interface
 * @CyAPI.InModule work-api
 */
public interface TaskObserver {
	/**
	 * Called by an <code>ObservableTask</code> when it is finished executing.
	 *
	 * @param task The task being observed
	 */
	public void taskFinished(ObservableTask task);

	/**
 	 * Called by a <code>TaskManager</code> to tell us that all of the tasks are complete
 	 */
	public void allFinished();
}