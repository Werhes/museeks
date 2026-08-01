package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٖؖٙ;", "Leِٝؓ;", "Leؔٙۙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٖؖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4185e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C11796e f9218e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC17220e f9219e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15274e f9220e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f9221e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f9222e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Function1 f9223e;

    public C4185e(boolean z, C15274e c15274e, C13822e c13822e, boolean z2, C11796e c11796e, Function1 function1) {
        this.f9222e = z;
        this.f9220e = c15274e;
        this.f9219e = c13822e;
        this.f9221e = z2;
        this.f9218e = c11796e;
        this.f9223e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4185e.class != obj.getClass()) {
            return false;
        }
        C4185e c4185e = (C4185e) obj;
        return this.f9222e == c4185e.f9222e && AbstractC7890e.billing(this.f9220e, c4185e.f9220e) && AbstractC7890e.billing(this.f9219e, c4185e.f9219e) && this.f9221e == c4185e.f9221e && AbstractC7890e.billing(this.f9218e, c4185e.f9218e) && this.f9223e == c4185e.f9223e;
    }

    public final int hashCode() {
        int i = (this.f9222e ? 1231 : 1237) * 31;
        C15274e c15274e = this.f9220e;
        int hashCode = (i + (c15274e != null ? c15274e.hashCode() : 0)) * 31;
        InterfaceC17220e interfaceC17220e = this.f9219e;
        int hashCode2 = (((((hashCode + (interfaceC17220e != null ? interfaceC17220e.hashCode() : 0)) * 31) + 1237) * 31) + (this.f9221e ? 1231 : 1237)) * 31;
        C11796e c11796e = this.f9218e;
        return this.f9223e.hashCode() + ((hashCode2 + (c11796e != null ? c11796e.ad : 0)) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C2674e(this.f9222e, this.f9220e, this.f9219e, this.f9221e, this.f9218e, this.f9223e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C2674e c2674e = (C2674e) abstractC13616e;
        boolean z = c2674e.f6548e;
        boolean z2 = this.f9222e;
        if (z != z2) {
            c2674e.f6548e = z2;
            AbstractC15118e.appmetrica(c2674e);
        }
        c2674e.f6550e = this.f9223e;
        c2674e.m2032e(this.f9220e, this.f9219e, false, this.f9221e, null, this.f9218e, c2674e.f6549e);
    }
}
