package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12166e implements InterfaceC6641e {
    public final C18010e ad;

    public C12166e(C18010e c18010e) {
        this.ad = c18010e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12166e) && this.ad.equals(((C12166e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "StartPlayback(source=" + this.ad + ')';
    }
}
