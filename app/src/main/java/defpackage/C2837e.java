package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import j$.util.Collection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2837e extends CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ int ad;
    public final Serializable license;
    public final /* synthetic */ C2604e metrica;
    public final C4780e vip;

    public C2837e(C2604e c2604e, C4780e c4780e) {
        this.ad = 0;
        this.metrica = c2604e;
        this.vip = c4780e;
        this.license = new ConcurrentLinkedQueue();
    }

    public C2837e(C2604e c2604e, C4780e c4780e, LinkedHashMap linkedHashMap) {
        this.ad = 1;
        this.metrica = c2604e;
        this.vip = c4780e;
        this.license = linkedHashMap;
    }

    private final void ad(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    private final void vip(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        switch (this.ad) {
            case 0:
                if (((ConcurrentLinkedQueue) this.license).isEmpty()) {
                    C13710e c13710e = this.metrica.f6460e;
                    c13710e.getClass();
                    long incrementAndGet = C13710e.vip.incrementAndGet(c13710e);
                    this.metrica.f6459e.put(cameraExtensionSession, Long.valueOf(incrementAndGet));
                    ((ConcurrentLinkedQueue) this.license).add(Long.valueOf(incrementAndGet));
                }
                this.vip.license(captureRequest, ((Number) ((ConcurrentLinkedQueue) this.license).remove()).longValue());
                return;
            default:
                if (((List) ((LinkedHashMap) this.license).get(captureRequest)).size() == 1) {
                    this.vip.license(captureRequest, ((Number) ((List) ((LinkedHashMap) this.license).get(captureRequest)).get(0)).longValue());
                    return;
                } else {
                    Log.i("CXCP", "onCaptureFailed is not triggered for repeating requests. Request frame numbers: " + Collection.EL.stream((List) ((LinkedHashMap) this.license).get(captureRequest)));
                    return;
                }
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        switch (this.ad) {
            case 0:
                this.vip.appmetrica(captureRequest, i);
                return;
            default:
                this.vip.appmetrica(captureRequest, i);
                return;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.ad;
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.ad) {
            case 0:
                if (((ConcurrentLinkedQueue) this.license).isEmpty()) {
                    C13710e c13710e = this.metrica.f6460e;
                    c13710e.getClass();
                    long incrementAndGet = C13710e.vip.incrementAndGet(c13710e);
                    this.metrica.f6459e.put(cameraExtensionSession, Long.valueOf(incrementAndGet));
                    ((ConcurrentLinkedQueue) this.license).add(Long.valueOf(incrementAndGet));
                }
                this.vip.metrica(captureRequest, totalCaptureResult, ((Number) ((ConcurrentLinkedQueue) this.license).remove()).longValue());
                return;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                return;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        switch (this.ad) {
            case 0:
                this.vip.purchase(i);
                return;
            default:
                this.vip.purchase(i);
                return;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        switch (this.ad) {
            case 0:
                this.vip.billing(i, ((Long) this.metrica.f6459e.get(cameraExtensionSession)).longValue());
                return;
            default:
                this.vip.billing(i, ((Long) this.metrica.f6459e.get(cameraExtensionSession)).longValue());
                return;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        switch (this.ad) {
            case 0:
                C13710e c13710e = this.metrica.f6460e;
                c13710e.getClass();
                long incrementAndGet = C13710e.vip.incrementAndGet(c13710e);
                this.metrica.f6459e.put(cameraExtensionSession, Long.valueOf(incrementAndGet));
                ((ConcurrentLinkedQueue) this.license).add(Long.valueOf(incrementAndGet));
                this.vip.yandex(captureRequest, incrementAndGet, j);
                return;
            default:
                C13710e c13710e2 = this.metrica.f6460e;
                c13710e2.getClass();
                long incrementAndGet2 = C13710e.vip.incrementAndGet(c13710e2);
                this.metrica.f6459e.put(cameraExtensionSession, Long.valueOf(incrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.license;
                Object obj = linkedHashMap.get(captureRequest);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(captureRequest, obj);
                }
                ((List) obj).add(Long.valueOf(incrementAndGet2));
                this.vip.yandex(captureRequest, incrementAndGet2, j);
                return;
        }
    }
}
