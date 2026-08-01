package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٖؔؒ;", "Leِٝؓ;", "Leؚّٟ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٖؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2612e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final EnumC17426e f6467e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC5495e f6468e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f6469e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function0 f6470e;

    public C2612e(Function0 function0, InterfaceC5495e interfaceC5495e, EnumC17426e enumC17426e, boolean z) {
        this.f6470e = function0;
        this.f6468e = interfaceC5495e;
        this.f6467e = enumC17426e;
        this.f6469e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2612e)) {
            return false;
        }
        C2612e c2612e = (C2612e) obj;
        return this.f6470e == c2612e.f6470e && AbstractC7890e.billing(this.f6468e, c2612e.f6468e) && this.f6467e == c2612e.f6467e && this.f6469e == c2612e.f6469e;
    }

    public final int hashCode() {
        return ((((this.f6467e.hashCode() + ((this.f6468e.hashCode() + (this.f6470e.hashCode() * 31)) * 31)) * 31) + (this.f6469e ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C7344e(this.f6470e, this.f6468e, this.f6467e, this.f6469e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C7344e c7344e = (C7344e) abstractC13616e;
        c7344e.f15066e = this.f6470e;
        c7344e.f15067e = this.f6468e;
        EnumC17426e enumC17426e = c7344e.f15065e;
        EnumC17426e enumC17426e2 = this.f6467e;
        if (enumC17426e != enumC17426e2) {
            c7344e.f15065e = enumC17426e2;
            AbstractC15118e.appmetrica(c7344e);
        }
        boolean z = c7344e.f15064e;
        boolean z2 = this.f6469e;
        if (z == z2) {
            return;
        }
        c7344e.f15064e = z2;
        c7344e.m2290e();
        AbstractC15118e.appmetrica(c7344e);
    }
}
