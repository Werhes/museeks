package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11727e extends AbstractC6437e {
    public final int ad;

    public C11727e(int i) {
        this.ad = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11727e) && this.ad == ((C11727e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("TypeParameter(id="), this.ad, ')');
    }
}
