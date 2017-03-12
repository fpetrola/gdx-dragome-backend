/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.btTypedObject;

/** @author xpenatan */
public class btPersistentManifold extends btTypedObject {

    private btManifoldPoint maniFoldPoint = new btManifoldPoint(0, false);

    public btPersistentManifold(long cPtr, boolean cMemoryOwn) {
        resetObj(cPtr, cMemoryOwn);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btPersistentManifold);",this);
	}

    public btManifoldPoint getContactPoint(int index) {
		com.dragome.commons.javascript.ScriptHelper.put("index",index,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		long addr = com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(jsObj.getContactPoint(index));",this);
		maniFoldPoint.resetObj(addr, false);
		return maniFoldPoint;
    }

    public int getNumContacts() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getNumContacts();",this);
    }

    public btCollisionObject getBody0(btCollisionWorld world) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		long addr = com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(jsObj.getBody0());",this);
		return world.bodies.get(addr);
    }

    public btCollisionObject getBody1(btCollisionWorld world) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		long addr = com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(jsObj.getBody1());",this);
		return world.bodies.get(addr);
    }
}