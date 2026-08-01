package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4497e {
    public final Integer ad;
    public final Object vip;

    public C4497e(Integer num, Object obj) {
        this.ad = num;
        this.vip = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4497e)) {
            return false;
        }
        C4497e c4497e = (C4497e) obj;
        return this.ad.equals(c4497e.ad) && AbstractC7890e.billing(this.vip, c4497e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        Object obj = this.vip;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.ad + ", right=" + this.vip + ')';
    }
}
