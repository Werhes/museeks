package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٍّؒ;", "Leِٝؓ;", "Leؔٗٗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٍّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
final class C9423e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function0 f18760e;

    public C9423e(Function0 function0) {
        this.f18760e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9423e) {
            return this.f18760e == ((C9423e) obj).f18760e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18760e.hashCode();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C2629e(this.f18760e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C2629e) abstractC13616e).f6493e = this.f18760e;
    }
}
