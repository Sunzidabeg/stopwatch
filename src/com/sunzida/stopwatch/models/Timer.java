package com.sunzida.stopwatch.models;

import java.util.Date;

public class Timer {
	private Date start;
	public Date getStart() {
		return start;
	}
	public Date getStop() {
		return stop;
	}
	public long getDifference() {
		return difference;
	}
	private Date stop;
	private long difference;
	public Timer() {
		
	}