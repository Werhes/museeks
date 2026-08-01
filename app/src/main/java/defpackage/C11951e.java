package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11951e {
    public final String ad;

    public C11951e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11951e)) {
            return false;
        }
        return AbstractC7890e.billing(this.ad, ((C11951e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad;
    }
}
