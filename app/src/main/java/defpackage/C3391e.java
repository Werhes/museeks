package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3391e extends AbstractC5918e {
    public int appmetrica;
    public int license;
    public InterfaceC7189e metrica;

    public C3391e() {
        super(0, 3);
        this.metrica = C17043e.ad;
        this.license = 0;
        this.appmetrica = 0;
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC2209e ad() {
        C3391e c3391e = new C3391e();
        c3391e.metrica = this.metrica;
        c3391e.license = this.license;
        c3391e.appmetrica = this.appmetrica;
        ArrayList arrayList = this.vip;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC2209e) it.next()).ad());
        }
        c3391e.vip.addAll(arrayList2);
        return c3391e;
    }

    @Override // defpackage.InterfaceC2209e
    public final void metrica(InterfaceC7189e interfaceC7189e) {
        this.metrica = interfaceC7189e;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.metrica + ", verticalAlignment=" + ((Object) C13692e.vip(this.license)) + ", horizontalAlignment=" + ((Object) C2782e.vip(this.appmetrica)) + ", children=[\n" + license() + "\n])";
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC7189e vip() {
        return this.metrica;
    }
}
