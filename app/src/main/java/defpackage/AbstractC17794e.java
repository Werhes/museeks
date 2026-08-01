package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17794e {
    public static final int[] ad;

    static {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            iArr[i] = AbstractC5304e.m1865interface("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, 6);
        }
        ad = iArr;
    }
}
