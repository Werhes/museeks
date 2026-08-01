package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12528e implements InterfaceC14230e {
    public final C11744e ad;
    public boolean appmetrica;
    public final AtomicInteger billing;
    public final boolean license;
    public InterfaceC7865e metrica;
    public final C1326e purchase;
    public C6467e startapp;
    public final C8591e vip;
    public C8823e yandex;

    /* JADX WARN: Type inference failed for: r3v1, types: [eٍ۟ۤ, eؒۛ٘] */
    public C12528e(InterfaceC2531e interfaceC2531e, C11744e c11744e, C8591e c8591e, C3154e c3154e) {
        this.ad = c11744e;
        this.vip = c8591e;
        boolean z = false;
        if (interfaceC2531e != null) {
            InterfaceC2531e.yandex.getClass();
            int[] iArr = (int[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr == null ? false : AbstractC1660e.startapp(iArr, 6)) {
                z = true;
            }
        }
        this.license = z;
        this.purchase = new AbstractC9790e(-1);
        this.billing = new AtomicInteger(-1);
        if (z) {
            c3154e.ad(new C5996e(this), c8591e.license);
        }
    }

    public final void ad(List list) {
        if (this.license) {
            if (list.isEmpty()) {
                this.startapp = AbstractC16565e.ad(Boolean.FALSE);
            } else {
                this.startapp = AbstractC5336e.vip(3, null, this.vip.appmetrica, new C4870e(this, list, null, 29));
            }
        }
    }

    public final C8823e license(boolean z, boolean z2) {
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        C8823e c8823e = new C8823e();
        if (this.license) {
            AbstractC5336e.purchase(this.vip.appmetrica, null, 0, new C5558e(null, this, c8823e, z, z2), 3);
            return c8823e;
        }
        c8823e.m2503e(new IllegalStateException("Low Light Boost is not supported!"));
        return c8823e;
    }

    public final void metrica(C1326e c1326e, int i) {
        if (this.billing.getAndSet(i) != i) {
            if (AbstractC13062e.purchase()) {
                c1326e.startapp(Integer.valueOf(i));
            } else {
                c1326e.adcel(Integer.valueOf(i));
            }
        }
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        C8823e c8823e = this.yandex;
        if (c8823e != null) {
            AbstractC17861e.isPro("There is a new enableLowLightBoost being set", c8823e);
        }
        this.yandex = null;
        license(false, true);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.metrica = interfaceC7865e;
        if (this.appmetrica) {
            if (interfaceC7865e != null) {
                license(true, false);
            } else {
                metrica(this.purchase, 0);
            }
        }
    }
}
