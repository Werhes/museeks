package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8891e extends AbstractC10727e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C2815e f17856e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final long f17857e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC10727e f17858e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final float f17855e = 0.25f;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f17854e = 9205357640488583168L;

    public C8891e(C14156e c14156e, long j, long j2) {
        this.f17858e = c14156e;
        this.f17857e = j;
        this.f17856e = new C2815e(j2, 5);
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        AbstractC4653e.subscription(interfaceC2235e, this.f17857e, 0L, 0L, 0.0f, null, null, 0, 126);
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32));
        float f = this.f17855e;
        float f2 = intBitsToFloat * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) * f;
        ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(f2, intBitsToFloat2);
        try {
            AbstractC10727e abstractC10727e = this.f17858e;
            float f3 = 2;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - (f2 * f3);
            float intBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) - (f3 * intBitsToFloat2);
            AbstractC10727e.yandex(abstractC10727e, interfaceC2235e, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat4)), this.f17856e, 2);
        } finally {
            ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-f2, -intBitsToFloat2);
        }
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return this.f17854e;
    }
}
