package defpackage;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13539e implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService ad;
    public final String license;
    public final int metrica;
    public final int vip;

    public C13539e(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.ad = glanceRemoteViewsService;
        this.vip = i;
        this.metrica = i2;
        this.license = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r8.mo696protected(r5) == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r10 == r9) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C13539e r10, defpackage.C10838e r11, defpackage.AbstractC10731e r12) {
        /*
            androidx.glance.appwidget.GlanceRemoteViewsService r1 = r10.ad
            int r6 = r10.vip
            boolean r0 = r12 instanceof defpackage.C1886e
            if (r0 == 0) goto L18
            r0 = r12
            eؓ٘ۡ r0 = (defpackage.C1886e) r0
            int r2 = r0.f5023e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r0.f5023e = r2
        L16:
            r5 = r0
            goto L1e
        L18:
            eؓ٘ۡ r0 = new eؓ٘ۡ
            r0.<init>(r10, r12)
            goto L16
        L1e:
            java.lang.Object r10 = r5.f5022e
            int r12 = r5.f5023e
            r7 = 3
            r0 = 1
            r8 = 0
            eٟؔۙ r9 = defpackage.EnumC2821e.f6782e
            if (r12 == 0) goto L48
            if (r12 == r0) goto L44
            r11 = 2
            if (r12 == r11) goto L3d
            if (r12 != r7) goto L35
            defpackage.AbstractC2003e.purchase(r10)
            goto L9e
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            defpackage.AbstractC2003e.purchase(r10)
            r8 = r10
            eَٟۙ r8 = (defpackage.InterfaceC10500e) r8
            goto L93
        L44:
            defpackage.AbstractC2003e.purchase(r10)
            goto L87
        L48:
            defpackage.AbstractC2003e.purchase(r10)
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r1)
            android.appwidget.AppWidgetProviderInfo r10 = r10.getAppWidgetInfo(r6)
            if (r10 == 0) goto L72
            android.content.ComponentName r10 = r10.provider
            if (r10 == 0) goto L72
            java.lang.String r10 = r10.getClassName()
            if (r10 == 0) goto L72
            java.lang.Class r10 = java.lang.Class.forName(r10)
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r8)
            java.lang.Object r10 = r10.newInstance(r8)
            eّؖ r10 = (defpackage.AbstractC12260e) r10
            eؘٕۘ r10 = r10.appmetrica()
            goto L73
        L72:
            r10 = r8
        L73:
            if (r10 == 0) goto L8e
            eُؔۨ r4 = new eُؔۨ
            r12 = 4
            r4.<init>(r12, r0, r8)
            r5.f5023e = r0
            r3 = 0
            r0 = r10
            r2 = r11
            java.lang.Object r10 = r0.metrica(r1, r2, r3, r4, r5)
            if (r10 != r9) goto L87
            goto L9d
        L87:
            eَٟۙ r10 = (defpackage.InterfaceC10500e) r10
            if (r10 != 0) goto L8c
            goto L8e
        L8c:
            r8 = r10
            goto L93
        L8e:
            eُِۘ r10 = androidx.glance.appwidget.UnmanagedSessionReceiver.ad
            defpackage.C11672e.amazon(r6)
        L93:
            if (r8 == 0) goto La1
            r5.f5023e = r7
            java.lang.Object r10 = r8.mo696protected(r5)
            if (r10 != r9) goto L9e
        L9d:
            return r9
        L9e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        La1:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13539e.ad(eْ۟ٙ, eؘُٜ, eُؑ۠):java.lang.Object");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return vip().ad.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return vip().ad[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return vip().vip[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.ad.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return vip().metrica;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        vip().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        AbstractC5336e.yandex(C2693e.f6576e, new C16600e(this, null, 6));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        C11704e c11704e = GlanceRemoteViewsService.f431e;
        int i = this.vip;
        int i2 = this.metrica;
        String str = this.license;
        C11704e c11704e2 = GlanceRemoteViewsService.f431e;
        synchronized (c11704e2) {
            c11704e2.ad.remove(C11704e.ad(i, i2, str));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final C0335e vip() {
        C0335e c0335e;
        C11704e c11704e = GlanceRemoteViewsService.f431e;
        int i = this.vip;
        int i2 = this.metrica;
        String str = this.license;
        C11704e c11704e2 = GlanceRemoteViewsService.f431e;
        synchronized (c11704e2) {
            c0335e = (C0335e) c11704e2.ad.get(C11704e.ad(i, i2, str));
            if (c0335e == null) {
                c0335e = C0335e.license;
            }
        }
        return c0335e;
    }
}
