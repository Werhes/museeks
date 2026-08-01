package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9926e implements InterfaceC6347e {
    public final /* synthetic */ C18510e ad;

    public C9926e(C18510e c18510e) {
        this.ad = c18510e;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        C18510e c18510e = this.ad;
        long j2 = c18510e.f36289e;
        BigInteger valueOf = BigInteger.valueOf((c18510e.f36292e.startapp * j) / 1000000);
        long j3 = c18510e.f36287e;
        C7278e c7278e = new C7278e(j, AbstractC9413e.mopub((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(c18510e.f36296e)).longValue() + j2) - 30000, c18510e.f36289e, j3 - 1));
        return new C13178e(c7278e, c7278e);
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return (this.ad.f36296e * 1000000) / r0.f36292e.startapp;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }
}
