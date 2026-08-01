package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le٘ۖٝ;", "Leِٝؓ;", "Leٍّ۠;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e٘ۖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17937e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final float f35180e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f35181e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function0 f35182e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11200e f35183e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f35184e;

    public C17937e(boolean z, Function0 function0, boolean z2, C11200e c11200e, float f) {
        this.f35184e = z;
        this.f35182e = function0;
        this.f35181e = z2;
        this.f35183e = c11200e;
        this.f35180e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17937e)) {
            return false;
        }
        C17937e c17937e = (C17937e) obj;
        return this.f35184e == c17937e.f35184e && this.f35181e == c17937e.f35181e && this.f35182e == c17937e.f35182e && AbstractC7890e.billing(this.f35183e, c17937e.f35183e) && C15765e.vip(this.f35180e, c17937e.f35180e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35180e) + ((this.f35183e.hashCode() + ((this.f35182e.hashCode() + ((((this.f35184e ? 1231 : 1237) * 31) + (this.f35181e ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C9798e(this.f35184e, this.f35182e, this.f35181e, this.f35183e, this.f35180e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C9798e c9798e = (C9798e) abstractC13616e;
        c9798e.f19352e = this.f35182e;
        c9798e.f19355e = this.f35181e;
        c9798e.f19358e = this.f35183e;
        c9798e.f19351e = this.f35180e;
        boolean z = c9798e.f19353e;
        boolean z2 = this.f35184e;
        if (z != z2) {
            c9798e.f19353e = z2;
            AbstractC5336e.purchase(c9798e.m3623e(), null, 0, new C9609e(c9798e, null, 2), 3);
        }
    }
}
