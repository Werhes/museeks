package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8574e extends AbstractC5830e {
    public static final C1615e ads = AbstractC9180e.metrica(C17204e.f33724e);
    public static final AtomicReference premium = new AtomicReference(Boolean.FALSE);
    public final C0583e Signature;
    public long ad;
    public final C12431e adcel;
    public ArrayList admob;
    public final ArrayList advert;
    public final C10312e amazon;
    public final C10914e applovin;
    public InterfaceC10500e appmetrica;
    public final ArrayList billing;
    public final C6799e inmobi;
    public final InterfaceC8850e isPro;
    public final C0912e isVip;
    public final Object license;
    public final C0583e loadAd;
    public final C0909e metrica;
    public final ArrayList mopub;
    public final C1615e pro;
    public Throwable purchase;
    public C13578e remoteconfig;
    public boolean signatures;
    public final C0583e smaato;
    public C12618e startapp;
    public C12618e subscription;
    public final C1615e tapsense;
    public final C4886e vip;
    public Object yandex;

    /* JADX WARN: Type inference failed for: r1v1, types: [eٍؚؒ, java.lang.Object] */
    public C8574e(InterfaceC8850e interfaceC8850e) {
        C4886e c4886e = new C4886e(new C3899e(this, 0));
        this.vip = c4886e;
        C3899e c3899e = new C3899e(this, 1);
        ?? obj = new Object();
        obj.f3323e = new AtomicInteger(0);
        obj.f3322e = new C18464e(3);
        obj.f3321e = new C1708e(obj, c3899e, 15);
        this.metrica = obj;
        this.license = new Object();
        this.billing = new ArrayList();
        this.startapp = new C12618e();
        this.adcel = new C12431e(0, new C17489e[16]);
        this.mopub = new ArrayList();
        this.advert = new ArrayList();
        this.smaato = new C0583e();
        this.amazon = new C10312e(7);
        this.loadAd = new C0583e();
        this.Signature = new C0583e();
        this.pro = AbstractC9180e.metrica(null);
        this.tapsense = AbstractC9180e.metrica(EnumC18411e.f36094e);
        this.isVip = new C0912e();
        C6799e c6799e = new C6799e((InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e));
        c6799e.mo692else(new C13749e(9, this));
        this.inmobi = c6799e;
        this.isPro = interfaceC8850e.mo394const(c4886e).mo394const(c6799e);
        this.applovin = new C10914e(7);
    }

    public static final void ads(C8574e c8574e, InterfaceC10500e interfaceC10500e) {
        synchronized (c8574e.license) {
            try {
                Throwable th = c8574e.purchase;
                if (th != null) {
                    throw th;
                }
                if (((EnumC18411e) c8574e.tapsense.getValue()).compareTo(EnumC18411e.f36095e) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c8574e.appmetrica != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c8574e.appmetrica = interfaceC10500e;
                if (c8574e.crashlytics() != null) {
                    AbstractC1889e.ad("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final List applovin(C8574e c8574e) {
        List m2452this;
        synchronized (c8574e.license) {
            m2452this = c8574e.m2452this();
        }
        return m2452this;
    }

    public static final void inmobi(C8574e c8574e) {
        int i;
        C12328e c12328e;
        C12328e c12328e2;
        synchronized (c8574e.license) {
            try {
                if (c8574e.smaato.adcel()) {
                    C0583e c0583e = c8574e.smaato;
                    if (c0583e.startapp()) {
                        c12328e2 = AbstractC4180e.vip;
                    } else {
                        C12328e c12328e3 = new C12328e();
                        Object[] objArr = c0583e.metrica;
                        long[] jArr = c0583e.ad;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i2 << 3) + i4];
                                            if (obj instanceof C12328e) {
                                                c12328e3.vip((C12328e) obj);
                                            } else {
                                                c12328e3.ad(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        c12328e2 = c12328e3;
                    }
                    c8574e.smaato.ad();
                    C10312e c10312e = c8574e.amazon;
                    ((C0583e) c10312e.f20361e).ad();
                    ((C0583e) c10312e.f20360e).ad();
                    c8574e.Signature.ad();
                    c12328e = new C12328e(c12328e2.vip);
                    Object[] objArr2 = c12328e2.ad;
                    int i5 = c12328e2.vip;
                    for (int i6 = 0; i6 < i5; i6++) {
                        AbstractC14546e abstractC14546e = (AbstractC14546e) objArr2[i6];
                        c12328e.ad(new C6571e(abstractC14546e, c8574e.loadAd.billing(abstractC14546e)));
                    }
                    c8574e.loadAd.ad();
                } else {
                    c12328e = AbstractC4180e.vip;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr3 = c12328e.ad;
        int i7 = c12328e.vip;
        for (i = 0; i < i7; i++) {
            C6571e c6571e = (C6571e) objArr3[i];
        }
    }

    public static final boolean isPro(C8574e c8574e) {
        boolean firebase;
        synchronized (c8574e.license) {
            firebase = c8574e.firebase();
        }
        return firebase;
    }

    public static final Object isVip(C8574e c8574e, C10246e c10246e) {
        C13578e c13578e;
        if (c8574e.m2447goto()) {
            return Unit.INSTANCE;
        }
        C13578e c13578e2 = new C13578e(1, AbstractC10558e.startapp(c10246e));
        c13578e2.tapsense();
        synchronized (c8574e.license) {
            if (c8574e.m2447goto()) {
                c13578e = c13578e2;
            } else {
                c8574e.remoteconfig = c13578e2;
                c13578e = null;
            }
        }
        if (c13578e != null) {
            c13578e.billing(Unit.INSTANCE);
        }
        Object signatures = c13578e2.signatures();
        return signatures == EnumC2821e.f6782e ? signatures : Unit.INSTANCE;
    }

    public static void premium(C12478e c12478e) {
        try {
            if (c12478e.isVip() instanceof C5834e) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c12478e.metrica();
        }
    }

    /* renamed from: while, reason: not valid java name */
    public static final void m2440while(ArrayList arrayList, C8574e c8574e, C17489e c17489e) {
        arrayList.clear();
        synchronized (c8574e.license) {
            Iterator it = c8574e.advert.iterator();
            if (it.hasNext()) {
                ((AbstractC14546e) it.next()).getClass();
                throw null;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public final boolean m2441abstract() {
        boolean m2444class;
        synchronized (this.license) {
            if (this.startapp.yandex()) {
                return m2444class();
            }
            List m2452this = m2452this();
            C5456e c5456e = new C5456e(this.startapp);
            this.startapp = new C12618e();
            try {
                int size = m2452this.size();
                for (int i = 0; i < size; i++) {
                    ((C17489e) m2452this.get(i)).inmobi(c5456e);
                    if (((EnumC18411e) this.tapsense.getValue()).compareTo(EnumC18411e.f36095e) <= 0) {
                        break;
                    }
                }
                synchronized (this.license) {
                    if (crashlytics() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    m2444class = m2444class();
                }
                return m2444class;
            } catch (Throwable th) {
                synchronized (this.license) {
                    C12618e c12618e = this.startapp;
                    int i2 = c12618e.license;
                    Iterator<E> it = c5456e.iterator();
                    while (it.hasNext()) {
                        c12618e.advert(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.AbstractC5830e
    public final void ad(C17489e c17489e, Function2 function2) {
        EnumC18411e enumC18411e;
        boolean contains;
        C12478e crashlytics;
        boolean z = c17489e.f34298e.f27288class;
        synchronized (this.license) {
            EnumC18411e enumC18411e2 = (EnumC18411e) this.tapsense.getValue();
            enumC18411e = EnumC18411e.f36095e;
            contains = enumC18411e2.compareTo(enumC18411e) > 0 ? true ^ m2452this().contains(c17489e) : true;
        }
        try {
            C13749e c13749e = new C13749e(8, c17489e);
            C6538e c6538e = new C6538e(c17489e, null, 0);
            AbstractC13717e adcel = AbstractC12909e.adcel();
            C12478e c12478e = adcel instanceof C12478e ? (C12478e) adcel : null;
            if (c12478e == null || (crashlytics = c12478e.crashlytics(c13749e, c6538e)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC13717e adcel2 = crashlytics.adcel();
                try {
                    c17489e.mopub(function2);
                    Unit unit = Unit.INSTANCE;
                    synchronized (this.license) {
                        if (((EnumC18411e) this.tapsense.getValue()).compareTo(enumC18411e) > 0 && !m2452this().contains(c17489e)) {
                            this.billing.add(c17489e);
                            this.yandex = null;
                        }
                    }
                    if (!z) {
                        AbstractC12909e.adcel().smaato();
                    }
                    try {
                        m2453throw(c17489e);
                        try {
                            c17489e.appmetrica();
                            c17489e.billing();
                            if (z) {
                                return;
                            }
                            AbstractC12909e.adcel().smaato();
                        } catch (Throwable th) {
                            m2442break(th, null);
                        }
                    } catch (Throwable th2) {
                        m2442break(th2, c17489e);
                    }
                } finally {
                    AbstractC13717e.admob(adcel2);
                }
            } finally {
                premium(crashlytics);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.license) {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            m2442break(th3, c17489e);
        }
    }

    @Override // defpackage.AbstractC5830e
    public final InterfaceC8850e adcel() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC5830e
    public final void admob(C2846e c2846e) {
        C0912e c0912e = this.isVip;
        C12618e c12618e = (C12618e) c0912e.get();
        if (c12618e == null) {
            C12618e c12618e2 = AbstractC1710e.ad;
            c12618e = new C12618e();
            c0912e.Signature(c12618e);
        }
        c12618e.ad(c2846e);
    }

    @Override // defpackage.AbstractC5830e
    public final void advert(C17489e c17489e) {
        InterfaceC1148e interfaceC1148e;
        synchronized (this.license) {
            if (this.adcel.adcel(c17489e)) {
                interfaceC1148e = null;
            } else {
                this.adcel.license(c17489e);
                interfaceC1148e = crashlytics();
            }
        }
        if (interfaceC1148e != null) {
            ((C13578e) interfaceC1148e).billing(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC5830e
    public final C12618e amazon(C17489e c17489e, InterfaceC15992e interfaceC15992e, C12618e c12618e) {
        C0912e c0912e = this.isVip;
        try {
            m2441abstract();
            c17489e.inmobi(new C5456e(c12618e));
            InterfaceC15992e interfaceC15992e2 = c17489e.f34295e;
            c17489e.f34295e = interfaceC15992e;
            try {
                C17489e m2451protected = m2451protected(c17489e, null);
                if (m2451protected != null) {
                    m2453throw(c17489e);
                    m2451protected.appmetrica();
                    m2451protected.billing();
                }
                C12618e c12618e2 = (C12618e) c0912e.get();
                if (c12618e2 == null) {
                    c12618e2 = AbstractC1710e.ad;
                }
                return c12618e2;
            } finally {
                c17489e.f34295e = interfaceC15992e2;
            }
        } finally {
            c0912e.Signature(null);
        }
    }

    @Override // defpackage.AbstractC5830e
    public final boolean appmetrica() {
        return false;
    }

    @Override // defpackage.AbstractC5830e
    public final long billing() {
        return 1000;
    }

    /* renamed from: break, reason: not valid java name */
    public final void m2442break(Throwable th, C17489e c17489e) {
        if (!((Boolean) premium.get()).booleanValue() || (th instanceof C8421e)) {
            synchronized (this.license) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C16130e c16130e = (C16130e) this.pro.getValue();
                if (c16130e != null) {
                    throw c16130e.ad;
                }
                C1615e c1615e = this.pro;
                C16130e c16130e2 = new C16130e(th);
                c1615e.getClass();
                c1615e.smaato(null, c16130e2);
                Unit unit = Unit.INSTANCE;
            }
            throw th;
        }
        synchronized (this.license) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.mopub.clear();
                this.adcel.startapp();
                this.startapp = new C12618e();
                this.advert.clear();
                this.smaato.ad();
                this.loadAd.ad();
                C1615e c1615e2 = this.pro;
                C16130e c16130e3 = new C16130e(th);
                c1615e2.getClass();
                c1615e2.smaato(null, c16130e3);
                if (c17489e != null) {
                    m2445default(c17489e);
                }
                if (crashlytics() != null) {
                    AbstractC1889e.ad("expected to go to inactive state due to composition error");
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: case, reason: not valid java name */
    public final Object m2443case(AbstractC7185e abstractC7185e) {
        Object advert = AbstractC5336e.advert(this.vip, new C14164e(this, new C10246e(this, null), AbstractC0326e.advert(abstractC7185e.f21135e), (InterfaceC5083e) null, 14), abstractC7185e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (advert != enumC2821e) {
            advert = Unit.INSTANCE;
        }
        return advert == enumC2821e ? advert : Unit.INSTANCE;
    }

    /* renamed from: class, reason: not valid java name */
    public final boolean m2444class() {
        return this.adcel.f24868e != 0 || firebase() || m2449interface() || this.smaato.adcel();
    }

    public final InterfaceC1148e crashlytics() {
        C1615e c1615e = this.tapsense;
        int compareTo = ((EnumC18411e) c1615e.getValue()).compareTo(EnumC18411e.f36095e);
        C1615e c1615e2 = this.pro;
        ArrayList arrayList = this.advert;
        ArrayList arrayList2 = this.mopub;
        C12431e c12431e = this.adcel;
        if (compareTo > 0) {
            Object value = c1615e2.getValue();
            EnumC18411e enumC18411e = EnumC18411e.f36099e;
            EnumC18411e enumC18411e2 = EnumC18411e.f36094e;
            if (value == null) {
                if (this.appmetrica == null) {
                    this.startapp = new C12618e();
                    c12431e.startapp();
                    if (firebase() || m2449interface()) {
                        enumC18411e2 = EnumC18411e.f36096e;
                    }
                } else {
                    enumC18411e2 = (c12431e.f24868e != 0 || this.startapp.startapp() || !arrayList2.isEmpty() || !arrayList.isEmpty() || firebase() || m2449interface() || this.smaato.adcel()) ? enumC18411e : EnumC18411e.f36093e;
                }
            }
            c1615e.getClass();
            c1615e.smaato(null, enumC18411e2);
            if (enumC18411e2 != enumC18411e) {
                return null;
            }
            C13578e c13578e = this.remoteconfig;
            this.remoteconfig = null;
            return c13578e;
        }
        List m2452this = m2452this();
        int size = m2452this.size();
        for (int i = 0; i < size; i++) {
        }
        this.billing.clear();
        this.yandex = C13664e.f27089e;
        this.startapp = new C12618e();
        c12431e.startapp();
        arrayList2.clear();
        arrayList.clear();
        this.admob = null;
        C13578e c13578e2 = this.remoteconfig;
        if (c13578e2 != null) {
            c13578e2.ad(null);
        }
        this.remoteconfig = null;
        c1615e2.advert(null);
        return null;
    }

    /* renamed from: default, reason: not valid java name */
    public final void m2445default(C17489e c17489e) {
        ArrayList arrayList = this.admob;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.admob = arrayList;
        }
        if (!arrayList.contains(c17489e)) {
            arrayList.add(c17489e);
        }
        if (this.billing.remove(c17489e)) {
            this.yandex = null;
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2446extends() {
        synchronized (this.license) {
            this.signatures = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean firebase() {
        return !this.signatures && (((C11936e) ((C18464e) this.vip.f10364e).f36192e).get() & 134217727) > 0;
    }

    /* renamed from: goto, reason: not valid java name */
    public final boolean m2447goto() {
        boolean z;
        synchronized (this.license) {
            if (!this.startapp.startapp() && this.adcel.f24868e == 0 && !firebase()) {
                z = m2449interface();
            }
        }
        return z;
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m2448implements() {
        InterfaceC1148e interfaceC1148e;
        synchronized (this.license) {
            if (this.signatures) {
                this.signatures = false;
                interfaceC1148e = crashlytics();
            } else {
                interfaceC1148e = null;
            }
        }
        if (interfaceC1148e != null) {
            ((C13578e) interfaceC1148e).billing(Unit.INSTANCE);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m2449interface() {
        return !this.signatures && (((C11936e) ((C18464e) this.metrica.f3322e).f36192e).get() & 134217727) > 0;
    }

    @Override // defpackage.AbstractC5830e
    public final boolean license() {
        return ((Boolean) premium.get()).booleanValue();
    }

    @Override // defpackage.AbstractC5830e
    public final void loadAd(Set set) {
    }

    @Override // defpackage.AbstractC5830e
    public final boolean mopub() {
        return false;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m2450native() {
        InterfaceC1148e crashlytics;
        synchronized (this.license) {
            crashlytics = crashlytics();
            if (((EnumC18411e) this.tapsense.getValue()).compareTo(EnumC18411e.f36095e) <= 0) {
                throw AbstractC7070e.ad("Recomposer shutdown; frame clock awaiter will never resume", this.purchase);
            }
        }
        if (crashlytics != null) {
            ((C13578e) crashlytics).billing(Unit.INSTANCE);
        }
    }

    /* renamed from: protected, reason: not valid java name */
    public final C17489e m2451protected(C17489e c17489e, C12618e c12618e) {
        C12478e crashlytics;
        if (c17489e.f34298e.f27288class || c17489e.f34301e == 3) {
            return null;
        }
        C12618e c12618e2 = this.subscription;
        if (c12618e2 == null || !c12618e2.metrica(c17489e)) {
            C13749e c13749e = new C13749e(8, c17489e);
            C6538e c6538e = new C6538e(c17489e, c12618e, 0);
            AbstractC13717e adcel = AbstractC12909e.adcel();
            C12478e c12478e = adcel instanceof C12478e ? (C12478e) adcel : null;
            if (c12478e == null || (crashlytics = c12478e.crashlytics(c13749e, c6538e)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC13717e adcel2 = crashlytics.adcel();
                if (c12618e != null) {
                    try {
                        if (c12618e.startapp()) {
                            C5565e c5565e = new C5565e(c12618e, c17489e, 4);
                            C13770e c13770e = c17489e.f34298e;
                            if (c13770e.f27288class) {
                                AbstractC1889e.ad("Preparing a composition while composing is not supported");
                            }
                            c13770e.f27288class = true;
                            try {
                                c5565e.invoke();
                                c13770e.f27288class = false;
                            } catch (Throwable th) {
                                c13770e.f27288class = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC13717e.admob(adcel2);
                        throw th2;
                    }
                }
                boolean isVip = c17489e.isVip();
                AbstractC13717e.admob(adcel2);
                if (isVip) {
                    return c17489e;
                }
            } finally {
                premium(crashlytics);
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC5830e
    public final boolean purchase() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [eؚِۣ, eٟؒ۟, java.lang.Object] */
    @Override // defpackage.AbstractC5830e
    public final InterfaceC3399e remoteconfig(C17073e c17073e) {
        C0909e c0909e = this.metrica;
        C18464e c18464e = (C18464e) c0909e.f3322e;
        ?? obj = new Object();
        obj.ad = c17073e;
        return c18464e.m4519finally(obj, (C1708e) c0909e.f3321e);
    }

    @Override // defpackage.AbstractC5830e
    public final AbstractC16572e smaato(AbstractC14546e abstractC14546e) {
        AbstractC16572e abstractC16572e;
        synchronized (this.license) {
            abstractC16572e = (AbstractC16572e) this.loadAd.advert(abstractC14546e);
        }
        return abstractC16572e;
    }

    public final void subs() {
        synchronized (this.license) {
            try {
                if (((EnumC18411e) this.tapsense.getValue()).compareTo(EnumC18411e.f36093e) >= 0) {
                    C1615e c1615e = this.tapsense;
                    EnumC18411e enumC18411e = EnumC18411e.f36095e;
                    c1615e.getClass();
                    c1615e.smaato(null, enumC18411e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.inmobi.Signature(null);
    }

    @Override // defpackage.AbstractC5830e
    public final void subscription(C17489e c17489e) {
        synchronized (this.license) {
            try {
                C12618e c12618e = this.subscription;
                if (c12618e == null) {
                    C12618e c12618e2 = AbstractC1710e.ad;
                    c12618e = new C12618e();
                    this.subscription = c12618e;
                }
                c12618e.ad(c17489e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC5830e
    public final void tapsense(C17489e c17489e) {
        synchronized (this.license) {
            if (this.billing.remove(c17489e)) {
                this.yandex = null;
            }
            this.adcel.smaato(c17489e);
            this.mopub.remove(c17489e);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* renamed from: this, reason: not valid java name */
    public final List m2452this() {
        ?? r0 = this.yandex;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.billing;
        List arrayList2 = arrayList.isEmpty() ? C13664e.f27089e : new ArrayList(arrayList);
        this.yandex = arrayList2;
        return arrayList2;
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m2453throw(C17489e c17489e) {
        synchronized (this.license) {
            ArrayList arrayList = this.advert;
            if (arrayList.size() > 0) {
                ((AbstractC14546e) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (((defpackage.C6571e) r11.get(r4)).f13543e == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r10 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r12 = (defpackage.C6571e) r11.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (r12.f13543e != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r12 = (defpackage.AbstractC14546e) r12.f13544e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        r4 = r18.license;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        defpackage.AbstractC13480e.inmobi(r18.advert, r3);
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017d, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018b, code lost:
    
        if (r10 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
    
        r12 = r11.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0196, code lost:
    
        if (((defpackage.C6571e) r12).f13543e == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0198, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019b, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019e, code lost:
    
        r11 = r3;
     */
    /* renamed from: try, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m2454try(java.util.List r19, defpackage.C12618e r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8574e.m2454try(java.util.List, eّٜٝ):java.util.List");
    }

    @Override // defpackage.AbstractC5830e
    public final C12618e vip(C17489e c17489e, InterfaceC15992e interfaceC15992e, Function2 function2) {
        C0912e c0912e = this.isVip;
        try {
            InterfaceC15992e interfaceC15992e2 = c17489e.f34295e;
            c17489e.f34295e = interfaceC15992e;
            try {
                ad(c17489e, function2);
                C12618e c12618e = (C12618e) c0912e.get();
                if (c12618e == null) {
                    c12618e = AbstractC1710e.ad;
                }
                return c12618e;
            } finally {
                c17489e.f34295e = interfaceC15992e2;
            }
        } finally {
            c0912e.Signature(null);
        }
    }

    @Override // defpackage.AbstractC5830e
    public final InterfaceC12254e yandex() {
        return null;
    }
}
