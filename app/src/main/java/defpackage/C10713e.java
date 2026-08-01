package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؐۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10713e extends AbstractC13960e {
    public final C3123e vip;

    public C10713e() {
        C3123e c3123e = AbstractC12146e.ad;
        this.vip = new C3123e();
    }

    @Override // defpackage.AbstractC13960e
    public final void vip() {
        C3123e c3123e = this.vip;
        int[] iArr = c3123e.vip;
        Object[] objArr = c3123e.metrica;
        long[] jArr = c3123e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        C12328e c12328e = (C12328e) objArr[i5];
                        Object[] objArr2 = c12328e.ad;
                        int i7 = c12328e.vip;
                        int i8 = 0;
                        while (i8 < i7) {
                            C16965e c16965e = (C16965e) objArr2[i8];
                            int i9 = i2;
                            InterfaceC3399e interfaceC3399e = c16965e.license;
                            if (interfaceC3399e != null) {
                                interfaceC3399e.cancel();
                            }
                            c16965e.license = null;
                            C13245e c13245e = (C13245e) c16965e.ad.f5914e;
                            c13245e.f26276e = true;
                            c13245e.f26278e = false;
                            c13245e.ad();
                            i8++;
                            i2 = i9;
                        }
                    }
                    int i10 = i2;
                    j >>= i10;
                    i4++;
                    i2 = i10;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
