package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6798e {
    public final Class ad;
    public final C4813e vip;

    public C6798e(Class cls, C4813e c4813e) {
        this.ad = cls;
        this.vip = c4813e;
    }

    public final String ad() {
        return this.ad.getName().replace('.', '/') + ".class";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6798e) {
            return AbstractC7890e.billing(this.ad, ((C6798e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return C6798e.class.getName() + ": " + this.ad;
    }
}
