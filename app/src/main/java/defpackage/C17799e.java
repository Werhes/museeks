package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17799e extends C2096e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f34889e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f34890e;

    public C17799e(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC10498e.billing(i, i + i2, bArr.length);
        this.f34889e = i;
        this.f34890e = i2;
    }

    @Override // defpackage.C2096e
    public final int advert() {
        return this.f34889e;
    }

    @Override // defpackage.C2096e, defpackage.AbstractC10498e
    public final byte appmetrica(int i) {
        int i2 = this.f34890e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f5426e[this.f34889e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC1786e.admob(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC1786e.Signature(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.C2096e, defpackage.AbstractC10498e
    public final int size() {
        return this.f34890e;
    }

    @Override // defpackage.C2096e
    public final byte smaato(int i) {
        return this.f5426e[this.f34889e + i];
    }

    @Override // defpackage.C2096e, defpackage.AbstractC10498e
    public final void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f5426e, this.f34889e, bArr, 0, i);
    }
}
