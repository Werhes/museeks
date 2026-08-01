package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۧؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14390e extends AbstractC5918e {
    public InterfaceC7189e license;
    public final int metrica;

    public C14390e(int i) {
        super(i, 2);
        this.metrica = i;
        this.license = C17043e.ad;
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC2209e ad() {
        C14390e c14390e = new C14390e(this.metrica);
        c14390e.license = this.license;
        ArrayList arrayList = this.vip;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC2209e) it.next()).ad());
        }
        c14390e.vip.addAll(arrayList2);
        return c14390e;
    }

    @Override // defpackage.InterfaceC2209e
    public final void metrica(InterfaceC7189e interfaceC7189e) {
        this.license = interfaceC7189e;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.license + ", children=[\n" + license() + "\n])";
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC7189e vip() {
        return this.license;
    }
}
