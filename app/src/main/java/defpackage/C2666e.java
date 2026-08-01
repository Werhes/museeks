package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2666e {
    public final int ad;
    public final boolean vip;
    public static final C2666e metrica = new C2666e(2, false);
    public static final C2666e license = new C2666e(1, true);

    public C2666e(int i, boolean z) {
        this.ad = i;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2666e)) {
            return false;
        }
        C2666e c2666e = (C2666e) obj;
        return this.ad == c2666e.ad && this.vip == c2666e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + (this.vip ? 1231 : 1237);
    }

    public final String toString() {
        return equals(metrica) ? "TextMotion.Static" : equals(license) ? "TextMotion.Animated" : "Invalid";
    }
}
