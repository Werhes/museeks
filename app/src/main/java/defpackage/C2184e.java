package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٍۣؓ;", "Leِٝؓ;", "Leؚۧۢ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٍۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2184e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f5548e;

    public C2184e(Function1 function1) {
        this.f5548e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2184e) && ((C2184e) obj).f5548e == this.f5548e;
    }

    public final int hashCode() {
        return this.f5548e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؔؗ, eؚۧۢ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC5397e = new AbstractC5397e();
        abstractC5397e.f15496e = this.f5548e;
        return abstractC5397e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C7621e c7621e = (C7621e) abstractC13616e;
        Function1 function1 = c7621e.f15496e;
        Function1 function12 = this.f5548e;
        if (function12 != function1) {
            c7621e.f15496e = function12;
        }
    }
}
