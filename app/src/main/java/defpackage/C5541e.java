package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5541e extends AbstractC5918e {
    public C7139e license;
    public InterfaceC7189e metrica;

    public C5541e() {
        super(0, 3);
        this.metrica = C17043e.ad;
        this.license = C7139e.metrica;
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC2209e ad() {
        C5541e c5541e = new C5541e();
        c5541e.metrica = this.metrica;
        c5541e.license = this.license;
        ArrayList arrayList = this.vip;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC2209e) it.next()).ad());
        }
        c5541e.vip.addAll(arrayList2);
        return c5541e;
    }

    @Override // defpackage.InterfaceC2209e
    public final void metrica(InterfaceC7189e interfaceC7189e) {
        this.metrica = interfaceC7189e;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.metrica + ", contentAlignment=" + this.license + "children=[\n" + license() + "\n])";
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC7189e vip() {
        return this.metrica;
    }
}
