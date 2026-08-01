package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14971e {
    public final C10761e ad;

    public C14971e(C10761e c10761e) {
        this.ad = c10761e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14971e) && AbstractC7890e.billing(this.ad, ((C14971e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.ad + ", loaderKey=null)";
    }
}
