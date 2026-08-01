package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12262e {
    public final ArrayList ad;
    public final C3123e appmetrica;
    public final ArrayList license;
    public int metrica;
    public final C5363e purchase;
    public final int vip;

    public C12262e(int i, ArrayList arrayList) {
        this.ad = arrayList;
        this.vip = i;
        if (i < 0) {
            AbstractC6536e.ad("Invalid start index");
        }
        this.license = new ArrayList();
        C3123e c3123e = new C3123e();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C13005e c13005e = (C13005e) this.ad.get(i3);
            int i4 = c13005e.metrica;
            int i5 = c13005e.license;
            c3123e.startapp(i4, new C14949e(i3, i2, i5));
            i2 += i5;
        }
        this.appmetrica = c3123e;
        this.purchase = new C5363e(new C3411e(22, this));
    }

    public final boolean ad(int i, int i2) {
        int i3;
        C3123e c3123e = this.appmetrica;
        C14949e c14949e = (C14949e) c3123e.vip(i);
        if (c14949e == null) {
            return false;
        }
        int i4 = c14949e.vip;
        int i5 = i2 - c14949e.metrica;
        c14949e.metrica = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = c3123e.metrica;
        long[] jArr = c3123e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C14949e c14949e2 = (C14949e) objArr[(i6 << 3) + i8];
                        if (c14949e2.vip >= i4 && !c14949e2.equals(c14949e) && (i3 = c14949e2.vip + i5) >= 0) {
                            c14949e2.vip = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
