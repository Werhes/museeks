package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۡٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18065e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f35427e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f35428e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f35429e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2720e f35430e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f35431e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f35432e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f35433e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final long f35434e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f35435e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f35436e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C9284e f35437e;

    public AbstractC18065e(String str, C2720e c2720e, long j, int i, long j2, C9284e c9284e, String str2, String str3, long j3, long j4, boolean z) {
        this.f35435e = str;
        this.f35430e = c2720e;
        this.f35428e = j;
        this.f35433e = i;
        this.f35427e = j2;
        this.f35437e = c9284e;
        this.f35436e = str2;
        this.f35431e = str3;
        this.f35434e = j3;
        this.f35429e = j4;
        this.f35432e = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.f35427e;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
