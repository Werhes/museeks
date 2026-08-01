package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11977e {
    public static final char[] ad = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int[] vip;

    static {
        int[] iArr = new int[128];
        for (int i = 0; i < 128; i++) {
            char[] cArr = ad;
            char c = (char) i;
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (c == cArr[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
            iArr[i] = i2;
        }
        vip = iArr;
    }
}
