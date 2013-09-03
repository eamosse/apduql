package com.first.nfc.apduql;

import java.util.HashMap;
import java.util.Map;

public class Applet {
	private String nom; 
	private byte[] AID; 
	private Map<Command, Byte> classes; 
	private Map<String, Byte> instructions; 

	public Applet() {
		classes = new HashMap<Command, Byte>(); 
		instructions = new HashMap<String, Byte>(); 
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the aID
	 */
	public byte[] getAID() {
		return AID;
	}

	/**
	 * @param aID the aID to set
	 */
	public void setAID(byte[] aID) {
		AID = aID;
	}

	/**
	 * @return the classes
	 */
	public Map<Command, Byte> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(Map<Command, Byte> classes) {
		this.classes = classes;
	}

	/**
	 * @return the instructions
	 */
	public Map<String, Byte> getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(Map<String, Byte> instructions) {
		this.instructions = instructions;
	}
	public void addInstruction(String name, byte value){
		this.instructions.put(name, value);
	}
	
	public void addClass(Command clazz, byte value){
		this.classes.put(clazz, value);
	}

}
