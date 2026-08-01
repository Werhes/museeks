package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18257e {
    public boolean appmetrica;
    public int license;
    public final C10755e ad = new C10755e();
    public final C1292e vip = new C1292e(0, new byte[65025]);
    public int metrica = -1;

    public final int ad(int i) {
        int i2;
        int i3 = 0;
        this.license = 0;
        do {
            int i4 = this.license;
            int i5 = i + i4;
            C10755e c10755e = this.ad;
            if (i5 >= c10755e.metrica) {
                break;
            }
            int[] iArr = c10755e.purchase;
            this.license = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean vip(InterfaceC2283e interfaceC2283e) {
        int i;
        AbstractC2301e.subscription(interfaceC2283e != null);
        boolean z = this.appmetrica;
        C1292e c1292e = this.vip;
        if (z) {
            this.appmetrica = false;
            c1292e.m564extends(0);
        }
        while (!this.appmetrica) {
            int i2 = this.metrica;
            C10755e c10755e = this.ad;
            if (i2 < 0) {
                if (c10755e.vip(interfaceC2283e, -1L) && c10755e.ad(interfaceC2283e, true)) {
                    int i3 = c10755e.license;
                    if ((c10755e.ad & 1) == 1 && c1292e.metrica == 0) {
                        i3 += ad(0);
                        i = this.license;
                    } else {
                        i = 0;
                    }
                    try {
                        interfaceC2283e.amazon(i3);
                        this.metrica = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int ad = ad(this.metrica);
            int i4 = this.metrica + this.license;
            if (ad > 0) {
                c1292e.metrica(c1292e.metrica + ad);
                try {
                    interfaceC2283e.readFully(c1292e.ad, c1292e.metrica, ad);
                    c1292e.m572while(c1292e.metrica + ad);
                    this.appmetrica = c10755e.purchase[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == c10755e.metrica) {
                i4 = -1;
            }
            this.metrica = i4;
        }
        return true;
    }
}
