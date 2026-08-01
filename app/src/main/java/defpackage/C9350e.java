package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9350e {
    public final int ad;
    public final Integer metrica;
    public final C12344e vip;

    public C9350e(int i, C12344e c12344e, Integer num) {
        this.ad = i;
        this.vip = c12344e;
        this.metrica = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9350e)) {
            return false;
        }
        C9350e c9350e = (C9350e) obj;
        return this.ad == c9350e.ad && AbstractC7890e.billing(this.vip, c9350e.vip) && AbstractC7890e.billing(this.metrica, c9350e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        C12344e c12344e = this.vip;
        int hashCode = (i + (c12344e == null ? 0 : c12344e.hashCode())) * 31;
        Integer num = this.metrica;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.ad + ", sourceInfo=" + this.vip + ", groupOffset=" + this.metrica + ')';
    }
}
