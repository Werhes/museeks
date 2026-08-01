package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LogCallback;
import java.io.File;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10215e implements InterfaceC8292e, LogCallback, InterfaceC9575e, InterfaceC9650e, InterfaceC13204e, InterfaceC11232e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20226e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20220e = new C10215e(15);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20219e = new C10215e(16);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20222e = new C10215e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20218e = new C10215e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20225e = new C10215e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20224e = new C10215e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20221e = new C10215e(21);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C10215e f20223e = new C10215e(22);

    public /* synthetic */ C10215e(int i) {
        this.f20226e = i;
    }

    public C10215e(C3373e c3373e) {
        this.f20226e = 2;
    }

    public static long billing(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eِٖۢ, java.lang.Object] */
    public static C10675e license(String str, boolean z) {
        C0193e c0193e = purchase.ad;
        ?? obj = new Object();
        obj.m4126e(str);
        return purchase.license(obj, z);
    }

    public static final int metrica(int i, long j) {
        int i2 = AbstractC15287e.vip;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static C10675e purchase(File file) {
        return license(file.toString(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:10:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(java.io.FileOutputStream r11, defpackage.AbstractC10731e r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C8099e
            if (r0 == 0) goto L13
            r0 = r12
            eًٟٞ r0 = (defpackage.C8099e) r0
            int r1 = r0.f16448e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16448e = r1
            goto L18
        L13:
            eًٟٞ r0 = new eًٟٞ
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f16449e
            int r1 = r0.f16448e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r3 = r0.f16446e
            java.io.FileOutputStream r11 = r0.f16447e
            defpackage.AbstractC2003e.purchase(r12)
            r12 = r0
            goto L70
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.AbstractC2003e.purchase(r12)
            r3 = 10
            r12 = r0
        L38:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L75
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L50
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L50
            goto L85
        L50:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L74
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = defpackage.AbstractC5304e.inmobi(r1, r5, r6)
            if (r1 != r2) goto L74
            r12.f16447e = r11
            r12.f16446e = r3
            r12.f16448e = r2
            java.lang.Object r0 = defpackage.AbstractC16481e.vip(r3, r12)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L70
            r11 = r1
            goto L85
        L70:
            r0 = 2
            long r0 = (long) r0
            long r3 = r3 * r0
            goto L38
        L74:
            throw r0
        L75:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)
        L85:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10215e.vip(java.io.FileOutputStream, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f20226e) {
            case 15:
                List list = AbstractC17254e.ad;
                return (String) C0343e.ad.get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(21600000L, 52, "measurement.sgtm.upload.retry_max_wait").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(500L, 28, "measurement.upload.minimum_delay").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C3973e.f8863e.get();
                return (Boolean) C16868e.ad.license("measurement.test.boolean_flag", false, 0).get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(1L, 18, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 20:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Boolean) C15469e.ad.license("measurement.config.bundle_for_all_apps_on_backgrounded", true, 2).get();
            case 21:
                List list7 = AbstractC17254e.ad;
                return Integer.valueOf((int) ((Long) C10812e.ad.get()).longValue());
            default:
                List list8 = AbstractC17254e.ad;
                return (Boolean) C10118e.ad.get();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eٌؘّ, java.lang.Object] */
    @Override // defpackage.InterfaceC9650e
    public Object apply(Object obj) {
        List<C7841e> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C7841e c7841e : list) {
            ArrayList arrayList2 = c7841e.purchase;
            C13198e c13198e = (arrayList2 == null || arrayList2.isEmpty()) ? C13198e.metrica : (C13198e) c7841e.purchase.get(0);
            UUID fromString = UUID.fromString(c7841e.ad);
            EnumC7300e enumC7300e = c7841e.vip;
            C13198e c13198e2 = c7841e.metrica;
            ArrayList arrayList3 = c7841e.appmetrica;
            int i = c7841e.license;
            ?? obj2 = new Object();
            obj2.ad = fromString;
            obj2.vip = enumC7300e;
            obj2.metrica = c13198e2;
            obj2.license = new HashSet(arrayList3);
            obj2.appmetrica = c13198e;
            obj2.purchase = i;
            arrayList.add(obj2);
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // io.realm.kotlin.internal.interop.LogCallback
    public void log(short s, String str, String str2) {
        InterfaceC16665e.ad.getClass();
        InterfaceC16665e interfaceC16665e = (InterfaceC16665e) AbstractC12479e.ad.get(str);
        int ad = AbstractC12479e.ad(AbstractC4608e.license(s));
        Object[] objArr = new Object[0];
        Iterator it = C8880e.vip.iterator();
        while (it.hasNext()) {
            ((C0715e) it.next()).ad(interfaceC16665e, ad, str2, Arrays.copyOf(objArr, 0));
        }
    }

    @Override // defpackage.InterfaceC11232e
    public C3900e pro(Context context, String str, InterfaceC11716e interfaceC11716e) {
        C3900e c3900e = new C3900e();
        c3900e.vip = interfaceC11716e.yandex(context, str);
        int i = 1;
        int purchase = interfaceC11716e.purchase(context, str, true);
        c3900e.metrica = purchase;
        int i2 = c3900e.vip;
        if (i2 == 0) {
            i2 = 0;
            if (purchase == 0) {
                i = 0;
                c3900e.license = i;
                return c3900e;
            }
        }
        if (i2 >= purchase) {
            i = -1;
        }
        c3900e.license = i;
        return c3900e;
    }
}
