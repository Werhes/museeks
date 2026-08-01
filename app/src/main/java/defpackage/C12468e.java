package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12468e implements InterfaceC14388e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC8998e f24962e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f24963e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f24964e;

    public C12468e(float f, float f2, InterfaceC8998e interfaceC8998e) {
        this.f24964e = f;
        this.f24963e = f2;
        this.f24962e = interfaceC8998e;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC13362e.mopub(this.f24962e.ad(mo498new(f)), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12468e)) {
            return false;
        }
        C12468e c12468e = (C12468e) obj;
        return Float.compare(this.f24964e, c12468e.f24964e) == 0 && Float.compare(this.f24963e, c12468e.f24963e) == 0 && AbstractC7890e.billing(this.f24962e, c12468e.f24962e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        if (C4616e.ad(C12973e.vip(j), 4294967296L)) {
            return this.f24962e.vip(C12973e.metrica(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final int hashCode() {
        return this.f24962e.hashCode() + AbstractC1414e.license(Float.floatToIntBits(this.f24964e) * 31, this.f24963e, 31);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f24963e;
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f24964e + ", fontScale=" + this.f24963e + ", converter=" + this.f24962e + ')';
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f24964e;
    }
}
