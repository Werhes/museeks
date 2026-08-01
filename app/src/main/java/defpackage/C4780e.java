package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4780e extends CameraCaptureSession.CaptureCallback implements InterfaceC15648e {
    public final String ad;
    public final C12204e adcel;
    public final C8823e advert;
    public final List appmetrica;
    public final ArrayMap billing;
    public final ArrayList license;
    public final ArrayList metrica;
    public final long mopub;
    public final C6594e purchase;
    public volatile Integer smaato;
    public final InterfaceC6755e startapp;
    public final boolean vip;
    public final ArrayMap yandex;

    public C4780e(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, C6594e c6594e, ArrayMap arrayMap, ArrayMap arrayMap2, InterfaceC6755e interfaceC6755e, C12204e c12204e) {
        this.ad = str;
        this.vip = z;
        this.metrica = arrayList;
        this.license = arrayList2;
        this.appmetrica = list;
        this.purchase = c6594e;
        this.billing = arrayMap;
        this.yandex = arrayMap2;
        this.startapp = interfaceC6755e;
        this.adcel = c12204e;
        C13710e c13710e = AbstractC3242e.vip;
        c13710e.getClass();
        this.mopub = C13710e.vip.incrementAndGet(c13710e);
        this.advert = new C8823e();
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        }
    }

    public final int ad() {
        int intValue;
        if (this.smaato != null) {
            Integer num = this.smaato;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
        }
        synchronized (this) {
            Integer num2 = this.smaato;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            intValue = num2.intValue();
        }
        return intValue;
    }

    public final void appmetrica(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        InterfaceC9610e startapp = startapp(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC1926e) list.get(i2)).inmobi(startapp, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = startapp.license().license.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((InterfaceC1926e) startapp.license().license.get(i3)).inmobi(startapp, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void billing(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.advert.m2175import(Unit.INSTANCE);
        this.purchase.m2215const(this);
        if (ad() != i) {
            String str = "onCaptureSequenceCompleted was invoked on " + ad() + ", but expected " + i + '!';
            this.adcel.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.license;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC9610e interfaceC9610e = (InterfaceC9610e) arrayList.get(i2);
            List list = this.appmetrica;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC1926e) list.get(i3)).loadAd(interfaceC9610e, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            InterfaceC9610e interfaceC9610e2 = (InterfaceC9610e) arrayList.get(i4);
            int size4 = interfaceC9610e2.license().license.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((InterfaceC1926e) interfaceC9610e2.license().license.get(i5)).loadAd(interfaceC9610e2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void license(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.advert.m2175import(Unit.INSTANCE);
        InterfaceC9610e startapp = startapp(captureRequest);
        vip(startapp, j, new C11911e(startapp, j));
        Trace.endSection();
    }

    public final void metrica(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.purchase.m2215const(this);
        Trace.endSection();
        InterfaceC9610e startapp = startapp(captureRequest);
        C7500e c7500e = new C7500e(totalCaptureResult, this.ad);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1926e) list.get(i)).ads(startapp, j, c7500e);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = startapp.license().license.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC1926e) startapp.license().license.get(i2)).ads(startapp, j, c7500e);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((InterfaceC1926e) list.get(i3)).mo730extends(startapp, j, c7500e);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = startapp.license().license.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((InterfaceC1926e) startapp.license().license.get(i4)).mo730extends(startapp, j, c7500e);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        C7662e c7662e;
        Object obj;
        Trace.beginSection("onCaptureBufferLost");
        C13269e c13269e = (C13269e) this.billing.get(surface);
        ArrayMap arrayMap = this.yandex;
        if (c13269e == null) {
            C18319e c18319e = (C18319e) arrayMap.get(surface);
            C13269e c13269e2 = null;
            if (c18319e != null) {
                int i = c18319e.ad;
                Iterator it = ((C2107e) this.startapp).f5446e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((C7662e) obj).ad == i) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c7662e = (C7662e) obj;
            } else {
                c7662e = null;
            }
            if (c7662e != null) {
                C12550e c12550e = c7662e.adcel;
                if (c12550e == null) {
                    c12550e = null;
                }
                if (c12550e != null) {
                    c13269e2 = new C13269e(c12550e.ad);
                }
            }
            c13269e = c13269e2;
        }
        C18319e c18319e2 = (C18319e) arrayMap.get(surface);
        if (c13269e == null) {
            throw new IllegalStateException(("Unable to find the streamId for " + surface + " on " + ((Object) C5125e.ad(j))).toString());
        }
        if (c18319e2 == null) {
            throw new IllegalStateException(("Unable to find the outputId for " + surface + " on " + ((Object) C5125e.ad(j))).toString());
        }
        InterfaceC9610e startapp = startapp(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC1926e) list.get(i2)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = startapp.license().license.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((InterfaceC1926e) startapp.license().license.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((InterfaceC1926e) list.get(i4)).license(startapp, j, c13269e.ad, c18319e2.ad);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = startapp.license().license.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((InterfaceC1926e) startapp.license().license.get(i5)).license(startapp, j, c13269e.ad, c18319e2.ad);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        metrica(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Trace.beginSection("onCaptureFailed");
        this.advert.m2175import(Unit.INSTANCE);
        vip(startapp(captureRequest), captureFailure.getFrameNumber(), new C10639e(captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        C10224e c10224e = new C10224e(captureResult, this.ad);
        InterfaceC9610e startapp = startapp(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1926e) list.get(i)).crashlytics(startapp, frameNumber, c10224e);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = startapp.license().license.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC1926e) startapp.license().license.get(i2)).crashlytics(startapp, frameNumber, c10224e);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        purchase(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        billing(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        yandex(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onReadoutStarted");
        InterfaceC9610e startapp = startapp(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1926e) list.get(i)).purchase(startapp, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = startapp.license().license.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC1926e) startapp.license().license.get(i2)).purchase(startapp, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void purchase(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.advert.m2175import(Unit.INSTANCE);
        this.purchase.m2215const(this);
        if (ad() != i) {
            String str = "onCaptureSequenceAborted was invoked on " + ad() + ", but expected " + i + '!';
            this.adcel.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.license;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC9610e interfaceC9610e = (InterfaceC9610e) arrayList.get(i2);
            List list = this.appmetrica;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC1926e) list.get(i3)).Signature(interfaceC9610e);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            InterfaceC9610e interfaceC9610e2 = (InterfaceC9610e) arrayList.get(i4);
            int size4 = interfaceC9610e2.license().license.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((InterfaceC1926e) interfaceC9610e2.license().license.get(i5)).Signature(interfaceC9610e2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final InterfaceC9610e startapp(CaptureRequest captureRequest) {
        ArrayList arrayList = this.metrica;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (InterfaceC9610e) this.license.get(i);
            }
        }
        throw new IllegalArgumentException("Failed to find CaptureRequest " + captureRequest + " in " + arrayList);
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.mopub;
    }

    public final void vip(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
        this.purchase.m2215const(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1926e) list.get(i)).mo731goto(interfaceC9610e, j, interfaceC7172e);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC9610e.license().license.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC1926e) interfaceC9610e.license().license.get(i2)).mo731goto(interfaceC9610e, j, interfaceC7172e);
        }
        Trace.endSection();
    }

    public final void yandex(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.advert.m2175import(Unit.INSTANCE);
        InterfaceC9610e startapp = startapp(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.appmetrica;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1926e) list.get(i)).isVip(startapp, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = startapp.license().license.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC1926e) startapp.license().license.get(i2)).isVip(startapp, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }
}
