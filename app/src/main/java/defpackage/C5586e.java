package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5586e extends AbstractC9555e {
    public static final C5586e license = new AbstractC9555e(0, 3, 1);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        C10312e c10312e;
        C18516e c18516e = (C18516e) c11226e.billing(1);
        C3155e c3155e = (C3155e) c11226e.billing(0);
        C5657e c5657e = (C5657e) c11226e.billing(2);
        C14479e adcel = c18516e.adcel();
        if (interfaceC15989e != null) {
            try {
                c10312e = new C10312e(interfaceC15989e, c14479e, 9);
            } catch (Throwable th) {
                adcel.appmetrica(false);
                throw th;
            }
        } else {
            c10312e = null;
        }
        if (!c5657e.purchase.startapp()) {
            AbstractC1889e.ad("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c5657e.appmetrica.yandex(interfaceC11305e, adcel, c14995e, c10312e);
        Unit unit = Unit.INSTANCE;
        adcel.appmetrica(true);
        c14479e.license();
        c3155e.getClass();
        c14479e.ads(c18516e, c18516e.appmetrica(c3155e));
        c14479e.mopub();
    }
}
