package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2488e {
    public static final AtomicReferenceFieldUpdater[] ad;
    private volatile InterfaceC1148e acceptHandlerReference;
    private volatile InterfaceC1148e connectHandlerReference;
    private volatile InterfaceC1148e readHandlerReference;
    private volatile InterfaceC1148e writeHandlerReference;

    static {
        InterfaceC15954e interfaceC15954e;
        EnumC16368e[] enumC16368eArr = EnumC16368e.f32159e;
        EnumC16368e[] enumC16368eArr2 = EnumC16368e.f32159e;
        ArrayList arrayList = new ArrayList(enumC16368eArr2.length);
        for (EnumC16368e enumC16368e : enumC16368eArr2) {
            int ordinal = enumC16368e.ordinal();
            if (ordinal == 0) {
                interfaceC15954e = C15970e.f31484e;
            } else if (ordinal == 1) {
                interfaceC15954e = C13351e.f26607e;
            } else if (ordinal == 2) {
                interfaceC15954e = C3113e.f7186e;
            } else {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                interfaceC15954e = C17848e.f35023e;
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(C2488e.class, InterfaceC1148e.class, interfaceC15954e.getName()));
        }
        ad = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
