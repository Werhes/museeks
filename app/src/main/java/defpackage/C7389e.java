package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7389e {
    public static final C7389e vip = new C7389e();
    public final C12591e ad;

    public C7389e() {
        this.ad = null;
    }

    public C7389e(C12591e c12591e) {
        this.ad = c12591e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7389e) {
            return AbstractC7890e.billing(this.ad, ((C7389e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        C12591e c12591e = this.ad;
        if (c12591e != null) {
            return c12591e.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.ad + ")";
    }
}
