package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۠ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18046e {
    public static final C8208e mopub;
    public final C7988e ad;
    public final C18464e adcel;
    public final C6594e appmetrica;
    public final C7988e billing;
    public final C8221e purchase;
    public final C9398e startapp;
    public final C16089e vip = new C16089e(25);
    public final C18046e metrica = this;
    public final C18046e license = this;
    public final String yandex = AbstractC6507e.mopub(new byte[]{(byte) 34913, (byte) 368, (byte) 105, (byte) 238824750, (byte) 1910, (byte) 993387, (byte) 22136, (byte) 3022126, (byte) 241721953, (byte) 129930608, (byte) 4344432});

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(Unit.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(Unit.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        mopub = new C8208e("spark-bypass-auth-await", new C12025e(vip, interfaceC13984e));
    }

    public C18046e(C7988e c7988e, VKXApplication vKXApplication, C6594e c6594e, C9398e c9398e) {
        this.ad = c7988e;
        this.appmetrica = c6594e;
        this.purchase = new C8221e(vKXApplication);
        this.billing = new C7988e(24, c6594e);
        int i = 0;
        C14947e c14947e = c9398e.f18711e;
        C9964e c9964e = new C9964e();
        c9964e.metrica(c9398e.f18706e);
        c9964e.ad(AbstractC15641e.license, new C7983e(28));
        c9964e.ad(AbstractC10725e.vip, new C7983e(29));
        c9964e.ad(AbstractC9506e.vip, new C4671e(i));
        c9964e.ad(AbstractC1002e.metrica, new C16075e(this, i));
        C16075e c16075e = new C16075e(this, 1);
        InterfaceC4911e interfaceC4911e = AbstractC1515e.ad;
        c9964e.ad(C15210e.vip, new C2046e(2, c16075e));
        Unit unit = Unit.INSTANCE;
        C9398e c9398e2 = new C9398e(c14947e, c9964e, c9398e.f18704e);
        this.startapp = c9398e2;
        this.adcel = new C18464e(new C12454e(c9398e2));
    }

    public final void ad() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.appmetrica.f13613e;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
        C8221e c8221e = this.purchase;
        C1615e c1615e = (C1615e) c8221e.vip;
        c1615e.advert(null);
        if (c1615e.getValue() != null) {
            c8221e.adcel(C1642e.ad);
        }
        ((C1615e) c8221e.license).advert(null);
        c8221e.adcel(C3467e.ad);
        InterfaceC4911e interfaceC4911e = AbstractC1002e.ad;
        Iterable iterable = (List) this.startapp.f18705e.purchase(AbstractC1002e.license);
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof C7488e) {
                arrayList.add(obj);
            }
        }
        C7488e c7488e = (C7488e) AbstractC13480e.m3603synchronized(arrayList);
        if (c7488e != null) {
            C7256e.metrica(c7488e.metrica);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(4:19|20|21|(1:23)(1:24))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        ((defpackage.C1615e) r2.license).advert(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C16145e
            if (r0 == 0) goto L13
            r0 = r9
            eِٖٕ r0 = (defpackage.C16145e) r0
            int r1 = r0.f31729e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31729e = r1
            goto L18
        L13:
            eِٖٕ r0 = new eِٖٕ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f31727e
            int r1 = r0.f31729e
            eًۛ۠ r2 = r8.purchase
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            eًۛ۠ r0 = r0.f31728e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Exception -> L6c
            goto L62
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.AbstractC2003e.purchase(r9)
            eۣۡ r9 = r8.adcel     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = r9.f36192e     // Catch: java.lang.Exception -> L6c
            eٕۣۣ r9 = (defpackage.C15816e) r9     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = r9.f31190e     // Catch: java.lang.Exception -> L6c
            eّْ۟ r9 = (defpackage.C12454e) r9     // Catch: java.lang.Exception -> L6c
            eّۦٜ r1 = new eّۦٜ     // Catch: java.lang.Exception -> L6c
            java.lang.String r4 = "/InboxService/GetIsRead"
            eَؑؑ r5 = defpackage.C15625e.f30813e     // Catch: java.lang.Exception -> L6c
            eؙِؕ r6 = defpackage.C1609e.f4526e     // Catch: java.lang.Exception -> L6c
            r7 = 18
            r1.<init>(r7, r4, r5, r6)     // Catch: java.lang.Exception -> L6c
            eؘٟۚ r9 = r9.metrica(r1)     // Catch: java.lang.Exception -> L6c
            eٍٕٞ r1 = new eٍٕٞ     // Catch: java.lang.Exception -> L6c
            r1.<init>()     // Catch: java.lang.Exception -> L6c
            r0.f31728e = r2     // Catch: java.lang.Exception -> L6c
            r0.f31729e = r3     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = r9.firebase(r1, r0)     // Catch: java.lang.Exception -> L6c
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r9 != r0) goto L61
            return r0
        L61:
            r0 = r2
        L62:
            eٜؓؖ r9 = (defpackage.C1609e) r9     // Catch: java.lang.Exception -> L6c
            java.lang.Object r0 = r0.license     // Catch: java.lang.Exception -> L6c
            eؓؗ r0 = (defpackage.C1615e) r0     // Catch: java.lang.Exception -> L6c
            r0.advert(r9)     // Catch: java.lang.Exception -> L6c
            goto L74
        L6c:
            java.lang.Object r9 = r2.license
            eؓؗ r9 = (defpackage.C1615e) r9
            r0 = 0
            r9.advert(r0)
        L74:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18046e.appmetrica(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C7420e
            if (r0 == 0) goto L13
            r0 = r6
            eؚۙٔ r0 = (defpackage.C7420e) r0
            int r1 = r0.f15186e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15186e = r1
            goto L18
        L13:
            eؚۙٔ r0 = new eؚۙٔ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f15185e
            int r1 = r0.f15186e
            r2 = 1
            eًۛ۠ r3 = r5.purchase
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.AbstractC2003e.purchase(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eُؕٚ r6 = defpackage.C3467e.ad
            r3.adcel(r6)
            r0.f15186e = r2
            e٘۠ؒ r6 = r5.license
            java.lang.Object r6 = defpackage.AbstractC2774e.yandex(r6, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L44
            return r0
        L44:
            r0 = r6
            eؑؒ r0 = (defpackage.C0029e) r0
            eؙؓؒ r1 = defpackage.C1642e.ad
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r3.vip
            eؓؗ r2 = (defpackage.C1615e) r2
            r2.advert(r0)
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L5b
            r3.adcel(r1)
        L5b:
            return r6
        L5c:
            java.lang.Object r0 = r3.vip
            eؓؗ r0 = (defpackage.C1615e) r0
            r4 = 0
            r0.advert(r4)
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L6d
            r3.adcel(r1)
        L6d:
            java.lang.Object r0 = r3.metrica
            eؓؗ r0 = (defpackage.C1615e) r0
            r0.advert(r4)
            java.lang.Object r0 = r3.vip
            eؓؗ r0 = (defpackage.C1615e) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L81
            r3.adcel(r1)
        L81:
            eَْٝ r0 = new eَْٝ
            r0.<init>(r2)
            r3.adcel(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18046e.license(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(2:20|21))(5:24|25|(1:27)|(2:29|21)|23))(6:30|31|32|(2:34|(3:41|(4:43|25|(0)|(0))|23)(1:40))|15|16))(2:45|46))(3:53|54|(2:56|23)(1:57))|47|(1:49)(2:50|(2:52|23))|31|32|(0)|15|16))|60|6|7|(0)(0)|47|(0)(0)|31|32|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0116, code lost:
    
        if (metrica(r0) != r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0055, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0081, code lost:
    
        r13 = new defpackage.C12763e(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:30:0x0051, B:31:0x007e, B:46:0x0059, B:47:0x006d, B:50:0x0072, B:54:0x0060), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18046e.metrica(eُؑ۠):java.lang.Object");
    }

    public final Object vip(AbstractC10731e abstractC10731e) {
        Object appmetrica = AbstractC9743e.appmetrica(new C7090e(this, null, 1), abstractC10731e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }
}
