package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4093e implements InterfaceC9499e {
    public final int ad;

    public C4093e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4093e) && this.ad == ((C4093e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("Present(size="), this.ad, ')');
    }
}
