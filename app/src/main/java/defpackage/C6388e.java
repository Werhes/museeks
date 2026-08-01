package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6388e implements InterfaceC13984e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC13984e f13246e;

    public C6388e(InterfaceC13984e interfaceC13984e) {
        this.f13246e = interfaceC13984e;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C6388e c6388e = obj instanceof C6388e ? (C6388e) obj : null;
        InterfaceC13984e interfaceC13984e = c6388e != null ? c6388e.f13246e : null;
        InterfaceC13984e interfaceC13984e2 = this.f13246e;
        if (!AbstractC7890e.billing(interfaceC13984e2, interfaceC13984e)) {
            return false;
        }
        InterfaceC0861e isVip = interfaceC13984e2.isVip();
        if (isVip instanceof InterfaceC7227e) {
            InterfaceC13984e interfaceC13984e3 = obj instanceof InterfaceC13984e ? (InterfaceC13984e) obj : null;
            InterfaceC0861e isVip2 = interfaceC13984e3 != null ? interfaceC13984e3.isVip() : null;
            if (isVip2 != null && (isVip2 instanceof InterfaceC7227e)) {
                return AbstractC7890e.billing(((InterfaceC18155e) ((InterfaceC7227e) isVip)).subs(), ((InterfaceC18155e) ((InterfaceC7227e) isVip2)).subs());
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC11034e
    public final List getAnnotations() {
        return this.f13246e.getAnnotations();
    }

    public final int hashCode() {
        return this.f13246e.hashCode();
    }

    @Override // defpackage.InterfaceC13984e
    public final InterfaceC0861e isVip() {
        return this.f13246e.isVip();
    }

    @Override // defpackage.InterfaceC13984e
    public final List signatures() {
        return this.f13246e.signatures();
    }

    @Override // defpackage.InterfaceC13984e
    public final boolean startapp() {
        return this.f13246e.startapp();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f13246e;
    }
}
