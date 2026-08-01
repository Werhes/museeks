package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2802e implements InterfaceC18133e {
    public final C17400e ad;

    public C2802e(C17400e c17400e) {
        this.ad = c17400e;
    }

    @Override // defpackage.InterfaceC2869e
    /* renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public final C7188e ad(C11139e c11139e) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        C17400e c17400e = this.ad;
        C3123e c3123e = c17400e.vip;
        C12452e c12452e = new C12452e(c3123e.appmetrica + 2);
        C3123e c3123e2 = new C3123e(c3123e.appmetrica);
        int[] iArr3 = c3123e.vip;
        Object[] objArr3 = c3123e.metrica;
        long[] jArr = c3123e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            i = i3;
                            C8494e c8494e = (C8494e) objArr3[i6];
                            c12452e.ad(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c3123e2.startapp(i7, new C1871e((AbstractC3424e) c11139e.ad.invoke(c8494e.ad), c8494e.vip));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        iArr3 = iArr2;
                        i3 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c3123e.ad(0)) {
            int i8 = c12452e.vip;
            if (i8 < 0) {
                AbstractC14783e.yandex("Index must be between 0 and size");
                throw null;
            }
            c12452e.vip(i8 + 1);
            int[] iArr4 = c12452e.ad;
            int i9 = c12452e.vip;
            if (i9 != 0) {
                AbstractC1660e.advert(1, 0, iArr4, iArr4, i9);
            }
            iArr4[0] = 0;
            c12452e.vip++;
        }
        if (!c3123e.ad(c17400e.ad)) {
            c12452e.ad(c17400e.ad);
        }
        int i10 = c12452e.vip;
        if (i10 != 0) {
            Arrays.sort(c12452e.ad, 0, i10);
        }
        return new C7188e(c12452e, c3123e2, c17400e.ad, AbstractC5616e.license);
    }
}
