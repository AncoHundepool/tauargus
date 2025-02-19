/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tauargus.extern.tauhitas;

public class IProgressListener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IProgressListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IProgressListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tauhitasJNI.delete_IProgressListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    tauhitasJNI.IProgressListener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    tauhitasJNI.IProgressListener_change_ownership(this, swigCPtr, true);
  }

  public void UpdateLB(int Perc) {
    tauhitasJNI.IProgressListener_UpdateLB(swigCPtr, this, Perc);
  }

  public void UpdateUB(int Perc) {
    tauhitasJNI.IProgressListener_UpdateUB(swigCPtr, this, Perc);
  }

  public void UpdateGroups(int Perc) {
    tauhitasJNI.IProgressListener_UpdateGroups(swigCPtr, this, Perc);
  }

  public void UpdateTables(int Perc) {
    tauhitasJNI.IProgressListener_UpdateTables(swigCPtr, this, Perc);
  }

  public void UpdateDiscrepancy(double value) {
    tauhitasJNI.IProgressListener_UpdateDiscrepancy(swigCPtr, this, value);
  }

  public void UpdateTime(int value) {
    tauhitasJNI.IProgressListener_UpdateTime(swigCPtr, this, value);
  }

  public void UpdateNSuppressed(int value) {
    tauhitasJNI.IProgressListener_UpdateNSuppressed(swigCPtr, this, value);
  }

  public IProgressListener() {
    this(tauhitasJNI.new_IProgressListener(), true);
    tauhitasJNI.IProgressListener_director_connect(this, swigCPtr, true, true);
  }

}
