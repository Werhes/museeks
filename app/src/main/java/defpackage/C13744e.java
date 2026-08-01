package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13744e extends AbstractC9555e {
    public static final C13744e license = new AbstractC9555e(0, 1, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        C12431e c12431e;
        C2846e c2846e = (C2846e) c11226e.billing(0);
        C0583e c0583e = (C0583e) c14995e.startapp;
        if (c0583e == null || ((C16283e) c0583e.billing(c2846e)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) c14995e.adcel;
        if (arrayList != null && (c12431e = (C12431e) arrayList.remove(arrayList.size() - 1)) != null) {
            c14995e.appmetrica = c12431e;
        }
        c0583e.advert(c2846e);
    }
}
