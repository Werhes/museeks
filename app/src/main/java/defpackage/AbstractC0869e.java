package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒؗ */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0869e {
    public static C6571e Signature(int i, C9079e c9079e) {
        return new C6571e(c9079e, new C0561e(i));
    }

    public static C14677e ad(InterfaceC12438e interfaceC12438e) {
        C14677e c14677e = (C14677e) interfaceC12438e.smaato(InterfaceC14405e.ads, C14677e.metrica);
        c14677e.getClass();
        return c14677e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C14097e adcel(InterfaceC0182e interfaceC0182e, InterfaceC7227e interfaceC7227e, String str, Object... objArr) {
        C14918e c14918e = (C14918e) ((AbstractC11130e) interfaceC0182e).f22047e;
        return new C14097e(interfaceC0182e.yandex(), interfaceC0182e.yandex().advert().metrica(c14918e.purchase.amazon(interfaceC7227e).ad()).vip, interfaceC7227e, c14918e.purchase, str, objArr);
    }

    public static C6571e admob(int i, C17700e c17700e) {
        return new C6571e(c17700e, new C4309e(i));
    }

    public static void ads(EnumC14212e enumC14212e, EnumC15386e enumC15386e, C6404e c6404e, EnumC14212e enumC14212e2, EnumC15386e enumC15386e2) {
        c6404e.ad(C16728e.amazon(enumC14212e, enumC15386e));
        c6404e.ad(C16728e.amazon(enumC14212e2, enumC15386e2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r10 == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object advert(defpackage.C14947e r8, defpackage.C10017e r9, defpackage.AbstractC10731e r10) {
        /*
            boolean r0 = r10 instanceof defpackage.C10581e
            if (r0 == 0) goto L13
            r0 = r10
            eَ۠ۡ r0 = (defpackage.C10581e) r0
            int r1 = r0.f20880e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20880e = r1
            goto L18
        L13:
            eَ۠ۡ r0 = new eَ۠ۡ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f20878e
            int r1 = r0.f20880e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            eَؓۧ r9 = r0.f20879e
            defpackage.AbstractC2003e.purchase(r10)
            goto L7b
        L38:
            defpackage.AbstractC2003e.purchase(r10)
            java.lang.Object r10 = r9.f19791e
            eَٟۙ r10 = (defpackage.InterfaceC10500e) r10
            r0.f20879e = r9
            r0.f20880e = r3
            eؘْۧ r1 = defpackage.AbstractC16841e.ad
            eؙۧؐ r1 = new eؙۧؐ
            r1.<init>(r10)
            eٌِٞ r10 = r8.f29634e
            eٌِٞ r10 = r10.mo394const(r1)
            eؘْۧ r5 = defpackage.AbstractC16841e.ad
            eٌِٞ r10 = r10.mo394const(r5)
            eٌِٞ r5 = r0.f21135e
            eْؖۧ r6 = defpackage.C4524e.f9798e
            eؗؒۚ r5 = r5.mo397public(r6)
            eَٟۙ r5 = (defpackage.InterfaceC10500e) r5
            if (r5 != 0) goto L63
            goto L78
        L63:
            eؘٔ٘ r6 = new eؘٔ٘
            r7 = 14
            r6.<init>(r7, r1)
            eٟؒٙ r3 = r5.inmobi(r3, r6, r3)
            eؘٔ٘ r5 = new eؘٔ٘
            r6 = 13
            r5.<init>(r6, r3)
            r1.mo692else(r5)
        L78:
            if (r10 != r4) goto L7b
            goto L9c
        L7b:
            eٌِٞ r10 = (defpackage.InterfaceC8850e) r10
            eؙٕٔ r1 = new eؙٕٔ
            r1.<init>(r10)
            eٌِٞ r10 = r10.mo394const(r1)
            eؙٟۙ r1 = new eؙٟۙ
            r3 = 20
            r5 = 0
            r1.<init>(r8, r9, r5, r3)
            eٌ٘ٚ r8 = defpackage.AbstractC5336e.vip(r2, r10, r8, r1)
            r0.f20879e = r5
            r0.f20880e = r2
            java.lang.Object r8 = r8.tapsense(r0)
            if (r8 != r4) goto L9d
        L9c:
            return r4
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0869e.advert(eُٔۚ, eَؓۧ, eُؑ۠):java.lang.Object");
    }

    public static void applovin(int i, int i2, int i3, int i4, int i5) {
        AbstractC16852e.ad(i);
        AbstractC16852e.ad(i2);
        AbstractC16852e.ad(i3);
        AbstractC16852e.ad(i4);
        AbstractC16852e.ad(i5);
    }

    public static int appmetrica(InterfaceC17303e interfaceC17303e, InterfaceC0732e interfaceC0732e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC17303e.license(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), new C11976e(interfaceC16719e, 2, 1, 2), AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    public static int billing(InterfaceC17303e interfaceC17303e, InterfaceC0732e interfaceC0732e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC17303e.license(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), new C11976e(interfaceC16719e, 1, 2, 2), AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    public static /* synthetic */ String crashlytics(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static String inmobi(String str, Ctry ctry, String str2) {
        return str + ctry + str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashSet isPro(String str, String str2, AbstractC17080e abstractC17080e, Object obj) {
        return AbstractC4511e.Signature(obj, AbstractC7644e.appmetrica(str, str2, abstractC17080e).getMessage());
    }

    public static String isVip(long j, String str) {
        return str + j;
    }

    public static int license(InterfaceC16827e interfaceC16827e, AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16827e.license(new C1202e(abstractC9292e, abstractC9292e.getLayoutDirection()), new C11976e(interfaceC16719e, 2, 1, 1), AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    public static C6571e loadAd(int i, int i2, Integer num) {
        return new C6571e(new C7660e(i, i2), num);
    }

    public static int metrica(InterfaceC17303e interfaceC17303e, InterfaceC0732e interfaceC0732e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC17303e.license(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), new C11976e(interfaceC16719e, 2, 2, 2), AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    public static InterfaceC7189e mopub(InterfaceC7189e interfaceC7189e, InterfaceC7189e interfaceC7189e2) {
        return interfaceC7189e2 == C17043e.ad ? interfaceC7189e : new C9132e(interfaceC7189e, interfaceC7189e2);
    }

    public static /* synthetic */ boolean premium(Object obj) {
        return obj != null;
    }

    public static C6404e pro(ArrayList arrayList, C6404e c6404e) {
        arrayList.add(c6404e);
        return new C6404e();
    }

    public static int purchase(InterfaceC16827e interfaceC16827e, AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16827e.license(new C1202e(abstractC9292e, abstractC9292e.getLayoutDirection()), new C11976e(interfaceC16719e, 1, 2, 1), AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    public static C6404e remoteconfig(EnumC14212e enumC14212e, EnumC15386e enumC15386e, C6404e c6404e, ArrayList arrayList, C6404e c6404e2) {
        c6404e.ad(C16728e.amazon(enumC14212e, enumC15386e));
        arrayList.add(c6404e2);
        return new C6404e();
    }

    public static Object signatures(HashMap hashMap, Uri uri, Uri uri2) {
        AbstractC2301e.subscription(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static /* synthetic */ boolean smaato(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static int startapp(InterfaceC17303e interfaceC17303e, InterfaceC0732e interfaceC0732e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC17303e.license(new C1202e(interfaceC0732e, interfaceC0732e.getLayoutDirection()), new C11976e(interfaceC16719e, 1, 1, 2), AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashSet subs(String str, String str2, AbstractC17080e abstractC17080e, Object obj) {
        return AbstractC4511e.Signature(obj, AbstractC7644e.adcel(str, str2, abstractC17080e).getMessage());
    }

    public static C6571e subscription(int i, C4463e c4463e) {
        return new C6571e(c4463e, new C0561e(i));
    }

    public static String tapsense(char c, String str, String str2) {
        return str + c + str2;
    }

    public static int vip(InterfaceC16827e interfaceC16827e, AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16827e.license(new C1202e(abstractC9292e, abstractC9292e.getLayoutDirection()), new C11976e(interfaceC16719e, 2, 2, 1), AbstractC2278e.vip(0, i, 0, 0, 13)).vip();
    }

    public static int yandex(InterfaceC16827e interfaceC16827e, AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return interfaceC16827e.license(new C1202e(abstractC9292e, abstractC9292e.getLayoutDirection()), new C11976e(interfaceC16719e, 1, 1, 1), AbstractC2278e.vip(0, 0, 0, i, 7)).getWidth();
    }
}
