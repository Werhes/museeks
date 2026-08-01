package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًٟٗ;", "Leِٝؓ;", "Leؖۦؑ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7980e extends AbstractC11865e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C14099e f16163e = new C14099e(7);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f16164e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f16165e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC17426e f16166e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f16167e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C15274e f16168e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC3239e f16169e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Function3 f16170e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Function3 f16171e;

    public C7980e(InterfaceC3239e interfaceC3239e, EnumC17426e enumC17426e, boolean z, C15274e c15274e, boolean z2, C15256e c15256e, Function3 function3, boolean z3) {
        this.f16169e = interfaceC3239e;
        this.f16166e = enumC17426e;
        this.f16165e = z;
        this.f16168e = c15274e;
        this.f16164e = z2;
        this.f16171e = c15256e;
        this.f16170e = function3;
        this.f16167e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7980e.class != obj.getClass()) {
            return false;
        }
        C7980e c7980e = (C7980e) obj;
        return AbstractC7890e.billing(this.f16169e, c7980e.f16169e) && this.f16166e == c7980e.f16166e && this.f16165e == c7980e.f16165e && AbstractC7890e.billing(this.f16168e, c7980e.f16168e) && this.f16164e == c7980e.f16164e && AbstractC7890e.billing(this.f16171e, c7980e.f16171e) && AbstractC7890e.billing(this.f16170e, c7980e.f16170e) && this.f16167e == c7980e.f16167e;
    }

    public final int hashCode() {
        int hashCode = (((this.f16166e.hashCode() + (this.f16169e.hashCode() * 31)) * 31) + (this.f16165e ? 1231 : 1237)) * 31;
        C15274e c15274e = this.f16168e;
        return ((this.f16170e.hashCode() + ((this.f16171e.hashCode() + ((((hashCode + (c15274e != null ? c15274e.hashCode() : 0)) * 31) + (this.f16164e ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f16167e ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘۙۢ, eؖۦؑ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        C14099e c14099e = f16163e;
        boolean z = this.f16165e;
        C15274e c15274e = this.f16168e;
        EnumC17426e enumC17426e = this.f16166e;
        ?? abstractC5881e = new AbstractC5881e(c14099e, z, c15274e, enumC17426e);
        abstractC5881e.f9760e = this.f16169e;
        abstractC5881e.f9762e = enumC17426e;
        abstractC5881e.f9761e = this.f16164e;
        abstractC5881e.f9757e = this.f16171e;
        abstractC5881e.f9758e = this.f16170e;
        abstractC5881e.f9759e = this.f16167e;
        return abstractC5881e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        boolean z;
        boolean z2;
        C4498e c4498e = (C4498e) abstractC13616e;
        InterfaceC3239e interfaceC3239e = c4498e.f9760e;
        InterfaceC3239e interfaceC3239e2 = this.f16169e;
        if (AbstractC7890e.billing(interfaceC3239e, interfaceC3239e2)) {
            z = false;
        } else {
            c4498e.f9760e = interfaceC3239e2;
            z = true;
        }
        EnumC17426e enumC17426e = c4498e.f9762e;
        EnumC17426e enumC17426e2 = this.f16166e;
        if (enumC17426e != enumC17426e2) {
            c4498e.f9762e = enumC17426e2;
            z = true;
        }
        boolean z3 = c4498e.f9759e;
        boolean z4 = this.f16167e;
        if (z3 != z4) {
            c4498e.f9759e = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        c4498e.f9757e = this.f16171e;
        c4498e.f9758e = this.f16170e;
        c4498e.f9761e = this.f16164e;
        c4498e.m1981e(f16163e, this.f16165e, this.f16168e, enumC17426e2, z2);
    }
}
