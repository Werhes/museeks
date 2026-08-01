package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10589e {
    public static final Class[] ad = new Class[0];
    public static final Object[] vip = new Object[0];

    public static final void ad(InterfaceC12864e interfaceC12864e, C15036e c15036e, Function1 function1, C13770e c13770e, int i) {
        c13770e.m3671package(1127677005);
        if ((((c13770e.purchase(c15036e) ? 32 : 16) | i | (c13770e.purchase(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 731) == 146 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3672private(1157296644);
            boolean purchase = c13770e.purchase(c15036e);
            Object m3681throw = c13770e.m3681throw();
            int i2 = 1;
            Object obj = C2987e.ad;
            int i3 = 0;
            if (purchase || m3681throw == obj) {
                m3681throw = C11047e.amazon(AbstractC6874e.startapp(new C3618e(C15036e.ad(c15036e, 0.0f, 0.0f, 0.0f, 1.0f, 7).vip()), new C3618e(AbstractC6532e.vip(16777215))));
                c13770e.m3682throws(m3681throw);
            }
            c13770e.Signature(false);
            AbstractC4457e abstractC4457e = (AbstractC4457e) m3681throw;
            InterfaceC12864e premium = interfaceC12864e.premium(AbstractC18007e.metrica);
            Unit unit = Unit.INSTANCE;
            c13770e.m3672private(1157296644);
            boolean purchase2 = c13770e.purchase(function1);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase2 || m3681throw2 == obj) {
                m3681throw2 = new C4301e(function1, null, i2);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.Signature(false);
            InterfaceC12864e vip2 = AbstractC0845e.vip(premium, unit, (Function2) m3681throw2);
            c13770e.m3672private(511388516);
            boolean purchase3 = c13770e.purchase(abstractC4457e) | c13770e.purchase(c15036e);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase3 || m3681throw3 == obj) {
                m3681throw3 = new C17829e(abstractC4457e, c15036e, i3);
                c13770e.m3682throws(m3681throw3);
            }
            c13770e.Signature(false);
            AbstractC18366e.ad(vip2, (Function1) m3681throw3, c13770e, 0);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription == null) {
            return;
        }
        subscription.license = new C10729e(interfaceC12864e, c15036e, function1, i, 0);
    }

    public static List appmetrica(List list) {
        return list instanceof AbstractC17475e ? ((AbstractC17475e) list).crashlytics() : list instanceof C11615e ? ((C11615e) list).f23325e : list instanceof RandomAccess ? new C11615e(list) : new C11615e(list);
    }

    public static final InterfaceC7189e billing(InterfaceC7189e interfaceC7189e) {
        return interfaceC7189e.purchase(new C12005e(C9133e.ad));
    }

    public static final InterfaceC7189e license(InterfaceC7189e interfaceC7189e) {
        return interfaceC7189e.purchase(new C12005e(C6705e.ad));
    }

    public static final InterfaceC7189e metrica(InterfaceC7189e interfaceC7189e) {
        return license(interfaceC7189e).purchase(new C8851e(C6705e.ad));
    }

    public static AbstractList purchase(InterfaceC8223e interfaceC8223e, List list) {
        return list instanceof RandomAccess ? new C0452e(interfaceC8223e, list) : new C1957e(interfaceC8223e, list);
    }

    public static final List vip(InterfaceC7227e interfaceC7227e) {
        return AbstractC7762e.Signature(new C8522e(AbstractC7762e.advert(interfaceC7227e, C11633e.f23357e), C11633e.f23356e, C9723e.f19221e));
    }
}
