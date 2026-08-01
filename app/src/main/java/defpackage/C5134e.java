package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5134e implements InterfaceC4977e {
    public final Throwable ad;

    public C5134e(Throwable th) {
        this.ad = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5134e) && AbstractC7890e.billing(this.ad, ((C5134e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "NetworkError(exception=" + this.ad + ')';
    }
}
