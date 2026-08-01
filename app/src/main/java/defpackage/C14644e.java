package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14644e extends AbstractC9555e {
    public static final C14644e license = new AbstractC9555e(0, 2, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        int i = ((C9898e) c11226e.billing(0)).ad;
        List list = (List) c11226e.billing(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC11305e.license(i3, obj);
            interfaceC11305e.amazon(i3, obj);
        }
    }
}
