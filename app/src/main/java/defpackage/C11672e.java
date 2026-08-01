package defpackage;

import android.os.SystemClock;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11672e implements InterfaceC13464e, InterfaceC13603e, InterfaceC17956e, InterfaceC12457e, InterfaceC6256e, InterfaceC9575e, InterfaceC13204e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23467e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23462e = new C11672e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23461e = new C11672e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23464e = new C11672e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23460e = new C11672e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23466e = new C11672e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23465e = new C11672e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C11672e f23463e = new C11672e(21);

    public /* synthetic */ C11672e(int i) {
        this.f23467e = i;
    }

    public C11672e(C0136e c0136e) {
        this.f23467e = 8;
    }

    public static void amazon(int i) {
        synchronized (UnmanagedSessionReceiver.ad) {
            if (UnmanagedSessionReceiver.vip.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static final int startapp(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 4) {
            return 4;
        }
        return i7 + 1;
    }

    public static final boolean yandex(double d, double d2, double d3) {
        return d2 < d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f23467e) {
            case 14:
                return new Boolean(((Boolean) C11228e.ad.get()).booleanValue());
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.sgtm.google_signal.url", 16, "https://app-measurement.com/s/d").get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(43200000L, 63, "measurement.upload.backoff_period").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(605000L, 15, "measurement.upload.google_signal_max_queue_time").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(100L, 3, "measurement.max_bundles_per_iteration").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(864000000L, 57, "measurement.rb.attribution.max_queue_time").get();
            default:
                List list6 = AbstractC17254e.ad;
                C4261e.f9346e.get();
                return (Boolean) C13302e.ad.license("measurement.rb.attribution.enable_trigger_redaction", true, 7).get();
        }
    }

    public AbstractC1186e adcel(InterfaceC18168e interfaceC18168e, InterfaceC6647e interfaceC6647e, boolean z, C11980e c11980e, EnumC13937e enumC13937e, C7639e c7639e, boolean z2, Function1 function1) {
        C6613e c6613e = new C6613e((InterfaceC15633e) interfaceC6647e, z, c11980e, enumC13937e, false);
        AbstractC1186e abstractC1186e = (AbstractC1186e) function1.invoke(interfaceC18168e);
        Collection mo337finally = interfaceC18168e.mo337finally();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo337finally, 10));
        Iterator it = mo337finally.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC1186e) function1.invoke((InterfaceC0390e) it.next()));
        }
        return mopub(c6613e, abstractC1186e, arrayList, c7639e, z2);
    }

    @Override // defpackage.InterfaceC12457e
    public StackTraceElement[] advert(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, stackTraceElementArr2, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
        return stackTraceElementArr2;
    }

    @Override // defpackage.InterfaceC17956e
    public boolean appmetrica() {
        boolean z;
        synchronized (C2591e.ad) {
            try {
                int i = C2591e.metrica;
                C2591e.metrica = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > C2591e.license + 30000) {
                    C2591e.metrica = 0;
                    C2591e.license = SystemClock.uptimeMillis();
                    String[] list = C2591e.vip.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C2591e.appmetrica = list.length < 800;
                }
                z = C2591e.appmetrica;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC6256e
    public int billing(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC13464e
    public C8208e getKey() {
        return C8007e.metrica;
    }

    @Override // defpackage.InterfaceC13464e
    public Object isPro(Function1 function1) {
        function1.invoke(new C6607e(1));
        return new C8007e();
    }

    @Override // defpackage.InterfaceC6256e
    public int license(int i) {
        return i;
    }

    @Override // defpackage.InterfaceC13464e
    public void metrica(C9398e c9398e, Object obj) {
        c9398e.f18713e.mopub(C13886e.f27534e, new C12159e((C8007e) obj, c9398e, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x02cb, code lost:
    
        if (r10 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x02d0, code lost:
    
        if (r10 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x02de, code lost:
    
        if (r8.compareTo(r9) <= 0) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0307  */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [eًؔۤ] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [eِٕٖ] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29, types: [eِٕٖ] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v38, types: [eٖٚۦ] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [eًؔۤ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC1186e mopub(defpackage.C6613e r29, defpackage.AbstractC1186e r30, java.util.List r31, defpackage.C7639e r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11672e.mopub(eؙۘۚ, eٜؒؒ, java.util.List, eًؐٙ, boolean):eٜؒؒ");
    }

    @Override // defpackage.InterfaceC13603e
    public C5471e purchase() {
        C5471e c5471e = C5471e.f11744e;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        if ((currentTimeMillis ^ 1000) < 0 && j * 1000 != currentTimeMillis) {
            j--;
        }
        long j2 = currentTimeMillis % 1000;
        return j < -31557014167219200L ? C5471e.f11744e : j > 31556889864403199L ? C5471e.f11745e : C13023e.metrica(j, (int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025c A[LOOP:2: B:91:0x0256->B:93:0x025c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027e  */
    /* JADX WARN: Type inference failed for: r27v0, types: [eُِۘ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [eٍؙۛ, eؑٚؐ, eِٕٖ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eؚ٘ۨ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList smaato(defpackage.C11980e r28, java.util.Collection r29) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11672e.smaato(eِۚۘ, java.util.Collection):java.util.ArrayList");
    }

    @Override // defpackage.InterfaceC17956e
    public boolean vip(C16320e c16320e) {
        InterfaceC10650e interfaceC10650e = c16320e.ad;
        boolean z = interfaceC10650e instanceof C3645e;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z ? ((C3645e) interfaceC10650e).ad : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC10650e interfaceC10650e2 = c16320e.vip;
        if (interfaceC10650e2 instanceof C3645e) {
            i = ((C3645e) interfaceC10650e2).ad;
        }
        return i > 100;
    }
}
