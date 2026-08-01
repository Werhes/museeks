package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13320e extends AbstractC9555e {
    public static final C13320e license = new AbstractC9555e(0, 2, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        C9898e c9898e = (C9898e) c11226e.billing(1);
        int i = c9898e != null ? c9898e.ad : 0;
        C14608e c14608e = (C14608e) c11226e.billing(0);
        if (i > 0) {
            interfaceC11305e = new C10629e(interfaceC11305e, i);
        }
        c14608e.appmetrica(interfaceC11305e, c14479e, c14995e, interfaceC15989e != null ? new C10312e(interfaceC15989e, c14479e, 9) : null);
    }
}
