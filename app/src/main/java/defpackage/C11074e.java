package defpackage;

import java.util.Collections;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11074e implements InterfaceC1926e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C8823e f21963e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C8823e f21966e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f21967e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f21965e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13935e f21964e = new C13935e(5);

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void Signature(InterfaceC9610e interfaceC9610e) {
    }

    public final C8823e ad(InterfaceC7865e interfaceC7865e, boolean z) {
        C11456e applovin;
        C8823e c8823e = new C8823e();
        synchronized (this.f21967e) {
            applovin = this.f21964e.applovin();
        }
        synchronized (this.f21965e) {
            try {
                if (interfaceC7865e != null) {
                    if (z) {
                        C8823e c8823e2 = this.f21966e;
                        if (c8823e2 != null) {
                            c8823e2.m2503e(new Exception("Camera2CameraControl was updated with new options."));
                        }
                    } else {
                        C8823e c8823e3 = this.f21966e;
                        if (c8823e3 != null) {
                            AbstractC16398e.metrica(c8823e, c8823e3);
                        }
                    }
                    this.f21966e = c8823e;
                    interfaceC7865e.appmetrica(applovin, Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(c8823e.hashCode())));
                } else {
                    C8823e c8823e4 = this.f21963e;
                    if (c8823e4 != null) {
                        c8823e4.m2503e(new Exception("Camera2CameraControl was updated with new options."));
                    }
                    this.f21963e = c8823e;
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8823e;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void advert(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: extends */
    public final void mo730extends(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        synchronized (this.f21965e) {
            try {
                C8823e c8823e = this.f21966e;
                if (c8823e != null) {
                    if (AbstractC7890e.billing(((C18543e) interfaceC9610e.ad(AbstractC9212e.ad, C18543e.vip)).ad.get("Camera2CameraControl.tag"), Integer.valueOf(c8823e.hashCode()))) {
                        c8823e.m2175import(null);
                        this.f21966e = null;
                        C8823e c8823e2 = this.f21963e;
                        if (c8823e2 != null) {
                            c8823e2.m2175import(null);
                            this.f21963e = null;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: goto */
    public final /* synthetic */ void mo731goto(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void inmobi(InterfaceC9610e interfaceC9610e, int i) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void isVip(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void license(InterfaceC9610e interfaceC9610e, long j, int i, int i2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void loadAd(InterfaceC9610e interfaceC9610e, long j) {
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: protected */
    public final /* synthetic */ void mo732protected(C9021e c9021e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void purchase(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void subs(InterfaceC9610e interfaceC9610e) {
    }
}
