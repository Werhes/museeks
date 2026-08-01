package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؘّٕ;", "Leِٝؓ;", "Leؙۥؚ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5600e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f11955e;

    public C5600e(Function1 function1) {
        this.f11955e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5600e) {
            return this.f11955e == ((C5600e) obj).f11955e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11955e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍۧٛ, eؙۥؚ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? c9924e = new C9924e(AbstractC15842e.metrica);
        c9924e.f13975e = this.f11955e;
        return c9924e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C6775e c6775e = (C6775e) abstractC13616e;
        Function1 function1 = c6775e.f13975e;
        Function1 function12 = this.f11955e;
        if (function1 != function12) {
            c6775e.f13975e = function12;
            C8845e c8845e = c6775e.f13976e;
            if (c8845e != null) {
                InterfaceC11968e interfaceC11968e = (InterfaceC11968e) function12.invoke(c8845e);
                if (AbstractC7890e.billing(interfaceC11968e, c6775e.f19629e)) {
                    return;
                }
                c6775e.f19629e = interfaceC11968e;
                c6775e.mo1899e();
            }
        }
    }
}
