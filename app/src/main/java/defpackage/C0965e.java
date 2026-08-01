package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965e {
    public final C4521e ad;
    public final C15803e vip;

    public C0965e() {
        this(null, new C15803e());
    }

    public C0965e(C4521e c4521e, C15803e c15803e) {
        this.ad = c4521e;
        this.vip = c15803e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0965e)) {
            return false;
        }
        C0965e c0965e = (C0965e) obj;
        return AbstractC7890e.billing(this.vip, c0965e.vip) && AbstractC7890e.billing(this.ad, c0965e.ad);
    }

    public final int hashCode() {
        C4521e c4521e = this.ad;
        int hashCode = (c4521e != null ? c4521e.hashCode() : 0) * 31;
        C15803e c15803e = this.vip;
        return hashCode + (c15803e != null ? c15803e.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.ad + ", paragraphSyle=" + this.vip + ')';
    }
}
