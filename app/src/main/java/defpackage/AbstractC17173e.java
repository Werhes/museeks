package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٞ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17173e {
    public static final float[] ad;

    static {
        long[] jArr = AbstractC12981e.ad;
        int license = AbstractC12981e.license(0);
        int max = license > 0 ? Math.max(7, AbstractC12981e.metrica(license)) : 0;
        if (max != 0) {
            int i = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[max];
        ad = new float[0];
    }
}
