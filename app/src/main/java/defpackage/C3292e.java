package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3292e implements InterfaceC11605e {
    public final C6272e ad;
    public final InterfaceC5334e vip;

    public C3292e(C6272e c6272e, C16113e c16113e) {
        this.ad = c6272e;
        this.vip = c16113e;
    }

    @Override // defpackage.InterfaceC11605e
    public final InterfaceC5052e ad(C11709e c11709e) {
        C12816e c12816e;
        C15857e ad;
        if (c11709e.metrica || c11709e.billing()) {
            return null;
        }
        String str = c11709e.vip.ad.ad;
        if (!AbstractC5304e.inmobi(str, "Function", false) || (ad = C1955e.vip.ad((c12816e = c11709e.ad), str)) == null) {
            return null;
        }
        AbstractC13445e abstractC13445e = ad.ad;
        int i = ad.vip;
        C0394e c0394e = ((C14887e) this.vip.mo1886e(c12816e)).f29502e;
        InterfaceC8614e interfaceC8614e = C14887e.f29497e[0];
        List list = (List) c0394e.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C4718e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (AbstractC13480e.m3604this(arrayList2) == null) {
            return new C12562e(this.ad, (C4718e) AbstractC13480e.m3591interface(arrayList), abstractC13445e, i);
        }
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC11605e
    public final boolean metrica(C12816e c12816e, C0520e c0520e) {
        String vip = c0520e.vip();
        return (AbstractC6507e.pro(vip, "Function", false) || AbstractC6507e.pro(vip, "KFunction", false) || AbstractC6507e.pro(vip, "SuspendFunction", false) || AbstractC6507e.pro(vip, "KSuspendFunction", false)) && C1955e.vip.ad(c12816e, vip) != null;
    }

    @Override // defpackage.InterfaceC11605e
    public final Collection vip(C12816e c12816e) {
        return C3295e.f7451e;
    }
}
