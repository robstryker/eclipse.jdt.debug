package org.eclipse.jdt.internal.debug.core;

import com.sun.jdi.event.Event;

/**
 * A jdi event listener is notified of events associated with
 * a specific jdi event request. A listener registers/deregisters
 * event requests with a debug target.
 * 
 * @see JDIDebugTarget#addJDIEventListener(IJDIEventListener, EventRequest)
 * @see JDIDebugTarget#removeJDIEventListener(IJDIEventListener, EventRequest)
 */

public interface IJDIEventListener {
	/**
	 * Handles the given event that this listener has registered for and
	 * returns whether the thread in which the event occurred should
	 * be resumed. All event handlers for the events in an event set
	 * are given a chance to vote on whether the thread should be
	 * resumed. If all agree, the thread is resumed by the event dispatcher.
	 * If any event handler returns <code>false</code> the thread in which
	 * the event originated is left in a suspended state.
	 * 
	 * @param event the event to handle
	 * @param target the debug target in which the event occurred
	 */
	public boolean handleEvent(Event event, JDIDebugTarget target);
}

