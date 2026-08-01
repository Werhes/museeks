package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11666e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f23444e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f23445e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f23446e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23447e;

    public /* synthetic */ RunnableC11666e(int i) {
        this.f23447e = i;
    }

    public /* synthetic */ RunnableC11666e(int i, Object obj, Object obj2, Object obj3) {
        this.f23447e = i;
        this.f23445e = obj;
        this.f23444e = obj2;
        this.f23446e = obj3;
    }

    public /* synthetic */ RunnableC11666e(Context context, C18320e c18320e, CountDownLatch countDownLatch) {
        this.f23447e = 11;
        this.f23444e = context;
        this.f23445e = c18320e;
        this.f23446e = countDownLatch;
    }

    public RunnableC11666e(BinderC5579e binderC5579e, C7568e c7568e, String str, String str2) {
        this.f23447e = 22;
        this.f23445e = c7568e;
        this.f23444e = str;
        this.f23446e = str2;
    }

    public RunnableC11666e(C10640e c10640e, AtomicReference atomicReference, C8019e c8019e) {
        this.f23447e = 18;
        this.f23445e = atomicReference;
        this.f23444e = c8019e;
        Objects.requireNonNull(c10640e);
        this.f23446e = c10640e;
    }

    public /* synthetic */ RunnableC11666e(C10682e c10682e, C9271e c9271e, String str) {
        this.f23447e = 17;
        this.f23445e = c10682e;
        this.f23444e = c9271e;
        this.f23446e = str;
    }

    public RunnableC11666e(C15899e c15899e, String str) {
        this.f23447e = 6;
        this.f23444e = c15899e;
        this.f23446e = str;
        this.f23445e = new Object();
    }

    public /* synthetic */ RunnableC11666e(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f23447e = i;
        this.f23446e = obj;
        this.f23445e = obj2;
        this.f23444e = obj3;
    }

    private final /* synthetic */ void ad() {
        InterfaceC13524e interfaceC13524e;
        BinderC12679e binderC12679e = (BinderC12679e) this.f23445e;
        HashMap hashMap = binderC12679e.license.subs;
        String str = (String) this.f23444e;
        synchronized (hashMap) {
            interfaceC13524e = (InterfaceC13524e) hashMap.get(str);
        }
        if (interfaceC13524e == null) {
            C4612e.f9940interface.vip("Discarded message for unknown namespace '%s'", str);
            return;
        }
        String str2 = (String) this.f23446e;
        CastDevice castDevice = binderC12679e.license.ads;
        ((C5710e) interfaceC13524e).mopub(str2);
    }

    private final void appmetrica() {
        C5240e c5240e;
        C6936e c6936e;
        C1195e c1195e;
        C13879e c13879e;
        InterfaceC9026e interfaceC9026e = (InterfaceC9026e) this.f23444e;
        C10640e c10640e = (C10640e) this.f23446e;
        String str = null;
        try {
            try {
                c6936e = (C6936e) c10640e.f36443e;
                c1195e = c6936e.f14198e;
                c13879e = c6936e.f14227e;
                C6936e.purchase(c1195e);
            } catch (RemoteException e) {
                C13879e c13879e2 = ((C6936e) c10640e.f36443e).f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.vip(e, "Failed to get app instance id");
            }
            if (c1195e.m488e().startapp(EnumC9102e.ANALYTICS_STORAGE)) {
                InterfaceC8227e interfaceC8227e = c10640e.f20961e;
                if (interfaceC8227e != null) {
                    str = interfaceC8227e.mo1655e((C8019e) this.f23445e);
                    if (str != null) {
                        C8320e c8320e = c6936e.f14199e;
                        C6936e.billing(c8320e);
                        c8320e.f17009e.set(str);
                        C6936e.purchase(c1195e);
                        c1195e.f3809e.isVip(str);
                    }
                    c10640e.m2853e();
                    c5240e = ((C6936e) c10640e.f36443e).f14223e;
                    C6936e.purchase(c5240e);
                    c5240e.m1821e(str, interfaceC9026e);
                }
                C6936e.yandex(c13879e);
                c13879e.f27502e.ad("Failed to get app instance id");
            } else {
                C6936e.yandex(c13879e);
                c13879e.f27494e.ad("Analytics storage consent denied; will not get app instance id");
                C8320e c8320e2 = c6936e.f14199e;
                C6936e.billing(c8320e2);
                c8320e2.f17009e.set(null);
                C6936e.purchase(c1195e);
                c1195e.f3809e.isVip(null);
            }
            c5240e = c6936e.f14223e;
            C6936e.purchase(c5240e);
            c5240e.m1821e(str, interfaceC9026e);
        } catch (Throwable th) {
            C5240e c5240e2 = ((C6936e) c10640e.f36443e).f14223e;
            C6936e.purchase(c5240e2);
            c5240e2.m1821e(null, interfaceC9026e);
            throw th;
        }
    }

    private final void license() {
        AtomicReference atomicReference;
        C10640e c10640e;
        C6936e c6936e;
        C1195e c1195e;
        AtomicReference atomicReference2 = (AtomicReference) this.f23445e;
        synchronized (atomicReference2) {
            try {
                try {
                    c10640e = (C10640e) this.f23446e;
                    c6936e = (C6936e) c10640e.f36443e;
                    c1195e = c6936e.f14198e;
                    C6936e.purchase(c1195e);
                } catch (RemoteException e) {
                    C13879e c13879e = ((C6936e) ((C10640e) this.f23446e).f36443e).f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.vip(e, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.f23445e;
                }
                if (c1195e.m488e().startapp(EnumC9102e.ANALYTICS_STORAGE)) {
                    InterfaceC8227e interfaceC8227e = c10640e.f20961e;
                    if (interfaceC8227e != null) {
                        atomicReference2.set(interfaceC8227e.mo1655e((C8019e) this.f23444e));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            C8320e c8320e = ((C6936e) c10640e.f36443e).f14199e;
                            C6936e.billing(c8320e);
                            c8320e.f17009e.set(str);
                            C1195e c1195e2 = c6936e.f14198e;
                            C6936e.purchase(c1195e2);
                            c1195e2.f3809e.isVip(str);
                        }
                        c10640e.m2853e();
                        atomicReference = (AtomicReference) this.f23445e;
                        atomicReference.notify();
                        return;
                    }
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.ad("Failed to get app instance id");
                } else {
                    C13879e c13879e3 = c6936e.f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27494e.ad("Analytics storage consent denied; will not get app instance id");
                    C8320e c8320e2 = ((C6936e) c10640e.f36443e).f14199e;
                    C6936e.billing(c8320e2);
                    c8320e2.f17009e.set(null);
                    C1195e c1195e3 = c6936e.f14198e;
                    C6936e.purchase(c1195e3);
                    c1195e3.f3809e.isVip(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th) {
                ((AtomicReference) this.f23445e).notify();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [eٔ۟ٔ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void metrica() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f23445e
            eَؚۧ r0 = (defpackage.C10682e) r0
            java.lang.Object r1 = r14.f23444e
            eٍؗۤ r1 = (defpackage.C9271e) r1
            eٕؕۛ r2 = defpackage.EnumC15232e.INPUT_IMAGE_CONSTRUCTION
            java.lang.Object r3 = r14.f23446e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f18486e
            eؚؒٗ r4 = (defpackage.C0912e) r4
            r4.f3331e = r2
            java.lang.Object r2 = r4.f3332e
            eًّٖ r2 = (defpackage.C7964e) r2
            if (r2 == 0) goto L26
            java.lang.String r2 = r2.license
            int r4 = defpackage.AbstractC10307e.ad
            if (r2 == 0) goto L26
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L28
        L26:
            java.lang.String r2 = "NA"
        L28:
            eٔ۟ٔ r4 = new eٔ۟ٔ
            r4.<init>()
            java.lang.String r5 = r0.ad
            r4.ad = r5
            java.lang.String r5 = r0.vip
            r4.vip = r5
            java.lang.Class<eَؚۧ> r5 = defpackage.C10682e.class
            monitor-enter(r5)
            eؔۚۦ r6 = defpackage.C10682e.adcel     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L3e
            monitor-exit(r5)
            goto L95
        L3e:
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> Ld0
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Ld0
            eؙُٙ r6 = defpackage.AbstractC18039e.license(r6)     // Catch: java.lang.Throwable -> Ld0
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Ld0
            r8 = 0
            r9 = r8
        L4f:
            eٔٓٗ r10 = r6.ad     // Catch: java.lang.Throwable -> Ld0
            int r10 = r10.size()     // Catch: java.lang.Throwable -> Ld0
            if (r8 >= r10) goto L86
            eٔٓٗ r10 = r6.ad     // Catch: java.lang.Throwable -> Ld0
            java.util.Locale r10 = r10.get(r8)     // Catch: java.lang.Throwable -> Ld0
            eْٝۜ r11 = defpackage.AbstractC10849e.ad     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r10 = r10.toLanguageTag()     // Catch: java.lang.Throwable -> Ld0
            r10.getClass()     // Catch: java.lang.Throwable -> Ld0
            int r11 = r9 + 1
            int r12 = r7.length     // Catch: java.lang.Throwable -> Ld0
            if (r12 >= r11) goto L80
            int r13 = r12 >> 1
            int r12 = r12 + r13
            int r12 = r12 + 1
            if (r12 >= r11) goto L77
            int r12 = java.lang.Integer.highestOneBit(r9)     // Catch: java.lang.Throwable -> Ld0
            int r12 = r12 + r12
        L77:
            if (r12 >= 0) goto L7c
            r12 = 2147483647(0x7fffffff, float:NaN)
        L7c:
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r12)     // Catch: java.lang.Throwable -> Ld0
        L80:
            r7[r9] = r10     // Catch: java.lang.Throwable -> Ld0
            int r8 = r8 + 1
            r9 = r11
            goto L4f
        L86:
            eٍؚٞ r6 = defpackage.AbstractC6080e.f12753e     // Catch: java.lang.Throwable -> Ld0
            if (r9 != 0) goto L8d
            eؔۚۦ r6 = defpackage.C2847e.f6814e     // Catch: java.lang.Throwable -> Ld0
            goto L92
        L8d:
            eؔۚۦ r6 = new eؔۚۦ     // Catch: java.lang.Throwable -> Ld0
            r6.<init>(r9, r7)     // Catch: java.lang.Throwable -> Ld0
        L92:
            defpackage.C10682e.adcel = r6     // Catch: java.lang.Throwable -> Ld0
            monitor-exit(r5)
        L95:
            r4.appmetrica = r6
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.yandex = r5
            r4.license = r2
            r4.metrica = r3
            eؑۛٞ r2 = r0.purchase
            boolean r2 = r2.advert()
            if (r2 == 0) goto Lb0
            eؑۛٞ r2 = r0.purchase
            java.lang.Object r2 = r2.adcel()
            java.lang.String r2 = (java.lang.String) r2
            goto Lb6
        Lb0:
            eؘۥ۠ r2 = r0.license
            java.lang.String r2 = r2.ad()
        Lb6:
            r4.purchase = r2
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.adcel = r2
            int r2 = r0.yandex
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.mopub = r2
            r1.f18485e = r4
            eٓؔۧ r0 = r0.metrica
            r0.ad(r1)
            return
        Ld0:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Ld0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC11666e.metrica():void");
    }

    private final void purchase() {
        InterfaceC13524e interfaceC13524e;
        C7568e c7568e = (C7568e) this.f23445e;
        synchronized (c7568e.f15399class) {
            interfaceC13524e = (InterfaceC13524e) c7568e.f15399class.get((String) this.f23444e);
        }
        if (interfaceC13524e != null) {
            ((C5710e) interfaceC13524e).mopub((String) this.f23446e);
        } else {
            C7568e.f15392final.vip("Discarded message for unknown namespace '%s'", (String) this.f23444e);
        }
    }

    private final void vip() {
        int i;
        C0560e m2615implements;
        C18320e c18320e = (C18320e) this.f23445e;
        Intent intent = c18320e.f35976e;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            m2615implements = AbstractC1749e.appmetrica(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c18320e.f35976e;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c18320e.f35976e;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.f23444e;
            bundle.putBoolean("supports_message_handled", true);
            C9556e m2611default = C9556e.m2611default(context);
            synchronized (m2611default) {
                i = m2611default.f18970e;
                m2611default.f18970e = i + 1;
            }
            m2615implements = m2611default.m2615implements(new C2680e(i, 2, bundle, 0));
        }
        m2615implements.vip(ExecutorC8172e.f16645e, new C8383e((CountDownLatch) this.f23446e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r12v1, types: [eًَؙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eٕ٘ؔ, eؓۨۖ] */
    public List billing() {
        C4956e amazon = ((C15899e) this.f23444e).appmetrica.amazon();
        String str = (String) this.f23446e;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) amazon.f10517e;
        C6096e purchase = C6096e.purchase(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            purchase.loadAd(1);
        } else {
            purchase.Signature(1, str);
        }
        workDatabase_Impl.vip();
        workDatabase_Impl.metrica();
        try {
            Cursor appmetrica = AbstractC15389e.appmetrica(workDatabase_Impl, purchase);
            try {
                int startapp = AbstractC12640e.startapp(appmetrica, "id");
                int startapp2 = AbstractC12640e.startapp(appmetrica, "state");
                int startapp3 = AbstractC12640e.startapp(appmetrica, "output");
                int startapp4 = AbstractC12640e.startapp(appmetrica, "run_attempt_count");
                ?? c17519e = new C17519e(0);
                ?? c17519e2 = new C17519e(0);
                while (appmetrica.moveToNext()) {
                    if (!appmetrica.isNull(startapp)) {
                        String string = appmetrica.getString(startapp);
                        if (((ArrayList) c17519e.get(string)) == null) {
                            c17519e.put(string, new ArrayList());
                        }
                    }
                    if (!appmetrica.isNull(startapp)) {
                        String string2 = appmetrica.getString(startapp);
                        if (((ArrayList) c17519e2.get(string2)) == null) {
                            c17519e2.put(string2, new ArrayList());
                        }
                    }
                }
                appmetrica.moveToPosition(-1);
                amazon.vip(c17519e);
                amazon.ad(c17519e2);
                ArrayList arrayList = new ArrayList(appmetrica.getCount());
                while (appmetrica.moveToNext()) {
                    ArrayList arrayList2 = !appmetrica.isNull(startapp) ? (ArrayList) c17519e.get(appmetrica.getString(startapp)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = appmetrica.isNull(startapp) ? null : (ArrayList) c17519e2.get(appmetrica.getString(startapp));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ?? obj = new Object();
                    obj.ad = appmetrica.getString(startapp);
                    obj.vip = AbstractC11203e.yandex(appmetrica.getInt(startapp2));
                    obj.metrica = C13198e.ad(appmetrica.getBlob(startapp3));
                    obj.license = appmetrica.getInt(startapp4);
                    obj.appmetrica = arrayList2;
                    obj.purchase = arrayList3;
                    arrayList.add(obj);
                }
                workDatabase_Impl.yandex();
                appmetrica.close();
                purchase.isVip();
                workDatabase_Impl.purchase();
                return (List) C13394e.remoteconfig.apply(arrayList);
            } catch (Throwable th) {
                appmetrica.close();
                purchase.isVip();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.purchase();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC11666e.run():void");
    }

    public String toString() {
        switch (this.f23447e) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                RunnableC11327e runnableC11327e = (RunnableC11327e) this.f23446e;
                StringBuilder sb = new StringBuilder(runnableC11327e.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(runnableC11327e);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
