package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9559e extends C1326e {
    public final C13615e advert = new C13615e();

    @Override // defpackage.AbstractC9790e
    public final void billing() {
        Iterator it = this.advert.iterator();
        while (true) {
            C6652e c6652e = (C6652e) it;
            if (!c6652e.hasNext()) {
                return;
            }
            C1495e c1495e = (C1495e) ((Map.Entry) c6652e.next()).getValue();
            c1495e.ad.yandex(c1495e);
        }
    }

    public final void mopub(AbstractC9790e abstractC9790e, InterfaceC2994e interfaceC2994e) {
        Object obj;
        if (abstractC9790e == null) {
            throw new NullPointerException("source cannot be null");
        }
        C1495e c1495e = new C1495e(abstractC9790e, interfaceC2994e);
        C13615e c13615e = this.advert;
        C18091e appmetrica = c13615e.appmetrica(abstractC9790e);
        if (appmetrica != null) {
            obj = appmetrica.f35478e;
        } else {
            C18091e c18091e = new C18091e(abstractC9790e, c1495e);
            c13615e.f27009e++;
            C18091e c18091e2 = c13615e.f27008e;
            if (c18091e2 == null) {
                c13615e.f27010e = c18091e;
                c13615e.f27008e = c18091e;
            } else {
                c18091e2.f35477e = c18091e;
                c18091e.f35479e = c18091e2;
                c13615e.f27008e = c18091e;
            }
            obj = null;
        }
        C1495e c1495e2 = (C1495e) obj;
        if (c1495e2 != null && c1495e2.vip != interfaceC2994e) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c1495e2 == null && this.metrica > 0) {
            abstractC9790e.appmetrica(c1495e);
        }
    }

    @Override // defpackage.AbstractC9790e
    public final void purchase() {
        Iterator it = this.advert.iterator();
        while (true) {
            C6652e c6652e = (C6652e) it;
            if (!c6652e.hasNext()) {
                return;
            }
            C1495e c1495e = (C1495e) ((Map.Entry) c6652e.next()).getValue();
            c1495e.ad.appmetrica(c1495e);
        }
    }
}
