package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۟ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17293e implements InterfaceC7484e {
    public final C17561e ad;

    public C17293e(C17561e c17561e) {
        this.ad = c17561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17293e) && AbstractC7890e.billing(this.ad, ((C17293e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Available(profile=" + this.ad + ')';
    }
}
