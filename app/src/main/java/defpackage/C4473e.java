package defpackage;

import android.util.Log;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4473e {
    public final C1253e ad;
    public boolean adcel;
    public final InterfaceC8018e appmetrica;
    public final InterfaceC8850e billing;
    public final C16723e license;
    public final InterfaceC11882e metrica;
    public String mopub = BuildConfig.FLAVOR;
    public final C5233e purchase;
    public boolean startapp;
    public final C7596e vip;
    public C12893e yandex;

    public C4473e(C1253e c1253e, C7596e c7596e, InterfaceC11882e interfaceC11882e, C16723e c16723e, InterfaceC8018e interfaceC8018e, C5233e c5233e, InterfaceC8850e interfaceC8850e) {
        this.ad = c1253e;
        this.vip = c7596e;
        this.metrica = interfaceC11882e;
        this.license = c16723e;
        this.appmetrica = interfaceC8018e;
        this.purchase = c5233e;
        this.billing = interfaceC8850e;
        AbstractC5336e.purchase(AbstractC9743e.ad(interfaceC8850e), null, 0, new C10203e(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C4473e r4, java.lang.String r5, defpackage.EnumC6067e r6, defpackage.InterfaceC5083e r7) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4473e.ad(eٌؖۤ, java.lang.String, eؘۦۦ, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (defpackage.C14157e.purchase(r9) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (defpackage.C14157e.purchase(r9) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean appmetrica(defpackage.C12893e r12) {
        /*
            r11 = this;
            eّٗۡ r0 = r12.vip
            eؘٙؐ r12 = r12.ad
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L74
            eٗؒۥ r4 = r11.license
            eّٗۡ r4 = r4.ad()
            eٍ٘ؖ r5 = defpackage.C14157e.f27993e
            long r4 = r4.ad
            long r6 = r0.ad
            long r4 = r4 - r6
            eٖؒٗ r0 = defpackage.EnumC15934e.MILLISECONDS
            long r4 = defpackage.AbstractC0326e.admob(r4, r0)
            eؒۗٚ r0 = r11.ad
            eٔؕٛ r6 = r0.ad
            eٟٜٓ r6 = r6.metrica()
            r7 = 0
            if (r6 == 0) goto L37
            long r9 = r6.f27995e
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L37
            boolean r6 = defpackage.C14157e.purchase(r9)
            if (r6 != 0) goto L37
            goto L54
        L37:
            eٔؕٛ r0 = r0.vip
            eٟٜٓ r0 = r0.metrica()
            if (r0 == 0) goto L4c
            long r9 = r0.f27995e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4c
            boolean r0 = defpackage.C14157e.purchase(r9)
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            r0 = 30
            eٖؒٗ r6 = defpackage.EnumC15934e.MINUTES
            long r9 = defpackage.AbstractC0326e.Signature(r0, r6)
        L54:
            int r0 = defpackage.C14157e.metrica(r4, r9)
            if (r0 <= 0) goto L5b
            r3 = 1
        L5b:
            if (r3 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.ad
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L73:
            return r3
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.ad
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4473e.appmetrica(eّۦٖ):boolean");
    }

    public final boolean license(C12893e c12893e) {
        Map map = c12893e.metrica;
        boolean z = true;
        C5233e c5233e = this.purchase;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c5233e.ad());
            return true;
        }
        C17545e c17545e = (C17545e) map.get(c5233e.ad());
        if (c17545e != null && c17545e.ad == c5233e.metrica && AbstractC7890e.billing(c17545e.vip, (String) c5233e.license.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + c5233e.ad() + " is stale");
        }
        return z;
    }

    public final void metrica() {
        this.startapp = true;
        C12893e c12893e = this.yandex;
        if (c12893e == null) {
            this.adcel = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.purchase.ad());
        if (appmetrica(c12893e) || license(c12893e)) {
            AbstractC5336e.purchase(AbstractC9743e.ad(this.billing), null, 0, new C7602e(this, c12893e, null, 8), 3);
        }
    }

    public final void vip() {
        this.startapp = false;
        if (this.yandex == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.purchase.ad());
        AbstractC5336e.purchase(AbstractC9743e.ad(this.billing), null, 0, new C10203e(this, null, 1), 3);
    }
}
