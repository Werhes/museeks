package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8928e implements InterfaceC1926e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinkedHashMap f17892e = new LinkedHashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5363e f17891e = new C5363e(new C14582e(25));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile Map f17890e = C9139e.f18290e;

    public static int metrica(InterfaceC9610e interfaceC9610e) {
        C18543e c18543e = (C18543e) interfaceC9610e.vip(AbstractC9212e.ad);
        Object obj = c18543e != null ? c18543e.ad.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC1926e
    public final void Signature(InterfaceC9610e interfaceC9610e) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                C12232e c12232e = AbstractC3820e.ad;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC9610e.mo754static(c12232e.vip(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new RunnableC16019e((C17839e) abstractC1037e, cameraCaptureSession, 13));
                }
            } else {
                executor.execute(new RunnableC10678e(abstractC1037e, this, interfaceC9610e, 1));
            }
        }
    }

    public final void ad(AbstractC1037e abstractC1037e, Executor executor) {
        if (this.f17890e.containsKey(abstractC1037e)) {
            throw new IllegalStateException((abstractC1037e + " was already registered!").toString());
        }
        synchronized (this.f17892e) {
            this.f17892e.put(abstractC1037e, executor);
            this.f17890e = AbstractC10064e.advert(this.f17892e);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void advert(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                C12232e c12232e = AbstractC3820e.ad;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC9610e.mo754static(c12232e.vip(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) c10224e.mo754static(c12232e.vip(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new RunnableC15637e((C17839e) abstractC1037e, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: extends */
    public final void mo730extends(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                CameraCaptureSession vip = vip(interfaceC9610e);
                C12232e c12232e = AbstractC3820e.ad;
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) c7500e.mo754static(c12232e.vip(TotalCaptureResult.class));
                if (vip != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new RunnableC6795e((C17839e) abstractC1037e, vip, captureRequest, totalCaptureResult, 0));
                }
            } else {
                executor.execute(new RunnableC4904e(abstractC1037e, this, interfaceC9610e, new C7500e(interfaceC9610e, c7500e), 6));
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: goto */
    public final void mo731goto(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                CameraCaptureSession vip = vip(interfaceC9610e);
                C12232e c12232e = AbstractC3820e.ad;
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) interfaceC7172e.mo754static(c12232e.vip(CaptureFailure.class));
                if (vip != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new RunnableC6795e((C17839e) abstractC1037e, vip, captureRequest, captureFailure, 1));
                }
            } else {
                executor.execute(new RunnableC4904e(abstractC1037e, this, interfaceC9610e, new C6114e(25), 7));
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void inmobi(InterfaceC9610e interfaceC9610e, int i) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                C12232e c12232e = AbstractC3820e.ad;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC9610e.mo754static(c12232e.vip(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) interfaceC9610e.mo754static(c12232e.vip(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new RunnableC15637e((C17839e) abstractC1037e, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new RunnableC16764e(abstractC1037e, this, interfaceC9610e, i));
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void isVip(InterfaceC9610e interfaceC9610e, long j, long j2) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                CameraCaptureSession vip = vip(interfaceC9610e);
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(AbstractC3820e.ad.vip(CaptureRequest.class));
                if (vip != null && captureRequest != null) {
                    executor.execute(new RunnableC9489e((C17839e) abstractC1037e, vip, captureRequest, j2, j, 0));
                }
            } else {
                executor.execute(new RunnableC10678e(abstractC1037e, this, interfaceC9610e, 0));
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void license(InterfaceC9610e interfaceC9610e, final long j, int i, int i2) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (Build.VERSION.SDK_INT >= 24 && (abstractC1037e instanceof C17839e)) {
                C12232e c12232e = AbstractC3820e.ad;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC9610e.mo754static(c12232e.vip(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                final Surface surface = (Surface) interfaceC9610e.subs().get(new C13269e(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final C17839e c17839e = (C17839e) abstractC1037e;
                    executor.execute(new Runnable() { // from class: eؙؚٙ
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC12026e.subscription(C17839e.this.ad, cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void loadAd(InterfaceC9610e interfaceC9610e, long j) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                CameraCaptureSession vip = vip(interfaceC9610e);
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(AbstractC3820e.ad.vip(CaptureRequest.class));
                if (vip != null && captureRequest != null) {
                    executor.execute(new RunnableC5316e(0, j, (C17839e) abstractC1037e, vip));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: protected */
    public final void mo732protected(C9021e c9021e) {
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = c9021e.metrica.get(AbstractC9212e.ad);
            C18543e c18543e = obj instanceof C18543e ? (C18543e) obj : null;
            Object obj2 = c18543e != null ? c18543e.ad.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new RunnableC9766e(abstractC1037e, num != null ? num.intValue() : -1, 3));
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final void purchase(InterfaceC9610e interfaceC9610e, long j, long j2) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.f17890e.entrySet()) {
            AbstractC1037e abstractC1037e = (AbstractC1037e) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC1037e instanceof C17839e) {
                C12232e c12232e = AbstractC3820e.ad;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC9610e.mo754static(c12232e.vip(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC9610e.mo754static(c12232e.vip(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new RunnableC9489e((C17839e) abstractC1037e, cameraCaptureSession, captureRequest, j2, j, 1));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void subs(InterfaceC9610e interfaceC9610e) {
    }

    public final CameraCaptureSession vip(InterfaceC9610e interfaceC9610e) {
        C12232e c12232e = AbstractC3820e.ad;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC9610e.mo754static(c12232e.vip(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) interfaceC9610e.mo754static(c12232e.vip(C4403e.billing()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.f17891e.getValue();
    }
}
