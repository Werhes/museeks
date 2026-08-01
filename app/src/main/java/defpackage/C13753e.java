package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13753e implements InterfaceC12822e {
    @Override // defpackage.InterfaceC12822e
    public final int ad() {
        return 3;
    }

    @Override // defpackage.InterfaceC12822e
    public final int vip(InterfaceC6647e interfaceC6647e, InterfaceC6647e interfaceC6647e2, InterfaceC5052e interfaceC5052e) {
        if ((interfaceC6647e2 instanceof InterfaceC2188e) && (interfaceC6647e instanceof InterfaceC2188e)) {
            InterfaceC2188e interfaceC2188e = (InterfaceC2188e) interfaceC6647e2;
            InterfaceC2188e interfaceC2188e2 = (InterfaceC2188e) interfaceC6647e;
            if (AbstractC7890e.billing(interfaceC2188e.getName(), interfaceC2188e2.getName())) {
                if (interfaceC2188e.metrica() == null && interfaceC2188e2.metrica() == null) {
                    return 1;
                }
                if (interfaceC2188e.metrica() == null || interfaceC2188e2.metrica() == null) {
                    return 2;
                }
            }
        }
        return 3;
    }
}
