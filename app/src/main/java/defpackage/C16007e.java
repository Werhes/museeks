package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16007e {
    public final String ad;
    public final C0576e adcel;
    public Object advert;
    public final C1615e amazon;
    public final AbstractC5857e appmetrica;
    public final InterfaceC1811e billing;
    public final C14137e license;
    public final AtomicBoolean metrica;
    public final C0576e mopub;
    public final C10838e purchase;
    public final C6799e smaato;
    public final boolean startapp;
    public final AtomicBoolean vip;
    public final InterfaceC3997e yandex;

    public C16007e(AbstractC5857e abstractC5857e, C10838e c10838e, Bundle bundle) {
        C16669e c16669e = C16669e.ad;
        InterfaceC3997e license = abstractC5857e.license();
        this.ad = AbstractC14114e.vip(c10838e.ad);
        this.vip = new AtomicBoolean(true);
        this.metrica = new AtomicBoolean(false);
        this.license = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
        this.appmetrica = abstractC5857e;
        this.purchase = c10838e;
        this.billing = c16669e;
        this.yandex = license;
        this.startapp = true;
        if (AbstractC14114e.purchase(c10838e)) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        C10990e c10990e = C10990e.f21771e;
        this.adcel = new C0576e(null, c10990e);
        this.mopub = new C0576e(bundle, c10990e);
        this.advert = C9139e.f18290e;
        this.smaato = AbstractC6629e.ad();
        this.amazon = AbstractC9180e.metrica(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00a8 -> B:10:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object appmetrica(defpackage.C16007e r6, java.util.ArrayList r7, defpackage.AbstractC10731e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C6214e
            if (r0 == 0) goto L13
            r0 = r8
            eؙْؗ r0 = (defpackage.C6214e) r0
            int r1 = r0.f12990e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12990e = r1
            goto L18
        L13:
            eؙْؗ r0 = new eؙْؗ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12992e
            int r1 = r0.f12990e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            int r6 = r0.f12989e
            int r7 = r0.f12993e
            java.util.List r1 = r0.f12994e
            eٖؖۙ r3 = r0.f12987e
            eٖؖۙ r4 = r0.f12991e
            defpackage.AbstractC2003e.purchase(r8)
            goto Lab
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.AbstractC2003e.purchase(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r7.iterator()
        L44:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof defpackage.C4015e
            if (r4 == 0) goto L44
            r8.add(r3)
            goto L44
        L56:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5f:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r7.next()
            boolean r4 = r3 instanceof defpackage.C16440e
            if (r4 == 0) goto L5f
            r1.add(r3)
            goto L5f
        L71:
            java.lang.Object r7 = defpackage.AbstractC13480e.m3569abstract(r1)
            eٖۗ۠ r7 = (defpackage.C16440e) r7
            if (r7 == 0) goto L7c
            android.os.Bundle r7 = r7.ad
            goto L7d
        L7c:
            r7 = 0
        L7d:
            eٖؖۙ r1 = new eٖؖۙ
            eؘٕۘ r3 = r6.appmetrica
            eؘُٜ r6 = r6.purchase
            r1.<init>(r3, r6, r7)
            int r6 = r8.size()
            r7 = 0
            r3 = r1
            r4 = r3
            r1 = r8
        L8e:
            if (r7 >= r6) goto Lad
            java.lang.Object r8 = r1.get(r7)
            eٍؖۥ r8 = (defpackage.C4015e) r8
            r0.f12991e = r4
            r0.f12987e = r3
            r0.f12994e = r1
            r0.f12993e = r7
            r0.f12989e = r6
            r0.f12990e = r2
            java.lang.Object r8 = r3.purchase(r8, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r8 != r5) goto Lab
            return r5
        Lab:
            int r7 = r7 + r2
            goto L8e
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16007e.appmetrica(eٖؖۙ, java.util.ArrayList, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object metrica(defpackage.C16007e r5, android.content.Context r6, java.lang.Object r7, defpackage.AbstractC10731e r8) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16007e.metrica(eٖؖۙ, android.content.Context, java.lang.Object, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(1:(1:(4:19|20|21|22)(1:(2:13|14)(3:16|17|18)))(1:23))(2:63|(2:65|66)(3:67|(1:69)|42))|24|25|26|27|28|29|(9:31|32|33|34|35|36|(1:38)|39|40)(2:58|59)))|70|6|(0)(0)|24|25|26|27|28|29|(0)(0)|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        if (r3.vip(r5) == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0163, code lost:
    
        if (r3.vip(r5) != r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        if (r3.vip(r5) != r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        if (r3.vip(r5) != r12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: all -> 0x00ef, CancellationException -> 0x00f1, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x00f1, all -> 0x00ef, blocks: (B:27:0x008f, B:29:0x0094, B:31:0x009c, B:36:0x00e5, B:38:0x00e9, B:39:0x00f3, B:58:0x0114, B:59:0x012b), top: B:26:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114 A[Catch: all -> 0x00ef, CancellationException -> 0x00f1, TRY_ENTER, TryCatch #4 {CancellationException -> 0x00f1, all -> 0x00ef, blocks: (B:27:0x008f, B:29:0x0094, B:31:0x009c, B:36:0x00e5, B:38:0x00e9, B:39:0x00f3, B:58:0x0114, B:59:0x012b), top: B:26:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object vip(defpackage.C16007e r20, android.content.Context r21, defpackage.AbstractC5918e r22, defpackage.AbstractC10731e r23) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16007e.vip(eٖؖۙ, android.content.Context, eؘۜٚ, eُؑ۠):java.lang.Object");
    }

    public final void ad(Context context, Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        if (!this.startapp) {
            throw th;
        }
        int i = this.purchase.ad;
        this.appmetrica.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), R.layout.glance_error_layout));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object billing(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C0254e
            if (r0 == 0) goto L13
            r0 = r5
            eِؑٛ r0 = (defpackage.C0254e) r0
            int r1 = r0.f2248e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2248e = r1
            goto L18
        L13:
            eِؑٛ r0 = new eِؑٛ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2246e
            int r1 = r0.f2248e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؘَۣ r0 = r0.f2247e
            defpackage.AbstractC2003e.purchase(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            eؘَۣ r5 = new eؘَۣ
            eؙۧؐ r1 = new eؙۧؐ
            eؙۧؐ r3 = r4.smaato
            r1.<init>(r3)
            r5.<init>(r1)
            r0.f2247e = r5
            r0.f2248e = r2
            java.lang.Object r0 = r4.purchase(r5, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            eؙۧؐ r5 = r0.ad
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16007e.billing(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(5:19|20|(1:22)|24|25))(2:27|28))(6:29|30|20|(0)|24|25))(4:31|32|14|(0)(0))))|34|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (metrica(r6, r1, r9, r0) == r4) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[Catch: eؕۡؗ -> 0x0082, TRY_LEAVE, TryCatch #0 {eؕۡؗ -> 0x0082, blocks: (B:12:0x002c, B:14:0x0052, B:20:0x0064, B:22:0x006c, B:30:0x0041, B:32:0x0048), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(android.content.Context r7, defpackage.C9675e r8, defpackage.AbstractC10731e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C5393e
            if (r0 == 0) goto L13
            r0 = r9
            eؘۣؓ r0 = (defpackage.C5393e) r0
            int r1 = r0.f11545e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11545e = r1
            goto L18
        L13:
            eؘۣؓ r0 = new eؘۣؓ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f11546e
            int r1 = r0.f11545e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            eٜؐ r7 = r0.f11547e
            kotlin.jvm.functions.Function1 r8 = r0.f11542e
            android.content.Context r1 = r0.f11544e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: defpackage.C3680e -> L82
        L2f:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L52
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            eٜؐ r7 = r0.f11547e
            kotlin.jvm.functions.Function1 r8 = r0.f11542e
            android.content.Context r1 = r0.f11544e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: defpackage.C3680e -> L82
            goto L64
        L45:
            defpackage.AbstractC2003e.purchase(r9)
            eٖٓٞ r9 = r6.license     // Catch: defpackage.C3680e -> L82
            r9.getClass()     // Catch: defpackage.C3680e -> L82
            eٜؐ r1 = new eٜؐ     // Catch: defpackage.C3680e -> L82
            r1.<init>(r9)     // Catch: defpackage.C3680e -> L82
        L52:
            r0.f11544e = r7     // Catch: defpackage.C3680e -> L82
            r0.f11542e = r8     // Catch: defpackage.C3680e -> L82
            r0.f11547e = r1     // Catch: defpackage.C3680e -> L82
            r0.f11545e = r3     // Catch: defpackage.C3680e -> L82
            java.lang.Object r9 = r1.ad(r0)     // Catch: defpackage.C3680e -> L82
            if (r9 != r4) goto L61
            goto L81
        L61:
            r5 = r1
            r1 = r7
            r7 = r5
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: defpackage.C3680e -> L82
            boolean r9 = r9.booleanValue()     // Catch: defpackage.C3680e -> L82
            if (r9 == 0) goto L82
            java.lang.Object r9 = r7.vip()     // Catch: defpackage.C3680e -> L82
            r8.invoke(r9)     // Catch: defpackage.C3680e -> L82
            r0.f11544e = r1     // Catch: defpackage.C3680e -> L82
            r0.f11542e = r8     // Catch: defpackage.C3680e -> L82
            r0.f11547e = r7     // Catch: defpackage.C3680e -> L82
            r0.f11545e = r2     // Catch: defpackage.C3680e -> L82
            java.lang.Object r9 = metrica(r6, r1, r9, r0)     // Catch: defpackage.C3680e -> L82
            if (r9 != r4) goto L2f
        L81:
            return r4
        L82:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16007e.license(android.content.Context, eٍۖۦ, eُؑ۠):java.lang.Object");
    }

    public final Object purchase(Object obj, AbstractC10731e abstractC10731e) {
        Object metrica = this.license.metrica(abstractC10731e, obj);
        return metrica == EnumC2821e.f6782e ? metrica : Unit.INSTANCE;
    }
}
