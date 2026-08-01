package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ۠۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11315e implements InterfaceC14388e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f22707e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f22708e;

    public C11315e(float f, float f2) {
        this.f22708e = f;
        this.f22707e = f2;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC4653e.purchase(this, mo498new(f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11315e)) {
            return false;
        }
        C11315e c11315e = (C11315e) obj;
        return Float.compare(this.f22708e, c11315e.f22708e) == 0 && Float.compare(this.f22707e, c11315e.f22707e) == 0;
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
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22707e) + (Float.floatToIntBits(this.f22708e) * 31);
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
        return this.f22707e;
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f22708e);
        sb.append(", fontScale=");
        return AbstractC17861e.remoteconfig(sb, this.f22707e, ')');
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f22708e;
    }
}
