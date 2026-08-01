package com.werhes.museeksreborn.cache.path_migration;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import defpackage.AbstractC14114e;
import defpackage.AbstractC15448e;
import defpackage.AbstractC4608e;
import defpackage.AbstractC7535e;
import defpackage.AbstractServiceC5667e;
import defpackage.C10479e;
import defpackage.C11318e;
import defpackage.C15966e;
import defpackage.C16955e;
import defpackage.C4013e;
import defpackage.C4870e;
import defpackage.C4891e;
import defpackage.C5363e;
import defpackage.C5981e;
import defpackage.C6029e;
import defpackage.C7371e;
import defpackage.C9042e;
import defpackage.EnumC7785e;
import defpackage.InterfaceC5083e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/path_migration/DedicatedCacheMigrationService;", "Leؘُٖ;", "<init>", "()V", "eؚ٘ۖ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DedicatedCacheMigrationService extends AbstractServiceC5667e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f36555e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f36556e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5363e f36557e = new C5363e(new C10479e(17, this));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16955e f36558e;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01cd, code lost:
    
        if (defpackage.AbstractC15448e.ad(r0, r4) == r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
    
        if (defpackage.AbstractC5336e.advert(defpackage.AbstractC6731e.ad, new defpackage.C15238e(defpackage.C3293e.ad, r10, 4), r4) == r11) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService r17, defpackage.AbstractC16696e r18, defpackage.AbstractC16696e r19, defpackage.AbstractC10731e r20) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService.metrica(ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService, eٗؑٔ, eٗؑٔ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return new Binder();
    }

    @Override // defpackage.AbstractServiceC5667e, android.app.Service
    public final void onCreate() {
        super.onCreate();
        InterfaceC5083e interfaceC5083e = null;
        C4870e c4870e = new C4870e(this, interfaceC5083e, 14);
        C5981e c5981e = AbstractC15448e.ad;
        C6029e c6029e = this.f12041e;
        C4891e c4891e = (C4891e) c6029e.f12699e;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C7371e(c4013e, 8), new C15966e(c4870e, interfaceC5083e, 20), 3);
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        C9042e c9042e = new C9042e(this, interfaceC5083e, 13);
        C4891e c4891e2 = (C4891e) c6029e.f12699e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C7371e(c4013e, 9), new C15966e(c9042e, interfaceC5083e, 22), 3), c4891e2, enumC7785e), AbstractC4608e.metrica(c4891e2));
    }
}
