package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٞٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11885e {
    public final long ad;
    public final C11180e license;
    public final long metrica;
    public final long vip;

    public C11885e() {
        C17647e c17647e = C14157e.f27993e;
        EnumC15934e enumC15934e = EnumC15934e.SECONDS;
        long Signature = AbstractC0326e.Signature(45, enumC15934e);
        long Signature2 = AbstractC0326e.Signature(5, enumC15934e);
        long Signature3 = AbstractC0326e.Signature(5, enumC15934e);
        C11180e c11180e = C16628e.f32606e;
        this.ad = Signature;
        this.vip = Signature2;
        this.metrica = Signature3;
        this.license = c11180e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11885e) {
            C11885e c11885e = (C11885e) obj;
            long j = c11885e.ad;
            C17647e c17647e = C14157e.f27993e;
            if (this.ad == j && this.vip == c11885e.vip && this.metrica == c11885e.metrica && AbstractC7890e.billing(this.license, c11885e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C17647e c17647e = C14157e.f27993e;
        long j = this.ad;
        long j2 = this.vip;
        int i = (((int) (j2 ^ (j2 >>> 32))) + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        long j3 = this.metrica;
        return this.license.hashCode() + ((((int) (j3 ^ (j3 >>> 32))) + i) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) C14157e.startapp(this.ad)) + ", additionalTime=" + ((Object) C14157e.startapp(this.vip)) + ", idleTimeout=" + ((Object) C14157e.startapp(this.metrica)) + ", timeSource=" + this.license + ')';
    }
}
