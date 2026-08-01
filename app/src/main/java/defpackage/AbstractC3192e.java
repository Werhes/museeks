package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3192e {
    public static final C2892e ad = new C2892e(1657563816, false, new C15480e(20));
    public static final C2892e vip = new C2892e(2128603267, false, new C15480e(21));

    public static final void ad(int i) {
        new Integer(i);
    }

    public static int appmetrica(Object obj) {
        return license(obj == null ? 0 : obj.hashCode());
    }

    public static int license(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, C14298e c14298e) {
        return interfaceC12864e.premium(new C9979e(c14298e));
    }

    public static void purchase(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static final void vip(long j) {
        new Long(j);
    }
}
