package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15552e {
    public final Object ad;
    public final Object vip;

    public C15552e(Object obj, Object obj2) {
        this.ad = obj;
        this.vip = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15552e)) {
            return false;
        }
        C15552e c15552e = (C15552e) obj;
        return Objects.equals(c15552e.ad, this.ad) && Objects.equals(c15552e.vip, this.vip);
    }

    public final int hashCode() {
        Object obj = this.ad;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.vip;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.ad + " " + this.vip + "}";
    }
}
