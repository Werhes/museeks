package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17713e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C17713e f34719e = new C17713e(new byte[0]);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final char[] f34720e = "0123456789abcdef".toCharArray();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34721e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f34722e;

    public C17713e(byte[] bArr) {
        this.f34722e = bArr;
    }

    public C17713e(byte[] bArr, int i, int i2) {
        this(AbstractC1660e.remoteconfig(i, i2, bArr));
    }

    public final byte ad(int i) {
        byte[] bArr = this.f34722e;
        if (i < 0 || i >= bArr.length) {
            throw new IndexOutOfBoundsException(AbstractC1786e.pro(AbstractC4653e.premium("index (", i, ") is out of byte string bounds: [0.."), bArr.length, ')'));
        }
        return bArr[i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17713e c17713e = (C17713e) obj;
        byte[] bArr = c17713e.f34722e;
        if (c17713e == this) {
            return 0;
        }
        byte[] bArr2 = this.f34722e;
        int min = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < min; i++) {
            int yandex = AbstractC7890e.yandex(bArr2[i] & 255, bArr[i] & 255);
            if (yandex != 0) {
                return yandex;
            }
        }
        return AbstractC7890e.yandex(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C17713e.class != obj.getClass()) {
            return false;
        }
        C17713e c17713e = (C17713e) obj;
        byte[] bArr = c17713e.f34722e;
        int length = bArr.length;
        byte[] bArr2 = this.f34722e;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = c17713e.f34721e;
        if (i2 == 0 || (i = this.f34721e) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f34721e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f34722e);
        this.f34721e = hashCode;
        return hashCode;
    }

    public final String toString() {
        byte[] bArr = this.f34722e;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + valueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = f34720e;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }
}
