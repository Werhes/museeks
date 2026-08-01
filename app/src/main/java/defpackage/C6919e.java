package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6919e extends AbstractC4284e {
    public final float ad;

    public C6919e(float f) {
        this.ad = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6919e) && Float.compare(this.ad, ((C6919e) obj).ad) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }

    public final String toString() {
        return AbstractC17861e.remoteconfig(new StringBuilder("Loading(progress="), this.ad, ')');
    }
}
