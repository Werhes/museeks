package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2807e {
    public static final byte[] license;
    public static final C7936e metrica;
    public int ad;
    public int vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        metrica = new C7936e(2);
        license = new byte[]{86, 66, 82, 73};
    }

    public static C16151e ad(C16151e c16151e) {
        c16151e.skip(36L);
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = c16151e.Signature(i);
        }
        if (!Arrays.equals(bArr, license)) {
            return null;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        metrica.getClass();
        int i2 = C1724e.ad;
        return c16151e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؔۘۗ] */
    public static C2807e vip(C16151e c16151e) {
        ?? obj = new Object();
        obj.ad = -1;
        obj.vip = -1;
        c16151e.skip(10L);
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = c16151e.readByte();
        }
        obj.vip = (bArr[3] & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i2] = c16151e.readByte();
        }
        obj.ad = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        return obj;
    }

    public final String toString() {
        C12894e billing = AbstractC1749e.billing(this);
        billing.license("vbr", String.valueOf(true));
        billing.ad(this.ad, "frameCount");
        billing.ad(this.vip, "audioSize");
        return billing.toString();
    }
}
