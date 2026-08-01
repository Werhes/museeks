package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6159e extends AbstractC10727e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C2815e f12925e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f12928e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public float f12927e = 1.0f;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f12926e = 9205357640488583168L;

    public C6159e(long j) {
        this.f12928e = j;
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        AbstractC4653e.subscription(interfaceC2235e, this.f12928e, 0L, 0L, this.f12927e, null, this.f12925e, 0, 86);
    }

    @Override // defpackage.AbstractC10727e
    public final boolean appmetrica(C2815e c2815e) {
        this.f12925e = c2815e;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6159e) {
            return C3618e.metrica(this.f12928e, ((C6159e) obj).f12928e);
        }
        return false;
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.f12928e);
    }

    @Override // defpackage.AbstractC10727e
    public final boolean license(float f) {
        this.f12927e = f;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return this.f12926e;
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) C3618e.startapp(this.f12928e)) + ')';
    }
}
