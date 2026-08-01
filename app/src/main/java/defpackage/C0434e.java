package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Leؑٝؐ;", "Leِٝؓ;", "Leؗۦۤ;", "Leُۖؖ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؑٝؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434e extends AbstractC11865e implements InterfaceC11183e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f2483e;

    public C0434e(Function1 function1) {
        this.f2483e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0434e) {
            return this.f2483e == ((C0434e) obj).f2483e;
        }
        return false;
    }

    @Override // defpackage.InterfaceC11183e
    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final C0500e mo346e() {
        C0500e c0500e = new C0500e();
        c0500e.f2575e = false;
        c0500e.f2577e = true;
        this.f2483e.invoke(c0500e);
        return c0500e;
    }

    public final int hashCode() {
        return this.f2483e.hashCode();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C5293e(false, true, this.f2483e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C5293e) abstractC13616e).f11382e = this.f2483e;
    }
}
