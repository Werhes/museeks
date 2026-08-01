package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9079e {
    public final EnumC2880e ad;
    public final int metrica;
    public final int vip;

    public C9079e(EnumC2880e enumC2880e, int i, int i2) {
        this.ad = enumC2880e;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9079e)) {
            return false;
        }
        C9079e c9079e = (C9079e) obj;
        return this.ad == c9079e.ad && this.vip == c9079e.vip && this.metrica == c9079e.metrica;
    }

    public final int hashCode() {
        return (((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.ad + ", horizontalAlignment=" + ((Object) C2782e.vip(this.vip)) + ", verticalAlignment=" + ((Object) C13692e.vip(this.metrica)) + ')';
    }
}
