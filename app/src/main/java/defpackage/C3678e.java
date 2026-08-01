package defpackage;

/* renamed from: eؕۡؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3678e implements InterfaceC13829e {
    public final byte[] ad;
    public final byte[] metrica;
    public final byte[] vip;

    public C3678e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
        this.ad = AbstractC12442e.license(bArr);
        if (bArr2 == null || bArr2.length == 0) {
            this.vip = null;
        } else {
            this.vip = AbstractC12442e.license(bArr2);
        }
        if (bArr3 == null) {
            this.metrica = new byte[0];
        } else {
            this.metrica = AbstractC12442e.license(bArr3);
        }
    }
}
