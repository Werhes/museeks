package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13459e {
    public final int ad;
    public final int vip;

    public C13459e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13459e)) {
            return false;
        }
        C13459e c13459e = (C13459e) obj;
        return this.ad == c13459e.ad && this.vip == c13459e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        return "VibrancyColor(color=" + this.ad + ", blendMode=" + ((Object) C8738e.billing(this.vip)) + ')';
    }
}
