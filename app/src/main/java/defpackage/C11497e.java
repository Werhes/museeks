package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11497e implements InterfaceC1272e {
    public C1919e adcel;
    public int appmetrica;
    public C0713e billing;
    public int license;
    public int metrica;
    public C3318e startapp;
    public InterfaceC5483e vip;
    public InterfaceC2283e yandex;
    public final C1292e ad = new C1292e(2);
    public long purchase = -1;

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final void billing() {
        InterfaceC5483e interfaceC5483e = this.vip;
        interfaceC5483e.getClass();
        interfaceC5483e.mopub();
        this.vip.pro(new C5990e(-9223372036854775807L));
        this.metrica = 6;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        if (j == 0) {
            this.metrica = 0;
            this.adcel = null;
        } else if (this.metrica == 5) {
            C1919e c1919e = this.adcel;
            c1919e.getClass();
            c1919e.license(j, j2);
        }
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        String tapsense;
        C14446e c14446e = (C14446e) interfaceC2283e;
        C1292e c1292e = this.ad;
        c1292e.m564extends(2);
        c14446e.billing(c1292e.ad, 0, 2, false);
        if (c1292e.m565goto() == 65496) {
            while (true) {
                c1292e.m564extends(2);
                c14446e.billing(c1292e.ad, 0, 2, false);
                int m565goto = c1292e.m565goto();
                this.license = m565goto;
                if (m565goto == 65498) {
                    break;
                }
                c1292e.m564extends(2);
                c14446e.ad(0, 2, c1292e.ad);
                int m565goto2 = c1292e.m565goto() - 2;
                if (m565goto2 < 0) {
                    break;
                }
                if (this.license != 65505) {
                    c14446e.mopub(m565goto2, false);
                } else {
                    c1292e.m564extends(m565goto2);
                    c14446e.billing(c1292e.ad, 0, m565goto2, false);
                    if (Objects.equals(c1292e.tapsense(), "http://ns.adobe.com/xap/1.0/") && (tapsense = c1292e.tapsense()) != null) {
                        String[] strArr = AbstractC7518e.vip;
                        for (int i = 0; i < 4; i++) {
                            if (tapsense.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.vip = interfaceC5483e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
        C1919e c1919e = this.adcel;
        if (c1919e != null) {
            c1919e.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r26, defpackage.C14829e r27) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11497e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
