package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5857e {

    /* renamed from: implements, reason: not valid java name */
    public static C8419e f12387implements;
    public static final C2892e ad = new C2892e(1018081763, false, new C13428e(15));
    public static final C2892e vip = new C2892e(-1666391907, false, new C8453e(13));
    public static final C2892e metrica = new C2892e(-1363504516, false, new C8453e(20));
    public static final C2892e license = new C2892e(-416367225, false, new C8453e(25));
    public static final C2892e appmetrica = new C2892e(463872688, false, new C11832e(0));
    public static final C2892e purchase = new C2892e(-103039345, false, new C11832e(1));
    public static final C2892e billing = new C2892e(-669951378, false, new C11832e(2));
    public static final C2892e yandex = new C2892e(-1395043317, false, new C11832e(3));
    public static final C2892e startapp = new C2892e(161204826, false, new C13428e(29));
    public static final C2892e adcel = new C2892e(-1804781928, false, new C15480e(0));
    public static final C2892e mopub = new C2892e(1657352852, false, new C8453e(18));
    public static final C2892e advert = new C2892e(674359475, false, new C8453e(23));
    public static final C2892e smaato = new C2892e(354136027, false, new C13428e(28));
    public static final C2892e amazon = new C2892e(-1611850727, false, new C15480e(1));
    public static final C2892e loadAd = new C2892e(1850284053, false, new C11832e(4));
    public static final C2892e Signature = new C2892e(867290676, false, new C11832e(5));
    public static final C2892e admob = new C2892e(-115702701, false, new C11832e(6));
    public static final C2892e subscription = new C2892e(-911498401, false, new C11832e(7));
    public static final C2892e remoteconfig = new C2892e(774481088, false, new C11832e(8));
    public static final C2892e pro = new C2892e(1911829074, false, new C8453e(12));
    public static final C2892e signatures = new C2892e(-2086568529, false, new C8453e(14));
    public static final C2892e tapsense = new C2892e(875599566, false, new C8453e(15));
    public static final C2892e isVip = new C2892e(1338399247, false, new C13428e(16));
    public static final C2892e inmobi = new C2892e(-1413864560, false, new C8453e(16));
    public static final C2892e isPro = new C2892e(-929227729, false, new C8453e(17));
    public static final C2892e applovin = new C2892e(-1502657556, false, new C13428e(17));
    public static final C2892e ads = new C2892e(-1018020725, false, new C13428e(18));
    public static final C2892e premium = new C2892e(-533383894, false, new C13428e(19));
    public static final C2892e subs = new C2892e(-48747063, false, new C13428e(20));
    public static final C2892e crashlytics = new C2892e(1493956426, false, new C8453e(19));
    public static final C2892e firebase = new C2892e(1790526119, false, new C8453e(21));

    /* renamed from: class, reason: not valid java name */
    public static final C2892e f12383class = new C2892e(-1870043794, false, new C13428e(21));

    /* renamed from: interface, reason: not valid java name */
    public static final C2892e f12388interface = new C2892e(1349888363, false, new C8453e(22));

    /* renamed from: goto, reason: not valid java name */
    public static final C2892e f12386goto = new C2892e(-900770132, false, new C13428e(22));

    /* renamed from: this, reason: not valid java name */
    public static final C2892e f12391this = new C2892e(-416133301, false, new C13428e(23));

    /* renamed from: native, reason: not valid java name */
    public static final C2892e f12389native = new C2892e(68503530, false, new C13428e(24));

    /* renamed from: extends, reason: not valid java name */
    public static final C2892e f12385extends = new C2892e(553140361, false, new C13428e(25));

    /* renamed from: throw, reason: not valid java name */
    public static final C2892e f12392throw = new C2892e(1037777192, false, new C13428e(26));

    /* renamed from: while, reason: not valid java name */
    public static final C2892e f12394while = new C2892e(1522414023, false, new C13428e(27));

    /* renamed from: try, reason: not valid java name */
    public static final C2892e f12393try = new C2892e(-1789361401, false, new C8453e(24));

    /* renamed from: protected, reason: not valid java name */
    public static final C2892e f12390protected = new C2892e(1362163967, false, new C8453e(26));

    /* renamed from: break, reason: not valid java name */
    public static final C2892e f12382break = new C2892e(107733627, false, new C8453e(27));

    /* renamed from: abstract, reason: not valid java name */
    public static final C2892e f12381abstract = new C2892e(119289704, false, new C8453e(28));

    /* renamed from: default, reason: not valid java name */
    public static final C2892e f12384default = new C2892e(1497543140, false, new C8453e(29));

    public static final InterfaceC11129e ad(InterfaceC2484e interfaceC2484e) {
        C10095e c10095e = new C10095e(1);
        for (String str : interfaceC2484e.mo857e()) {
            List mo856e = interfaceC2484e.mo856e(str);
            if (mo856e == null) {
                mo856e = C13664e.f27089e;
            }
            String license2 = AbstractC6528e.license(0, 0, 15, str);
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo856e, 10));
            Iterator it = mo856e.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC6528e.license(0, 0, 11, (String) it.next()));
            }
            c10095e.mo858e(license2, arrayList);
        }
        return c10095e.build();
    }

    public static Object yandex(AbstractC5857e abstractC5857e, Context context, int i, AbstractC10731e abstractC10731e) {
        abstractC5857e.getClass();
        AtomicBoolean atomicBoolean = AbstractC8326e.ad;
        if (Build.VERSION.SDK_INT >= 29 && AbstractC8326e.ad.get()) {
            AbstractC14204e.metrica();
        }
        Object metrica2 = abstractC5857e.metrica(context, new C10838e(i), null, new C3029e(4, 0, null), abstractC10731e);
        return metrica2 == EnumC2821e.f6782e ? metrica2 : Unit.INSTANCE;
    }

    public abstract InterfaceC8418e appmetrica();

    public Object billing(Context context, C10838e c10838e, AbstractC10731e abstractC10731e) {
        if (!(c10838e instanceof C10838e) || AbstractC14114e.purchase(c10838e)) {
            throw new IllegalArgumentException("Invalid Glance ID");
        }
        Object yandex2 = yandex(this, context, c10838e.ad, abstractC10731e);
        return yandex2 == EnumC2821e.f6782e ? yandex2 : Unit.INSTANCE;
    }

    public abstract InterfaceC3997e license();

    public Object metrica(Context context, C10838e c10838e, Bundle bundle, Function4 function4, AbstractC10731e abstractC10731e) {
        C10973e c10973e = AbstractC12985e.ad;
        C14144e c14144e = new C14144e(context, c10838e, this, bundle, function4, null);
        c10973e.getClass();
        return C10973e.ad(c10973e, c14144e, abstractC10731e);
    }

    public abstract void purchase(Context context, C10838e c10838e, AbstractC10731e abstractC10731e);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0096, code lost:
    
        if (defpackage.C10973e.ad(r1, r5, r0) == r4) goto L86;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object vip(android.content.Context r10, int r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5857e.vip(android.content.Context, int, eُؑ۠):java.lang.Object");
    }
}
