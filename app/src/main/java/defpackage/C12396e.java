package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12396e implements InterfaceC14230e {
    public final C3082e ad;
    public InterfaceC7865e metrica;
    public C10388e vip;

    public C12396e(C3082e c3082e) {
        this.ad = c3082e;
        this.vip = new C10388e(c3082e.license, 0, c3082e.metrica, c3082e.appmetrica);
    }

    public final C8823e ad(boolean z) {
        C3082e c3082e = this.ad;
        if (!c3082e.license) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            C8823e c8823e = new C8823e();
            c8823e.m2503e(illegalArgumentException);
            return c8823e;
        }
        if (!c3082e.metrica.contains((Range) 0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + c3082e.metrica.getUpper() + " .. " + c3082e.metrica.getLower() + ']');
            C8823e c8823e2 = new C8823e();
            c8823e2.m2503e(illegalArgumentException2);
            return c8823e2;
        }
        InterfaceC7865e interfaceC7865e = this.metrica;
        if (interfaceC7865e == null) {
            Exception exc = new Exception("Camera is not active.");
            C8823e c8823e3 = c3082e.purchase;
            if (c8823e3 != null) {
                c8823e3.m2503e(exc);
            }
            C8823e c8823e4 = new C8823e();
            c8823e4.m2503e(exc);
            return c8823e4;
        }
        C10388e c10388e = this.vip;
        this.vip = new C10388e(c10388e.ad, 0, c10388e.metrica, c10388e.license);
        C3154e c3154e = c3082e.vip;
        C8823e c8823e5 = new C8823e();
        C8823e c8823e6 = c3082e.purchase;
        if (c8823e6 != null) {
            if (z) {
                AbstractC17861e.isPro("Cancelled by another setExposureCompensationIndex()", c8823e6);
            } else {
                AbstractC16398e.metrica(c8823e5, c8823e6);
            }
        }
        c3082e.purchase = c8823e5;
        C17735e c17735e = c3082e.billing;
        if (c17735e != null) {
            c3154e.vip(c17735e);
            c3082e.billing = null;
        }
        interfaceC7865e.adcel(Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0), AbstractC13788e.vip);
        C17735e c17735e2 = new C17735e(0, c8823e5);
        c3154e.ad(c17735e2, c3082e.ad.license);
        c8823e5.mo692else(new C9041e(c3082e, c17735e2, 13));
        c3082e.billing = c17735e2;
        return c8823e5;
    }

    @Override // defpackage.InterfaceC14230e
    public final void reset() {
        C10388e c10388e = this.vip;
        this.vip = new C10388e(c10388e.ad, 0, c10388e.metrica, c10388e.license);
        ad(true);
    }

    @Override // defpackage.InterfaceC14230e
    public final void vip(InterfaceC7865e interfaceC7865e) {
        this.metrica = interfaceC7865e;
        ad(false);
    }
}
