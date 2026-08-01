package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866e {
    public final C12476e ad;
    public InterfaceC0043e metrica;
    public InterfaceC0043e vip = null;

    public C0866e(C12476e c12476e, InterfaceC0043e interfaceC0043e) {
        this.ad = c12476e;
        this.metrica = interfaceC0043e;
    }

    public final long ad(long j) {
        C0763e c0763e;
        InterfaceC0043e interfaceC0043e = this.vip;
        C0763e c0763e2 = C0763e.appmetrica;
        if (interfaceC0043e != null) {
            if (interfaceC0043e.billing()) {
                InterfaceC0043e interfaceC0043e2 = this.metrica;
                c0763e = interfaceC0043e2 != null ? interfaceC0043e2.mo208goto(interfaceC0043e, true) : null;
            } else {
                c0763e = c0763e2;
            }
            if (c0763e != null) {
                c0763e2 = c0763e;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = c0763e2.ad;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = c0763e2.metrica;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = c0763e2.vip;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = c0763e2.license;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final long appmetrica(long j) {
        InterfaceC0043e interfaceC0043e;
        InterfaceC0043e interfaceC0043e2 = this.vip;
        if (interfaceC0043e2 == null) {
            return j;
        }
        if (!interfaceC0043e2.billing()) {
            interfaceC0043e2 = null;
        }
        if (interfaceC0043e2 == null || (interfaceC0043e = this.metrica) == null) {
            return j;
        }
        InterfaceC0043e interfaceC0043e3 = interfaceC0043e.billing() ? interfaceC0043e : null;
        return interfaceC0043e3 == null ? j : interfaceC0043e3.mo207class(interfaceC0043e2, j);
    }

    public final long license(long j) {
        InterfaceC0043e interfaceC0043e;
        InterfaceC0043e interfaceC0043e2 = this.vip;
        if (interfaceC0043e2 == null) {
            return j;
        }
        if (!interfaceC0043e2.billing()) {
            interfaceC0043e2 = null;
        }
        if (interfaceC0043e2 == null || (interfaceC0043e = this.metrica) == null) {
            return j;
        }
        InterfaceC0043e interfaceC0043e3 = interfaceC0043e.billing() ? interfaceC0043e : null;
        return interfaceC0043e3 == null ? j : interfaceC0043e2.mo207class(interfaceC0043e3, j);
    }

    public final boolean metrica(long j) {
        long license = license(ad(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & license));
        C12476e c12476e = this.ad;
        int appmetrica = c12476e.vip.appmetrica(intBitsToFloat);
        int i = (int) (license >> 32);
        return Float.intBitsToFloat(i) >= c12476e.billing(appmetrica) && Float.intBitsToFloat(i) <= c12476e.yandex(appmetrica);
    }

    public final int vip(long j, boolean z) {
        if (z) {
            j = ad(j);
        }
        return this.ad.vip.billing(license(j));
    }
}
