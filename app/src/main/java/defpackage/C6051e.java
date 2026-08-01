package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6051e implements InterfaceC1272e {
    public boolean Signature;
    public final C1292e ad;
    public long adcel;
    public int advert;
    public long amazon;
    public int appmetrica;
    public C8262e billing;
    public final C4524e license;
    public int loadAd;
    public final boolean metrica;
    public C2255e mopub;
    public InterfaceC5483e purchase;
    public long smaato;
    public C2255e[] startapp;
    public final C3900e vip;
    public long yandex;

    public C6051e(int i, C4524e c4524e) {
        this.license = c4524e;
        this.metrica = (i & 1) == 0;
        this.ad = new C1292e(12);
        this.vip = new C3900e(1);
        this.purchase = new C9821e(5);
        this.startapp = new C2255e[0];
        this.smaato = -1L;
        this.amazon = -1L;
        this.advert = -1;
        this.yandex = -9223372036854775807L;
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

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.adcel = -1L;
        this.mopub = null;
        for (C2255e c2255e : this.startapp) {
            if (c2255e.mopub == 0) {
                c2255e.startapp = 0;
            } else {
                c2255e.startapp = c2255e.amazon[AbstractC9413e.purchase(c2255e.smaato, j, true)];
            }
        }
        if (j != 0) {
            this.appmetrica = 6;
        } else if (this.startapp.length == 0) {
            this.appmetrica = 0;
        } else {
            this.appmetrica = 3;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C1292e c1292e = this.ad;
        interfaceC2283e.ad(0, 12, c1292e.ad);
        c1292e.m571try(0);
        if (c1292e.loadAd() != 1179011410) {
            return false;
        }
        c1292e.m568protected(4);
        return c1292e.loadAd() == 541677121;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.appmetrica = 0;
        if (this.metrica) {
            interfaceC5483e = new C5609e(interfaceC5483e, this.license);
        }
        this.purchase = interfaceC5483e;
        this.adcel = -1L;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r23, defpackage.C14829e r24) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6051e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
