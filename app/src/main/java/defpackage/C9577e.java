package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9577e implements InterfaceC3886e {
    public final float ad;

    public C9577e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC3886e
    public final int ad(int i, int i2, EnumC7792e enumC7792e) {
        float f = (i2 - i) / 2.0f;
        EnumC7792e enumC7792e2 = EnumC7792e.f15794e;
        float f2 = this.ad;
        if (enumC7792e != enumC7792e2) {
            f2 *= -1;
        }
        return AbstractC8703e.advert(1, f2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9577e) && Float.compare(this.ad, ((C9577e) obj).ad) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return AbstractC17861e.remoteconfig(new StringBuilder("Horizontal(bias="), this.ad, ')');
    }
}
