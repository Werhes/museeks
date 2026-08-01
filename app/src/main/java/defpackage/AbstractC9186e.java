package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9186e {
    public static final C2892e ad = new C2892e(582825681, false, new C0972e(29));
    public static final C2892e vip = new C2892e(1850464817, false, new C2131e(0));
    public static final C2892e metrica = new C2892e(-1553632184, false, new C2131e(1));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [eؘُۛ, java.lang.Object, eٍُٝ] */
    public static final void ad(boolean z, Function0 function0, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-361453782);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object ad2 = AbstractC16233e.ad(c13770e);
            if (ad2 == null) {
                c13770e.m3676strictfp(535274673);
                ad2 = AbstractC12536e.ad(c13770e);
            } else {
                c13770e.m3676strictfp(535271790);
            }
            c13770e.Signature(false);
            if (ad2 == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean purchase = c13770e.purchase(ad2);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase || m3681throw == obj) {
                InterfaceC12760e interfaceC12760e = ad2 instanceof InterfaceC12760e ? (InterfaceC12760e) ad2 : null;
                C11106e metrica2 = interfaceC12760e != null ? interfaceC12760e.metrica() : null;
                InterfaceC15119e interfaceC15119e = ad2 instanceof InterfaceC15119e ? (InterfaceC15119e) ad2 : null;
                m3681throw = new C7184e(metrica2, interfaceC15119e != null ? interfaceC15119e.ad() : null);
                c13770e.m3682throws(m3681throw);
            }
            C7184e c7184e = (C7184e) m3681throw;
            long j = c13770e.f27286case;
            boolean purchase2 = c13770e.purchase(c7184e) | c13770e.appmetrica(j);
            Object m3681throw2 = c13770e.m3681throw();
            Object obj2 = m3681throw2;
            if (purchase2 || m3681throw2 == obj) {
                ?? abstractC11130e = new AbstractC11130e(new C13484e(j, ad2));
                abstractC11130e.f12466e = new C13630e(16);
                c13770e.m3682throws(abstractC11130e);
                obj2 = abstractC11130e;
            }
            C5906e c5906e = (C5906e) obj2;
            c13770e.m3676strictfp(-585307852);
            boolean yandex = c13770e.yandex(c5906e) | ((i2 & 112) == 32);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == obj) {
                m3681throw3 = new Celse(c5906e, function0, 15);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC17680e.purchase((Function0) m3681throw3, c13770e);
            int i3 = i2;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean yandex2 = c13770e.yandex(c5906e) | (i4 == 4);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex2 || m3681throw4 == obj) {
                m3681throw4 = new C7144e(c5906e, z, 1);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17181e.purchase(valueOf, c5906e, null, (Function1) m3681throw4, c13770e, i4);
            boolean yandex3 = c13770e.yandex(c7184e) | c13770e.yandex(c5906e);
            Object m3681throw5 = c13770e.m3681throw();
            if (yandex3 || m3681throw5 == obj) {
                m3681throw5 = new C12439e(c7184e, c5906e, 11);
                c13770e.m3682throws(m3681throw5);
            }
            AbstractC17680e.ad(c7184e, c5906e, (Function1) m3681throw5, c13770e);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C5230e(z, function0, i, 0);
        }
    }

    public static final String appmetrica(C11787e c11787e) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = c11787e.appmetrica;
        String str2 = c11787e.purchase;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        sb.append(sb2.toString());
        sb.append(c11787e.ad);
        int i = c11787e.metrica;
        if (i != 0 && i != c11787e.license().f31629e) {
            sb.append(":");
            sb.append(String.valueOf(c11787e.metrica));
        }
        return sb.toString();
    }

    public static final void billing(C11787e c11787e, String str) {
        c11787e.yandex = AbstractC5304e.m1866native(str) ? C13664e.f27089e : str.equals("/") ? AbstractC3202e.ad : new ArrayList(AbstractC5304e.m1868package(str, new char[]{'/'}));
    }

    public static void license(C11787e c11787e, String[] strArr) {
        boolean z;
        List m670implements = AbstractC1660e.m670implements(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = m670implements.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else {
                AbstractC13480e.inmobi(arrayList, AbstractC5304e.m1868package((String) it.next(), new char[]{'/'}));
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC6528e.purchase((String) it2.next()));
        }
        boolean z2 = c11787e.yandex.size() > 1 && ((CharSequence) AbstractC13480e.m3570break(c11787e.yandex)).length() == 0 && !arrayList2.isEmpty();
        if (arrayList2.size() > 1 && ((CharSequence) AbstractC13480e.m3591interface(arrayList2)).length() == 0 && !c11787e.yandex.isEmpty()) {
            z = true;
        }
        c11787e.yandex = (z2 && z) ? AbstractC13480e.m3584final(AbstractC13480e.crashlytics(c11787e.yandex), AbstractC13480e.subs(1, arrayList2)) : z2 ? AbstractC13480e.m3584final(AbstractC13480e.crashlytics(c11787e.yandex), arrayList2) : z ? AbstractC13480e.m3584final(c11787e.yandex, AbstractC13480e.subs(1, arrayList2)) : AbstractC13480e.m3584final(c11787e.yandex, arrayList2);
    }

    public static final void metrica(C11787e c11787e, StringBuilder sb) {
        List list;
        sb.append(c11787e.license().f31630e);
        String str = c11787e.license().f31630e;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = c11787e.appmetrica;
                    String str3 = c11787e.purchase;
                    if (str2 != null) {
                        sb2.append(str2);
                        if (str3 != null) {
                            sb2.append(':');
                            sb2.append(str3);
                        }
                        sb2.append("@");
                    }
                    CharSequence sb3 = sb2.toString();
                    CharSequence charSequence = c11787e.ad;
                    sb.append(":");
                    sb.append(sb3);
                    sb.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = c11787e.ad;
                    sb.append(":");
                    sb.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = c11787e.ad;
                    sb.append(":");
                    sb.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = c11787e.ad;
                    String purchase = purchase(c11787e);
                    sb.append("://");
                    sb.append(charSequence4);
                    if (!AbstractC5304e.m1864instanceof(purchase, '/')) {
                        sb.append('/');
                    }
                    sb.append((CharSequence) purchase);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = c11787e.ad;
                    sb.append(":");
                    sb.append(charSequence5);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(appmetrica(c11787e));
        String purchase2 = purchase(c11787e);
        InterfaceC14071e interfaceC14071e = c11787e.startapp;
        boolean z = c11787e.vip;
        if (!AbstractC5304e.m1866native(purchase2) && !AbstractC6507e.pro(purchase2, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) purchase2);
        if (!interfaceC14071e.isEmpty() || z) {
            sb.append("?");
        }
        Set<Map.Entry> mopub = interfaceC14071e.mopub();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mopub) {
            String str4 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = Collections.singletonList(new C6571e(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C6571e(str4, (String) it.next()));
                }
                list = arrayList2;
            }
            AbstractC13480e.inmobi(arrayList, list);
        }
        AbstractC13480e.m3610while(arrayList, sb, "&", null, null, new C13887e(10), 60);
        if (c11787e.billing.length() > 0) {
            sb.append('#');
            sb.append(c11787e.billing);
        }
    }

    public static final String purchase(C11787e c11787e) {
        List list = c11787e.yandex;
        return list.isEmpty() ? BuildConfig.FLAVOR : list.size() == 1 ? ((CharSequence) AbstractC13480e.m3591interface(list)).length() == 0 ? "/" : (String) AbstractC13480e.m3591interface(list) : AbstractC13480e.m3608try(list, "/", null, null, null, 62);
    }

    public static C6342e vip(String str, C1839e c1839e, long j, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e, int i, int i2) {
        C13664e c13664e = C13664e.f27089e;
        return new C6342e(new C9904e(str, c1839e, c13664e, c13664e, interfaceC2141e, interfaceC14388e), i, 1, j);
    }

    public static int yandex(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
