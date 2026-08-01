package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1890e {
    public static final C11354e appmetrica;
    public static final C11951e billing;
    public static final C5749e license;
    public static InterfaceC8018e purchase;
    public final Context ad;
    public final C5363e metrica = new C5363e(new C10479e(29, this));
    public final AppWidgetManager vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؘٜ] */
    static {
        ?? obj = new Object();
        license = obj;
        appmetrica = AbstractC17419e.license("GlanceAppWidgetManager-" + C5749e.ad(obj), null, null, 14);
        billing = new C11951e("list::Providers");
    }

    public C1890e(Context context) {
        this.ad = context;
        this.vip = AppWidgetManager.getInstance(context);
    }

    public final Object ad(AbstractC7185e abstractC7185e) {
        String packageName = this.ad.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.vip.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (AbstractC7890e.billing(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object vip = ((InterfaceC8018e) this.metrica.getValue()).vip(new C6369e(AbstractC13480e.m3582e(arrayList2), null, 0), abstractC7185e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }

    public final Object license(AbstractC12260e abstractC12260e, AbstractC5857e abstractC5857e, C6626e c6626e) {
        license.getClass();
        String canonicalName = abstractC12260e.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = abstractC5857e.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object vip = ((InterfaceC8018e) this.metrica.getValue()).vip(new C13698e(canonicalName, canonicalName2, null, 0), c6626e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1890e.metrica(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable vip(java.lang.Class r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C7375e
            if (r0 == 0) goto L13
            r0 = r8
            eؚۗؕ r0 = (defpackage.C7375e) r0
            int r1 = r0.f15113e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15113e = r1
            goto L18
        L13:
            eؚۗؕ r0 = new eؚۗؕ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15111e
            int r1 = r0.f15113e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.Class r7 = r0.f15112e
            defpackage.AbstractC2003e.purchase(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            r0.f15112e = r7
            r0.f15113e = r2
            java.lang.Object r8 = r6.metrica(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r8 != r0) goto L3f
            return r0
        L3f:
            eؒۨۙ r8 = (defpackage.C1499e) r8
            java.lang.String r7 = r7.getCanonicalName()
            if (r7 == 0) goto L8b
            java.util.Map r8 = r8.vip
            java.lang.Object r7 = r8.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L54
            eْۨٝ r7 = defpackage.C13664e.f27089e
            return r7
        L54:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            android.appwidget.AppWidgetManager r1 = r6.vip
            int[] r0 = r1.getAppWidgetIds(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L77:
            if (r3 >= r2) goto L86
            r4 = r0[r3]
            eؘُٜ r5 = new eؘُٜ
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L77
        L86:
            defpackage.AbstractC13480e.inmobi(r8, r1)
            goto L5d
        L8a:
            return r8
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "no canonical provider name"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1890e.vip(java.lang.Class, eُؑ۠):java.io.Serializable");
    }
}
