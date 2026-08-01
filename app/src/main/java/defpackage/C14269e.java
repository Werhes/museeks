package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٓ۟ۚ;", "Leِٝؓ;", "Leًْۤ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٓ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14269e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Function0 f28205e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f28206e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC17220e f28207e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f28208e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15274e f28209e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Function0 f28210e;

    public C14269e(InterfaceC17220e interfaceC17220e, C15274e c15274e, Function0 function0, Function0 function02, boolean z, boolean z2) {
        this.f28209e = c15274e;
        this.f28207e = interfaceC17220e;
        this.f28206e = z;
        this.f28208e = z2;
        this.f28205e = function0;
        this.f28210e = function02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14269e.class != obj.getClass()) {
            return false;
        }
        C14269e c14269e = (C14269e) obj;
        return AbstractC7890e.billing(this.f28209e, c14269e.f28209e) && AbstractC7890e.billing(this.f28207e, c14269e.f28207e) && this.f28206e == c14269e.f28206e && this.f28208e == c14269e.f28208e && this.f28205e == c14269e.f28205e && this.f28210e == c14269e.f28210e;
    }

    public final int hashCode() {
        C15274e c15274e = this.f28209e;
        int hashCode = (c15274e != null ? c15274e.hashCode() : 0) * 31;
        InterfaceC17220e interfaceC17220e = this.f28207e;
        int hashCode2 = (this.f28205e.hashCode() + ((((((hashCode + (interfaceC17220e != null ? interfaceC17220e.hashCode() : 0)) * 31) + (this.f28206e ? 1231 : 1237)) * 31) + (this.f28208e ? 1231 : 1237)) * 29791)) * 961;
        Function0 function0 = this.f28210e;
        return ((hashCode2 + (function0 != null ? function0.hashCode() : 0)) * 961) + 1231;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C13136e(this.f28207e, this.f28209e, this.f28205e, this.f28210e, this.f28206e, this.f28208e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        boolean z;
        C13136e c13136e = (C13136e) abstractC13616e;
        c13136e.f26096e = true;
        boolean z2 = c13136e.f26111e == null;
        Function0 function0 = this.f28210e;
        if (z2 != (function0 == null)) {
            c13136e.m2025e();
            AbstractC15118e.appmetrica(c13136e);
            z = true;
        } else {
            z = false;
        }
        c13136e.f26111e = function0;
        boolean z3 = c13136e.f12798e;
        boolean z4 = this.f28208e;
        boolean z5 = z3 != z4 ? true : z;
        c13136e.m2032e(this.f28209e, this.f28207e, this.f28206e, z4, null, null, this.f28205e);
        if (z5) {
            c13136e.m3531e(false);
            c13136e.m3531e(true);
        }
    }
}
