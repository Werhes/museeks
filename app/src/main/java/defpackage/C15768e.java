package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15768e {
    public final byte[] ad;

    public C15768e(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.ad = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C15768e ad(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new C15768e(length, bArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15768e) {
            return Arrays.equals(((C15768e) obj).ad, this.ad);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.ad);
    }

    public final String toString() {
        return "Bytes(" + AbstractC5706e.license(this.ad) + ")";
    }

    public final byte[] vip() {
        byte[] bArr = this.ad;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
