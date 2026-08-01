package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11106e implements InterfaceC14343e, InterfaceC7539e, InterfaceC15813e, InterfaceC8827e, InterfaceC10625e, InterfaceC3896e, InterfaceC0987e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C12916e f22003e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C12916e f22004e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static C11106e f22005e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f22006e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f22007e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f22008e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f22009e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22010e;

    static {
        Boolean bool = Boolean.FALSE;
        int i = 12;
        f22004e = new C12916e(i, bool);
        f22003e = new C12916e(i, bool);
    }

    public C11106e(int i) {
        this.f22010e = i;
        switch (i) {
            case 8:
                this.f22008e = new C16966e(10);
                this.f22007e = new C17519e(0);
                this.f22009e = new ArrayList();
                this.f22006e = new HashSet();
                return;
            case 10:
                this.f22008e = new ArrayList();
                this.f22007e = new HashMap();
                this.f22009e = new HashMap();
                return;
            case 12:
                this.f22008e = new ArrayList();
                this.f22007e = new ArrayList();
                this.f22009e = new ArrayList(0);
                InterfaceC14256e.ad.getClass();
                List ad = C12381e.ad();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
                Iterator it = ad.iterator();
                while (it.hasNext()) {
                    ((C9484e) ((InterfaceC14256e) it.next())).getClass();
                    arrayList.add(new C6860e());
                }
                this.f22006e = arrayList;
                return;
            case 15:
                this.f22008e = new C1292e();
                this.f22007e = new C1292e();
                this.f22009e = new C12279e();
                return;
            default:
                this.f22008e = null;
                this.f22007e = null;
                this.f22009e = null;
                this.f22006e = new ArrayDeque();
                return;
        }
    }

    public /* synthetic */ C11106e(int i, boolean z) {
        this.f22010e = i;
    }

    public C11106e(long j, long j2, long j3) {
        this.f22010e = 19;
        this.f22008e = AbstractC14533e.startapp(new C2108e(j));
        this.f22007e = AbstractC14533e.startapp(new C2152e(j2));
        this.f22009e = AbstractC14533e.startapp(new C2152e(j3));
        this.f22006e = AbstractC14533e.startapp(new C2152e(j2));
    }

    public C11106e(Context context, ActionMode.Callback callback) {
        this.f22010e = 18;
        this.f22007e = context;
        this.f22008e = callback;
        this.f22009e = new ArrayList();
        this.f22006e = new C17519e(0);
    }

    public C11106e(Context context, C14826e c14826e, C11476e c11476e) {
        this.f22010e = 1;
        this.f22008e = context;
        this.f22007e = c14826e;
        this.f22009e = c11476e;
        this.f22006e = new C5363e(new C10479e(6, this));
    }

    public C11106e(C0368e c0368e) {
        this.f22010e = 23;
        this.f22007e = null;
        this.f22009e = null;
        this.f22006e = null;
        this.f22008e = c0368e;
    }

    public C11106e(C1195e c1195e, String str) {
        this.f22010e = 24;
        this.f22006e = c1195e;
        AbstractC9528e.purchase(str);
        this.f22008e = str;
        this.f22007e = new Bundle();
    }

    public C11106e(C6584e c6584e) {
        this.f22010e = 6;
        this.f22007e = new C17519e(0);
        this.f22009e = new C17519e(0);
        this.f22008e = new Object();
        this.f22006e = new WeakReference(c6584e);
    }

    public C11106e(C13462e c13462e, InterfaceC1481e interfaceC1481e, AbstractC1238e abstractC1238e) {
        this.f22010e = 21;
        this.f22008e = c13462e;
        this.f22007e = interfaceC1481e;
        this.f22009e = abstractC1238e;
        this.f22006e = new C11993e(10);
    }

    public C11106e(C14461e c14461e, C11980e c11980e, ArrayList arrayList) {
        this.f22010e = 4;
        this.f22007e = c14461e;
        this.f22009e = c11980e;
        this.f22006e = arrayList;
        this.f22008e = c14461e;
    }

    public C11106e(C15503e c15503e, C8143e c8143e, C6535e c6535e, C15146e c15146e) {
        this.f22010e = 16;
        this.f22008e = c8143e;
        this.f22007e = c6535e;
        this.f22009e = c15146e;
        List list = c15503e.f30633e;
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica < 16 ? 16 : appmetrica);
        for (Object obj : list) {
            C8143e c8143e2 = (C8143e) this.f22008e;
            int i = ((C2009e) obj).f5258e;
            linkedHashMap.put(C9616e.advert(c8143e2.ad(i), c8143e2.vip(i)), obj);
        }
        this.f22006e = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11106e(C15723e c15723e, InterfaceC10540e interfaceC10540e, C6156e c6156e, Function2 function2) {
        this.f22010e = 7;
        this.f22008e = c15723e;
        this.f22007e = interfaceC10540e;
        this.f22009e = c6156e;
        this.f22006e = (C7460e) function2;
    }

    public C11106e(C16289e c16289e) {
        this.f22010e = 13;
        this.f22007e = new ArrayList();
        this.f22009e = new ArrayList();
        this.f22006e = new HashSet();
        this.f22008e = new Bundle(c16289e.ad);
        this.f22007e = c16289e.metrica();
        this.f22009e = c16289e.vip();
        this.f22006e = c16289e.ad();
    }

    public C11106e(C16911e c16911e, C17613e c17613e) {
        this.f22010e = 2;
        this.f22006e = c16911e;
        this.f22010e = 2;
        this.f22009e = c16911e;
        this.f22008e = c17613e;
        this.f22007e = new ArrayList();
    }

    public C11106e(C17687e c17687e) {
        this.f22010e = 14;
        this.f22008e = c17687e;
        this.f22007e = new C15655e();
        new LinkedHashSet();
        this.f22009e = new LinkedHashSet();
        this.f22006e = new LinkedHashSet();
    }

    public /* synthetic */ C11106e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f22010e = i;
        this.f22008e = obj;
        this.f22007e = obj2;
        this.f22009e = obj3;
        this.f22006e = obj4;
    }

    public C11106e(String str, String str2) {
        this.f22010e = 13;
        this.f22007e = new ArrayList();
        this.f22009e = new ArrayList();
        this.f22006e = new HashSet();
        Bundle bundle = new Bundle();
        this.f22008e = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public static void adcel(C11106e c11106e, AbstractC13388e abstractC13388e) {
        c11106e.getClass();
        if (((LinkedHashSet) c11106e.f22009e).add(abstractC13388e)) {
            C15655e c15655e = (C15655e) c11106e.f22007e;
            c15655e.getClass();
            if (abstractC13388e.metrica == null) {
                c15655e.appmetrica.addFirst(abstractC13388e);
                abstractC13388e.metrica = c11106e;
                c15655e.vip();
            } else {
                throw new IllegalArgumentException(("Handler '" + abstractC13388e + "' is already registered with a dispatcher").toString());
            }
        }
    }

    /* renamed from: while, reason: not valid java name */
    public static synchronized C11106e m2998while() {
        C11106e c11106e;
        synchronized (C11106e.class) {
            try {
                if (f22005e == null) {
                    f22005e = new C11106e(0);
                }
                c11106e = f22005e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11106e;
    }

    public void Signature(AbstractC15931e abstractC15931e, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unsupported priority value: ").toString());
        }
        if (((LinkedHashSet) this.f22006e).add(abstractC15931e)) {
            ((C15655e) this.f22007e).ad(this, abstractC15931e, i);
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public AbstractC13960e m2999abstract(InterfaceC7227e interfaceC7227e, String str) {
        AbstractC13960e abstractC13960e;
        AbstractC13960e license;
        C2741e c2741e;
        AbstractC0003e abstractC0003e;
        synchronized (((C11993e) this.f22006e)) {
            try {
                abstractC13960e = (AbstractC13960e) ((C13462e) this.f22008e).ad.get(str);
                if (interfaceC7227e.applovin(abstractC13960e)) {
                    InterfaceC1481e interfaceC1481e = (InterfaceC1481e) this.f22007e;
                    if ((interfaceC1481e instanceof C2741e) && (abstractC0003e = (c2741e = (C2741e) interfaceC1481e).f6642e) != null) {
                        AbstractC1206e.metrica(abstractC13960e, c2741e.f6639e, abstractC0003e);
                    }
                } else {
                    C8229e c8229e = new C8229e((AbstractC1238e) this.f22009e);
                    c8229e.ad(AbstractC2774e.f6687e, str);
                    InterfaceC1481e interfaceC1481e2 = (InterfaceC1481e) this.f22007e;
                    try {
                        try {
                            license = interfaceC1481e2.advert(interfaceC7227e, c8229e);
                        } catch (AbstractMethodError unused) {
                            license = interfaceC1481e2.license(((InterfaceC18155e) interfaceC7227e).subs());
                        }
                    } catch (AbstractMethodError unused2) {
                        license = interfaceC1481e2.billing(((InterfaceC18155e) interfaceC7227e).subs(), c8229e);
                    }
                    abstractC13960e = license;
                    AbstractC13960e abstractC13960e2 = (AbstractC13960e) ((C13462e) this.f22008e).ad.put(str, abstractC13960e);
                    if (abstractC13960e2 != null) {
                        abstractC13960e2.ad();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC13960e;
    }

    @Override // defpackage.InterfaceC8827e
    public ArrayList ad() {
        return (ArrayList) this.f22007e;
    }

    public void admob(C18424e c18424e, int i, InterfaceC7251e interfaceC7251e) {
        synchronized (this.f22008e) {
            try {
                C11030e c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
                if (c11030e != null) {
                    C5298e c5298e = c11030e.billing;
                    c5298e.getClass();
                    C16722e c16722e = new C16722e(5);
                    c16722e.metrica(c5298e.ad);
                    c16722e.ad(i);
                    c11030e.billing = new C5298e(c16722e.appmetrica());
                    c11030e.metrica.add(interfaceC7251e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ads(C11030e c11030e) {
        C6584e c6584e = (C6584e) ((WeakReference) this.f22006e).get();
        if (c6584e == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            InterfaceC7251e interfaceC7251e = (InterfaceC7251e) c11030e.metrica.poll();
            if (interfaceC7251e == null) {
                c11030e.purchase = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            C11030e c11030e2 = c11030e;
            AbstractC9413e.m2565strictfp(c6584e.advert, new RunnableC7410e(c6584e, m3007extends(c11030e.ad), new RunnableC14110e(this, interfaceC7251e, atomicBoolean2, c11030e2, atomicBoolean, 1)));
            atomicBoolean2.set(false);
            c11030e = c11030e2;
        }
    }

    public void advert(AbstractC10766e abstractC10766e) {
        if (((LinkedHashSet) this.f22006e).add(abstractC10766e)) {
            ((C15655e) this.f22007e).ad(this, abstractC10766e, -1);
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void amazon(C0520e c0520e, Object obj) {
        ((C14461e) this.f22008e).amazon(c0520e, obj);
    }

    public AbstractComponentCallbacksC17875e applovin(String str) {
        for (C5221e c5221e : ((HashMap) this.f22007e).values()) {
            if (c5221e != null) {
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
                if (!str.equals(abstractComponentCallbacksC17875e.f35068e)) {
                    abstractComponentCallbacksC17875e = abstractComponentCallbacksC17875e.f35093e.metrica.applovin(str);
                }
                if (abstractComponentCallbacksC17875e != null) {
                    return abstractComponentCallbacksC17875e;
                }
            }
        }
        return null;
    }

    public void appmetrica(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                ArrayList arrayList2 = (ArrayList) this.f22009e;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture billing(C12053e c12053e) {
        byte[] bArr = c12053e.mopub;
        if (bArr != null) {
            return smaato(bArr);
        }
        Uri uri = c12053e.amazon;
        if (uri == null) {
            return null;
        }
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f22007e;
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC8461e.appmetrica(2, ExecutorC3603e.f8134e, interfaceC18435e, new C17781e(uri, this, null));
    }

    /* renamed from: break, reason: not valid java name */
    public C18100e m3000break(C18424e c18424e) {
        C11030e c11030e;
        synchronized (this.f22008e) {
            c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
        }
        if (c11030e != null) {
            return c11030e.vip;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0987e
    public /* synthetic */ ListenableFuture call() {
        C14742e c14742e = (C14742e) this.f22008e;
        C7703e c7703e = new C7703e(c14742e, 0);
        ListenableFuture listenableFuture = (ListenableFuture) this.f22007e;
        EnumC3320e enumC3320e = EnumC3320e.f7489e;
        C12183e billing = AbstractC2017e.billing(listenableFuture, c7703e, enumC3320e);
        C12183e billing2 = AbstractC2017e.billing(billing, (C2111e) this.f22009e, (Executor) this.f22006e);
        return AbstractC2017e.billing(billing2, AbstractC9855e.vip(new C11561e(0, c14742e, billing, billing2)), enumC3320e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [eَؘۜ, eّّٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eّؖٝ, java.lang.Object] */
    /* renamed from: case, reason: not valid java name */
    public C7826e m3001case(Object obj, String str, C8633e c8633e, C16722e c16722e) {
        C11898e c11898e = new C11898e();
        c11898e.f23836e = C3295e.f7451e;
        c11898e.f23835e = EnumC10668e.f21010e;
        InterfaceC10540e interfaceC10540e = (InterfaceC10540e) this.f22007e;
        C11898e c11898e2 = new C11898e();
        c11898e2.f23836e = C3295e.f7451e;
        EnumC10668e enumC10668e = EnumC10668e.f21010e;
        c11898e2.f23835e = enumC10668e;
        final ?? obj2 = new Object();
        obj2.f27641e = c11898e2;
        final ?? obj3 = new Object();
        EnumC10668e state = interfaceC10540e.getState();
        EnumC10668e enumC10668e2 = EnumC10668e.f21012e;
        obj3.f9318e = state == enumC10668e2 ? enumC10668e2 : enumC10668e;
        final ?? obj4 = new Object();
        if (((EnumC10668e) c11898e.f23835e) == enumC10668e2) {
            enumC10668e = enumC10668e2;
        }
        obj4.f9318e = enumC10668e;
        Comparable comparable = (Comparable) obj3.f9318e;
        if (comparable.compareTo(enumC10668e) <= 0) {
            enumC10668e = comparable;
        }
        obj2.m3748throw(enumC10668e);
        if (obj3.f9318e != enumC10668e2 && obj4.f9318e != enumC10668e2) {
            final int i = 0;
            C5934e c5934e = new C5934e(4, new Function1() { // from class: eٍؑ٘
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Comparable, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Comparable, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    EnumC10668e enumC10668e3 = (EnumC10668e) obj5;
                    switch (i) {
                        case 0:
                            obj3.f9318e = enumC10668e3;
                            ?? r0 = (Comparable) obj4.f9318e;
                            if (enumC10668e3.compareTo((EnumC10668e) r0) > 0) {
                                enumC10668e3 = r0;
                            }
                            obj2.m3748throw(enumC10668e3);
                            return Unit.INSTANCE;
                        default:
                            obj3.f9318e = enumC10668e3;
                            ?? r02 = (Comparable) obj4.f9318e;
                            if (enumC10668e3.compareTo((EnumC10668e) r02) > 0) {
                                enumC10668e3 = r02;
                            }
                            obj2.m3748throw(enumC10668e3);
                            return Unit.INSTANCE;
                    }
                }
            });
            final int i2 = 1;
            C5934e c5934e2 = new C5934e(4, new Function1() { // from class: eٍؑ٘
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Comparable, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Comparable, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    EnumC10668e enumC10668e3 = (EnumC10668e) obj5;
                    switch (i2) {
                        case 0:
                            obj4.f9318e = enumC10668e3;
                            ?? r0 = (Comparable) obj3.f9318e;
                            if (enumC10668e3.compareTo((EnumC10668e) r0) > 0) {
                                enumC10668e3 = r0;
                            }
                            obj2.m3748throw(enumC10668e3);
                            return Unit.INSTANCE;
                        default:
                            obj4.f9318e = enumC10668e3;
                            ?? r02 = (Comparable) obj3.f9318e;
                            if (enumC10668e3.compareTo((EnumC10668e) r02) > 0) {
                                enumC10668e3 = r02;
                            }
                            obj2.m3748throw(enumC10668e3);
                            return Unit.INSTANCE;
                    }
                }
            });
            interfaceC10540e.smaato(c5934e);
            c11898e.smaato(c5934e2);
            if (((EnumC10668e) c11898e2.f23835e) == enumC10668e2) {
                interfaceC10540e.startapp(c5934e);
                c11898e.startapp(c5934e2);
            } else {
                c11898e2.smaato(new C8364e(interfaceC10540e, c5934e, c11898e, c5934e2));
            }
        }
        C13391e c13391e = new C13391e(c8633e);
        if (c16722e == null) {
            c16722e = new C16722e(4);
        }
        C16722e c16722e2 = c16722e;
        C6156e c6156e = new C6156e((C6156e) this.f22009e, true, 0);
        ?? r14 = (C7460e) this.f22006e;
        ((C15723e) this.f22008e).getClass();
        return new C7826e(obj, str, r14.invoke(obj, new C5435e(obj2, c13391e, c16722e2, c6156e)), c11898e, c13391e, c16722e2, c6156e);
    }

    /* renamed from: catch, reason: not valid java name */
    public boolean m3002catch(C18424e c18424e) {
        boolean z;
        synchronized (this.f22008e) {
            z = ((C2271e) this.f22009e).get(c18424e) != null;
        }
        return z;
    }

    /* renamed from: class, reason: not valid java name */
    public ArrayList m3003class() {
        ArrayList arrayList = new ArrayList();
        for (C5221e c5221e : ((HashMap) this.f22007e).values()) {
            if (c5221e != null) {
                arrayList.add(c5221e.metrica);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: const, reason: not valid java name */
    public void m3004const(Bundle bundle) {
        String str = (String) this.f22008e;
        C1195e c1195e = (C1195e) this.f22006e;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences m490e = c1195e.m490e();
        C6936e c6936e = (C6936e) c1195e.f36443e;
        SharedPreferences.Editor edit = m490e.edit();
        if (bundle2.size() == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C4261e.ad();
                        if (!c6936e.f14221e.m2822e(null, AbstractC17254e.f33825e)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                C13879e c13879e = c6936e.f14227e;
                                C6936e.yandex(c13879e);
                                c13879e.f27502e.vip(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            C13879e c13879e2 = c6936e.f14227e;
                            C6936e.yandex(c13879e2);
                            c13879e2.f27502e.vip(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        C13879e c13879e3 = c6936e.f14227e;
                        C6936e.yandex(c13879e3);
                        c13879e3.f27502e.vip(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f22009e = bundle2;
    }

    @Override // defpackage.InterfaceC15813e
    public void crashlytics(C0520e c0520e, C11709e c11709e, C0520e c0520e2) {
        ((C14461e) this.f22008e).crashlytics(c0520e, c11709e, c0520e2);
    }

    /* renamed from: default, reason: not valid java name */
    public boolean m3005default(Context context) {
        if (((Boolean) this.f22009e) == null) {
            this.f22009e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f22007e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f22009e).booleanValue();
    }

    /* renamed from: else, reason: not valid java name */
    public Bundle m3006else(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f22009e;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    /* renamed from: extends, reason: not valid java name */
    public C18424e m3007extends(Object obj) {
        C18424e c18424e;
        synchronized (this.f22008e) {
            c18424e = (C18424e) ((C2271e) this.f22007e).get(obj);
        }
        return c18424e;
    }

    /* renamed from: final, reason: not valid java name */
    public boolean m3008final(C18424e c18424e, int i) {
        C11030e c11030e;
        synchronized (this.f22008e) {
            c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
        }
        C6584e c6584e = (C6584e) ((WeakReference) this.f22006e).get();
        return c11030e != null && c11030e.appmetrica.ad(i) && c6584e != null && c6584e.pro.firebase().ad(i);
    }

    /* renamed from: finally, reason: not valid java name */
    public Bundle m3009finally() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        C1195e c1195e = (C1195e) this.f22006e;
        if (((Bundle) this.f22009e) == null) {
            String str = (String) this.f22008e;
            SharedPreferences m490e = c1195e.m490e();
            C6936e c6936e = (C6936e) c1195e.f36443e;
            String string3 = m490e.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            C13879e c13879e = c6936e.f14227e;
                            C6936e.yandex(c13879e);
                            c13879e.f27502e.ad("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            C4261e.ad();
                                            if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33825e)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        C4261e.ad();
                                        if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33825e)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        C13879e c13879e2 = c6936e.f14227e;
                        C6936e.yandex(c13879e2);
                        c13879e2.f27502e.vip(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.f22009e = bundle;
                } catch (JSONException unused2) {
                    C13879e c13879e3 = c6936e.f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27502e.ad("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f22009e) == null) {
                this.f22009e = (Bundle) this.f22007e;
            }
        }
        Bundle bundle2 = (Bundle) this.f22009e;
        AbstractC9528e.startapp(bundle2);
        return new Bundle(bundle2);
    }

    public ArrayList firebase() {
        ArrayList arrayList = new ArrayList();
        for (C5221e c5221e : ((HashMap) this.f22007e).values()) {
            if (c5221e != null) {
                arrayList.add(c5221e);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC15813e
    /* renamed from: goto */
    public InterfaceC15813e mo2367goto(C11709e c11709e, C0520e c0520e) {
        return ((C14461e) this.f22008e).mo2367goto(c11709e, c0520e);
    }

    /* renamed from: implements, reason: not valid java name */
    public boolean m3010implements(Context context) {
        if (((Boolean) this.f22007e) == null) {
            this.f22007e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f22007e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f22007e).booleanValue();
    }

    /* renamed from: import, reason: not valid java name */
    public boolean m3011import(AbstractC12364e abstractC12364e, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f22008e).onActionItemClicked(subs(abstractC12364e), new MenuItemC4494e((Context) this.f22007e, (InterfaceMenuItemC4281e) menuItem));
    }

    public void inmobi(AbstractC10766e abstractC10766e, C1558e c1558e) {
        C15655e c15655e = (C15655e) this.f22007e;
        if (c15655e.billing != 0) {
            return;
        }
        AbstractC13388e metrica = c15655e.metrica(-1);
        c15655e.purchase = metrica;
        c15655e.billing = -1;
        c15655e.yandex = abstractC10766e;
        if (c1558e != null) {
            if (metrica != null) {
                metrica.license(c1558e);
            }
            C1615e c1615e = c15655e.ad;
            C10296e c10296e = new C10296e(c1558e);
            c1615e.getClass();
            c1615e.smaato(null, c10296e);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public boolean m3012instanceof(AbstractC12364e abstractC12364e, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f22008e;
        C3817e subs = subs(abstractC12364e);
        C17519e c17519e = (C17519e) this.f22006e;
        Menu menu2 = (Menu) c17519e.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC15372e((Context) this.f22007e, (MenuC8939e) menu);
            c17519e.put(menu, menu2);
        }
        return callback.onCreateActionMode(subs, menu2);
    }

    /* renamed from: interface, reason: not valid java name */
    public C5298e m3013interface(C18424e c18424e) {
        synchronized (this.f22008e) {
            try {
                C11030e c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
                if (c11030e == null) {
                    return null;
                }
                return c11030e.appmetrica;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractComponentCallbacksC17875e isPro(String str) {
        C5221e c5221e = (C5221e) ((HashMap) this.f22007e).get(str);
        if (c5221e != null) {
            return c5221e.metrica;
        }
        return null;
    }

    public void isVip(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C17519e) this.f22007e).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                isVip(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.InterfaceC8827e
    public ArrayList license() {
        return (ArrayList) this.f22009e;
    }

    @Override // defpackage.InterfaceC3896e
    public C5912e loadAd(C11709e c11709e) {
        C2009e c2009e = (C2009e) ((LinkedHashMap) this.f22006e).get(c11709e);
        if (c2009e == null) {
            return null;
        }
        return new C5912e((C8143e) this.f22008e, c2009e, (C6535e) this.f22007e, (InterfaceC3054e) ((C15146e) this.f22009e).invoke(c11709e));
    }

    @Override // defpackage.InterfaceC7539e
    public InterfaceC15813e metrica(C11709e c11709e, C0515e c0515e) {
        return ((C2532e) ((C16911e) this.f22009e).f33137e).m938volatile(c11709e, c0515e, (ArrayList) this.f22007e);
    }

    @Override // defpackage.InterfaceC15813e
    public void mopub() {
        switch (this.f22010e) {
            case 2:
                ArrayList arrayList = (ArrayList) this.f22007e;
                if (arrayList.isEmpty()) {
                    return;
                }
                ((HashMap) ((C16911e) this.f22009e).f33136e).put((C17613e) this.f22008e, arrayList);
                return;
            default:
                ((C14461e) this.f22007e).mopub();
                ((ArrayList) ((C11980e) this.f22009e).f23950e).add(new AbstractC13656e((InterfaceC16566e) AbstractC13480e.m3590instanceof((ArrayList) this.f22006e)));
                return;
        }
    }

    /* renamed from: native, reason: not valid java name */
    public AbstractC17475e m3014native() {
        AbstractC17475e remoteconfig;
        synchronized (this.f22008e) {
            remoteconfig = AbstractC17475e.remoteconfig(((C2271e) this.f22007e).values());
        }
        return remoteconfig;
    }

    /* renamed from: new, reason: not valid java name */
    public boolean m3015new(C18424e c18424e, int i) {
        C11030e c11030e;
        synchronized (this.f22008e) {
            c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
        }
        return c11030e != null && c11030e.license.ad(i);
    }

    /* renamed from: package, reason: not valid java name */
    public void m3016package(C5221e c5221e) {
        HashMap hashMap = (HashMap) this.f22007e;
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
        if (abstractComponentCallbacksC17875e.f35087e) {
            ((C16301e) this.f22006e).purchase(abstractComponentCallbacksC17875e);
        }
        if (hashMap.get(abstractComponentCallbacksC17875e.f35068e) == c5221e && ((C5221e) hashMap.put(abstractComponentCallbacksC17875e.f35068e, null)) != null && AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC17875e);
        }
    }

    public void premium(final C18424e c18424e) {
        synchronized (this.f22008e) {
            try {
                C11030e c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
                if (c11030e == null) {
                    return;
                }
                final C5298e c5298e = c11030e.billing;
                c11030e.billing = C5298e.vip;
                c11030e.metrica.add(new InterfaceC7251e(c18424e, c5298e) { // from class: eْٖۢ
                    public final /* synthetic */ C18424e vip;

                    @Override // defpackage.InterfaceC7251e
                    public final ListenableFuture run() {
                        C6584e c6584e = (C6584e) ((WeakReference) C11106e.this.f22006e).get();
                        if (c6584e != null) {
                            c6584e.ads(this.vip);
                        }
                        return C13747e.f27231e;
                    }
                });
                if (c11030e.purchase) {
                    return;
                }
                c11030e.purchase = true;
                ads(c11030e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: private, reason: not valid java name */
    public void m3017private(C5221e c5221e) {
        AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c5221e.metrica;
        String str = abstractComponentCallbacksC17875e.f35068e;
        HashMap hashMap = (HashMap) this.f22007e;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC17875e.f35068e, c5221e);
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC17875e);
        }
    }

    public C12835e pro() {
        C13903e c13903e = (C13903e) this.f22008e;
        if (c13903e == null) {
            throw new GeneralSecurityException("HPKE KEM parameter is not set");
        }
        C5031e c5031e = (C5031e) this.f22007e;
        if (c5031e == null) {
            throw new GeneralSecurityException("HPKE KDF parameter is not set");
        }
        C1062e c1062e = (C1062e) this.f22009e;
        if (c1062e == null) {
            throw new GeneralSecurityException("HPKE AEAD parameter is not set");
        }
        C5709e c5709e = (C5709e) this.f22006e;
        if (c5709e != null) {
            return new C12835e(c13903e, c5031e, c1062e, c5709e);
        }
        throw new GeneralSecurityException("HPKE variant is not set");
    }

    /* renamed from: protected, reason: not valid java name */
    public C2411e m3018protected(C18424e c18424e) {
        synchronized (this.f22008e) {
            try {
                return ((C11030e) ((C2271e) this.f22009e).get(c18424e)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void purchase(Object obj, C18424e c18424e, C6689e c6689e, C5298e c5298e) {
        synchronized (this.f22008e) {
            try {
                C18424e m3007extends = m3007extends(obj);
                if (m3007extends == null) {
                    ((C2271e) this.f22007e).put(obj, c18424e);
                    ((C2271e) this.f22009e).put(c18424e, new C11030e(obj, new C18100e(4), c6689e, c5298e));
                } else {
                    C11030e c11030e = (C11030e) ((C2271e) this.f22009e).get(m3007extends);
                    c11030e.getClass();
                    c11030e.license = c6689e;
                    c11030e.appmetrica = c5298e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC15813e
    public void remoteconfig(C0520e c0520e, C5302e c5302e) {
        ((C14461e) this.f22008e).remoteconfig(c0520e, c5302e);
    }

    @Override // defpackage.InterfaceC10625e
    public /* synthetic */ void reset() {
    }

    /* renamed from: return, reason: not valid java name */
    public void m3019return(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f22008e = Integer.valueOf(i);
    }

    public C16289e signatures() {
        Bundle bundle = (Bundle) this.f22008e;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.f22009e));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.f22007e));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.f22006e));
        return new C16289e(bundle);
    }

    @Override // defpackage.InterfaceC14343e
    public ListenableFuture smaato(byte[] bArr) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f22007e;
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC8461e.appmetrica(2, ExecutorC3603e.f8134e, interfaceC18435e, new C9042e(bArr, null, 11));
    }

    public void startapp(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList2 = (ArrayList) this.f22007e;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    /* renamed from: static, reason: not valid java name */
    public void m3020static(C18424e c18424e) {
        synchronized (this.f22008e) {
            try {
                C11030e c11030e = (C11030e) ((C2271e) this.f22009e).remove(c18424e);
                if (c11030e == null) {
                    return;
                }
                ((C2271e) this.f22007e).remove(c11030e.ad);
                c11030e.vip.billing();
                C6584e c6584e = (C6584e) ((WeakReference) this.f22006e).get();
                if (c6584e == null || c6584e.loadAd()) {
                    return;
                }
                AbstractC9413e.m2565strictfp(c6584e.advert, new RunnableC4936e(c6584e, c18424e, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public boolean m3021strictfp(C18424e c18424e, C11858e c11858e) {
        C11030e c11030e;
        synchronized (this.f22008e) {
            c11030e = (C11030e) ((C2271e) this.f22009e).get(c18424e);
        }
        if (c11030e == null) {
            return false;
        }
        AbstractC12614e abstractC12614e = c11030e.license.ad;
        c11858e.getClass();
        return abstractC12614e.contains(c11858e) || C11161e.amazon(c11858e.vip);
    }

    public C3817e subs(AbstractC12364e abstractC12364e) {
        ArrayList arrayList = (ArrayList) this.f22009e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3817e c3817e = (C3817e) arrayList.get(i);
            if (c3817e != null && c3817e.vip == abstractC12364e) {
                return c3817e;
            }
        }
        C3817e c3817e2 = new C3817e((Context) this.f22007e, abstractC12364e);
        arrayList.add(c3817e2);
        return c3817e2;
    }

    public C15694e subscription() {
        Integer num = (Integer) this.f22008e;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((C16372e) this.f22006e) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f22007e) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f22009e) != null) {
            return new C15694e(num.intValue(), ((Integer) this.f22007e).intValue(), ((Integer) this.f22009e).intValue(), (C16372e) this.f22006e);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    /* renamed from: super, reason: not valid java name */
    public boolean m3022super(InterfaceC9794e interfaceC9794e) {
        if (((InterfaceC9794e) this.f22007e).equals(interfaceC9794e)) {
            return true;
        }
        C11106e c11106e = (C11106e) this.f22008e;
        return c11106e != null ? c11106e.m3022super(interfaceC9794e) : false;
    }

    /* renamed from: switch, reason: not valid java name */
    public void m3023switch() {
        this.f22009e = 16;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m3024synchronized() {
        this.f22007e = 12;
    }

    @Override // defpackage.InterfaceC15813e
    public InterfaceC11429e tapsense(C0520e c0520e) {
        return ((C14461e) this.f22008e).tapsense(c0520e);
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    /* renamed from: throw, reason: not valid java name */
    public List m3025throw() {
        ArrayList arrayList;
        if (((ArrayList) this.f22008e).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f22008e)) {
            arrayList = new ArrayList((ArrayList) this.f22008e);
        }
        return arrayList;
    }

    /* renamed from: throws, reason: not valid java name */
    public C14461e m3026throws(int i, C11709e c11709e, C0515e c0515e) {
        C17613e c17613e = new C17613e(((C17613e) this.f22008e).ad + '@' + i);
        C16911e c16911e = (C16911e) this.f22006e;
        HashMap hashMap = (HashMap) c16911e.f33136e;
        List list = (List) hashMap.get(c17613e);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(c17613e, list);
        }
        return ((C2532e) c16911e.f33137e).m938volatile(c11709e, c0515e, list);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0074. Please report as an issue. */
    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    public void mo825transient(byte[] bArr, int i, int i2, C14033e c14033e, InterfaceC8427e interfaceC8427e) {
        C17817e c17817e;
        int i3;
        int i4;
        int i5;
        int crashlytics;
        C12279e c12279e = (C12279e) this.f22009e;
        C1292e c1292e = (C1292e) this.f22007e;
        C1292e c1292e2 = (C1292e) this.f22008e;
        c1292e2.m570throw(i + i2, bArr);
        c1292e2.m571try(i);
        if (((Inflater) this.f22006e) == null) {
            this.f22006e = new Inflater();
        }
        if (AbstractC9413e.m2549default(c1292e2, c1292e, (Inflater) this.f22006e)) {
            c1292e2.m570throw(c1292e.metrica, c1292e.ad);
        }
        int i6 = 0;
        c12279e.license = 0;
        int[] iArr = c12279e.vip;
        C1292e c1292e3 = c12279e.ad;
        c12279e.appmetrica = 0;
        c12279e.purchase = 0;
        c12279e.billing = 0;
        c12279e.yandex = 0;
        c12279e.startapp = 0;
        c1292e3.m564extends(0);
        c12279e.metrica = false;
        ArrayList arrayList = new ArrayList();
        while (c1292e2.ad() >= 3) {
            int i7 = c1292e2.metrica;
            int ads = c1292e2.ads();
            int m565goto = c1292e2.m565goto();
            int i8 = c1292e2.vip + m565goto;
            if (i8 > i7) {
                c1292e2.m571try(i7);
                i3 = i6;
                c17817e = null;
            } else {
                char c = 128;
                if (ads != 128) {
                    switch (ads) {
                        case 20:
                            if (m565goto % 5 == 2) {
                                c1292e2.m568protected(2);
                                Arrays.fill(iArr, i6);
                                int i9 = m565goto / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int ads2 = c1292e2.ads();
                                    char c2 = c;
                                    double ads3 = c1292e2.ads();
                                    double ads4 = c1292e2.ads() - 128;
                                    double ads5 = c1292e2.ads() - 128;
                                    iArr[ads2] = AbstractC9413e.adcel((int) ((ads5 * 1.772d) + ads3), 0, 255) | (c1292e2.ads() << 24) | (AbstractC9413e.adcel((int) ((1.402d * ads4) + ads3), 0, 255) << 16) | (AbstractC9413e.adcel((int) ((ads3 - (0.34414d * ads5)) - (ads4 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    c = c2;
                                    c12279e = c12279e;
                                }
                                c12279e.metrica = true;
                                break;
                            }
                            break;
                        case 21:
                            if (m565goto >= 4) {
                                c1292e2.m568protected(3);
                                int i11 = m565goto - 4;
                                if (((128 & c1292e2.ads()) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (crashlytics = c1292e2.crashlytics()) >= 4) {
                                        c12279e.yandex = c1292e2.m565goto();
                                        c12279e.startapp = c1292e2.m565goto();
                                        c1292e3.m564extends(crashlytics - 4);
                                        i11 = m565goto - 11;
                                    }
                                }
                                int i12 = c1292e3.vip;
                                int i13 = c1292e3.metrica;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    c1292e2.mopub(i12, min, c1292e3.ad);
                                    c1292e3.m571try(i12 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (m565goto >= 19) {
                                c12279e.license = c1292e2.m565goto();
                                c12279e.appmetrica = c1292e2.m565goto();
                                c1292e2.m568protected(11);
                                c12279e.purchase = c1292e2.m565goto();
                                c12279e.billing = c1292e2.m565goto();
                                break;
                            }
                            break;
                    }
                    i3 = 0;
                    c17817e = null;
                } else {
                    if (c12279e.license == 0 || c12279e.appmetrica == 0 || c12279e.yandex == 0 || c12279e.startapp == 0 || (i4 = c1292e3.metrica) == 0 || c1292e3.vip != i4 || !c12279e.metrica) {
                        c17817e = null;
                    } else {
                        c1292e3.m571try(0);
                        int i14 = c12279e.yandex * c12279e.startapp;
                        int[] iArr2 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int ads6 = c1292e3.ads();
                            if (ads6 != 0) {
                                i5 = i15 + 1;
                                iArr2[i15] = iArr[ads6];
                            } else {
                                int ads7 = c1292e3.ads();
                                if (ads7 != 0) {
                                    i5 = ((ads7 & 64) == 0 ? ads7 & 63 : ((ads7 & 63) << 8) | c1292e3.ads()) + i15;
                                    Arrays.fill(iArr2, i15, i5, (ads7 & 128) == 0 ? iArr[0] : iArr[c1292e3.ads()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, c12279e.yandex, c12279e.startapp, Bitmap.Config.ARGB_8888);
                        float f = c12279e.purchase;
                        float f2 = c12279e.license;
                        float f3 = f / f2;
                        float f4 = c12279e.billing;
                        float f5 = c12279e.appmetrica;
                        c17817e = new C17817e(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, c12279e.yandex / f2, c12279e.startapp / f5, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
                    }
                    i3 = 0;
                    c12279e.license = 0;
                    c12279e.appmetrica = 0;
                    c12279e.purchase = 0;
                    c12279e.billing = 0;
                    c12279e.yandex = 0;
                    c12279e.startapp = 0;
                    c1292e3.m564extends(0);
                    c12279e.metrica = false;
                }
                c1292e2.m571try(i8);
            }
            if (c17817e != null) {
                arrayList.add(c17817e);
            }
            i6 = i3;
        }
        interfaceC8427e.accept(new C17169e(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    /* renamed from: try, reason: not valid java name */
    public C8256e m3027try(C18424e c18424e) {
        synchronized (this.f22008e) {
            try {
                return ((C11030e) ((C2271e) this.f22009e).get(c18424e)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC8827e
    public ArrayList vip() {
        return (ArrayList) this.f22008e;
    }

    public void yandex(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        if (((ArrayList) this.f22008e).contains(abstractComponentCallbacksC17875e)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC17875e);
        }
        synchronized (((ArrayList) this.f22008e)) {
            ((ArrayList) this.f22008e).add(abstractComponentCallbacksC17875e);
        }
        abstractComponentCallbacksC17875e.f35091e = true;
    }
}
