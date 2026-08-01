package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؘّ;", "Leِٝؓ;", "Leؚۣ٘;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12294e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f24665e;

    public C12294e(Function1 function1) {
        this.f24665e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12294e) {
            return this.f24665e == ((C12294e) obj).f24665e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24665e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚۣ٘, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f14778e = this.f24665e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C7235e) abstractC13616e).f14778e = this.f24665e;
    }
}
