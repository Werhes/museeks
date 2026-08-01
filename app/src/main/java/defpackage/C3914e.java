package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؘؖؓ;", "Leِٝؓ;", "Leًٛٗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3914e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function2 f8738e;

    public C3914e(Function2 function2) {
        this.f8738e = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3914e) {
            return this.f8738e == ((C3914e) obj).f8738e;
        }
        return false;
    }

    public final int hashCode() {
        Function2 function2 = this.f8738e;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C8050e(this.f8738e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C8050e) abstractC13616e).f16354e = this.f8738e;
    }
}
