package com.globallink.api.model;

public class ItemStatusEnum {
    /**
     * value = 11
     */
    public static final ItemStatusEnum ARCHIVED = new ItemStatusEnum(11);
    /**
     * value = 0
     */
    public static final ItemStatusEnum CANCELLED = new ItemStatusEnum(0);
    /**
     * value = 2
     */
    public static final ItemStatusEnum DELIVERED = new ItemStatusEnum(2);
    /**
     * value = 1
     */
    public static final ItemStatusEnum DOWNLOADED = new ItemStatusEnum(1);
    /**
     * value = 9
     */
    public static final ItemStatusEnum FAILED = new ItemStatusEnum(9);
    /**
     * value = 3
     */
    public static final ItemStatusEnum IN_PROCESS = new ItemStatusEnum(3);
    /**
     * value = 4
     */
    public static final ItemStatusEnum PROCESSED = new ItemStatusEnum(4);
    /**
     * value = 8
     */
    public static final ItemStatusEnum PROCESSING = new ItemStatusEnum(8);
    /**
     * value = 10
     */
    public static final ItemStatusEnum QUOTING = new ItemStatusEnum(10);
    /**
     * value = 5
     */
    public static final ItemStatusEnum READY = new ItemStatusEnum(5);
    /**
     * value = 6
     */
    public static final ItemStatusEnum RESERVED = new ItemStatusEnum(6);
    /**
     * value = 7
     */
    public static final ItemStatusEnum WAITING = new ItemStatusEnum(7);
    /**
     * value = 12
     */
    public static final ItemStatusEnum COMPLETED = new ItemStatusEnum(12);
    /**
     * value = 13
     */
    public static final ItemStatusEnum CREATING = new ItemStatusEnum(13);

    private static final String ARCHIVED_NAME = "ARCHIVED";

    private static final String CANCELLED_NAME = "CANCELLED";

    private static final String DELIVERED_NAME = "DELIVERED";

    private static final String DOWNLOADED_NAME = "DOWNLOADED";

    private static final String FAILED_NAME = "FAILED";

    private static final String IN_PROCESS_NAME = "IN PROCESS";

    private static final String PROCESSED_NAME = "PROCESSED";

    private static final String PROCESSING_NAME = "PROCESSING";

    private static final String QUOTING_NAME = "QUOTING";

    private static final String READY_NAME = "READY";

    private static final String RESERVED_NAME = "RESERVED";

    private static final String WAITING_NAME = "WAITING";

    private static final String COMPLETED_NAME = "COMPLETED";

    private static final String CREATING_NAME = "CREATING";

    private static String[] names = { CANCELLED_NAME, DOWNLOADED_NAME, DELIVERED_NAME, IN_PROCESS_NAME, PROCESSED_NAME,
	    READY_NAME, RESERVED_NAME, WAITING_NAME, PROCESSING_NAME, FAILED_NAME, QUOTING_NAME, ARCHIVED_NAME,
	    COMPLETED_NAME, CREATING_NAME };

    public ItemStatusEnum() {
    }

    public ItemStatusEnum(int value) {
	this.value = value;
    }

    protected String name;
    protected int value;

    public String getName() {
	return name;
    }

    public void setName(String value) {
	this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
	return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
	this.value = value;
    }
}
