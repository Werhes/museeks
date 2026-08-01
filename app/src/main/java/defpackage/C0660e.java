package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0660e {
    public final float ad;
    public final float vip;

    public C0660e(float f, float f2) {
        this.ad = f;
        this.vip = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0660e)) {
            return false;
        }
        C0660e c0660e = (C0660e) obj;
        return Float.compare(this.ad, c0660e.ad) == 0 && Float.compare(this.vip, c0660e.vip) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip) + (Float.floatToIntBits(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionScrollPadding(start=");
        sb.append(this.ad);
        sb.append(", end=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }
}
