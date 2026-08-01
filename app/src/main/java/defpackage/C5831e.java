package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5831e extends AbstractC5918e {
    public InterfaceC3997e license;
    public long metrica;

    public C5831e() {
        super(0, 3);
        this.metrica = 9205357640488583168L;
        this.license = C6883e.ad;
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC2209e ad() {
        C5831e c5831e = new C5831e();
        c5831e.metrica = this.metrica;
        c5831e.license = this.license;
        ArrayList arrayList = this.vip;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC2209e) it.next()).ad());
        }
        c5831e.vip.addAll(arrayList2);
        return c5831e;
    }

    @Override // defpackage.InterfaceC2209e
    public final void metrica(InterfaceC7189e interfaceC7189e) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) C16109e.metrica(this.metrica)) + ", sizeMode=" + this.license + ", children=[\n" + license() + "\n])";
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC7189e vip() {
        InterfaceC7189e vip;
        InterfaceC2209e interfaceC2209e = (InterfaceC2209e) AbstractC13480e.m3603synchronized(this.vip);
        return (interfaceC2209e == null || (vip = interfaceC2209e.vip()) == null) ? AbstractC10589e.metrica(C17043e.ad) : vip;
    }
}
