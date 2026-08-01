package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16982e {
    public static final C2892e ad = new C2892e(954879418, false, new C13060e(11));
    public static final C2892e vip = new C2892e(1918065384, false, new C13060e(12));

    public static final C10620e billing(C16801e c16801e) {
        String str = c16801e.f32938e;
        String str2 = c16801e.f32937e;
        List list = c16801e.f32939e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((C1050e) it.next()).f3537e));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Double.valueOf(((C1050e) it2.next()).f3536e));
        }
        return new C10620e(str, str2, false, arrayList, arrayList2);
    }

    public static String metrica(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static final C0764e purchase(InterfaceC8018e interfaceC8018e, Function1 function1, Function3 function3, AbstractC7654e abstractC7654e, C13770e c13770e, int i) {
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = AbstractC17680e.startapp(c13770e);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
        Object m3681throw2 = c13770e.m3681throw();
        if (m3681throw2 == c5170e) {
            C7368e c7368e = new C7368e(interfaceC8018e.ad(), function1, abstractC7654e);
            c13770e.m3682throws(c7368e);
            m3681throw2 = c7368e;
        }
        InterfaceC3314e vip2 = AbstractC4628e.vip((InterfaceC1108e) m3681throw2, abstractC7654e, c13770e, 0);
        Object m3681throw3 = c13770e.m3681throw();
        if (m3681throw3 == c5170e) {
            m3681throw3 = new C0764e(vip2, interfaceC18435e, interfaceC8018e, function3);
            c13770e.m3682throws(m3681throw3);
        }
        return (C0764e) m3681throw3;
    }

    public abstract boolean ad(C15816e c15816e);

    public abstract AbstractC9932e appmetrica(AbstractC9932e abstractC9932e, BigInteger bigInteger);

    public AbstractC9932e license(AbstractC9932e abstractC9932e, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || abstractC9932e.advert()) {
            return abstractC9932e.ad.smaato();
        }
        AbstractC9932e appmetrica = appmetrica(abstractC9932e, bigInteger.abs());
        if (signum <= 0) {
            appmetrica = appmetrica.loadAd();
        }
        AbstractC0853e.metrica(appmetrica);
        return appmetrica;
    }

    public abstract Object vip(C15816e c15816e);
}
