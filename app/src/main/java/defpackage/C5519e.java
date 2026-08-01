package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5519e implements InterfaceC3810e {
    public final /* synthetic */ int ad;
    public static final C5519e vip = new C5519e(0);
    public static final C5519e metrica = new C5519e(1);
    public static final C5519e license = new C5519e(2);

    public /* synthetic */ C5519e(int i) {
        this.ad = i;
    }

    public static String vip(InterfaceC4077e interfaceC4077e) {
        String billing = AbstractC10681e.billing(interfaceC4077e.getName());
        if (interfaceC4077e instanceof InterfaceC16046e) {
            return billing;
        }
        InterfaceC15498e mo1351switch = interfaceC4077e.mo1351switch();
        String vip2 = mo1351switch instanceof InterfaceC5052e ? vip((InterfaceC4077e) mo1351switch) : mo1351switch instanceof InterfaceC9646e ? AbstractC10681e.startapp(C13579e.purchase(((AbstractC14941e) ((InterfaceC9646e) mo1351switch)).f29618e.ad)) : null;
        return (vip2 == null || vip2.equals(BuildConfig.FLAVOR)) ? billing : AbstractC0869e.tapsense('.', vip2, billing);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [eْؖٝ, eِٕٖ] */
    /* JADX WARN: Type inference failed for: r2v8, types: [eِٕٖ] */
    /* JADX WARN: Type inference failed for: r2v9, types: [eِٕٖ] */
    @Override // defpackage.InterfaceC3810e
    public final String ad(InterfaceC4077e interfaceC4077e, C8746e c8746e) {
        switch (this.ad) {
            case 0:
                return interfaceC4077e instanceof InterfaceC16046e ? c8746e.m2499try(((InterfaceC16046e) interfaceC4077e).getName(), false) : c8746e.loadAd(AbstractC10681e.startapp(C13579e.purchase(AbstractC14300e.purchase(interfaceC4077e))));
            case 1:
                if (interfaceC4077e instanceof InterfaceC16046e) {
                    return c8746e.m2499try(((InterfaceC16046e) interfaceC4077e).getName(), false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC4077e.getName());
                    interfaceC4077e = interfaceC4077e.mo1351switch();
                } while (interfaceC4077e instanceof InterfaceC5052e);
                return AbstractC10681e.startapp(new C11401e(arrayList));
            default:
                return vip(interfaceC4077e);
        }
    }
}
