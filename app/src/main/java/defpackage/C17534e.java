package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17534e implements InterfaceC18069e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f34376e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f34377e = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13471e f34378e;

    public C17534e(C13471e c13471e) {
        this.f34378e = c13471e;
    }

    @Override // defpackage.InterfaceC18069e
    public final void Signature(int i) {
        this.f34378e.Signature(i);
    }

    public final void ad() {
        synchronized (this.f34377e) {
            this.f34376e = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC18069e
    public final String advert() {
        return this.f34378e.f26734e;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: break */
    public final boolean mo3561break(List list, InterfaceC8943e interfaceC8943e) {
        boolean mo3561break;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    interfaceC8943e.ad();
                    mo3561break = false;
                } else {
                    mo3561break = this.f34378e.mo3561break(list, interfaceC8943e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3561break;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: const */
    public final boolean mo3562const(InputConfiguration inputConfiguration, ArrayList arrayList, InterfaceC8943e interfaceC8943e) {
        boolean mo3562const;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((C13135e) interfaceC8943e).ad();
                    mo3562const = false;
                } else {
                    mo3562const = this.f34378e.mo3562const(inputConfiguration, arrayList, interfaceC8943e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3562const;
    }

    @Override // defpackage.InterfaceC18069e
    public final boolean crashlytics(C14510e c14510e) {
        boolean crashlytics;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    c14510e.appmetrica.ad();
                    crashlytics = false;
                } else {
                    crashlytics = this.f34378e.crashlytics(c14510e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return crashlytics;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: else */
    public final boolean mo3563else(C18240e c18240e) {
        boolean mo3563else;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    c18240e.billing.ad();
                    mo3563else = false;
                } else {
                    mo3563else = this.f34378e.mo3563else(c18240e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3563else;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: extends */
    public final boolean mo3564extends(ArrayList arrayList, InterfaceC8943e interfaceC8943e) {
        boolean mo3564extends;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((C13135e) interfaceC8943e).ad();
                    mo3564extends = false;
                } else {
                    mo3564extends = this.f34378e.mo3564extends(arrayList, interfaceC8943e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3564extends;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: final */
    public final boolean mo3565final(C2308e c2308e, ArrayList arrayList, InterfaceC8943e interfaceC8943e) {
        boolean mo3565final;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((C13135e) interfaceC8943e).ad();
                    mo3565final = false;
                } else {
                    mo3565final = this.f34378e.mo3565final(c2308e, arrayList, interfaceC8943e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3565final;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: goto */
    public final CaptureRequest.Builder mo3566goto(int i) {
        CaptureRequest.Builder mo3566goto;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    mo3566goto = null;
                } else {
                    mo3566goto = this.f34378e.mo3566goto(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3566goto;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: implements */
    public final boolean mo3567implements(ArrayList arrayList, InterfaceC8943e interfaceC8943e) {
        boolean mo3567implements;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((C13135e) interfaceC8943e).ad();
                    mo3567implements = false;
                } else {
                    mo3567implements = this.f34378e.mo3567implements(arrayList, interfaceC8943e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo3567implements;
    }

    @Override // defpackage.InterfaceC18069e
    public final void inmobi() {
        this.f34378e.inmobi();
    }

    @Override // defpackage.InterfaceC18069e
    public final CaptureRequest.Builder loadAd(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder loadAd;
        synchronized (this.f34377e) {
            try {
                if (this.f34376e) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    loadAd = null;
                } else {
                    loadAd = this.f34378e.loadAd(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return loadAd;
    }

    @Override // defpackage.InterfaceC18069e
    /* renamed from: new */
    public final void mo3568new() {
        this.f34378e.mo3568new();
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        return this.f34378e.mo754static(interfaceC7227e);
    }
}
