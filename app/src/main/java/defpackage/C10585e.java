package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leََۡ;", "Leِٝؓ;", "Leٌؙۡ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eََۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10585e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f20888e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC2141e f20889e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Function1 f20890e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1839e f20891e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f20892e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final Function1 f20893e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function1 f20894e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final List f20895e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10566e f20896e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f20897e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f20898e;

    public C10585e(C10566e c10566e, C1839e c1839e, InterfaceC2141e interfaceC2141e, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, Function1 function13) {
        this.f20896e = c10566e;
        this.f20891e = c1839e;
        this.f20889e = interfaceC2141e;
        this.f20894e = function1;
        this.f20888e = i;
        this.f20898e = z;
        this.f20897e = i2;
        this.f20892e = i3;
        this.f20895e = list;
        this.f20890e = function12;
        this.f20893e = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10585e)) {
            return false;
        }
        C10585e c10585e = (C10585e) obj;
        return AbstractC7890e.billing(this.f20896e, c10585e.f20896e) && AbstractC7890e.billing(this.f20891e, c10585e.f20891e) && AbstractC7890e.billing(this.f20895e, c10585e.f20895e) && AbstractC7890e.billing(this.f20889e, c10585e.f20889e) && this.f20894e == c10585e.f20894e && this.f20893e == c10585e.f20893e && this.f20888e == c10585e.f20888e && this.f20898e == c10585e.f20898e && this.f20897e == c10585e.f20897e && this.f20892e == c10585e.f20892e && this.f20890e == c10585e.f20890e;
    }

    public final int hashCode() {
        int hashCode = (this.f20889e.hashCode() + AbstractC1786e.smaato(this.f20891e, this.f20896e.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.f20894e;
        int hashCode2 = (((((((((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.f20888e) * 31) + (this.f20898e ? 1231 : 1237)) * 31) + this.f20897e) * 31) + this.f20892e) * 31;
        List list = this.f20895e;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.f20890e;
        int hashCode4 = (hashCode3 + (function12 != null ? function12.hashCode() : 0)) * 29791;
        Function1 function13 = this.f20893e;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C6284e(this.f20896e, this.f20891e, this.f20889e, this.f20894e, this.f20888e, this.f20898e, this.f20897e, this.f20892e, this.f20895e, this.f20890e, null, this.f20893e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        boolean z;
        C6284e c6284e = (C6284e) abstractC13616e;
        C1839e c1839e = c6284e.f13101e;
        C1839e c1839e2 = this.f20891e;
        if (c1839e2 == c1839e) {
            c1839e2.getClass();
        } else if (!c1839e2.ad.vip(c1839e.ad)) {
            z = true;
            c6284e.m2149e(z, c6284e.m2148e(this.f20896e), c6284e.m2146e(this.f20891e, this.f20895e, this.f20892e, this.f20897e, this.f20898e, this.f20889e, this.f20888e), c6284e.m2150e(this.f20894e, this.f20890e, null, this.f20893e));
        }
        z = false;
        c6284e.m2149e(z, c6284e.m2148e(this.f20896e), c6284e.m2146e(this.f20891e, this.f20895e, this.f20892e, this.f20897e, this.f20898e, this.f20889e, this.f20888e), c6284e.m2150e(this.f20894e, this.f20890e, null, this.f20893e));
    }
}
