package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8662e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8662e f17500e = new C8662e(2, 3, 10);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f17501e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f17502e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f17503e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f17504e;

    public C8662e(int i, int i2, int i3) {
        this.f17504e = i;
        this.f17502e = i2;
        this.f17501e = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f17503e = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17503e - ((C8662e) obj).f17503e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C8662e c8662e = obj instanceof C8662e ? (C8662e) obj : null;
        return c8662e != null && this.f17503e == c8662e.f17503e;
    }

    public final int hashCode() {
        return this.f17503e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17504e);
        sb.append('.');
        sb.append(this.f17502e);
        sb.append('.');
        sb.append(this.f17501e);
        return sb.toString();
    }
}
