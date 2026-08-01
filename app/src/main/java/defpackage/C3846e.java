package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3846e extends C2655e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f8503e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f8504e;

    public C3846e(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC13532e.isVip(i, i + i2, bArr.length);
        this.f8504e = i;
        this.f8503e = i2;
    }

    @Override // defpackage.C2655e, defpackage.AbstractC13532e
    public final void adcel(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.f6524e, this.f8504e + i, bArr, i2, i3);
    }

    @Override // defpackage.C2655e, defpackage.AbstractC13532e
    public final byte appmetrica(int i) {
        AbstractC13532e.subs(i, this.f8503e);
        return this.f6524e[this.f8504e + i];
    }

    @Override // defpackage.C2655e, defpackage.AbstractC13532e
    public final byte billing(int i) {
        return this.f6524e[this.f8504e + i];
    }

    @Override // defpackage.C2655e
    public final int crashlytics() {
        return this.f8504e;
    }

    @Override // defpackage.C2655e, defpackage.AbstractC13532e
    public final int startapp() {
        return this.f8503e;
    }
}
