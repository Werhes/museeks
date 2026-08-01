package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13245e implements InterfaceC8493e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f26275e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f26276e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f26278e = true;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0583e f26277e = new C0583e();

    public final void ad() {
        C0583e c0583e = this.f26277e;
        Object[] objArr = c0583e.metrica;
        long[] jArr = c0583e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof C12328e) {
                                C12328e c12328e = (C12328e) obj;
                                Object[] objArr2 = c12328e.ad;
                                int i4 = c12328e.vip;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c0583e.ad();
    }
}
