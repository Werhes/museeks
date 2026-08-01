package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15668e {
    public final C6571e ad;

    public /* synthetic */ C15668e(C6571e c6571e) {
        this.ad = c6571e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15668e) {
            return AbstractC7890e.billing(this.ad, ((C15668e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "StartHolder(packed=" + this.ad + ')';
    }
}
