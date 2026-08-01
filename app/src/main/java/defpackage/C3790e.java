package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: eؕۨۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3790e implements InterfaceC17460e, Iterable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ArrayList f8398e;

    @Override // defpackage.InterfaceC17460e
    public final Collection getMatches(InterfaceC14659e interfaceC14659e) {
        ArrayList arrayList = this.f8398e;
        if (interfaceC14659e == null) {
            return new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC14659e.advert(next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((ArrayList) getMatches(null)).iterator();
    }
}
