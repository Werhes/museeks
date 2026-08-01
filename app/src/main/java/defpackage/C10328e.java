package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10328e implements InterfaceC16538e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f20379e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f20380e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f20381e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f20382e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f20383e;

    public C10328e(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f20383e = f;
        this.f20381e = z;
        this.f20380e = z2;
        this.f20382e = z3;
        this.f20379e = z4;
    }

    @Override // defpackage.InterfaceC3934e
    public final C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        float f2 = f / 7.0f;
        float f3 = this.f20383e;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = f2 * f3;
        float vip = AbstractC3062e.vip(0.25f, 0.0f, 0.5f);
        float f5 = vip * f;
        float f6 = (f - (4 * f4)) * vip;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        boolean z = this.f20381e;
        long j = z ? floatToRawIntBits : 0L;
        boolean z2 = this.f20382e;
        long j2 = z2 ? floatToRawIntBits : 0L;
        boolean z3 = this.f20380e;
        long j3 = z3 ? floatToRawIntBits : 0L;
        boolean z4 = this.f20379e;
        AbstractC1634e.license(c17985e, new C2330e(0.0f, 0.0f, f, f, j, j2, z4 ? floatToRawIntBits : 0L, j3));
        float f7 = f - f4;
        long j4 = 0;
        long j5 = z ? floatToRawIntBits2 : 0L;
        long j6 = 0;
        if (z2) {
            j4 = floatToRawIntBits2;
        }
        long j7 = z3 ? floatToRawIntBits2 : 0L;
        if (z4) {
            j6 = floatToRawIntBits2;
        }
        AbstractC1634e.license(c17985e, new C2330e(f4, f4, f7, f7, j5, j4, j6, j7));
        return c17985e;
    }
}
