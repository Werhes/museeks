package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18466e extends AbstractC4457e implements InterfaceC5606e {
    public final long ad;

    public C18466e(long j) {
        this.ad = j;
    }

    @Override // defpackage.AbstractC4457e
    public final void ad(float f, long j, C11447e c11447e) {
        c11447e.metrica(1.0f);
        long j2 = this.ad;
        if (f != 1.0f) {
            j2 = C3618e.vip(C3618e.license(j2) * f, j2);
        }
        c11447e.appmetrica(j2);
        if (c11447e.metrica != null) {
            c11447e.startapp(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18466e) {
            return C3618e.metrica(this.ad, ((C18466e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.ad);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C3618e.startapp(this.ad)) + ')';
    }

    @Override // defpackage.InterfaceC5606e
    public final Object vip(Object obj, float f) {
        if (obj == null) {
            obj = new C18466e(C3618e.startapp);
        }
        if (!(obj instanceof C18466e)) {
            return null;
        }
        return new C18466e(AbstractC6532e.isVip(this.ad, ((C18466e) obj).ad, f));
    }
}
