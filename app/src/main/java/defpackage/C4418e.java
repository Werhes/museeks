package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4418e {
    public final Object ad;

    public /* synthetic */ C4418e(Object obj) {
        this.ad = obj;
    }

    public static final boolean ad(Object obj) {
        return ((obj instanceof C3110e) || obj == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4418e) {
            return AbstractC7890e.billing(this.ad, ((C4418e) obj).ad);
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
        return "OutputResult(result=" + this.ad + ')';
    }
}
