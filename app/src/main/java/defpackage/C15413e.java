package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15413e {
    public static final char[] ad = new char[117];
    public static final byte[] vip = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        ad('b', 8);
        ad('t', 9);
        ad('n', 10);
        ad('f', 12);
        ad('r', 13);
        ad('/', 47);
        ad('\"', 34);
        ad('\\', 92);
        byte[] bArr = vip;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = Byte.MAX_VALUE;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void ad(char c, int i) {
        if (c != 'u') {
            ad[c] = (char) i;
        }
    }
}
