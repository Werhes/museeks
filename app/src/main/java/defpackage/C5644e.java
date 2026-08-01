package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5644e extends AbstractC13656e {
    public C5644e(C5302e c5302e) {
        super(new C1646e(c5302e));
    }

    public C5644e(C11709e c11709e, int i) {
        this(new C5302e(c11709e, i));
    }

    @Override // defpackage.AbstractC13656e
    public final AbstractC1186e ad(InterfaceC5334e interfaceC5334e) {
        AbstractC1186e abstractC1186e;
        C6557e.f13492e.getClass();
        C6557e c6557e = C6557e.f13491e;
        AbstractC13270e amazon = interfaceC5334e.amazon();
        amazon.getClass();
        InterfaceC5052e adcel = amazon.adcel(AbstractC0206e.f1429abstract.startapp());
        Object obj = this.ad;
        AbstractC4488e abstractC4488e = (AbstractC4488e) obj;
        if (abstractC4488e instanceof C16637e) {
            abstractC1186e = ((C16637e) obj).ad;
        } else {
            if (!(abstractC4488e instanceof C1646e)) {
                throw new C14803e(10);
            }
            C5302e c5302e = ((C1646e) obj).ad;
            C11709e c11709e = c5302e.ad;
            int i = c5302e.vip;
            InterfaceC5052e license = AbstractC1284e.license(interfaceC5334e, c11709e);
            if (license == null) {
                abstractC1186e = C18139e.vip(EnumC16799e.f32927e, c11709e.toString(), String.valueOf(i));
            } else {
                AbstractC1186e smaato = AbstractC16279e.smaato(license.mo1458e());
                for (int i2 = 0; i2 < i; i2++) {
                    smaato = interfaceC5334e.amazon().startapp(smaato);
                }
                abstractC1186e = smaato;
            }
        }
        return AbstractC1596e.license(c6557e, adcel.mo1459goto(), Collections.singletonList(new C7878e(abstractC1186e)), false);
    }
}
