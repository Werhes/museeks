package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17476e implements Comparable<C17476e> {
    public static final C15471e Companion = new Object();

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final InterfaceC3477e[] f34224e = {null, null, null, AbstractC18039e.appmetrica(2, new C13564e(1)), null, null, AbstractC18039e.appmetrica(2, new C13564e(2)), null, null};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f34225e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f34226e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f34227e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f34228e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC18164e f34229e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f34230e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f34231e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final EnumC15009e f34232e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f34233e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٕٔ۟] */
    static {
        AbstractC0187e.vip(0L);
    }

    public /* synthetic */ C17476e(int i, int i2, int i3, int i4, EnumC18164e enumC18164e, int i5, int i6, EnumC15009e enumC15009e, int i7, long j) {
        if (511 != (i & 511)) {
            AbstractC5756e.billing(i, 511, C0795e.ad.appmetrica());
            throw null;
        }
        this.f34231e = i2;
        this.f34227e = i3;
        this.f34226e = i4;
        this.f34229e = enumC18164e;
        this.f34225e = i5;
        this.f34233e = i6;
        this.f34232e = enumC15009e;
        this.f34228e = i7;
        this.f34230e = j;
    }

    public C17476e(int i, int i2, int i3, EnumC18164e enumC18164e, int i4, int i5, EnumC15009e enumC15009e, int i6, long j) {
        this.f34231e = i;
        this.f34227e = i2;
        this.f34226e = i3;
        this.f34229e = enumC18164e;
        this.f34225e = i4;
        this.f34233e = i5;
        this.f34232e = enumC15009e;
        this.f34228e = i6;
        this.f34230e = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C17476e c17476e) {
        return AbstractC7890e.startapp(this.f34230e, c17476e.f34230e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17476e)) {
            return false;
        }
        C17476e c17476e = (C17476e) obj;
        return this.f34231e == c17476e.f34231e && this.f34227e == c17476e.f34227e && this.f34226e == c17476e.f34226e && this.f34229e == c17476e.f34229e && this.f34225e == c17476e.f34225e && this.f34233e == c17476e.f34233e && this.f34232e == c17476e.f34232e && this.f34228e == c17476e.f34228e && this.f34230e == c17476e.f34230e;
    }

    public final int hashCode() {
        int hashCode = (((this.f34232e.hashCode() + ((((((this.f34229e.hashCode() + (((((this.f34231e * 31) + this.f34227e) * 31) + this.f34226e) * 31)) * 31) + this.f34225e) * 31) + this.f34233e) * 31)) * 31) + this.f34228e) * 31;
        long j = this.f34230e;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.f34231e);
        sb.append(", minutes=");
        sb.append(this.f34227e);
        sb.append(", hours=");
        sb.append(this.f34226e);
        sb.append(", dayOfWeek=");
        sb.append(this.f34229e);
        sb.append(", dayOfMonth=");
        sb.append(this.f34225e);
        sb.append(", dayOfYear=");
        sb.append(this.f34233e);
        sb.append(", month=");
        sb.append(this.f34232e);
        sb.append(", year=");
        sb.append(this.f34228e);
        sb.append(", timestamp=");
        return AbstractC10257e.mopub(sb, this.f34230e, ')');
    }
}
