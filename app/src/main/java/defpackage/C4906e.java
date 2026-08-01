package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4906e implements InterfaceC3886e {
    public final float ad;

    public C4906e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC3886e
    public final int ad(int i, int i2, EnumC7792e enumC7792e) {
        return AbstractC8703e.advert(1, this.ad, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4906e) && Float.compare(this.ad, ((C4906e) obj).ad) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return AbstractC17861e.remoteconfig(new StringBuilder("Horizontal(bias="), this.ad, ')');
    }
}
