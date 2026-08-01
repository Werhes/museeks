package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17013e implements CharSequence {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C12347e f33321e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CharSequence f33322e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final List f33323e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f33324e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f33325e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C6571e f33326e;

    public C17013e(CharSequence charSequence, long j, C12347e c12347e, C6571e c6571e, List list, List list2, int i) {
        c12347e = (i & 4) != 0 ? null : c12347e;
        c6571e = (i & 8) != 0 ? null : c6571e;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        this.f33325e = list;
        this.f33323e = list2;
        this.f33322e = charSequence instanceof C17013e ? ((C17013e) charSequence).f33322e : charSequence;
        this.f33324e = AbstractC9262e.license(charSequence.length(), j);
        this.f33321e = c12347e != null ? new C12347e(AbstractC9262e.license(charSequence.length(), c12347e.ad)) : null;
        this.f33326e = c6571e != null ? new C6571e(c6571e.f13544e, new C12347e(AbstractC9262e.license(charSequence.length(), ((C12347e) c6571e.f13543e).ad))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f33322e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17013e.class != obj.getClass()) {
            return false;
        }
        C17013e c17013e = (C17013e) obj;
        if (C12347e.metrica(this.f33324e, c17013e.f33324e) && AbstractC7890e.billing(this.f33321e, c17013e.f33321e) && AbstractC7890e.billing(this.f33326e, c17013e.f33326e) && AbstractC7890e.billing(this.f33325e, c17013e.f33325e)) {
            return AbstractC6507e.adcel(this.f33322e, c17013e.f33322e);
        }
        return false;
    }

    public final int hashCode() {
        int startapp = (C12347e.startapp(this.f33324e) + (this.f33322e.hashCode() * 31)) * 31;
        C12347e c12347e = this.f33321e;
        int startapp2 = (startapp + (c12347e != null ? C12347e.startapp(c12347e.ad) : 0)) * 31;
        C6571e c6571e = this.f33326e;
        int hashCode = (startapp2 + (c6571e != null ? c6571e.hashCode() : 0)) * 31;
        List list = this.f33325e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f33322e.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f33322e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f33322e.toString();
    }
}
