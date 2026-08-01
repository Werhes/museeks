package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6492e implements InterfaceC2460e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3801e f13409e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2460e f13410e;

    public C6492e(InterfaceC2460e interfaceC2460e, C3801e c3801e) {
        this.f13410e = interfaceC2460e;
        this.f13409e = c3801e;
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean amazon(C12816e c12816e) {
        if (((Boolean) this.f13409e.invoke(c12816e)).booleanValue()) {
            return this.f13410e.amazon(c12816e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean isEmpty() {
        InterfaceC2460e interfaceC2460e = this.f13410e;
        if ((interfaceC2460e instanceof Collection) && ((Collection) interfaceC2460e).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC2460e.iterator();
        while (it.hasNext()) {
            C12816e mopub = ((InterfaceC16566e) it.next()).mopub();
            if (mopub != null && ((Boolean) this.f13409e.invoke(mopub)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f13410e) {
            C12816e mopub = ((InterfaceC16566e) obj).mopub();
            if (mopub != null && ((Boolean) this.f13409e.invoke(mopub)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.InterfaceC2460e
    public final InterfaceC16566e license(C12816e c12816e) {
        if (((Boolean) this.f13409e.invoke(c12816e)).booleanValue()) {
            return this.f13410e.license(c12816e);
        }
        return null;
    }
}
