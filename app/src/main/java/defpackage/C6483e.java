package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6483e implements InterfaceC1272e {
    public InterfaceC5483e ad;
    public boolean metrica;
    public AbstractC13109e vip;

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final boolean billing(InterfaceC2283e interfaceC2283e) {
        boolean z;
        C10755e c10755e = new C10755e();
        if (c10755e.ad(interfaceC2283e, true) && (c10755e.ad & 2) == 2) {
            int min = Math.min(c10755e.appmetrica, 8);
            C1292e c1292e = new C1292e(min);
            interfaceC2283e.ad(0, min, c1292e.ad);
            c1292e.m571try(0);
            if (c1292e.ad() >= 5 && c1292e.ads() == 127 && c1292e.subs() == 1179402563) {
                this.vip = new AbstractC13109e();
                return true;
            }
            c1292e.m571try(0);
            try {
                z = AbstractC0014e.smaato(1, c1292e, true);
            } catch (C15125e unused) {
                z = false;
            }
            if (z) {
                this.vip = new AbstractC13109e();
            } else {
                c1292e.m571try(0);
                if (C13241e.appmetrica(c1292e, C13241e.loadAd)) {
                    this.vip = new AbstractC13109e();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        AbstractC13109e abstractC13109e = this.vip;
        if (abstractC13109e != null) {
            C18257e c18257e = abstractC13109e.ad;
            C10755e c10755e = c18257e.ad;
            c10755e.ad = 0;
            c10755e.vip = 0L;
            c10755e.metrica = 0;
            c10755e.license = 0;
            c10755e.appmetrica = 0;
            c18257e.vip.m564extends(0);
            c18257e.metrica = -1;
            c18257e.appmetrica = false;
            if (j == 0) {
                abstractC13109e.license(!abstractC13109e.advert);
                return;
            }
            if (abstractC13109e.yandex != 0) {
                long j3 = (abstractC13109e.startapp * j2) / 1000000;
                abstractC13109e.appmetrica = j3;
                InterfaceC3604e interfaceC3604e = abstractC13109e.license;
                String str = AbstractC9413e.ad;
                interfaceC3604e.tapsense(j3);
                abstractC13109e.yandex = 2;
            }
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        try {
            return billing(interfaceC2283e);
        } catch (C15125e unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.ad = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r25, defpackage.C14829e r26) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6483e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
