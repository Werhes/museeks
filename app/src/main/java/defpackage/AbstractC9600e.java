package defpackage;

import com.google.android.gms.common.api.Status;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9600e {
    public static final C2892e ad = new C2892e(1300237279, false, new C4509e(2));
    public static final C2892e vip = new C2892e(-1587358171, false, new C4509e(3));
    public static final C2892e metrica = new C2892e(1982178266, false, new C16627e(0));

    public static final void ad(Catalog2Button catalog2Button, Function0 function0, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1152247560);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(catalog2Button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC8769e.license(catalog2Button.amazon);
                c13770e.m3682throws(m3681throw);
            }
            String str = (String) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = AbstractC8769e.license(catalog2Button.loadAd);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC0865e.license(function0, AbstractC18007e.adcel(C0115e.f1276e, 210, 240), false, null, AbstractC12322e.yandex(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, c13770e, 0, 14), null, null, AbstractC16653e.license(379592097, new C12050e(str, (String) m3681throw2, function0, catalog2Button, 15), c13770e), c13770e, ((i3 >> 3) & 14) | 100663344, 236);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(catalog2Button, function0, i, 22);
        }
    }

    public static final AbstractC10226e license(AbstractC1186e abstractC1186e) {
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (subscription instanceof AbstractC14773e) {
            return ((AbstractC14773e) subscription).f29221e;
        }
        if (subscription instanceof AbstractC10226e) {
            return (AbstractC10226e) subscription;
        }
        throw new C14803e(10);
    }

    public static final AbstractC10226e metrica(AbstractC1186e abstractC1186e) {
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (subscription instanceof AbstractC14773e) {
            return ((AbstractC14773e) subscription).f29222e;
        }
        if (subscription instanceof AbstractC10226e) {
            return (AbstractC10226e) subscription;
        }
        throw new C14803e(10);
    }

    public static C10427e vip(Status status) {
        return status.f730e != null ? new C10427e(status) : new C10427e(status);
    }
}
