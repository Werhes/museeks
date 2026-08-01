package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17931e {
    public boolean appmetrica;
    public int billing;
    public boolean license;
    public int[] purchase;
    public Rect startapp;
    public int yandex;
    public long vip = -9223372036854775807L;
    public long metrica = -9223372036854775807L;
    public final int[] ad = new int[4];
    public int adcel = -1;
    public int mopub = -1;

    public static int ad(int[] iArr, int i) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    public static int metrica(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public final void vip(C2125e c2125e, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int width = rect.width();
        int height = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * width;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (c2125e.vip() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | c2125e.billing(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.ad[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            c2125e.metrica();
        }
    }
}
