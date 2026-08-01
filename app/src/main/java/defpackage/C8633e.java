package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C14777e.class)
/* renamed from: eٌٌِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8633e {
    public static final C6750e Companion = new Object();
    public byte[] ad;
    public C10312e vip;

    public C8633e(byte[] bArr) {
        this.ad = bArr;
    }

    public final Object ad(InterfaceC5372e interfaceC5372e) {
        Object metrica;
        C10312e c10312e = this.vip;
        if (c10312e == null || (metrica = c10312e.f20361e) == null) {
            byte[] bArr = this.ad;
            metrica = bArr != null ? AbstractC2223e.metrica(interfaceC5372e, bArr) : null;
        }
        this.vip = null;
        this.ad = null;
        return metrica;
    }
}
