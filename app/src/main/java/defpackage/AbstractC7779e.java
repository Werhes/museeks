package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7779e {
    public static final C11021e ad = new C11021e(21);

    public static final void ad(AbstractC11069e abstractC11069e, String str) {
        new C5149e(abstractC11069e, abstractC11069e.ad, abstractC11069e.vip);
    }

    public static void license(C9831e c9831e, byte[] bArr, int i) {
        if (i == 3) {
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 3;
                long j = (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
                long j2 = (j & 2396745) + ((j >> 1) & 2396745) + ((j >> 2) & 2396745);
                for (int i4 = 0; i4 < 4; i4++) {
                    int i5 = i4 * 6;
                    ((short[]) c9831e.license)[(i2 * 4) + i4] = (short) (((short) ((j2 >> i5) & 7)) - ((short) (7 & (j2 >> (i5 + 3)))));
                }
            }
            return;
        }
        for (int i6 = 0; i6 < 32; i6++) {
            int i7 = i6 * 4;
            long j3 = (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24);
            long j4 = (j3 & 1431655765) + ((j3 >> 1) & 1431655765);
            for (int i8 = 0; i8 < 8; i8++) {
                int i9 = i8 * 4;
                ((short[]) c9831e.license)[(i6 * 8) + i8] = (short) (((short) ((j4 >> i9) & 3)) - ((short) ((j4 >> (i9 + i)) & 3)));
            }
        }
    }

    public static InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, boolean z, InterfaceC12864e interfaceC12864e2) {
        if (!z) {
            interfaceC12864e2 = C0115e.f1276e;
        }
        return interfaceC12864e.premium(interfaceC12864e2);
    }

    public static View vip(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
