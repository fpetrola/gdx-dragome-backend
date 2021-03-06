/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;

/** @author xpenatan */
public class btVector3 extends BulletBase {

    public static final Vector3 vector3_1 = new Vector3();

    public static final Vector3 vector3_2 = new Vector3();

    public static final Vector3 vector3_3 = new Vector3();

    public static final float[] localArr_1 = new float[3];

    public static final float[] localArr_2 = new float[3];

	final public static btVector3 btVector3_1 = new btVector3(); // Pointer
	final public static btVector3 btVector3_2 = new btVector3(); // Pointer

    public btVector3() {
        create();
    }

    public btVector3(float x, float y, float z) {
        resetObj(createNative(x, y, z), true);
    }

    public btVector3(long cPtr, boolean cMemoryOwn) {
        resetObj(cPtr, cMemoryOwn);
    }

    protected void create() {
        resetObj(createNative(0, 0, 0), true);
    }

    private static long createNative(float x, float y, float z) {
		com.dragome.commons.javascript.ScriptHelper.put("z",z,null);
		com.dragome.commons.javascript.ScriptHelper.put("y",y,null);
		com.dragome.commons.javascript.ScriptHelper.put("x",x,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=new Bullet.btVector3(x,y,z);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(vec);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btVector3);",this);
	}

    public void setValue(float x, float y, float z) {
		com.dragome.commons.javascript.ScriptHelper.put("z",z,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",y,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",x,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setValue(x,y,z);",this);
    }

    public float getX() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.x();",this);
    }

    public float getY() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.y();",this);
    }

    public float getZ() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.z();",this);
    }

    public void setX(float x) {
		com.dragome.commons.javascript.ScriptHelper.put("x",x,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setX(x);",this);
    }

    public void setY(float y) {
		com.dragome.commons.javascript.ScriptHelper.put("y",y,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setY(y);",this);
    }

    public void setZ(float z) {
		com.dragome.commons.javascript.ScriptHelper.put("z",z,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setZ(z);",this);
    }

    public static void set(btVector3 vec, float[] value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,null);
		vec.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",vec.jsObj,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setValue(value[0],value[1],value[2]);",null);
    }

    public static void get(btVector3 vector, float[] value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,null);
		vector.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("vec",vector.jsObj,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("value[0]=vec.x();value[1]=vec.y();value[2]=vec.z();",null);
    }

    public static void set(Vector3 in, btVector3 out) {
		out.checkPointer();
		btVector3.localArr_1[0] = in.x;
		btVector3.localArr_1[1] = in.y;
		btVector3.localArr_1[2] = in.z;
		btVector3.set(out, btVector3.localArr_1);
    }

    public static void get(btVector3 in, Vector3 out) {
		in.checkPointer();
		btVector3.get(in, btVector3.localArr_1);
		out.set(btVector3.localArr_1);
    }
}
