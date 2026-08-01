package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8194e extends AbstractC11130e implements InterfaceC0420e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C14400e f16680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8194e(C14400e c14400e) {
        super(9);
        this.f16680e = c14400e;
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC16843e
    public final void release() {
    }

    @Override // defpackage.InterfaceC0420e
    public final void vip(Object obj) {
        Object obj2;
        EnumC16228e enumC16228e;
        ((C8823e) this.f22046e).m2175import(new C4418e(obj));
        C14400e c14400e = this.f16680e;
        EnumC16228e enumC16228e2 = EnumC16228e.f31893e;
        C7744e c7744e = c14400e.purchase;
        do {
            obj2 = c7744e.ad;
            EnumC16228e enumC16228e3 = (EnumC16228e) obj2;
            int ordinal = enumC16228e3.ordinal();
            if (ordinal == 0) {
                enumC16228e = EnumC16228e.f31892e;
            } else {
                if (ordinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + c14400e + "! State is " + enumC16228e3 + ' ');
                }
                enumC16228e = enumC16228e2;
            }
        } while (!c7744e.ad(obj2, enumC16228e));
        Iterator it = c14400e.yandex.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        if (enumC16228e == enumC16228e2) {
            Iterator it2 = c14400e.yandex.iterator();
            if (it2.hasNext()) {
                throw AbstractC5087e.m1747goto(it2);
            }
        }
    }
}
