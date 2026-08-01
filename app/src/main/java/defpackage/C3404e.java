package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3404e extends AbstractC10298e {
    public final byte[] ad;
    public final C1622e vip;

    public C3404e(byte[] bArr, C1622e c1622e, int i) {
        c1622e = (i & 2) != 0 ? null : c1622e;
        this.ad = bArr;
        this.vip = c1622e;
    }

    @Override // defpackage.AbstractC14601e
    public final Long ad() {
        return Long.valueOf(this.ad.length);
    }

    @Override // defpackage.AbstractC10298e
    public final byte[] appmetrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14601e
    public final C2394e license() {
        return null;
    }

    @Override // defpackage.AbstractC14601e
    public final C1622e vip() {
        return this.vip;
    }
}
