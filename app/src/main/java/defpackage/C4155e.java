package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4155e implements InterfaceC2460e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f9167e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9168e;

    public /* synthetic */ C4155e(int i, Object obj) {
        this.f9168e = i;
        this.f9167e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4155e(InterfaceC2460e[] interfaceC2460eArr) {
        this(1, AbstractC1660e.m670implements(interfaceC2460eArr));
        this.f9168e = 1;
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean amazon(C12816e c12816e) {
        switch (this.f9168e) {
            case 0:
                return license(c12816e) != null;
            case 1:
                Iterator it = ((List) this.f9167e).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2460e) it.next()).amazon(c12816e)) {
                        return true;
                    }
                }
                return false;
            default:
                return license(c12816e) != null;
        }
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean isEmpty() {
        switch (this.f9168e) {
            case 0:
                return ((List) this.f9167e).isEmpty();
            case 1:
                List list = (List) this.f9167e;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC2460e) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9168e) {
            case 0:
                return ((List) this.f9167e).iterator();
            case 1:
                return new C10649e(AbstractC7762e.mopub(new C1356e(1, (List) this.f9167e), C11633e.f23377e));
            default:
                return C15897e.f31334e;
        }
    }

    @Override // defpackage.InterfaceC2460e
    public final InterfaceC16566e license(C12816e c12816e) {
        Object obj;
        switch (this.f9168e) {
            case 0:
                Iterator it = iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC7890e.billing(((InterfaceC16566e) obj).mopub(), c12816e)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                return (InterfaceC16566e) obj;
            case 1:
                C10649e c10649e = (C10649e) AbstractC7762e.loadAd(new C1356e(1, (List) this.f9167e), new C0025e(c12816e, 0)).iterator();
                return (InterfaceC16566e) (!c10649e.hasNext() ? null : c10649e.next());
            default:
                if (c12816e.equals((C12816e) this.f9167e)) {
                    return C2939e.ad;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9168e) {
            case 0:
                return ((List) this.f9167e).toString();
            default:
                return super.toString();
        }
    }
}
