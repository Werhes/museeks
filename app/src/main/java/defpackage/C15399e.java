package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15399e implements InterfaceC2869e {
    public final InterfaceC2869e ad;
    public final long vip;

    public C15399e(InterfaceC6512e interfaceC6512e, long j) {
        this.ad = interfaceC6512e;
        this.vip = j;
    }

    @Override // defpackage.InterfaceC2869e
    public final InterfaceC17717e ad(C11139e c11139e) {
        return new C5117e(this.ad.ad(c11139e), this.vip);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15399e)) {
            return false;
        }
        C15399e c15399e = (C15399e) obj;
        return c15399e.vip == this.vip && AbstractC7890e.billing(c15399e.ad, this.ad);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
