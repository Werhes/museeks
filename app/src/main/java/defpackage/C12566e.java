package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12566e {
    public final C12591e ad;

    public C12566e(C12591e c12591e) {
        this.ad = c12591e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12566e) && AbstractC7890e.billing(this.ad, ((C12566e) obj).ad);
    }

    public final int hashCode() {
        C12591e c12591e = this.ad;
        if (c12591e != null) {
            return c12591e.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.ad + ")";
    }
}
