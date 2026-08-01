package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2803e {
    public static final Object ad = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e8, code lost:
    
        if (r7 == r5) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.InterfaceC12864e r22, defpackage.C15036e r23, boolean r24, kotlin.jvm.functions.Function1 r25, defpackage.C13770e r26, int r27) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2803e.ad(eّۤۧ, eّٔۢ, boolean, kotlin.jvm.functions.Function1, eٓؕۥ, int):void");
    }

    public static String adcel(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (ad) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                }
                try {
                    if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    th2 = th2.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void advert(String str, String str2) {
        synchronized (ad) {
            Log.i(str, vip(str2, null));
        }
    }

    public static void amazon(String str, String str2, Throwable th) {
        synchronized (ad) {
            Log.w(str, vip(str2, th));
        }
    }

    public static void appmetrica(String str, String str2, Exception exc) {
        synchronized (ad) {
            Log.d(str, vip(str2, exc));
        }
    }

    public static void billing(String str, String str2, Throwable th) {
        synchronized (ad) {
            Log.e(str, vip(str2, th));
        }
    }

    public static void license(String str, String str2) {
        synchronized (ad) {
            Log.d(str, vip(str2, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٌۡ۠, eّ۟ۘ, eٌِٞ] */
    public static final Object loadAd(AbstractC10731e abstractC10731e) {
        Object obj;
        InterfaceC8850e admob = abstractC10731e.admob();
        AbstractC6629e.yandex(admob);
        InterfaceC5083e startapp = AbstractC10558e.startapp(abstractC10731e);
        C3843e c3843e = startapp instanceof C3843e ? (C3843e) startapp : null;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (c3843e == null) {
            obj = Unit.INSTANCE;
        } else {
            AbstractC3743e abstractC3743e = c3843e.f8481e;
            if (AbstractC7214e.amazon(abstractC3743e, admob)) {
                c3843e.f8483e = Unit.INSTANCE;
                c3843e.f6325e = 1;
                abstractC3743e.loadAd(admob, c3843e);
            } else {
                ?? abstractC12782e = new AbstractC12782e(C9052e.f18112e);
                InterfaceC8850e mo394const = admob.mo394const(abstractC12782e);
                Unit unit = Unit.INSTANCE;
                c3843e.f8483e = unit;
                c3843e.f6325e = 1;
                abstractC3743e.loadAd(mo394const, c3843e);
                if (abstractC12782e.f18113e) {
                    AbstractC11092e ad2 = AbstractC3858e.ad();
                    C12718e c12718e = ad2.f21990e;
                    if (!(c12718e != null ? c12718e.isEmpty() : true)) {
                        if (ad2.f21991e >= 4294967296L) {
                            c3843e.f8483e = unit;
                            c3843e.f6325e = 1;
                            ad2.m2988e(c3843e);
                        } else {
                            ad2.m2986e(true);
                            try {
                                c3843e.run();
                                do {
                                } while (ad2.m2985e());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = enumC2821e;
        }
        return obj == enumC2821e ? obj : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.InterfaceC5261e r4, java.util.Map r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C9887e
            if (r0 == 0) goto L13
            r0 = r6
            eٍۥؓ r0 = (defpackage.C9887e) r0
            int r1 = r0.f19499e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19499e = r1
            goto L18
        L13:
            eٍۥؓ r0 = new eٍۥؓ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19497e
            int r1 = r0.f19499e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؗۥؗ r4 = r0.f19498e
            defpackage.AbstractC2003e.purchase(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = r4.tapsense()
            if (r6 != 0) goto L3d
            java.lang.Object r4 = r4.Signature(r5)
            return r4
        L3d:
            eٌٝؖ r6 = defpackage.AbstractC5965e.ad(r4)
            if (r6 == 0) goto L76
            r0.f19498e = r4
            r0.f19499e = r2
            eِۧۡ r6 = (defpackage.AbstractC12141e) r6
            java.lang.Object r6 = r6.amazon(r5, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r6 != r5) goto L52
            return r5
        L52:
            eٓٔۖ r5 = r4.inmobi()
            eًؒؗ r5 = r5.isVip()
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            eؙّؔ r1 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r0 = r1.vip(r0)
            boolean r5 = defpackage.AbstractC7890e.billing(r5, r0)
            if (r5 == 0) goto L75
            eٓٔۖ r4 = r4.inmobi()
            boolean r4 = r4.startapp()
            if (r4 != 0) goto L75
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L75:
            return r6
        L76:
            eَُۥ r5 = new eَُۥ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "This callable does not support a default call: "
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2803e.metrica(eؗۥؗ, java.util.Map, eُؑ۠):java.lang.Object");
    }

    public static final ArrayList mopub(InterfaceC5261e interfaceC5261e) {
        List parameters = interfaceC5261e.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((C2299e) ((InterfaceC8960e) obj)).f5813e == 4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void purchase(String str, String str2) {
        synchronized (ad) {
            Log.e(str, vip(str2, null));
        }
    }

    public static void smaato(String str, String str2) {
        synchronized (ad) {
            Log.w(str, vip(str2, null));
        }
    }

    public static final InterfaceC8960e startapp(InterfaceC5261e interfaceC5261e) {
        Iterator it = interfaceC5261e.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((C2299e) ((InterfaceC8960e) next)).f5813e == 3) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (InterfaceC8960e) obj;
    }

    public static String vip(String str, Throwable th) {
        String adcel = adcel(th);
        if (TextUtils.isEmpty(adcel)) {
            return str;
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, "\n  ");
        isPro.append(adcel.replace("\n", "\n  "));
        isPro.append('\n');
        return isPro.toString();
    }

    public abstract AbstractC9510e yandex(C1740e c1740e, int i);
}
