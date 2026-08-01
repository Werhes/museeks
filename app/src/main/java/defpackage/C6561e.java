package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6561e implements InterfaceC11403e {
    public final C6228e ad;

    public C6561e(C6228e c6228e) {
        this.ad = c6228e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6561e) && AbstractC7890e.billing(this.ad, ((C6561e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.ad.hashCode();
    }

    public final String toString() {
        return "Success(dto=" + this.ad + ')';
    }
}
