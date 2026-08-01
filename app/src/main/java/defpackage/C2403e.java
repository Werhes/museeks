package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2403e implements Comparable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f6138e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6139e;

    public C2403e(int i, int i2) {
        this.f6139e = i;
        this.f6138e = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i2, "Digits must be non-negative, but was ").toString());
        }
    }

    public final int ad(int i) {
        int i2 = this.f6139e;
        int i3 = this.f6138e;
        if (i == i3) {
            return i2;
        }
        int[] iArr = AbstractC12447e.ad;
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2403e c2403e = (C2403e) obj;
        int max = Math.max(this.f6138e, c2403e.f6138e);
        return AbstractC7890e.yandex(ad(max), c2403e.ad(max));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2403e)) {
            return false;
        }
        C2403e c2403e = (C2403e) obj;
        int max = Math.max(this.f6138e, c2403e.f6138e);
        return AbstractC7890e.yandex(ad(max), c2403e.ad(max)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC12447e.ad[this.f6138e];
        int i2 = this.f6139e;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(AbstractC5304e.m1852case(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
