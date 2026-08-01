package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12260e extends AppWidgetProvider {
    public final C15420e ad = AbstractC6731e.ad;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC18435e r6, android.content.Context r7, int[] r8, defpackage.AbstractC10731e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C10842e
            if (r0 == 0) goto L13
            r0 = r9
            eؘُ۟ r0 = (defpackage.C10842e) r0
            int r1 = r0.f21470e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21470e = r1
            goto L18
        L13:
            eؘُ۟ r0 = new eؘُ۟
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f21471e
            int r1 = r0.f21470e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            int r6 = r0.f21474e
            int r7 = r0.f21475e
            int[] r8 = r0.f21469e
            android.content.Context r1 = r0.f21472e
            defpackage.AbstractC2003e.purchase(r9)
            r9 = r8
            r8 = r1
            goto L5e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.AbstractC2003e.purchase(r9)
            r5.purchase(r6, r7)
            int r6 = r8.length
            r9 = 0
            r4 = r8
            r8 = r7
            r7 = r9
            r9 = r4
        L43:
            if (r7 >= r6) goto L60
            r1 = r9[r7]
            eؘٕۘ r3 = r5.appmetrica()
            r0.f21472e = r8
            r0.f21469e = r9
            r0.f21475e = r7
            r0.f21474e = r6
            r0.f21470e = r2
            java.lang.Object r1 = r3.vip(r8, r1, r0)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 != r3) goto L5e
            return r3
        L5e:
            int r7 = r7 + r2
            goto L43
        L60:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12260e.ad(eۡۦ, android.content.Context, int[], eُؑ۠):java.lang.Object");
    }

    public abstract AbstractC5857e appmetrica();

    public final Object license(InterfaceC18435e interfaceC18435e, Context context, int[] iArr, AbstractC7185e abstractC7185e) {
        purchase(interfaceC18435e, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(AbstractC5336e.vip(3, null, interfaceC18435e, new C1086e(this, context, i, null)));
        }
        Object ad = AbstractC12475e.ad(arrayList, abstractC7185e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }

    public final Object metrica(InterfaceC18435e interfaceC18435e, Context context, int i, Bundle bundle, AbstractC7185e abstractC7185e) {
        Object obj;
        purchase(interfaceC18435e, context);
        AbstractC5857e appmetrica = appmetrica();
        boolean z = appmetrica.license() instanceof C6883e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (z || (Build.VERSION.SDK_INT > 31 && (appmetrica.license() instanceof C16576e))) {
            obj = Unit.INSTANCE;
        } else {
            obj = appmetrica.metrica(context, new C10838e(i), bundle, new C5772e(bundle, null, 0), abstractC7185e);
            if (obj != enumC2821e) {
                obj = Unit.INSTANCE;
            }
        }
        return obj == enumC2821e ? obj : Unit.INSTANCE;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (AbstractC13350e.appmetrica(context, new C16202e(this, i, bundle, 2))) {
            return;
        }
        AbstractC6959e.yandex(this, this.ad, new C12228e(this, context, i, bundle, null, 0));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        if (AbstractC13350e.appmetrica(context, new C15689e(this, iArr, 0))) {
            return;
        }
        AbstractC6959e.yandex(this, this.ad, new C5686e(this, context, iArr, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: all -> 0x0054, CancellationException -> 0x00c2, TryCatch #4 {CancellationException -> 0x00c2, all -> 0x0054, blocks: (B:23:0x004d, B:29:0x005d, B:30:0x0065, B:31:0x0066, B:32:0x006e, B:33:0x006f, B:36:0x00b7, B:38:0x0085, B:40:0x0097, B:42:0x00a2, B:43:0x00ab, B:45:0x00a7, B:46:0x00af, B:47:0x00b6, B:48:0x007a), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af A[Catch: all -> 0x0054, CancellationException -> 0x00c2, TryCatch #4 {CancellationException -> 0x00c2, all -> 0x0054, blocks: (B:23:0x004d, B:29:0x005d, B:30:0x0065, B:31:0x0066, B:32:0x006e, B:33:0x006f, B:36:0x00b7, B:38:0x0085, B:40:0x0097, B:42:0x00a2, B:43:0x00ab, B:45:0x00a7, B:46:0x00af, B:47:0x00b6, B:48:0x007a), top: B:4:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r10.getAction()     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            if (r1 == 0) goto L1b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L7a
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L6f
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1f
        L1b:
            r2 = r8
            r3 = r9
            goto Lb7
        L1f:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            if (r0 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r10.getStringExtra(r0)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            if (r5 == 0) goto L66
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r10.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            if (r4 == r1) goto L5d
            eٍٖٔ r10 = new eٍٖٔ     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            r0 = 1
            r10.<init>(r8, r4, r5, r0)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            boolean r10 = defpackage.AbstractC13350e.appmetrica(r9, r10)     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            if (r10 != 0) goto L5b
            eّٕٓ r10 = r8.ad     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            eّؔؔ r1 = new eّؔؔ     // Catch: java.lang.Throwable -> L58 java.util.concurrent.CancellationException -> L5b
            r6 = 0
            r7 = 1
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            defpackage.AbstractC6959e.yandex(r8, r10, r1)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            return
        L54:
            r0 = move-exception
        L55:
            r9 = r0
            goto Lbb
        L58:
            r0 = move-exception
            r2 = r8
            goto L55
        L5b:
            r2 = r8
            goto Lc2
        L5d:
            r2 = r8
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r10 = "Intent is missing AppWidgetId extra"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            throw r9     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
        L66:
            r2 = r8
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r10 = "Intent is missing ActionKey extra"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            throw r9     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
        L6f:
            r2 = r8
            r3 = r9
            java.lang.String r9 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            if (r9 != 0) goto L85
            goto Lb7
        L7a:
            r2 = r8
            r3 = r9
            java.lang.String r9 = "android.intent.action.LOCALE_CHANGED"
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            if (r9 != 0) goto L85
            goto Lb7
        L85:
            android.appwidget.AppWidgetManager r9 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            if (r4 == 0) goto Laf
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            boolean r1 = r10.hasExtra(r0)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            if (r1 == 0) goto La7
            int[] r10 = r10.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            goto Lab
        La7:
            int[] r10 = r9.getAppWidgetIds(r5)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
        Lab:
            r8.onUpdate(r3, r9, r10)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            return
        Laf:
            java.lang.String r9 = "no canonical name"
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            throw r10     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
        Lb7:
            super.onReceive(r3, r10)     // Catch: java.lang.Throwable -> L54 java.util.concurrent.CancellationException -> Lc2
            return
        Lbb:
            java.lang.String r10 = "GlanceAppWidget"
            java.lang.String r0 = "Error in Glance App Widget"
            android.util.Log.e(r10, r0, r9)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12260e.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (AbstractC13350e.appmetrica(context, new C15689e(this, iArr, 1))) {
            return;
        }
        AbstractC6959e.yandex(this, this.ad, new C5686e(this, context, iArr, null, 1));
    }

    public final void purchase(InterfaceC18435e interfaceC18435e, Context context) {
        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C6626e(context, this, null, 18), 3);
    }

    public final Object vip(InterfaceC18435e interfaceC18435e, Context context, int i, String str, AbstractC7185e abstractC7185e) {
        purchase(interfaceC18435e, context);
        AbstractC5857e appmetrica = appmetrica();
        appmetrica.getClass();
        Object metrica = appmetrica.metrica(context, new C10838e(i), null, new C5772e(str, null, 1), abstractC7185e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (metrica != enumC2821e) {
            metrica = Unit.INSTANCE;
        }
        return metrica == enumC2821e ? metrica : Unit.INSTANCE;
    }
}
