package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12445e implements InterfaceC1926e, InterfaceC3351e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C10860e f24908e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13710e f24909e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f24910e;

    /* JADX WARN: Type inference failed for: r3v3, types: [eٓؒؕ, java.lang.Object] */
    public C12445e(long j) {
        this.f24910e = j;
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ?? obj = new Object();
        obj.ad = 0L;
        this.f24909e = obj;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void Signature(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC3351e
    public final void ad() {
        long j;
        C13710e c13710e = this.f24909e;
        do {
            j = c13710e.ad;
        } while (!C13710e.vip.compareAndSet(c13710e, j, j != -1 ? 0L : -1L));
        this.f24908e.f21515e.ad = 0;
        Log.w("CXCP", "Capture processing has been disabled for " + this.f24908e + " until " + this.f24910e + " frames have been completed.");
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
        long j2;
        long j3;
        C13710e c13710e = this.f24909e;
        do {
            j2 = c13710e.ad;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!C13710e.vip.compareAndSet(c13710e, j2, j3));
        if (j3 == this.f24910e) {
            Log.w("CXCP", "Capture processing is now enabled for " + this.f24908e + " after " + j3 + " frames.");
            C10860e c10860e = this.f24908e;
            c10860e.f21515e.ad = 1;
            c10860e.f21517e.m4495e(C18369e.vip);
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

    @Override // defpackage.InterfaceC3351e
    public final void metrica() {
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

    @Override // defpackage.InterfaceC3351e
    public final void vip() {
        this.f24909e.ad = -1L;
        this.f24908e.f21515e.ad = 0;
    }
}
