package defpackage;

import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15458e {
    public final C0272e ad;
    public final C18100e license;
    public C0216e metrica;
    public final Set vip;

    public C15458e(C0272e c0272e, Set set, InterfaceC18435e interfaceC18435e, C13749e c13749e) {
        this.ad = c0272e;
        this.vip = set;
        this.license = new C18100e(interfaceC18435e, new Celse(c13749e, this, 3));
        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C15238e(this, null, 1), 3);
    }

    public final C13155e ad() {
        C18100e c18100e = this.license;
        synchronized (c18100e.f35492e) {
            try {
                if (c18100e.f35490e) {
                    return null;
                }
                int i = c18100e.f35491e + 1;
                c18100e.f35491e = i;
                if (i == 1) {
                    C8419e c8419e = (C8419e) c18100e.f35494e;
                    if (c8419e != null) {
                        c8419e.Signature(null);
                    }
                    c18100e.f35494e = null;
                }
                Unit unit = Unit.INSTANCE;
                return new C13155e(c18100e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Unit license(C0216e c0216e, C13155e c13155e) {
        Unit unit;
        C0216e c0216e2 = this.metrica;
        this.metrica = c0216e;
        InterfaceC5083e interfaceC5083e = null;
        if (c0216e2 != null) {
            c0216e2.ad(null);
        }
        C1615e c1615e = this.ad.signatures;
        synchronized (c0216e.appmetrica) {
            if (c0216e.purchase) {
                c13155e.vip();
                unit = Unit.INSTANCE;
            } else {
                c0216e.mopub = AbstractC5336e.purchase(c0216e.metrica, null, 0, new C7195e(c1615e, c0216e, interfaceC5083e, 8), 3);
                c0216e.advert = c13155e;
                unit = Unit.INSTANCE;
            }
        }
        return unit == EnumC2821e.f6782e ? unit : Unit.INSTANCE;
    }

    public final void metrica() {
        this.license.billing();
        this.ad.ad();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) C5060e.vip(this.ad.ad));
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC15211e.ad(16);
        sb.append(Integer.toString(hashCode, 16));
        return sb.toString();
    }

    public final Object vip(AbstractC10731e abstractC10731e) {
        Object adcel = AbstractC7535e.adcel(this.ad.signatures, new C9754e(2, 1, null), abstractC10731e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (adcel != enumC2821e) {
            adcel = Unit.INSTANCE;
        }
        return adcel == enumC2821e ? adcel : Unit.INSTANCE;
    }
}
