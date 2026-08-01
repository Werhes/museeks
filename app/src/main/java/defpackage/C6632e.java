package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6632e extends AbstractC15890e {
    public final /* synthetic */ AbstractC18103e billing;
    public final /* synthetic */ ArrayList purchase;

    public C6632e(ArrayList arrayList, AbstractC18103e abstractC18103e) {
        this.purchase = arrayList;
        this.billing = abstractC18103e;
    }

    @Override // defpackage.AbstractC15890e
    public final void ad(InterfaceC0390e interfaceC0390e) {
        C14514e.subscription(interfaceC0390e, null);
        this.purchase.add(interfaceC0390e);
    }

    @Override // defpackage.AbstractC15890e
    public final void vip(InterfaceC0390e interfaceC0390e, InterfaceC0390e interfaceC0390e2) {
        throw new IllegalStateException(("Conflict in scope of " + this.billing.vip + ": " + interfaceC0390e + " vs " + interfaceC0390e2).toString());
    }
}
