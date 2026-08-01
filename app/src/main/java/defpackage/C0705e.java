package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705e implements InterfaceC16132e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0576e f2992e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f2993e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f2994e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f2995e;

    public C0705e(int i, int i2, int i3) {
        this.f2995e = i2;
        this.f2993e = i3;
        int i4 = (i / i2) * i2;
        this.f2992e = new C0576e(AbstractC3062e.admob(Math.max(i4 - i3, 0), i4 + i2 + i3), C12575e.f25232e);
        this.f2994e = i;
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        return (C15926e) this.f2992e.getValue();
    }

    public final void metrica(int i) {
        if (i != this.f2994e) {
            this.f2994e = i;
            int i2 = this.f2995e;
            int i3 = (i / i2) * i2;
            int i4 = this.f2993e;
            this.f2992e.setValue(AbstractC3062e.admob(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }
}
