package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۡۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18070e implements InterfaceC12504e, InterfaceC1360e, InterfaceC6995e, InterfaceC8427e, InterfaceC7449e, InterfaceC14599e, InterfaceC13824e, InterfaceC12523e, InterfaceC15992e, InterfaceC0771e, InterfaceC3812e, InterfaceC6395e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f35441e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f35442e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35443e;

    public /* synthetic */ C18070e(C16255e c16255e, InterfaceC12424e interfaceC12424e, ArrayList arrayList) {
        this.f35443e = 20;
        this.f35442e = interfaceC12424e;
        this.f35441e = arrayList;
    }

    public /* synthetic */ C18070e(Object obj, Object obj2, int i) {
        this.f35443e = i;
        this.f35442e = obj;
        this.f35441e = obj2;
    }

    public /* synthetic */ C18070e(boolean z, C11858e c11858e, Bundle bundle) {
        this.f35443e = 7;
        this.f35442e = c11858e;
        this.f35441e = bundle;
    }

    private final void billing() {
        Map map;
        C5609e c5609e = (C5609e) this.f35442e;
        Function1 function1 = (Function1) this.f35441e;
        synchronized (((C11993e) c5609e.f11962e)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) c5609e.f11961e);
            linkedHashMap.remove(function1);
            int size = linkedHashMap.size();
            if (size == 0) {
                map = C9139e.f18290e;
            } else if (size != 1) {
                map = linkedHashMap;
            } else {
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
            }
            c5609e.f11961e = map;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        switch (this.f35443e) {
            case 6:
                BinderC17428e binderC17428e = (BinderC17428e) this.f35442e;
                C4491e c4491e = (C4491e) this.f35441e;
                C6268e c6268e = (C6268e) obj;
                AbstractC8507e abstractC8507e = c4491e.f9751goto;
                if (!abstractC8507e.isEmpty()) {
                    C14142e metrica = c4491e.ad().metrica();
                    AbstractC7014e it = abstractC8507e.values().iterator();
                    while (it.hasNext()) {
                        C11680e c11680e = (C11680e) it.next();
                        C16437e c16437e = (C16437e) binderC17428e.purchase.f9620e.get(c11680e.ad.vip);
                        if (c16437e == null || c11680e.ad.ad != c16437e.ad) {
                            metrica.ad(c11680e);
                        } else {
                            metrica.ad(new C11680e(c16437e, c11680e.vip));
                        }
                    }
                    c4491e = metrica.vip();
                }
                c6268e.mo2138synchronized(c4491e);
                return;
            case 7:
            case 9:
            default:
                Csuper csuper = (Csuper) this.f35442e;
                ((InterfaceC11421e) obj).billing(csuper.f36470e, (C18208e) csuper.f36469e, (C0807e) this.f35441e);
                return;
            case 8:
                BinderC17428e binderC17428e2 = (BinderC17428e) this.f35442e;
                C18424e c18424e = (C18424e) this.f35441e;
                C6584e c6584e = (C6584e) binderC17428e2.metrica.get();
                if (c6584e == null || c6584e.loadAd()) {
                    return;
                }
                c6584e.advert(c18424e, false);
                return;
            case 10:
                BinderC17428e binderC17428e3 = (BinderC17428e) this.f35442e;
                Surface surface = (Surface) this.f35441e;
                C6268e c6268e2 = (C6268e) obj;
                ((C6584e) binderC17428e3.metrica.get()).getClass();
                if (surface == null) {
                    c6268e2.mo2143volatile(null);
                    binderC17428e3.startapp = null;
                    return;
                } else {
                    SurfaceHolderC2120e surfaceHolderC2120e = new SurfaceHolderC2120e(surface);
                    binderC17428e3.startapp = surfaceHolderC2120e;
                    c6268e2.mo2143volatile(surfaceHolderC2120e);
                    return;
                }
        }
    }

    @Override // defpackage.InterfaceC6995e
    public void ad(C18424e c18424e) {
        switch (this.f35443e) {
            case 3:
                C5537e c5537e = (C5537e) this.f35442e;
                AbstractC5340e abstractC5340e = (AbstractC5340e) this.f35441e;
                C6584e c6584e = c5537e.yandex;
                C1962e m2082e = c6584e.pro.m2082e();
                if (m2082e == null) {
                    return;
                }
                String str = m2082e.ad;
                C1439e c1439e = c6584e.appmetrica;
                c6584e.m2208native(c18424e);
                AbstractC2301e.amazon(AbstractC8461e.appmetrica(3, null, c1439e.ad, new C16373e(c1439e, str, abstractC5340e, (InterfaceC5083e) null, 7)), "Callback.onSetRating must return non-null future");
                return;
            case 4:
                ((C11161e) this.f35441e).yandex(((C5537e) this.f35442e).yandex.pro);
                return;
            default:
                C5537e c5537e2 = (C5537e) this.f35442e;
                String str2 = ((C17571e) this.f35441e).f34423e;
                if (TextUtils.isEmpty(str2)) {
                    AbstractC2803e.smaato("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                C6268e c6268e = c5537e2.yandex.pro;
                if (!c6268e.mo2107e(17)) {
                    AbstractC2803e.smaato("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                AbstractC6690e mo2105e = c6268e.mo2105e();
                C11501e c11501e = new C11501e();
                for (int i = 0; i < mo2105e.loadAd(); i++) {
                    if (TextUtils.equals(mo2105e.smaato(i, c11501e, 0L).metrica.ad, str2)) {
                        c6268e.mo2068else(i);
                        return;
                    }
                }
                return;
        }
    }

    public Object adcel(C3611e c3611e) {
        return ((C17919e) this.f35442e).vip(c3611e.ad(), ((InterfaceC17259e) this.f35441e).ad());
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        C11883e c11883e = (C11883e) this.f35442e;
        String str = (String) this.f35441e;
        synchronized (c11883e) {
            ((C2271e) c11883e.f23814e).remove(str);
        }
        return c0560e;
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        switch (this.f35443e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C6594e c6594e = (C6594e) this.f35442e;
                C15552e c15552e = (C15552e) c6594e.f13613e;
                if (c15552e != null) {
                    C7169e c7169e2 = (C7169e) c15552e.ad;
                    Objects.requireNonNull(c7169e2);
                    c7169e2.vip();
                }
                Object obj = this.f35441e;
                c6594e.f13613e = new C15552e(c7169e, obj);
                return AbstractC1634e.advert(obj, "PendingValue ");
            case 20:
                InterfaceC12424e interfaceC12424e = (InterfaceC12424e) this.f35442e;
                ArrayList arrayList = (ArrayList) this.f35441e;
                C4396e c4396e = new C4396e(c7169e, interfaceC12424e);
                arrayList.add(c4396e);
                interfaceC12424e.premium(AbstractC3062e.billing(), c4396e);
                return "waitForCaptureResult";
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6122e c6122e = (C6122e) this.f35442e;
                ((AtomicReference) this.f35441e).set(c7169e);
                return "SurfaceRequest-surface-recreation(" + c6122e.hashCode() + ")";
            default:
                C0748e c0748e = (C0748e) this.f35442e;
                Surface surface = (Surface) this.f35441e;
                AbstractC9464e.yandex("TextureViewImpl", "Surface set on Preview.");
                c0748e.yandex.ad(surface, AbstractC3062e.billing(), new C18027e(3, c7169e));
                return "provideSurface[request=" + c0748e.yandex + " surface=" + surface + "]";
        }
    }

    @Override // defpackage.InterfaceC3812e
    public Object apply(Object obj) {
        C2417e c2417e = (C2417e) this.f35442e;
        C7869e c7869e = (C7869e) this.f35441e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C0176e c0176e = c2417e.f6208e;
        ArrayList advert = c2417e.advert(sQLiteDatabase, c7869e, c0176e.vip);
        for (EnumC6651e enumC6651e : EnumC6651e.values()) {
            if (enumC6651e != c7869e.metrica) {
                int size = c0176e.vip - advert.size();
                if (size <= 0) {
                    break;
                }
                advert.addAll(c2417e.advert(sQLiteDatabase, c7869e.vip(enumC6651e), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < advert.size(); i++) {
            sb.append(((C5171e) advert.get(i)).ad);
            if (i < advert.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new C18029e(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = advert.listIterator();
        while (listIterator.hasNext()) {
            C5171e c5171e = (C5171e) listIterator.next();
            long j2 = c5171e.ad;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                C14742e metrica = c5171e.metrica.metrica();
                for (C18029e c18029e : (Set) hashMap.get(Long.valueOf(j2))) {
                    metrica.vip(c18029e.ad, c18029e.vip);
                }
                listIterator.set(new C5171e(j2, c5171e.vip, metrica.metrica()));
            }
        }
        return advert;
    }

    @Override // defpackage.InterfaceC15992e
    public boolean appmetrica() {
        C5492e c5492e = (C5492e) this.f35442e;
        C16556e c16556e = (C16556e) this.f35441e;
        if (!c5492e.admob) {
            c5492e.yandex();
            c16556e.ad = C16556e.ad(c5492e.loadAd, c16556e.ad);
            c5492e.admob = !c5492e.billing(c5492e.amazon, r2 + c16556e.vip);
        }
        return c5492e.admob;
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        C2532e c2532e = (C2532e) this.f35442e;
        Integer num = (Integer) this.f35441e;
        ((InterfaceC8524e) obj).subscription(num.intValue(), ((C2411e) c2532e.f6388e).remoteconfig());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set, java.lang.Object] */
    public void license() {
        switch (this.f35443e) {
            case 14:
                billing();
                return;
            default:
                C12344e c12344e = (C12344e) this.f35442e;
                Function1 function1 = (Function1) this.f35441e;
                synchronized (((C11993e) c12344e.f24749e)) {
                    c12344e.f24748e = AbstractC4511e.advert(c12344e.f24748e, function1);
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC14599e
    public void metrica(InterfaceC8668e interfaceC8668e) {
        switch (this.f35443e) {
            case 15:
                C7988e c7988e = (C7988e) this.f35442e;
                InterfaceC14599e interfaceC14599e = (InterfaceC14599e) this.f35441e;
                c7988e.getClass();
                interfaceC14599e.metrica(c7988e);
                return;
            default:
                C4052e c4052e = (C4052e) this.f35442e;
                InterfaceC14599e interfaceC14599e2 = (InterfaceC14599e) this.f35441e;
                c4052e.getClass();
                interfaceC14599e2.metrica(c4052e);
                return;
        }
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        C4956e c4956e = (C4956e) this.f35442e;
        Iterable iterable = (Iterable) this.f35441e;
        C2417e c2417e = (C2417e) ((InterfaceC8685e) c4956e.f10512e);
        c2417e.getClass();
        if (!iterable.iterator().hasNext()) {
            return null;
        }
        c2417e.ad().compileStatement("DELETE FROM events WHERE _id in " + C2417e.isVip(iterable)).execute();
        return null;
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(final C6584e c6584e, final C18424e c18424e, int i) {
        switch (this.f35443e) {
            case 7:
                return c6584e.pro(c18424e, (C11858e) this.f35442e, (Bundle) this.f35441e);
            case 8:
            case 10:
            default:
                InterfaceC7449e interfaceC7449e = (InterfaceC7449e) this.f35442e;
                final InterfaceC0099e interfaceC0099e = (InterfaceC0099e) this.f35441e;
                if (c6584e.loadAd()) {
                    return AbstractC2017e.license(new C9759e(-100));
                }
                final int i2 = 1;
                return AbstractC9413e.m2550else((ListenableFuture) interfaceC7449e.startapp(c6584e, c18424e, i), new InterfaceC18244e() { // from class: eؒ۟ۥ
                    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.InterfaceC18244e
                    public final ListenableFuture apply(Object obj) {
                        int i3 = i2;
                        int i4 = 9;
                        Object obj2 = interfaceC0099e;
                        int i5 = 0;
                        switch (i3) {
                            case 0:
                                C6584e c6584e2 = c6584e;
                                Handler handler = c6584e2.advert;
                                RunnableC7410e runnableC7410e = new RunnableC7410e(c6584e2, c18424e, new RunnableC9527e(i5, c6584e2, (C15945e) obj2, (C9035e) obj));
                                C9759e c9759e = new C9759e(0);
                                String str = AbstractC9413e.ad;
                                ?? obj3 = new Object();
                                AbstractC9413e.m2565strictfp(handler, new RunnableC9527e(i4, obj3, runnableC7410e, c9759e));
                                return obj3;
                            default:
                                List list = (List) obj;
                                C6584e c6584e3 = c6584e;
                                Handler handler2 = c6584e3.advert;
                                C18424e c18424e2 = c18424e;
                                RunnableC7410e runnableC7410e2 = new RunnableC7410e(c6584e3, c18424e2, new RunnableC6795e(c6584e3, (InterfaceC0099e) obj2, c18424e2, list, 15));
                                C9759e c9759e2 = new C9759e(0);
                                String str2 = AbstractC9413e.ad;
                                ?? obj4 = new Object();
                                AbstractC9413e.m2565strictfp(handler2, new RunnableC9527e(i4, obj4, runnableC7410e2, c9759e2));
                                return obj4;
                        }
                    }
                });
            case 9:
                String str = (String) this.f35442e;
                AbstractC5340e abstractC5340e = (AbstractC5340e) this.f35441e;
                C1439e c1439e = c6584e.appmetrica;
                c6584e.m2208native(c18424e);
                C8724e appmetrica = AbstractC8461e.appmetrica(3, null, c1439e.ad, new C16373e(c1439e, str, abstractC5340e, (InterfaceC5083e) null, 7));
                AbstractC2301e.amazon(appmetrica, "Callback.onSetRating must return non-null future");
                return appmetrica;
            case 11:
                InterfaceC7449e interfaceC7449e2 = (InterfaceC7449e) this.f35442e;
                final C15945e c15945e = (C15945e) this.f35441e;
                if (c6584e.loadAd()) {
                    return AbstractC2017e.license(new C9759e(-100));
                }
                final int i3 = 0;
                return AbstractC9413e.m2550else((ListenableFuture) interfaceC7449e2.startapp(c6584e, c18424e, i), new InterfaceC18244e() { // from class: eؒ۟ۥ
                    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.InterfaceC18244e
                    public final ListenableFuture apply(Object obj) {
                        int i32 = i3;
                        int i4 = 9;
                        Object obj2 = c15945e;
                        int i5 = 0;
                        switch (i32) {
                            case 0:
                                C6584e c6584e2 = c6584e;
                                Handler handler = c6584e2.advert;
                                RunnableC7410e runnableC7410e = new RunnableC7410e(c6584e2, c18424e, new RunnableC9527e(i5, c6584e2, (C15945e) obj2, (C9035e) obj));
                                C9759e c9759e = new C9759e(0);
                                String str2 = AbstractC9413e.ad;
                                ?? obj3 = new Object();
                                AbstractC9413e.m2565strictfp(handler, new RunnableC9527e(i4, obj3, runnableC7410e, c9759e));
                                return obj3;
                            default:
                                List list = (List) obj;
                                C6584e c6584e3 = c6584e;
                                Handler handler2 = c6584e3.advert;
                                C18424e c18424e2 = c18424e;
                                RunnableC7410e runnableC7410e2 = new RunnableC7410e(c6584e3, c18424e2, new RunnableC6795e(c6584e3, (InterfaceC0099e) obj2, c18424e2, list, 15));
                                C9759e c9759e2 = new C9759e(0);
                                String str22 = AbstractC9413e.ad;
                                ?? obj4 = new Object();
                                AbstractC9413e.m2565strictfp(handler2, new RunnableC9527e(i4, obj4, runnableC7410e2, c9759e2));
                                return obj4;
                        }
                    }
                });
        }
    }

    @Override // defpackage.InterfaceC1360e
    public void vip(C4275e c4275e) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.f35443e) {
            case 1:
                c4275e.m1602return((C2411e) this.f35442e, (C1120e) this.f35441e);
                return;
            default:
                C6689e c6689e = (C6689e) this.f35442e;
                C5298e c5298e = (C5298e) this.f35441e;
                C12318e c12318e = c4275e.ad;
                if (c4275e.mo1580e()) {
                    boolean equals = Objects.equals(c4275e.inmobi, c5298e);
                    boolean equals2 = Objects.equals(c4275e.isVip, c6689e);
                    if (equals && equals2) {
                        return;
                    }
                    c4275e.isVip = c6689e;
                    if (equals) {
                        z = false;
                    } else {
                        c4275e.inmobi = c5298e;
                        C5298e c5298e2 = c4275e.applovin;
                        C5298e metrica = c4275e.metrica(c5298e, c4275e.isPro);
                        c4275e.applovin = metrica;
                        z = !metrica.equals(c5298e2);
                    }
                    if (!equals2 || z) {
                        C1410e c1410e = c4275e.signatures;
                        C1410e c1410e2 = c4275e.tapsense;
                        C1410e m1517e = C4275e.m1517e(c4275e.pro, c4275e.remoteconfig, c6689e, c4275e.applovin, c4275e.f9371this);
                        c4275e.signatures = m1517e;
                        c4275e.tapsense = C4275e.m1518e(m1517e, c4275e.remoteconfig, c4275e.f9371this, c6689e, c4275e.applovin, c4275e.tapsense());
                        z2 = !c4275e.signatures.equals(c1410e);
                        z3 = !c4275e.tapsense.equals(c1410e2);
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                    if (z) {
                        c4275e.startapp.billing(13, new C6225e(c4275e, 0));
                    }
                    if (!equals2) {
                        c12318e.getClass();
                        AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                        c12318e.f24703e.adcel();
                    }
                    if (z3) {
                        c12318e.getClass();
                        AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                        c12318e.f24703e.getClass();
                    }
                    if (z2) {
                        c12318e.getClass();
                        AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
                        c12318e.f24703e.applovin();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC13824e
    public void yandex(InterfaceC7970e interfaceC7970e) {
        InterfaceC13824e interfaceC13824e = (InterfaceC13824e) this.f35442e;
        InterfaceC13824e interfaceC13824e2 = (InterfaceC13824e) this.f35441e;
        interfaceC13824e.yandex(interfaceC7970e);
        interfaceC13824e2.yandex(interfaceC7970e);
    }
}
