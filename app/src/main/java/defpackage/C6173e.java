package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6173e implements InterfaceC15169e, InterfaceC13464e, InterfaceC14651e, InterfaceC11124e, InterfaceC13466e, InterfaceC4583e, InterfaceC1325e, InterfaceC8193e, InterfaceC2156e, InterfaceC5808e, InterfaceC13204e, InterfaceC9307e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12946e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12940e = new C6173e(13);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12938e = new C6173e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12942e = new C6173e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12937e = new C6173e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12945e = new C6173e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12944e = new C6173e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12941e = new C6173e(20);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12943e = new C6173e(21);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C6173e f12939e = new C6173e(22);

    public /* synthetic */ C6173e(int i) {
        this.f12946e = i;
    }

    public C6173e(InputConnectionC0817e inputConnectionC0817e) {
        this.f12946e = 9;
    }

    public static C12999e signatures(String str, C14133e c14133e) {
        C6571e metrica = AbstractC12546e.metrica(c14133e);
        Charset charset = (Charset) metrica.f13544e;
        C14133e c14133e2 = (C14133e) metrica.f13543e;
        byte[] bytes = str.getBytes(charset);
        return subscription(bytes.length, c14133e2, bytes);
    }

    public static C12999e subscription(int i, C14133e c14133e, byte[] bArr) {
        AbstractC10220e.ad(bArr.length, 0, i);
        return new C12999e(i, c14133e, bArr);
    }

    @Override // defpackage.InterfaceC8193e
    public /* synthetic */ void Signature() {
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f12946e) {
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(100000L, 20, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(1000L, 49, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.config.url_scheme", 8, "https").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(50L, 21, "measurement.experiment.max_ids").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.user_properties", 80, "_npa,npa|_fot,fot").get();
            case 20:
                List list6 = AbstractC17254e.ad;
                return (Boolean) C0945e.ad.get();
            case 21:
                List list7 = AbstractC17254e.ad;
                C4261e.f9346e.get();
                return (Boolean) C13302e.ad.license("measurement.rb.attribution.service", true, 6).get();
            default:
                return new Boolean(((Boolean) C6202e.ad.get()).booleanValue());
        }
    }

    @Override // defpackage.InterfaceC11124e
    public void adcel(C13915e c13915e, long j, C2106e c2106e, int i, boolean z) {
        c13915e.premium(j, c2106e, i, z);
    }

    @Override // defpackage.InterfaceC1325e
    public long admob() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.InterfaceC11124e
    public boolean advert(C2106e c2106e, C13915e c13915e) {
        AbstractC17732e abstractC17732e = (AbstractC17732e) c13915e.f27592e.appmetrica;
        abstractC17732e.getClass();
        AbstractC13616e m4403e = abstractC17732e.m4403e(AbstractC5180e.billing(16));
        if (m4403e != null && m4403e.f27016e) {
            if (!m4403e.f27022e.f27016e) {
                AbstractC14070e.metrica("visitLocalDescendants called on an unattached node");
            }
            AbstractC13616e abstractC13616e = m4403e.f27022e;
            if ((abstractC13616e.f27020e & 16) != 0) {
                while (abstractC13616e != null) {
                    if ((abstractC13616e.f27014e & 16) != 0) {
                        AbstractC6126e abstractC6126e = abstractC13616e;
                        ?? r4 = 0;
                        while (abstractC6126e != 0) {
                            if (abstractC6126e instanceof InterfaceC4890e) {
                                if (((InterfaceC4890e) abstractC6126e).mo716e()) {
                                    c2106e.f5431e = c2106e.f5433e.vip - 1;
                                    return true;
                                }
                            } else if ((abstractC6126e.f27014e & 16) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                                int i = 0;
                                abstractC6126e = abstractC6126e;
                                r4 = r4;
                                while (abstractC13616e2 != null) {
                                    if ((abstractC13616e2.f27014e & 16) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            abstractC6126e = abstractC13616e2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC6126e != 0) {
                                                r4.license(abstractC6126e);
                                                abstractC6126e = 0;
                                            }
                                            r4.license(abstractC13616e2);
                                        }
                                    }
                                    abstractC13616e2 = abstractC13616e2.f27024e;
                                    abstractC6126e = abstractC6126e;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC6126e = AbstractC5851e.vip(r4);
                        }
                    }
                    abstractC13616e = abstractC13616e.f27024e;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC11124e
    public boolean amazon(C13915e c13915e) {
        return true;
    }

    @Override // defpackage.InterfaceC8193e
    public /* synthetic */ void appmetrica() {
    }

    @Override // defpackage.InterfaceC11124e
    public /* synthetic */ boolean billing(AbstractC13616e abstractC13616e) {
        return true;
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // defpackage.InterfaceC13464e
    public C8208e getKey() {
        return C8252e.f16750e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(2:10|11)(2:26|27))(4:28|29|30|(1:32))|12|13|14|(1:16)|17|(2:20|18)|21|22|23))|39|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        android.util.Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + r8 + " is corrupted", r0);
        r9 = defpackage.C1222e.admob();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        android.util.Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + r8, r0);
        r9 = defpackage.C1222e.admob();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[LOOP:0: B:18:0x00a5->B:20:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object inmobi(android.content.Context r7, int r8, defpackage.AbstractC10731e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C9267e
            if (r0 == 0) goto L13
            r0 = r9
            eٍؗۜ r0 = (defpackage.C9267e) r0
            int r1 = r0.f18480e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18480e = r1
            goto L18
        L13:
            eٍؗۜ r0 = new eٍؗۜ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f18483e
            int r1 = r0.f18480e
            java.lang.String r2 = "GlanceAppWidget"
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L31
            int r8 = r0.f18479e
            android.content.Context r7 = r0.f18481e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            goto L53
        L2b:
            r0 = move-exception
            r9 = r0
            goto L58
        L2e:
            r0 = move-exception
            r9 = r0
            goto L6e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.AbstractC2003e.purchase(r9)
            eٖۧۦ r9 = defpackage.C16669e.ad     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            eؘٙ۟ r1 = defpackage.C5717e.vip     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            java.lang.String r4 = defpackage.AbstractC4306e.purchase(r8)     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            r0.f18481e = r7     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            r0.f18479e = r8     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            r0.f18480e = r3     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            java.lang.Object r9 = r9.metrica(r7, r1, r4, r0)     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r9 != r0) goto L53
            return r0
        L53:
            eؒٞٝ r9 = (defpackage.C1222e) r9     // Catch: java.io.IOException -> L2b defpackage.C11506e -> L2e
        L55:
            r1 = r7
            r4 = r8
            goto L89
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "I/O error reading set of layout structures for App Widget id "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0, r9)
            eؒٞٝ r9 = defpackage.C1222e.admob()
            goto L55
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Set of layout structures for App Widget id "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " is corrupted"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0, r9)
            eؒٞٝ r9 = defpackage.C1222e.admob()
            goto L55
        L89:
            eؖٔۛ r7 = r9.subscription()
            r8 = 10
            int r8 = defpackage.AbstractC0746e.subscription(r7, r8)
            int r8 = defpackage.AbstractC10064e.appmetrica(r8)
            r0 = 16
            if (r8 >= r0) goto L9c
            r8 = r0
        L9c:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        La5:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc2
            java.lang.Object r8 = r7.next()
            eٌؖٗ r8 = (defpackage.C3994e) r8
            eؚٔۖ r2 = r8.Signature()
            int r8 = r8.admob()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            r0.put(r2, r3)
            goto La5
        Lc2:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            eؙۛۤ r0 = new eؙۛۤ
            int r3 = r9.remoteconfig()
            java.util.Collection r7 = r2.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r5 = defpackage.AbstractC13480e.m3581e(r7)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6173e.inmobi(android.content.Context, int, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC13464e
    public Object isPro(Function1 function1) {
        C18540e c18540e = new C18540e(25);
        function1.invoke(c18540e);
        return new C8252e((C11698e) c18540e.f36382e, (ArrayList) c18540e.f36383e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|43|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r10 != r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0044, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isVip(defpackage.InterfaceC4648e r9, defpackage.AbstractC10731e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C4576e
            if (r0 == 0) goto L13
            r0 = r10
            eؗؑٔ r0 = (defpackage.C4576e) r0
            int r1 = r0.f9867e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9867e = r1
            goto L18
        L13:
            eؗؑٔ r0 = new eؗؑٔ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f9865e
            int r1 = r0.f9867e
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L46
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L34
            java.lang.Object r9 = r0.f9866e
            java.lang.String r9 = (java.lang.String) r9
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Exception -> L32
            goto L82
        L32:
            r10 = move-exception
            goto L89
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f9866e
            eؗؕۦ r9 = (defpackage.InterfaceC4648e) r9
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Exception -> L44
            goto L5e
        L44:
            r10 = move-exception
            goto L6a
        L46:
            defpackage.AbstractC2003e.purchase(r10)
            r10 = r9
            eٔۙؗ r10 = (defpackage.C14935e) r10     // Catch: java.lang.Exception -> L44
            eؑۛٞ r9 = r10.appmetrica()     // Catch: java.lang.Exception -> L44
            r0.f9866e = r10     // Catch: java.lang.Exception -> L66
            r0.f9867e = r4     // Catch: java.lang.Exception -> L66
            java.lang.Object r9 = defpackage.AbstractC7700e.ad(r9, r0)     // Catch: java.lang.Exception -> L66
            if (r9 != r6) goto L5b
            goto L81
        L5b:
            r7 = r10
            r10 = r9
            r9 = r7
        L5e:
            eٌٔۛ r10 = (defpackage.C14606e) r10     // Catch: java.lang.Exception -> L44
            java.lang.String r10 = r10.ad     // Catch: java.lang.Exception -> L44
            r7 = r10
            r10 = r9
            r9 = r7
            goto L71
        L66:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r2, r1, r10)
            r10 = r9
            r9 = r5
        L71:
            eٔۙؗ r10 = (defpackage.C14935e) r10     // Catch: java.lang.Exception -> L32
            eؑۛٞ r10 = r10.license()     // Catch: java.lang.Exception -> L32
            r0.f9866e = r9     // Catch: java.lang.Exception -> L32
            r0.f9867e = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = defpackage.AbstractC7700e.ad(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r6) goto L82
        L81:
            return r6
        L82:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L87
            goto L8e
        L87:
            r5 = r10
            goto L8e
        L89:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r2, r0, r10)
        L8e:
            eٝۧ r10 = new eٝۧ
            r10.<init>(r5, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6173e.isVip(eؗؕۦ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.InterfaceC11124e
    public boolean license(AbstractC13616e abstractC13616e) {
        ?? r1 = 0;
        while (abstractC13616e != 0) {
            if (abstractC13616e instanceof InterfaceC4890e) {
                ((InterfaceC4890e) abstractC13616e).mo708catch();
            } else if ((abstractC13616e.f27014e & 16) != 0 && (abstractC13616e instanceof AbstractC6126e)) {
                AbstractC13616e abstractC13616e2 = abstractC13616e.f12873e;
                int i = 0;
                r1 = r1;
                abstractC13616e = abstractC13616e;
                while (abstractC13616e2 != null) {
                    if ((abstractC13616e2.f27014e & 16) != 0) {
                        i++;
                        r1 = r1;
                        if (i == 1) {
                            abstractC13616e = abstractC13616e2;
                        } else {
                            if (r1 == 0) {
                                r1 = new C12431e(0, new AbstractC13616e[16]);
                            }
                            if (abstractC13616e != 0) {
                                r1.license(abstractC13616e);
                                abstractC13616e = 0;
                            }
                            r1.license(abstractC13616e2);
                        }
                    }
                    abstractC13616e2 = abstractC13616e2.f27024e;
                    r1 = r1;
                    abstractC13616e = abstractC13616e;
                }
                if (i == 1) {
                }
            }
            abstractC13616e = AbstractC5851e.vip(r1);
        }
        return false;
    }

    @Override // defpackage.InterfaceC14651e
    public long loadAd() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.InterfaceC13464e
    public void metrica(C9398e c9398e, Object obj) {
        C8252e c8252e = (C8252e) obj;
        InterfaceC5083e interfaceC5083e = null;
        c9398e.f18713e.mopub(C13886e.f27535e, new C0121e(c8252e, interfaceC5083e, 0));
        c9398e.f18707e.mopub(C13886e.f27523e, new C0121e(c8252e, interfaceC5083e, 1));
        c9398e.f18710e.mopub(C13886e.f27539e, new C12358e(c8252e, interfaceC5083e, 4));
    }

    @Override // defpackage.InterfaceC14651e
    public long mopub() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.InterfaceC14651e
    public boolean next() {
        return false;
    }

    @Override // defpackage.InterfaceC13466e
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.InterfaceC13466e
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.InterfaceC8193e
    public /* synthetic */ void pro() {
    }

    @Override // defpackage.InterfaceC11124e
    public int purchase() {
        return 16;
    }

    @Override // defpackage.InterfaceC15169e
    public InterfaceC9660e remoteconfig() {
        return new AbstractC15896e(false);
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return new C13122e();
    }

    @Override // defpackage.InterfaceC1325e
    public long startapp() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public AbstractC3370e tapsense(InterfaceC5021e interfaceC5021e, List list) {
        List parameters = interfaceC5021e.getParameters();
        InterfaceC16046e interfaceC16046e = (InterfaceC16046e) AbstractC13480e.m3569abstract(parameters);
        if (interfaceC16046e == null || !interfaceC16046e.mo2741e()) {
            return new C1351e((InterfaceC16046e[]) parameters.toArray(new InterfaceC16046e[0]), (AbstractC16232e[]) list.toArray(new AbstractC16232e[0]), false);
        }
        List parameters2 = interfaceC5021e.getParameters();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(parameters2, 10));
        Iterator it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC16046e) it.next()).mo1459goto());
        }
        return new C13027e(1, AbstractC10064e.mopub(AbstractC13480e.m3579e(list, arrayList)));
    }

    @Override // defpackage.InterfaceC8193e
    public /* synthetic */ void vip(C2351e c2351e) {
    }

    @Override // defpackage.InterfaceC4583e
    public boolean yandex(C6594e c6594e, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC4876e) c6594e.f13613e).smaato();
                Parcelable parcelable = (Parcelable) ((InterfaceC4876e) c6594e.f13613e).subscription();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription vip = ((InterfaceC4876e) c6594e.f13613e).vip();
        InterfaceC4876e interfaceC4876e = (InterfaceC4876e) c6594e.f13613e;
        new ClipData(vip, new ClipData.Item(interfaceC4876e.advert()));
        interfaceC4876e.vip();
        interfaceC4876e.amazon();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }
}
