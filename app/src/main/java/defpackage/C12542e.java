package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٍّ٘;", "Leِٝؓ;", "Leٌؘۘ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٍّ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12542e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C11796e f25123e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC17220e f25124e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15274e f25125e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f25126e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC9470e f25127e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Function0 f25128e;

    public C12542e(EnumC9470e enumC9470e, C15274e c15274e, C13822e c13822e, boolean z, C11796e c11796e, Function0 function0) {
        this.f25127e = enumC9470e;
        this.f25125e = c15274e;
        this.f25124e = c13822e;
        this.f25126e = z;
        this.f25123e = c11796e;
        this.f25128e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12542e.class != obj.getClass()) {
            return false;
        }
        C12542e c12542e = (C12542e) obj;
        return this.f25127e == c12542e.f25127e && AbstractC7890e.billing(this.f25125e, c12542e.f25125e) && AbstractC7890e.billing(this.f25124e, c12542e.f25124e) && this.f25126e == c12542e.f25126e && this.f25123e.equals(c12542e.f25123e) && this.f25128e == c12542e.f25128e;
    }

    public final int hashCode() {
        int hashCode = this.f25127e.hashCode() * 31;
        C15274e c15274e = this.f25125e;
        int hashCode2 = (hashCode + (c15274e != null ? c15274e.hashCode() : 0)) * 31;
        InterfaceC17220e interfaceC17220e = this.f25124e;
        return this.f25128e.hashCode() + ((((((((hashCode2 + (interfaceC17220e != null ? interfaceC17220e.hashCode() : 0)) * 31) + 1237) * 31) + (this.f25126e ? 1231 : 1237)) * 31) + this.f25123e.ad) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؘۘ, eؙؐ٘, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC6102e = new AbstractC6102e(this.f25125e, this.f25124e, false, this.f25126e, null, this.f25123e, this.f25128e);
        abstractC6102e.f12329e = this.f25127e;
        return abstractC6102e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C5853e c5853e = (C5853e) abstractC13616e;
        EnumC9470e enumC9470e = c5853e.f12329e;
        EnumC9470e enumC9470e2 = this.f25127e;
        if (enumC9470e != enumC9470e2) {
            c5853e.f12329e = enumC9470e2;
            AbstractC15118e.appmetrica(c5853e);
        }
        c5853e.m2032e(this.f25125e, this.f25124e, false, this.f25126e, null, this.f25123e, this.f25128e);
    }
}
