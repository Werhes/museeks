package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٓۜۘ;", "Leِٝؓ;", "Leِؕؔ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٓۜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14252e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f28174e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC2141e f28175e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Function1 f28176e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1839e f28177e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f28178e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C2752e f28179e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function1 f28180e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final List f28181e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10566e f28182e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f28183e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f28184e;

    public C14252e(C10566e c10566e, C1839e c1839e, InterfaceC2141e interfaceC2141e, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, C2752e c2752e) {
        this.f28182e = c10566e;
        this.f28177e = c1839e;
        this.f28175e = interfaceC2141e;
        this.f28180e = function1;
        this.f28174e = i;
        this.f28184e = z;
        this.f28183e = i2;
        this.f28178e = i3;
        this.f28181e = list;
        this.f28176e = function12;
        this.f28179e = c2752e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14252e)) {
            return false;
        }
        C14252e c14252e = (C14252e) obj;
        return AbstractC7890e.billing(this.f28182e, c14252e.f28182e) && AbstractC7890e.billing(this.f28177e, c14252e.f28177e) && AbstractC7890e.billing(this.f28181e, c14252e.f28181e) && AbstractC7890e.billing(this.f28175e, c14252e.f28175e) && this.f28180e == c14252e.f28180e && this.f28174e == c14252e.f28174e && this.f28184e == c14252e.f28184e && this.f28183e == c14252e.f28183e && this.f28178e == c14252e.f28178e && this.f28176e == c14252e.f28176e && AbstractC7890e.billing(this.f28179e, c14252e.f28179e);
    }

    public final int hashCode() {
        int hashCode = (this.f28175e.hashCode() + AbstractC1786e.smaato(this.f28177e, this.f28182e.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.f28180e;
        int hashCode2 = (((((((((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.f28174e) * 31) + (this.f28184e ? 1231 : 1237)) * 31) + this.f28183e) * 31) + this.f28178e) * 31;
        List list = this.f28181e;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.f28176e;
        int hashCode4 = (hashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        C2752e c2752e = this.f28179e;
        return (hashCode4 + (c2752e != null ? c2752e.hashCode() : 0)) * 961;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C11504e(this.f28182e, this.f28177e, this.f28175e, this.f28180e, this.f28174e, this.f28184e, this.f28183e, this.f28178e, this.f28181e, this.f28176e, this.f28179e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        boolean z;
        C11504e c11504e = (C11504e) abstractC13616e;
        C6284e c6284e = c11504e.f23112e;
        C1839e c1839e = c6284e.f13101e;
        C1839e c1839e2 = this.f28177e;
        if (c1839e2 == c1839e) {
            c1839e2.getClass();
        } else if (!c1839e2.ad.vip(c1839e.ad)) {
            z = true;
            boolean m2148e = c6284e.m2148e(this.f28182e);
            boolean m2146e = c11504e.f23112e.m2146e(c1839e2, this.f28181e, this.f28178e, this.f28183e, this.f28184e, this.f28175e, this.f28174e);
            Function1 function1 = this.f28180e;
            Function1 function12 = this.f28176e;
            C2752e c2752e = this.f28179e;
            c6284e.m2149e(z, m2148e, m2146e, c6284e.m2150e(function1, function12, c2752e, null));
            c11504e.f23113e = c2752e;
            AbstractC1599e.purchase(c11504e);
        }
        z = false;
        boolean m2148e2 = c6284e.m2148e(this.f28182e);
        boolean m2146e2 = c11504e.f23112e.m2146e(c1839e2, this.f28181e, this.f28178e, this.f28183e, this.f28184e, this.f28175e, this.f28174e);
        Function1 function13 = this.f28180e;
        Function1 function122 = this.f28176e;
        C2752e c2752e2 = this.f28179e;
        c6284e.m2149e(z, m2148e2, m2146e2, c6284e.m2150e(function13, function122, c2752e2, null));
        c11504e.f23113e = c2752e2;
        AbstractC1599e.purchase(c11504e);
    }
}
