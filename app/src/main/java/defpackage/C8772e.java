package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8772e {
    public final Object ad;

    public /* synthetic */ C8772e(Object obj) {
        this.ad = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8772e) {
            return AbstractC7890e.billing(this.ad, ((C8772e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.ad;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.ad + ')';
    }
}
