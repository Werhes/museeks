package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۨٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7628e extends C11507e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f15500e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f15501e;

    public C7628e(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC4002e.billing(i, i + i2, bArr.length);
        this.f15500e = i;
        this.f15501e = i2;
    }

    @Override // defpackage.C11507e
    public final int adcel() {
        return this.f15500e;
    }

    @Override // defpackage.C11507e
    public final byte advert(int i) {
        return this.f23125e[this.f15500e + i];
    }

    @Override // defpackage.C11507e, defpackage.AbstractC4002e
    public final byte appmetrica(int i) {
        int i2 = this.f15501e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f23125e[this.f15500e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC1786e.admob(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C11507e, defpackage.AbstractC4002e
    public final int size() {
        return this.f15501e;
    }

    @Override // defpackage.C11507e, defpackage.AbstractC4002e
    public final void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f23125e, this.f15500e, bArr, 0, i);
    }
}
