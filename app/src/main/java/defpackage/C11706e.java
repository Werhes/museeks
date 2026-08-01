package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leِّۨ;", "Leِٝؓ;", "Leؘٖٓ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eِّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11706e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f23537e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function2 f23538e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23539e;

    public C11706e(int i, Function2 function2, Object obj) {
        this.f23539e = i;
        this.f23538e = function2;
        this.f23537e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11706e.class != obj.getClass()) {
            return false;
        }
        C11706e c11706e = (C11706e) obj;
        return this.f23539e == c11706e.f23539e && AbstractC7890e.billing(this.f23537e, c11706e.f23537e);
    }

    public final int hashCode() {
        return this.f23537e.hashCode() + (((AbstractC8703e.m2467class(this.f23539e) * 31) + 1237) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘٖٓ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f12047e = this.f23539e;
        abstractC13616e.f12048e = this.f23538e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C5669e c5669e = (C5669e) abstractC13616e;
        c5669e.f12047e = this.f23539e;
        c5669e.f12048e = this.f23538e;
    }
}
