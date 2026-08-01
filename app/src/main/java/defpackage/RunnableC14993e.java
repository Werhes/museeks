package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC14993e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f29722e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29723e;

    public /* synthetic */ RunnableC14993e(Context context, int i) {
        this.f29723e = i;
        this.f29722e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f29723e
            switch(r0) {
                case 0: goto L36;
                case 1: goto L30;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            eؙٓ۠ r0 = new eؙٓ۠
            r1 = 2
            r0.<init>(r1)
            eْؔۥ r1 = defpackage.AbstractC1599e.ad
            r2 = 0
            android.content.Context r3 = r11.f29722e
            defpackage.AbstractC1599e.advert(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            eِٔ۟ r0 = new eِٔ۟
            r1 = 3
            android.content.Context r2 = r11.f29722e
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L30:
            android.content.Context r0 = r11.f29722e
            defpackage.AbstractC12346e.loadAd(r0)
            return
        L36:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L90
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f29722e
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L90
            if (r0 < r2) goto L67
            java.lang.Object r0 = defpackage.AbstractC12346e.metrica()
            if (r0 == 0) goto L6c
            android.os.LocaleList r0 = defpackage.AbstractC2656e.ad(r0)
            eؙُٙ r2 = new eؙُٙ
            eًؗؔ r4 = new eًؗؔ
            r4.<init>(r0)
            r2.<init>(r4)
            goto L6e
        L67:
            eؙُٙ r2 = defpackage.AbstractC12346e.f24755e
            if (r2 == 0) goto L6c
            goto L6e
        L6c:
            eؙُٙ r2 = defpackage.C6473e.vip
        L6e:
            eٔٓٗ r0 = r2.ad
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L89
            java.lang.String r0 = defpackage.AbstractC11912e.appmetrica(r5)
            java.lang.String r2 = "locale"
            java.lang.Object r2 = r5.getSystemService(r2)
            if (r2 == 0) goto L89
            android.os.LocaleList r0 = defpackage.AbstractC11171e.ad(r0)
            defpackage.AbstractC2656e.vip(r2, r0)
        L89:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L90:
            defpackage.AbstractC12346e.f24762e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC14993e.run():void");
    }
}
