package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٍؓؓ;", "Leِٝؓ;", "Leُؔٚ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٍؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9206e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C11796e f18388e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC17220e f18389e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15274e f18390e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f18391e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f18392e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Function0 f18393e;

    public C9206e(boolean z, C15274e c15274e, InterfaceC17220e interfaceC17220e, boolean z2, C11796e c11796e, Function0 function0) {
        this.f18392e = z;
        this.f18390e = c15274e;
        this.f18389e = interfaceC17220e;
        this.f18391e = z2;
        this.f18388e = c11796e;
        this.f18393e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9206e.class != obj.getClass()) {
            return false;
        }
        C9206e c9206e = (C9206e) obj;
        return this.f18392e == c9206e.f18392e && AbstractC7890e.billing(this.f18390e, c9206e.f18390e) && AbstractC7890e.billing(this.f18389e, c9206e.f18389e) && this.f18391e == c9206e.f18391e && AbstractC7890e.billing(this.f18388e, c9206e.f18388e) && this.f18393e == c9206e.f18393e;
    }

    public final int hashCode() {
        int i = (this.f18392e ? 1231 : 1237) * 31;
        C15274e c15274e = this.f18390e;
        int hashCode = (i + (c15274e != null ? c15274e.hashCode() : 0)) * 31;
        InterfaceC17220e interfaceC17220e = this.f18389e;
        int hashCode2 = (((((hashCode + (interfaceC17220e != null ? interfaceC17220e.hashCode() : 0)) * 31) + 1237) * 31) + (this.f18391e ? 1231 : 1237)) * 31;
        C11796e c11796e = this.f18388e;
        return this.f18393e.hashCode() + ((hashCode2 + (c11796e != null ? c11796e.ad : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؐ٘, eْۤۡ, eُؔٚ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC6102e = new AbstractC6102e(this.f18390e, this.f18389e, false, this.f18391e, null, this.f18388e, this.f18393e);
        abstractC6102e.f6347e = this.f18392e;
        return abstractC6102e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C2500e c2500e = (C2500e) abstractC13616e;
        boolean z = c2500e.f6347e;
        boolean z2 = this.f18392e;
        if (z != z2) {
            c2500e.f6347e = z2;
            AbstractC15118e.appmetrica(c2500e);
        }
        c2500e.m2032e(this.f18390e, this.f18389e, false, this.f18391e, null, this.f18388e, this.f18393e);
    }
}
