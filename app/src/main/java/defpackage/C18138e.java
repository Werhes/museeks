package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Le٘ۦَ;", "Leِٝؓ;", "Leؗۦۤ;", "Leُۖؖ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: e٘ۦَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18138e extends AbstractC11865e implements InterfaceC11183e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f35551e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f35552e;

    public C18138e(Function1 function1, boolean z) {
        this.f35552e = z;
        this.f35551e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18138e)) {
            return false;
        }
        C18138e c18138e = (C18138e) obj;
        return this.f35552e == c18138e.f35552e && this.f35551e == c18138e.f35551e;
    }

    @Override // defpackage.InterfaceC11183e
    /* renamed from: eِؗؓ */
    public final C0500e mo346e() {
        C0500e c0500e = new C0500e();
        c0500e.f2575e = this.f35552e;
        this.f35551e.invoke(c0500e);
        return c0500e;
    }

    public final int hashCode() {
        return this.f35551e.hashCode() + ((this.f35552e ? 1231 : 1237) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C5293e(this.f35552e, false, this.f35551e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C5293e c5293e = (C5293e) abstractC13616e;
        c5293e.f11383e = this.f35552e;
        c5293e.f11382e = this.f35551e;
    }
}
