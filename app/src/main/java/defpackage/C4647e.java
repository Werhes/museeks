package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4647e implements CharSequence {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9978e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char[] f9979e;

    public C4647e(char[] cArr) {
        this.f9979e = cArr;
        this.f9978e = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f9979e[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9978e;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return AbstractC6507e.startapp(this.f9979e, i, Math.min(i2, this.f9978e));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f9978e;
        return AbstractC6507e.startapp(this.f9979e, 0, Math.min(i, i));
    }
}
