package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8547e implements InterfaceC8998e {
    public final float ad;

    public C8547e(float f) {
        this.ad = f;
    }

    @Override // defpackage.InterfaceC8998e
    public final float ad(float f) {
        return f / this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8547e) && Float.compare(this.ad, ((C8547e) obj).ad) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return AbstractC17861e.remoteconfig(new StringBuilder("LinearFontScaleConverter(fontScale="), this.ad, ')');
    }

    @Override // defpackage.InterfaceC8998e
    public final float vip(float f) {
        return f * this.ad;
    }
}
