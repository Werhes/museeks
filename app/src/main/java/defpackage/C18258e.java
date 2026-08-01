package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٞٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18258e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f35710e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f35711e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f35712e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f35713e;

    public C18258e(int i, int i2, String str, String str2) {
        this.f35713e = i;
        this.f35711e = i2;
        this.f35710e = str;
        this.f35712e = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18258e c18258e = (C18258e) obj;
        int i = this.f35713e - c18258e.f35713e;
        return i == 0 ? this.f35711e - c18258e.f35711e : i;
    }
}
