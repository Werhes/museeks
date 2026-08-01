package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9400e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f18714e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f18715e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f18716e;

    static {
        new C9400e(C16308e.billing.ad);
        new C9400e(C16308e.yandex.ad);
    }

    public C9400e(int i, int i2, int i3) {
        this.f18716e = i;
        this.f18715e = i2;
        this.f18714e = i3;
        if (i < 0) {
            throw new IllegalArgumentException("Major version should be not less than 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Minor version should be not less than 0");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Patch version should be not less than 0");
        }
    }

    public C9400e(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
    }

    @Override // java.lang.Comparable
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9400e c9400e) {
        int yandex = AbstractC7890e.yandex(this.f18716e, c9400e.f18716e);
        if (yandex != 0) {
            return yandex;
        }
        int yandex2 = AbstractC7890e.yandex(this.f18715e, c9400e.f18715e);
        return yandex2 != 0 ? yandex2 : AbstractC7890e.yandex(this.f18714e, c9400e.f18714e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9400e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9400e c9400e = (C9400e) obj;
        return this.f18716e == c9400e.f18716e && this.f18715e == c9400e.f18715e && this.f18714e == c9400e.f18714e;
    }

    public final int hashCode() {
        return (((this.f18716e * 31) + this.f18715e) * 31) + this.f18714e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18716e);
        sb.append('.');
        sb.append(this.f18715e);
        sb.append('.');
        sb.append(this.f18714e);
        return sb.toString();
    }
}
