package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1105e extends AbstractC10200e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C11467e f3651e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f3652e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f3653e;

    public C1105e(C1105e c1105e) {
        super(c1105e.f20170e);
        ArrayList arrayList = new ArrayList(c1105e.f3652e.size());
        this.f3652e = arrayList;
        arrayList.addAll(c1105e.f3652e);
        ArrayList arrayList2 = new ArrayList(c1105e.f3653e.size());
        this.f3653e = arrayList2;
        arrayList2.addAll(c1105e.f3653e);
        this.f3651e = c1105e.f3651e;
    }

    public C1105e(String str, ArrayList arrayList, List list, C11467e c11467e) {
        super(str);
        this.f3652e = new ArrayList();
        this.f3651e = c11467e;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f3652e.add(((InterfaceC2268e) it.next()).startapp());
            }
        }
        this.f3653e = new ArrayList(list);
    }

    @Override // defpackage.AbstractC10200e
    public final InterfaceC2268e ad(C11467e c11467e, List list) {
        C1058e c1058e;
        C11467e m3217protected = this.f3651e.m3217protected();
        C7302e c7302e = (C7302e) m3217protected.f23070e;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3652e;
            int size = arrayList.size();
            c1058e = InterfaceC2268e.f5755e;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                m3217protected.m3214implements((String) arrayList.get(i), ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(i)));
            } else {
                m3217protected.m3214implements((String) arrayList.get(i), c1058e);
            }
            i++;
        }
        Iterator it = this.f3653e.iterator();
        while (it.hasNext()) {
            InterfaceC2268e interfaceC2268e = (InterfaceC2268e) it.next();
            InterfaceC2268e purchase = c7302e.purchase(m3217protected, interfaceC2268e);
            if (purchase instanceof C5094e) {
                purchase = c7302e.purchase(m3217protected, interfaceC2268e);
            }
            if (purchase instanceof C8466e) {
                return ((C8466e) purchase).f17238e;
            }
        }
        return c1058e;
    }

    @Override // defpackage.AbstractC10200e, defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        return new C1105e(this);
    }
}
