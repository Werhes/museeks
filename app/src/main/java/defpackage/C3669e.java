package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3669e extends AbstractC11661e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12562e f8248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3669e(C12562e c12562e) {
        super(c12562e.f25154e);
        this.f8248e = c12562e;
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.AbstractC11661e, defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        return this.f8248e;
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        return this.f8248e.f25157e;
    }

    @Override // defpackage.AbstractC13101e
    public final C5107e license() {
        return C5107e.f10959e;
    }

    @Override // defpackage.AbstractC11661e
    /* renamed from: startapp */
    public final InterfaceC5052e advert() {
        return this.f8248e;
    }

    public final String toString() {
        return this.f8248e.toString();
    }

    @Override // defpackage.AbstractC13101e
    public final Collection vip() {
        List<C11709e> startapp;
        C12562e c12562e = this.f8248e;
        int i = c12562e.f25156e;
        AbstractC13445e abstractC13445e = c12562e.f25159e;
        C7692e c7692e = C7692e.metrica;
        if (AbstractC7890e.billing(abstractC13445e, c7692e)) {
            startapp = Collections.singletonList(C12562e.f25153e);
        } else if (AbstractC7890e.billing(abstractC13445e, C0930e.metrica)) {
            startapp = AbstractC6874e.startapp(C12562e.f25152e, new C11709e(AbstractC4972e.mopub, c7692e.ad(i)));
        } else {
            C2597e c2597e = C2597e.metrica;
            if (AbstractC7890e.billing(abstractC13445e, c2597e)) {
                startapp = Collections.singletonList(C12562e.f25153e);
            } else {
                if (!AbstractC7890e.billing(abstractC13445e, C2770e.metrica)) {
                    int i2 = AbstractC2763e.ad;
                    throw new IllegalStateException("should not be called");
                }
                startapp = AbstractC6874e.startapp(C12562e.f25152e, new C11709e(AbstractC4972e.purchase, c2597e.ad(i)));
            }
        }
        InterfaceC5334e m3889e = ((AbstractC14941e) c12562e.f25160e).m3889e();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(startapp, 10));
        for (C11709e c11709e : startapp) {
            InterfaceC5052e license = AbstractC1284e.license(m3889e, c11709e);
            if (license == null) {
                throw new IllegalStateException(("Built-in class " + c11709e + " not found").toString());
            }
            List m3606throws = AbstractC13480e.m3606throws(license.mo1459goto().getParameters().size(), c12562e.f25157e);
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(m3606throws, 10));
            Iterator it = m3606throws.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C7878e(((InterfaceC16046e) it.next()).mo1458e()));
            }
            C6557e.f13492e.getClass();
            arrayList.add(AbstractC1596e.license(C6557e.f13491e, license.mo1459goto(), arrayList2, false));
        }
        return AbstractC13480e.m3575continue(arrayList);
    }
}
