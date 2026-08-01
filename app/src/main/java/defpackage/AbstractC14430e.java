package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔؐ */
/* loaded from: classes3.dex */
public abstract class AbstractC14430e {
    public static final C2892e ad = new C2892e(1863131183, false, new C0972e(10));

    public static final float ad(List list, Resources resources) {
        float f = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f;
    }

    public static AbstractC1186e adcel(AbstractC1186e abstractC1186e, List list, InterfaceC2460e interfaceC2460e, int i) {
        if ((i & 2) != 0) {
            interfaceC2460e = abstractC1186e.getAnnotations();
        }
        if ((list.isEmpty() || list == abstractC1186e.mopub()) && interfaceC2460e == abstractC1186e.getAnnotations()) {
            return abstractC1186e;
        }
        C6557e smaato = abstractC1186e.smaato();
        if ((interfaceC2460e instanceof C6492e) && ((C6492e) interfaceC2460e).isEmpty()) {
            interfaceC2460e = C4590e.f9885e;
        }
        C6557e m675throw = AbstractC1660e.m675throw(smaato, interfaceC2460e);
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (subscription instanceof AbstractC14773e) {
            AbstractC14773e abstractC14773e = (AbstractC14773e) subscription;
            return AbstractC1596e.ad(startapp(abstractC14773e.f29222e, list, m675throw), startapp(abstractC14773e.f29221e, list, m675throw));
        }
        if (subscription instanceof AbstractC10226e) {
            return startapp((AbstractC10226e) subscription, list, m675throw);
        }
        throw new C14803e(10);
    }

    public static final C5782e advert(float f) {
        return new C5782e(2, f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؗٔ, java.lang.Object] */
    public static final C7744e appmetrica(Object obj) {
        ?? obj2 = new Object();
        obj2.ad = obj;
        return obj2;
    }

    public static InterfaceC7189e billing(InterfaceC7189e interfaceC7189e, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return interfaceC7189e.purchase(new C4293e(advert(f), advert(f2), advert(f), advert(f2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؔ۠, java.lang.Object] */
    public static final C11498e license(int i) {
        ?? obj = new Object();
        obj.ad = i;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؔٙٝ, java.lang.Object] */
    public static final C2673e metrica(boolean z) {
        ?? obj = new Object();
        obj.ad = z ? 1 : 0;
        return obj;
    }

    public static /* synthetic */ AbstractC10226e mopub(AbstractC10226e abstractC10226e, List list, C6557e c6557e, int i) {
        if ((i & 1) != 0) {
            list = abstractC10226e.mopub();
        }
        if ((i & 2) != 0) {
            c6557e = abstractC10226e.smaato();
        }
        return startapp(abstractC10226e, list, c6557e);
    }

    public static final C1773e purchase(Context context) {
        return new C1773e(new C17214e(context, 0), new C15473e(Build.VERSION.SDK_INT >= 31 ? C7397e.ad.ad(context) : 0));
    }

    public static final AbstractC10226e startapp(AbstractC10226e abstractC10226e, List list, C6557e c6557e) {
        if (list.isEmpty() && c6557e == abstractC10226e.smaato()) {
            return abstractC10226e;
        }
        if (list.isEmpty()) {
            return abstractC10226e.isVip(c6557e);
        }
        if (!(abstractC10226e instanceof C3267e)) {
            return AbstractC1596e.license(c6557e, abstractC10226e.loadAd(), list, abstractC10226e.Signature());
        }
        C3267e c3267e = (C3267e) abstractC10226e;
        InterfaceC5021e interfaceC5021e = c3267e.f7417e;
        C9866e c9866e = c3267e.f7416e;
        EnumC16799e enumC16799e = c3267e.f7419e;
        boolean z = c3267e.f7421e;
        String[] strArr = c3267e.f7420e;
        return new C3267e(interfaceC5021e, c9866e, enumC16799e, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final AbstractC10226e vip(AbstractC1186e abstractC1186e) {
        AbstractC15728e subscription = abstractC1186e.subscription();
        AbstractC10226e abstractC10226e = subscription instanceof AbstractC10226e ? (AbstractC10226e) subscription : null;
        if (abstractC10226e != null) {
            return abstractC10226e;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC1186e).toString());
    }

    public static InterfaceC7189e yandex(InterfaceC7189e interfaceC7189e, float f, float f2, float f3, int i) {
        float f4 = 0;
        if ((i & 2) != 0) {
            f = 0;
        }
        if ((i & 4) != 0) {
            f2 = 0;
        }
        if ((i & 8) != 0) {
            f3 = 0;
        }
        return interfaceC7189e.purchase(new C4293e(advert(f4), advert(f), advert(f2), advert(f3)));
    }
}
