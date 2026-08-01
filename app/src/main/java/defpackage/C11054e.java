package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11054e implements InterfaceC2029e, InterfaceC5374e {
    public Integer ad;
    public Integer vip;

    public C11054e(Integer num, Integer num2) {
        this.ad = num;
        this.vip = num2;
    }

    @Override // defpackage.InterfaceC5374e
    public final Object ad() {
        return new C11054e(this.ad, this.vip);
    }

    @Override // defpackage.InterfaceC2029e
    public final void adcel(Integer num) {
        this.ad = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11054e)) {
            return false;
        }
        C11054e c11054e = (C11054e) obj;
        return AbstractC7890e.billing(this.ad, c11054e.ad) && AbstractC7890e.billing(this.vip, c11054e.vip);
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.vip;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.InterfaceC2029e
    public final void metrica(Integer num) {
        this.vip = num;
    }

    @Override // defpackage.InterfaceC2029e
    public final Integer mopub() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC2029e
    public final Integer purchase() {
        return this.ad;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.ad;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.vip;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
