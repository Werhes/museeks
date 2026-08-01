package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10672e {
    public static final C2892e ad = new C2892e(-1249084711, false, new C6039e(10));
    public static final C2892e vip = new C2892e(1400716153, false, new C6039e(12));
    public static final C2892e metrica = new C2892e(-814973276, false, new C6039e(16));
    public static final C2892e license = new C2892e(737521832, false, new C6039e(17));
    public static final C2892e appmetrica = new C2892e(-1021838039, false, new C6039e(18));
    public static final C2892e purchase = new C2892e(-116117818, false, new C16627e(8));
    public static final C2892e billing = new C2892e(-1497159233, false, new C6039e(20));
    public static final C2892e yandex = new C2892e(-919008061, false, new C6039e(21));
    public static final C2892e startapp = new C2892e(-91298083, false, new C9375e(6));
    public static final C2892e adcel = new C2892e(474987611, false, new C6039e(22));
    public static final C2892e mopub = new C2892e(-7170286, false, new C6039e(19));
    public static final C2892e advert = new C2892e(2131855876, false, new C6039e(23));
    public static final C2892e smaato = new C2892e(-1031478652, false, new C6039e(24));
    public static final C2892e amazon = new C2892e(62922019, false, new C6039e(25));
    public static final C2892e loadAd = new C2892e(1657069095, false, new C6039e(26));
    public static final C2892e Signature = new C2892e(1554708011, false, new C6039e(27));
    public static final C2892e admob = new C2892e(864012455, false, new C6039e(28));
    public static final C2892e subscription = new C2892e(1164807125, false, new C16627e(9));
    public static final C2892e remoteconfig = new C2892e(1765080390, false, new C6039e(29));
    public static final C2892e pro = new C2892e(627415676, false, new C6039e(11));
    public static final C2892e signatures = new C2892e(1205566848, false, new C6039e(13));
    public static final C2892e tapsense = new C2892e(-1851117771, false, new C6039e(14));
    public static final C2892e isVip = new C2892e(1819839750, false, new C16627e(7));
    public static final C2892e inmobi = new C2892e(-1378317716, false, new C6039e(15));

    public static final Object[] ad(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC1660e.loadAd(0, i, 6, objArr, objArr2);
        AbstractC1660e.mopub(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Intent appmetrica(InterfaceC10161e interfaceC10161e, C6555e c6555e, int i, C14099e c14099e) {
        if (interfaceC10161e instanceof InterfaceC4567e) {
            InterfaceC4567e interfaceC4567e = (InterfaceC4567e) interfaceC10161e;
            Intent billing2 = billing(interfaceC4567e, c6555e, interfaceC4567e.getParameters());
            if (billing2.getData() == null) {
                billing2.setData(AbstractC12947e.startapp(c6555e, i, 5, String.valueOf(billing2.getFlags())));
            }
            return billing2;
        }
        if (interfaceC10161e instanceof C3901e) {
            C3901e c3901e = (C3901e) interfaceC10161e;
            if (c3901e instanceof C3901e) {
                return AbstractC12947e.purchase(c3901e.ad, c6555e, i, 4);
            }
            throw new C14803e(10);
        }
        if (!(interfaceC10161e instanceof C7694e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + interfaceC10161e).toString());
        }
        ComponentName componentName = c6555e.amazon;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        return AbstractC12947e.purchase(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", ((C7694e) interfaceC10161e).ad).putExtra("EXTRA_APPWIDGET_ID", c6555e.vip), c6555e, i, 2);
    }

    public static final Intent billing(InterfaceC4567e interfaceC4567e, C6555e c6555e, C8280e c8280e) {
        Intent intent;
        if (interfaceC4567e instanceof C2703e) {
            intent = new Intent(c6555e.ad, (Class<?>) AppActivity.class);
        } else {
            if (!(interfaceC4567e instanceof C12338e)) {
                throw new IllegalStateException(("Action type not defined in app widget package: " + interfaceC4567e).toString());
            }
            intent = ((C12338e) interfaceC4567e).ad;
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(c8280e.ad);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            arrayList.add(new C6571e(((C1696e) entry.getKey()).ad, entry.getValue()));
        }
        C6571e[] c6571eArr = (C6571e[]) arrayList.toArray(new C6571e[0]);
        intent.putExtras(AbstractC2301e.vip((C6571e[]) Arrays.copyOf(c6571eArr, c6571eArr.length)));
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r9 == r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0055, B:20:0x006a, B:22:0x0072, B:32:0x0046, B:35:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.InterfaceC6034e r6, defpackage.InterfaceC10441e r7, boolean r8, defpackage.InterfaceC5083e r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C7833e
            if (r0 == 0) goto L13
            r0 = r9
            eًٍٖ r0 = (defpackage.C7833e) r0
            int r1 = r0.f15846e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15846e = r1
            goto L18
        L13:
            eًٍٖ r0 = new eًٍٖ
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15844e
            int r1 = r0.f15846e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            boolean r8 = r0.f15847e
            eٜؐ r6 = r0.f15848e
            eَۖؐ r7 = r0.f15843e
            eؘۥؒ r1 = r0.f15845e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r1
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f15847e
            eٜؐ r6 = r0.f15848e
            eَۖؐ r7 = r0.f15843e
            eؘۥؒ r1 = r0.f15845e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            defpackage.AbstractC2003e.purchase(r9)
            boolean r9 = r6 instanceof defpackage.C3706e
            if (r9 != 0) goto L98
            eٜؐ r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f15845e = r6     // Catch: java.lang.Throwable -> L34
            r0.f15843e = r7     // Catch: java.lang.Throwable -> L34
            r0.f15848e = r9     // Catch: java.lang.Throwable -> L34
            r0.f15847e = r8     // Catch: java.lang.Throwable -> L34
            r0.f15846e = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r9.ad(r0)     // Catch: java.lang.Throwable -> L34
            if (r1 != r4) goto L66
            goto L86
        L66:
            r5 = r1
            r1 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.vip()     // Catch: java.lang.Throwable -> L34
            r0.f15845e = r1     // Catch: java.lang.Throwable -> L34
            r0.f15843e = r7     // Catch: java.lang.Throwable -> L34
            r0.f15848e = r6     // Catch: java.lang.Throwable -> L34
            r0.f15847e = r8     // Catch: java.lang.Throwable -> L34
            r0.f15846e = r2     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r1.startapp(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r4) goto L31
        L86:
            return r4
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            r7.Signature(r6)
        L8d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            defpackage.AbstractC17113e.ad(r7, r6)
        L97:
            throw r9
        L98:
            eؕۢۗ r6 = (defpackage.C3706e) r6
            java.lang.Throwable r6 = r6.f8293e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10672e.license(eؘۥؒ, eَۖؐ, boolean, eًؗۖ):java.lang.Object");
    }

    public static final Object[] metrica(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1660e.loadAd(0, i, 6, objArr, objArr2);
        AbstractC1660e.mopub(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final PendingIntent purchase(InterfaceC10161e interfaceC10161e, C6555e c6555e, int i, C14099e c14099e) {
        Context context = c6555e.ad;
        if (interfaceC10161e instanceof InterfaceC4567e) {
            InterfaceC4567e interfaceC4567e = (InterfaceC4567e) interfaceC10161e;
            Intent billing2 = billing(interfaceC4567e, c6555e, interfaceC4567e.getParameters());
            if (billing2.getData() == null) {
                billing2.setData(AbstractC12947e.startapp(c6555e, i, 5, String.valueOf(billing2.getFlags())));
            }
            Unit unit = Unit.INSTANCE;
            return PendingIntent.getActivity(context, 0, billing2, 201326592, interfaceC4567e.ad());
        }
        if (interfaceC10161e instanceof C3901e) {
            C3901e c3901e = (C3901e) interfaceC10161e;
            if (!(c3901e instanceof C3901e)) {
                throw new C14803e(10);
            }
            Intent intent = c3901e.ad;
            if (intent.getData() == null) {
                intent.setData(AbstractC12947e.startapp(c6555e, i, 5, String.valueOf(intent.getFlags())));
            }
            return Build.VERSION.SDK_INT >= 26 ? AbstractC11815e.premium(context, intent) : PendingIntent.getService(context, 0, intent, 201326592);
        }
        if (!(interfaceC10161e instanceof C7694e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + interfaceC10161e).toString());
        }
        ComponentName componentName = c6555e.amazon;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        String str = ((C7694e) interfaceC10161e).ad;
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", str).putExtra("EXTRA_APPWIDGET_ID", c6555e.vip);
        putExtra.setData(AbstractC12947e.startapp(c6555e, i, 5, str));
        Unit unit2 = Unit.INSTANCE;
        return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
    }

    public static final Object[] vip(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC1660e.loadAd(0, i, 6, objArr, objArr2);
        AbstractC1660e.mopub(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final int yandex(int i, int i2) {
        return (i >> i2) & 31;
    }
}
