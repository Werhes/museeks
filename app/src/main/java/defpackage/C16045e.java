package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16045e extends AbstractC8589e {
    public final float ad;

    public C16045e(float f) {
        this.ad = f;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return Float.valueOf(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16045e) && Float.compare(this.ad, ((C16045e) obj).ad) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.ad);
    }
}
