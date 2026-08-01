package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7140e implements InterfaceC17282e, Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f14615e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f14616e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Class f14617e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f14618e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f14619e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f14620e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f14621e;

    public C7140e(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f14619e = obj;
        this.f14617e = cls;
        this.f14616e = str;
        this.f14618e = str2;
        this.f14615e = (i2 & 1) == 1;
        this.f14621e = i;
        this.f14620e = i2 >> 1;
    }

    public C7140e(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, C11625e.f23330e, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7140e)) {
            return false;
        }
        C7140e c7140e = (C7140e) obj;
        return this.f14615e == c7140e.f14615e && this.f14621e == c7140e.f14621e && this.f14620e == c7140e.f14620e && AbstractC7890e.billing(this.f14619e, c7140e.f14619e) && AbstractC7890e.billing(this.f14617e, c7140e.f14617e) && this.f14616e.equals(c7140e.f14616e) && this.f14618e.equals(c7140e.f14618e);
    }

    @Override // defpackage.InterfaceC17282e
    public final int getArity() {
        return this.f14621e;
    }

    public final int hashCode() {
        Object obj = this.f14619e;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f14617e;
        return ((((AbstractC1786e.advert(AbstractC1786e.advert((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.f14616e), 31, this.f14618e) + (this.f14615e ? 1231 : 1237)) * 31) + this.f14621e) * 31) + this.f14620e;
    }

    public final String toString() {
        return AbstractC3820e.ad.adcel(this);
    }
}
