package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٞ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5795e extends AbstractC13722e {
    public final float metrica;

    public C5795e(float f) {
        super(3);
        this.metrica = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5795e) && Float.compare(this.metrica, ((C5795e) obj).metrica) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica);
    }

    public final String toString() {
        return AbstractC17861e.remoteconfig(new StringBuilder("RelativeHorizontalTo(dx="), this.metrica, ')');
    }
}
