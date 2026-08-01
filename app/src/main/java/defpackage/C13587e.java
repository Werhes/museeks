package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13587e implements InterfaceC1272e {
    public C17754e Signature;
    public int adcel;
    public int advert;
    public boolean amazon;
    public final C7672e appmetrica;
    public int billing;
    public C9933e loadAd;
    public int mopub;
    public InterfaceC5483e purchase;
    public long smaato;
    public long startapp;
    public boolean yandex;
    public final C1292e ad = new C1292e(4);
    public final C1292e vip = new C1292e(9);
    public final C1292e metrica = new C1292e(11);
    public final C1292e license = new C1292e();

    /* JADX WARN: Type inference failed for: r0v4, types: [package, eًؒۧ] */
    public C13587e() {
        ?? cpackage = new Cpackage(15, new C6891e());
        cpackage.f15601e = -9223372036854775807L;
        cpackage.f15602e = new long[0];
        cpackage.f15600e = new long[0];
        this.appmetrica = cpackage;
        this.billing = 1;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final C1292e billing(InterfaceC2283e interfaceC2283e) {
        int i = this.advert;
        C1292e c1292e = this.license;
        byte[] bArr = c1292e.ad;
        if (i > bArr.length) {
            c1292e.m570throw(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c1292e.m571try(0);
        }
        c1292e.m572while(this.advert);
        interfaceC2283e.readFully(c1292e.ad, 0, this.advert);
        return c1292e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        if (j == 0) {
            this.billing = 1;
            this.yandex = false;
        } else {
            this.billing = 3;
        }
        this.adcel = 0;
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C1292e c1292e = this.ad;
        C14446e c14446e = (C14446e) interfaceC2283e;
        c14446e.billing(c1292e.ad, 0, 3, false);
        c1292e.m571try(0);
        if (c1292e.crashlytics() == 4607062) {
            c14446e.billing(c1292e.ad, 0, 2, false);
            c1292e.m571try(0);
            if ((c1292e.m565goto() & 250) == 0) {
                c14446e.billing(c1292e.ad, 0, 4, false);
                c1292e.m571try(0);
                int smaato = c1292e.smaato();
                c14446e.f28561e = 0;
                c14446e.mopub(smaato, false);
                c14446e.billing(c1292e.ad, 0, 4, false);
                c1292e.m571try(0);
                if (c1292e.smaato() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.purchase = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5, types: [eٍۨؖ, package] */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r30, defpackage.C14829e r31) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13587e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
