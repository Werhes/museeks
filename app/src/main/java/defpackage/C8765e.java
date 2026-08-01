package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8765e implements InterfaceC11659e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f17666e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f17667e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f17668e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f17669e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f17670e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f17671e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f17672e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f17673e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f17674e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f17675e;

    public C8765e(C6107e c6107e) {
        this.f17675e = new ArrayList();
        this.f17674e = new HashMap();
        this.f17670e = new ArrayList();
        this.f17672e = new HashMap();
        this.f17669e = c6107e.f12821e;
        this.f17667e = c6107e.f12815e;
        this.f17671e = c6107e.f12819e;
        this.f17666e = c6107e.f12817e;
        this.f17675e = new ArrayList(c6107e.f12814e);
        this.f17674e = new HashMap(c6107e.f12823e);
        this.f17670e = new ArrayList(c6107e.f12822e);
        this.f17672e = new HashMap(c6107e.f12818e);
        this.f17673e = c6107e.f12820e;
        this.f17668e = c6107e.f12816e;
    }

    public C8765e(PKIXParameters pKIXParameters) {
        this.f17675e = new ArrayList();
        this.f17674e = new HashMap();
        this.f17670e = new ArrayList();
        this.f17672e = new HashMap();
        this.f17669e = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.f17666e = new C5300e((CertSelector) targetCertConstraints.clone());
        }
        Date date = pKIXParameters.getDate();
        this.f17667e = date;
        this.f17671e = date == null ? new Date() : date;
        this.f17673e = pKIXParameters.isRevocationEnabled();
        this.f17668e = pKIXParameters.getTrustAnchors();
    }

    public C4641e ad() {
        Function1 function1 = (Function1) this.f17675e;
        if (function1 == null && ((Function1) this.f17674e) != null) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Color ", (String) this.f17669e, " has secondBackground defined, but background is not defined.").toString());
        }
        if (function1 == null && ((Function1) this.f17670e) != null) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Color ", (String) this.f17669e, " has contrastCurve defined, but background is not defined.").toString());
        }
        if (function1 != null && ((Function1) this.f17670e) == null) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Color ", (String) this.f17669e, " has background defined, but contrastCurve is not defined.").toString());
        }
        Function1 function12 = (Function1) this.f17671e;
        if (function12 == null) {
            function12 = function1 == null ? new C2163e(12) : new C2046e(3, function1);
        }
        return new C4641e((String) this.f17669e, (Function1) this.f17667e, function12, this.f17673e, (Function1) this.f17666e, function1, (Function1) this.f17674e, (Function1) this.f17670e, (Function1) this.f17672e, (Function1) this.f17668e);
    }

    public void appmetrica(List list, Throwable th) {
        boolean z;
        boolean z2;
        List unmodifiableList;
        Throwable th2;
        synchronized (this.f17669e) {
            try {
                if (th != null) {
                    if (((Throwable) this.f17666e) != null && ((List) this.f17671e).isEmpty()) {
                        z2 = false;
                        this.f17666e = th;
                        this.f17671e = Collections.EMPTY_LIST;
                    }
                    z2 = true;
                    this.f17666e = th;
                    this.f17671e = Collections.EMPTY_LIST;
                } else {
                    list.getClass();
                    if (((Throwable) this.f17666e) == null && ((List) this.f17671e).equals(list)) {
                        z = false;
                        this.f17666e = null;
                        this.f17671e = list;
                        z2 = z;
                    }
                    z = true;
                    this.f17666e = null;
                    this.f17671e = list;
                    z2 = z;
                }
                unmodifiableList = DesugarCollections.unmodifiableList((List) this.f17671e);
                th2 = (Throwable) this.f17666e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(((CopyOnWriteArrayList) this.f17667e).size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            Iterator it = ((CopyOnWriteArrayList) this.f17667e).iterator();
            while (it.hasNext()) {
                C1220e c1220e = (C1220e) it.next();
                c1220e.ad.execute(new RunnableC4904e(0, th2, c1220e, unmodifiableList));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [eٍؚؔ, java.lang.Object] */
    public void license() {
        if (!((AtomicBoolean) this.f17670e).compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        C8419e c8419e = (C8419e) this.f17672e;
        InterfaceC5083e interfaceC5083e = null;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        ?? obj = new Object();
        obj.f18534e = true;
        this.f17672e = AbstractC7535e.Signature(new C11318e(new C11318e(new C7371e((InterfaceC1108e) this.f17675e, 29), new C2122e(this, (Object) obj, interfaceC5083e, 1), 3), new C15985e(this, interfaceC5083e, 7)), (C14826e) this.f17674e);
    }

    @Override // defpackage.InterfaceC11659e
    public void loadAd(InterfaceC4868e interfaceC4868e) {
        C1220e c1220e;
        interfaceC4868e.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f17667e).iterator();
        while (true) {
            if (!it.hasNext()) {
                c1220e = null;
                break;
            } else {
                c1220e = (C1220e) it.next();
                if (c1220e.vip.equals(interfaceC4868e)) {
                    break;
                }
            }
        }
        if (c1220e != null) {
            ((CopyOnWriteArrayList) this.f17667e).remove(c1220e);
        }
        synchronized (this.f17669e) {
            try {
                if (this.f17673e && ((CopyOnWriteArrayList) this.f17667e).isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f17673e = false;
                    Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                    if (((AtomicBoolean) this.f17670e).compareAndSet(true, false)) {
                        C8419e c8419e = (C8419e) this.f17672e;
                        if (c8419e != null) {
                            c8419e.Signature(null);
                        }
                        this.f17672e = null;
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC11659e
    public void metrica(Executor executor, InterfaceC4868e interfaceC4868e) {
        List unmodifiableList;
        Throwable th;
        executor.getClass();
        interfaceC4868e.getClass();
        ((CopyOnWriteArrayList) this.f17667e).add(new C1220e(executor, interfaceC4868e));
        synchronized (this.f17669e) {
            try {
                if (!this.f17673e && !((CopyOnWriteArrayList) this.f17667e).isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f17673e = true;
                    license();
                }
                unmodifiableList = DesugarCollections.unmodifiableList((List) this.f17671e);
                th = (Throwable) this.f17666e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executor.execute(new RunnableC4904e(0, th, new C1220e(executor, interfaceC4868e), unmodifiableList));
    }

    @Override // defpackage.InterfaceC11659e
    public ListenableFuture startapp() {
        return AbstractC5750e.purchase(new C2007e(0, this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eٌٟ٘, java.lang.Object] */
    public C8765e vip(final C4641e c4641e) {
        String str = (String) this.f17669e;
        String str2 = c4641e.ad;
        if (!AbstractC7890e.billing(str, str2)) {
            throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC17861e.tapsense("Attempting to extend color ", (String) this.f17669e, " with color ", str2, " of different name for spec version "), "SPEC_2025", ".").toString());
        }
        boolean z = this.f17673e;
        boolean z2 = c4641e.license;
        if (z != z2) {
            String str3 = (String) this.f17669e;
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder tapsense = AbstractC17861e.tapsense("Attempting to extend color ", str3, " as a ", str4, " with color ");
            AbstractC13501e.Signature(tapsense, str2, " as a ", str5, " for spec version ");
            throw new IllegalArgumentException(AbstractC1786e.signatures(tapsense, "SPEC_2025", ".").toString());
        }
        ?? obj = new Object();
        obj.f17669e = (String) this.f17669e;
        obj.f17673e = z;
        final int i = 0;
        obj.f17667e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        obj.f17671e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i2) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        obj.f17666e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i3) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        obj.f17675e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i4) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        obj.f17674e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i5) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        obj.f17670e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i6) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        obj.f17672e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i7) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        obj.f17668e = new Function1() { // from class: eؚٗۛ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                C15073e c15073e;
                switch (i8) {
                    case 0:
                        Function1 function1 = c4641e.vip;
                        C16439e c16439e = (C16439e) obj2;
                        Function1 function12 = c16439e.advert == 2 ? function1 : (Function1) this.f17667e;
                        return (function12 == null || (c15073e = (C15073e) function12.invoke(c16439e)) == null) ? (C15073e) function1.invoke(c16439e) : c15073e;
                    case 1:
                        Function1 function13 = c4641e.metrica;
                        C16439e c16439e2 = (C16439e) obj2;
                        Function1 function14 = c16439e2.advert == 2 ? function13 : (Function1) this.f17671e;
                        return Double.valueOf(((Number) (function14 != null ? function14.invoke(c16439e2) : function13.invoke(c16439e2))).doubleValue());
                    case 2:
                        C16439e c16439e3 = (C16439e) obj2;
                        Function1 function15 = c16439e3.advert == 2 ? c4641e.appmetrica : (Function1) this.f17666e;
                        return function15 != null ? (Double) function15.invoke(c16439e3) : Double.valueOf(1.0d);
                    case 3:
                        C16439e c16439e4 = (C16439e) obj2;
                        Function1 function16 = c16439e4.advert == 2 ? c4641e.purchase : (Function1) this.f17675e;
                        if (function16 != null) {
                            return (C4641e) function16.invoke(c16439e4);
                        }
                        return null;
                    case 4:
                        C16439e c16439e5 = (C16439e) obj2;
                        Function1 function17 = c16439e5.advert == 2 ? c4641e.billing : (Function1) this.f17674e;
                        if (function17 != null) {
                            return (C4641e) function17.invoke(c16439e5);
                        }
                        return null;
                    case 5:
                        C16439e c16439e6 = (C16439e) obj2;
                        Function1 function18 = c16439e6.advert == 2 ? c4641e.yandex : (Function1) this.f17670e;
                        if (function18 != null) {
                            return (C7109e) function18.invoke(c16439e6);
                        }
                        return null;
                    case 6:
                        C16439e c16439e7 = (C16439e) obj2;
                        Function1 function19 = c16439e7.advert == 2 ? c4641e.startapp : (Function1) this.f17672e;
                        if (function19 != null) {
                            return (C13699e) function19.invoke(c16439e7);
                        }
                        return null;
                    default:
                        C16439e c16439e8 = (C16439e) obj2;
                        Function1 function110 = c16439e8.advert == 2 ? c4641e.adcel : (Function1) this.f17668e;
                        if (function110 != null) {
                            return (Double) function110.invoke(c16439e8);
                        }
                        return null;
                }
            }
        };
        return obj;
    }
}
