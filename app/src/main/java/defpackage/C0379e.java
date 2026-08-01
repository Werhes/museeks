package defpackage;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٜؑٙ;", "Leِٝؓ;", "Leِِٗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٜؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC15277e f2422e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f2423e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f2424e;

    public C0379e(Function1 function1, Function1 function12, InterfaceC15277e interfaceC15277e) {
        this.f2424e = function1;
        this.f2423e = function12;
        this.f2422e = interfaceC15277e;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        int i = (int) 9205357638345293824L;
        return this.f2422e.hashCode() + ((this.f2423e.hashCode() + ((((Float.floatToIntBits(Float.NaN) + AbstractC1414e.license((i + ((((Float.floatToIntBits(Float.NaN) + (this.f2424e.hashCode() * 961)) * 31) + 1231) * 31)) * 31, Float.NaN, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C16948e(this.f2424e, this.f2423e, this.f2422e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C16948e c16948e = (C16948e) abstractC13616e;
        float f = c16948e.f33190e;
        long j = c16948e.f33200e;
        float f2 = c16948e.f33203e;
        boolean z = c16948e.f33188e;
        float f3 = c16948e.f33187e;
        boolean z2 = c16948e.f33197e;
        InterfaceC15277e interfaceC15277e = c16948e.f33201e;
        View view = c16948e.f33202e;
        InterfaceC14388e interfaceC14388e = c16948e.f33196e;
        c16948e.f33191e = this.f2424e;
        c16948e.f33190e = Float.NaN;
        c16948e.f33188e = true;
        c16948e.f33200e = 9205357640488583168L;
        c16948e.f33203e = Float.NaN;
        c16948e.f33187e = Float.NaN;
        c16948e.f33197e = true;
        c16948e.f33192e = this.f2423e;
        InterfaceC15277e interfaceC15277e2 = this.f2422e;
        c16948e.f33201e = interfaceC15277e2;
        View crashlytics = AbstractC13482e.crashlytics(c16948e);
        InterfaceC14388e interfaceC14388e2 = AbstractC5851e.mopub(c16948e).f27604e;
        if (c16948e.f33194e != null) {
            C16591e c16591e = AbstractC4046e.ad;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !interfaceC15277e2.ad()) || 9205357640488583168L != j || !C15765e.vip(Float.NaN, f2) || !C15765e.vip(Float.NaN, f3) || true != z || true != z2 || !interfaceC15277e2.equals(interfaceC15277e) || !crashlytics.equals(view) || !AbstractC7890e.billing(interfaceC14388e2, interfaceC14388e)) {
                c16948e.m4231e();
            }
        }
        c16948e.m4232e();
    }
}
