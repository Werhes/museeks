package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۧۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12914e {
    public static final int[] ad = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public static final int[] vip = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 8) {
                break;
            }
            ad[i2] = 1 << i2;
            i2++;
        }
        for (i = 8; i < 256; i++) {
            int[] iArr = ad;
            iArr[i] = ((iArr[i - 4] ^ iArr[i - 5]) ^ iArr[i - 6]) ^ iArr[i - 8];
        }
        for (int i3 = 0; i3 < 255; i3++) {
            vip[ad[i3]] = i3;
        }
    }

    public static int ad(int i) {
        while (i < 0) {
            i += 255;
        }
        while (i >= 256) {
            i -= 255;
        }
        return ad[i];
    }
}
