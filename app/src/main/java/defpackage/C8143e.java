package defpackage;

import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8143e implements InterfaceC11824e {
    public final C8244e ad;
    public final C12162e vip;

    public C8143e(C8244e c8244e, C12162e c12162e) {
        this.ad = c8244e;
        this.vip = c12162e;
    }

    @Override // defpackage.InterfaceC11824e
    public final String ad(int i) {
        C10985e metrica = metrica(i);
        List list = (List) metrica.f21742e;
        String m3608try = AbstractC13480e.m3608try((List) metrica.f21741e, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return m3608try;
        }
        return AbstractC13480e.m3608try(list, "/", null, null, null, 62) + '/' + m3608try;
    }

    @Override // defpackage.InterfaceC11824e
    public final String getString(int i) {
        return (String) this.ad.f16746e.get(i);
    }

    public final C10985e metrica(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C10905e c10905e = (C10905e) this.vip.f24452e.get(i);
            String str = (String) this.ad.f16746e.get(c10905e.f21607e);
            int ordinal = c10905e.f21604e.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (ordinal != 2) {
                    throw new C14803e(10);
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = c10905e.f21605e;
        }
        return new C10985e(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC11824e
    public final boolean vip(int i) {
        return ((Boolean) metrica(i).f21740e).booleanValue();
    }
}
