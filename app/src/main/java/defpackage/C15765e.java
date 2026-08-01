package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15765e implements Comparable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f31051e;

    public static int ad(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static String metrica(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean vip(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ad(this.f31051e, ((C15765e) obj).f31051e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15765e) {
            return Float.compare(this.f31051e, ((C15765e) obj).f31051e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f31051e);
    }

    public final String toString() {
        return metrica(this.f31051e);
    }
}
