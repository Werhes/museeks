package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10669e extends C6283e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f21014e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f21015e;

    public C10669e(byte[] bArr, int i, int i2) {
        super(bArr);
        C6283e.billing(i, i + i2, bArr.length);
        this.f21014e = i;
        this.f21015e = i2;
    }

    @Override // defpackage.C6283e
    public final int adcel() {
        return this.f21014e;
    }

    @Override // defpackage.C6283e
    public final byte advert(int i) {
        return this.f13094e[this.f21014e + i];
    }

    @Override // defpackage.C6283e
    public final byte appmetrica(int i) {
        int i2 = this.f21015e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f13094e[this.f21014e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC1786e.admob(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C6283e
    public final int size() {
        return this.f21015e;
    }

    @Override // defpackage.C6283e
    public final void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f13094e, this.f21014e, bArr, 0, i);
    }
}
