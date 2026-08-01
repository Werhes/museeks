package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8215e {
    public final C0520e ad;
    public final C17070e vip;

    public C8215e(C0520e c0520e, C17070e c17070e) {
        this.ad = c0520e;
        this.vip = c17070e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8215e) {
            return AbstractC7890e.billing(this.ad, ((C8215e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
