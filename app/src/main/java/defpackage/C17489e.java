package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17489e implements InterfaceC12254e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C4799e f34284e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C0583e f34285e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C14608e f34286e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C0583e f34288e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C14995e f34289e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C0583e f34290e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C17489e f34291e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC7919e f34292e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C11844e f34293e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f34294e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public InterfaceC15992e f34295e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C12618e f34296e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C14608e f34297e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C13770e f34298e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f34299e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public int f34301e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C12618e f34302e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public Function2 f34303e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC5830e f34304e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0583e f34305e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C18516e f34306e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5389e f34307e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AtomicReference f34287e = new AtomicReference(null);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f34300e = new Object();

    public C17489e(AbstractC5830e abstractC5830e, AbstractC7919e abstractC7919e) {
        this.f34304e = abstractC5830e;
        this.f34292e = abstractC7919e;
        C4799e c4799e = new C4799e(new C12618e());
        this.f34284e = c4799e;
        C18516e c18516e = new C18516e();
        if (abstractC5830e.license()) {
            c18516e.f36306e = new C3123e();
        }
        if (abstractC5830e.purchase()) {
            c18516e.billing();
        }
        this.f34306e = c18516e;
        this.f34305e = AbstractC16565e.license();
        this.f34296e = new C12618e();
        this.f34302e = new C12618e();
        this.f34288e = AbstractC16565e.license();
        C14608e c14608e = new C14608e();
        this.f34297e = c14608e;
        C14608e c14608e2 = new C14608e();
        this.f34286e = c14608e2;
        this.f34285e = AbstractC16565e.license();
        this.f34290e = AbstractC16565e.license();
        C5389e c5389e = new C5389e(7, abstractC5830e);
        this.f34307e = c5389e;
        this.f34289e = new C14995e();
        C13770e c13770e = new C13770e(abstractC7919e, abstractC5830e, AbstractC2855e.appmetrica(c18516e), c4799e, c14608e, c14608e2, c5389e, this);
        abstractC5830e.Signature(c13770e);
        this.f34298e = c13770e;
        this.f34303e = AbstractC16982e.ad;
    }

    public final void Signature() {
        C3295e c3295e = C3295e.f7451e;
        AtomicReference atomicReference = this.f34287e;
        Object andSet = atomicReference.getAndSet(c3295e);
        if (AbstractC7890e.billing(andSet, AbstractC8294e.ad) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            license((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1889e.vip("corrupt pendingModifications drain: " + atomicReference);
            throw new C14803e(9);
        }
        for (Set set : (Set[]) andSet) {
            license(set, false);
        }
    }

    @Override // defpackage.InterfaceC12254e
    public final void ad() {
        synchronized (this.f34300e) {
            try {
                if (this.f34298e.f27288class) {
                    AbstractC6536e.vip("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f34301e != 3) {
                    this.f34301e = 3;
                    this.f34303e = AbstractC16982e.vip;
                    C14608e c14608e = this.f34298e.f27297throw;
                    if (c14608e != null) {
                        purchase(c14608e);
                    }
                    boolean z = this.f34306e.f36304e == 0;
                    if (!z || !this.f34284e.f10228e.yandex()) {
                        C14995e c14995e = this.f34289e;
                        try {
                            c14995e.mopub(this.f34284e, this.f34298e.applovin());
                            if (!z) {
                                C18516e c18516e = this.f34306e;
                                C14995e c14995e2 = this.f34289e;
                                C14479e adcel = c18516e.adcel();
                                try {
                                    adcel.amazon(adcel.pro, new C11213e(14, c14995e2));
                                    adcel.m3815goto();
                                    Unit unit = Unit.INSTANCE;
                                    adcel.appmetrica(true);
                                    this.f34292e.ad();
                                    this.f34292e.loadAd();
                                    c14995e.appmetrica();
                                } catch (Throwable th) {
                                    adcel.appmetrica(false);
                                    throw th;
                                }
                            }
                            c14995e.license();
                            c14995e.metrica();
                        } catch (Throwable th2) {
                            c14995e.metrica();
                            throw th2;
                        }
                    }
                    C13770e c13770e = this.f34298e;
                    c13770e.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c13770e.vip.signatures(c13770e);
                        c13770e.firebase.clear();
                        c13770e.remoteconfig.clear();
                        c13770e.appmetrica.license();
                        c13770e.tapsense = null;
                        c13770e.ad.ad();
                        Unit unit2 = Unit.INSTANCE;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f34304e.tapsense(this);
    }

    public final boolean adcel() {
        boolean z;
        synchronized (this.f34300e) {
            z = true;
            if (this.f34301e != 1) {
                z = false;
            }
            if (z) {
                this.f34301e = 0;
            }
        }
        return z;
    }

    public final void admob() {
        int i = this.f34301e;
        if (i != 0) {
            AbstractC6536e.vip(i != 1 ? i != 2 ? i != 3 ? BuildConfig.FLAVOR : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f34293e == null) {
            return;
        }
        AbstractC6536e.vip("A pausable composition is in progress");
    }

    public final void ads(Function2 function2) {
        boolean adcel = adcel();
        admob();
        AbstractC5830e abstractC5830e = this.f34304e;
        if (!adcel) {
            this.f34303e = function2;
            abstractC5830e.ad(this, function2);
            return;
        }
        C13770e c13770e = this.f34298e;
        c13770e.applovin = 0;
        c13770e.isPro = true;
        this.f34303e = function2;
        abstractC5830e.ad(this, function2);
        c13770e.remoteconfig();
    }

    public final C11844e advert(boolean z, Function2 function2) {
        if (this.f34293e != null) {
            AbstractC6536e.vip("A pausable composition is in progress");
        }
        C11844e c11844e = new C11844e(this, this.f34304e, this.f34298e, this.f34284e, function2, z, this.f34292e, this.f34300e);
        this.f34293e = c11844e;
        return c11844e;
    }

    public final void amazon() {
        AtomicReference atomicReference = this.f34287e;
        Object obj = AbstractC8294e.ad;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1889e.vip("pending composition has not been applied");
                throw new C14803e(9);
            }
            if (andSet instanceof Set) {
                license((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1889e.vip("corrupt pendingModifications drain: " + atomicReference);
                throw new C14803e(9);
            }
            for (Set set : (Set[]) andSet) {
                license(set, true);
            }
        }
    }

    public final void applovin(Object obj) {
        synchronized (this.f34300e) {
            try {
                signatures(obj);
                Object billing = this.f34288e.billing(obj);
                if (billing != null) {
                    if (billing instanceof C12618e) {
                        C12618e c12618e = (C12618e) billing;
                        Object[] objArr = c12618e.vip;
                        long[] jArr = c12618e.ad;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            signatures((C6656e) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        signatures((C6656e) billing);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void appmetrica() {
        synchronized (this.f34300e) {
            try {
                purchase(this.f34297e);
                loadAd();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f34284e.f10228e.yandex()) {
                        C14995e c14995e = this.f34289e;
                        try {
                            c14995e.mopub(this.f34284e, this.f34298e.applovin());
                            c14995e.license();
                            c14995e.metrica();
                        } catch (Throwable th2) {
                            c14995e.metrica();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    vip();
                    throw th3;
                }
            }
        }
    }

    public final void billing() {
        synchronized (this.f34300e) {
            try {
                C14608e c14608e = this.f34286e;
                c14608e.getClass();
                if (!c14608e.metrica.startapp()) {
                    purchase(this.f34286e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f34284e.f10228e.yandex()) {
                        C14995e c14995e = this.f34289e;
                        try {
                            c14995e.mopub(this.f34284e, this.f34298e.applovin());
                            c14995e.license();
                            c14995e.metrica();
                        } catch (Throwable th2) {
                            c14995e.metrica();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    vip();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void inmobi(C5456e c5456e) {
        C5456e c5456e2;
        while (true) {
            Object obj = this.f34287e.get();
            if (obj == null || obj.equals(AbstractC8294e.ad)) {
                c5456e2 = c5456e;
            } else if (obj instanceof Set) {
                c5456e2 = new Set[]{obj, c5456e};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f34287e).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = c5456e;
                c5456e2 = copyOf;
            }
            AtomicReference atomicReference = this.f34287e;
            while (!atomicReference.compareAndSet(obj, c5456e2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f34300e) {
                    loadAd();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void isPro(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17489e.isPro(java.lang.Object):void");
    }

    public final boolean isVip() {
        synchronized (this.f34300e) {
            C11844e c11844e = this.f34293e;
            boolean z = false;
            if (c11844e != null && (c11844e.yandex.get() != EnumC15242e.f30153e || c11844e.startapp != AbstractC15390e.appmetrica())) {
                AtomicReference atomicReference = c11844e.yandex;
                EnumC15242e enumC15242e = EnumC15242e.f30160e;
                EnumC15242e enumC15242e2 = EnumC15242e.f30157e;
                while (!atomicReference.compareAndSet(enumC15242e, enumC15242e2) && atomicReference.get() == enumC15242e) {
                }
                ((C12452e) c11844e.advert.f29788e).ad(9);
                return false;
            }
            amazon();
            try {
                C0583e c0583e = this.f34290e;
                this.f34290e = AbstractC16565e.license();
                try {
                    C13770e c13770e = this.f34298e;
                    InterfaceC15992e interfaceC15992e = this.f34295e;
                    C12021e c12021e = c13770e.appmetrica.metrica;
                    if (!c12021e.startapp()) {
                        AbstractC1889e.ad("Expected applyChanges() to have been called");
                    }
                    if (c0583e.appmetrica > 0 || !c13770e.remoteconfig.isEmpty()) {
                        c13770e.f27285break = interfaceC15992e;
                        try {
                            c13770e.amazon(c0583e, null);
                            c13770e.f27285break = null;
                            z = !c12021e.startapp();
                        } catch (Throwable th) {
                            c13770e.f27285break = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        loadAd();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f34290e = c0583e;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f34284e.f10228e.yandex()) {
                        C14995e c14995e = this.f34289e;
                        try {
                            c14995e.mopub(this.f34284e, this.f34298e.applovin());
                            c14995e.license();
                            c14995e.metrica();
                        } catch (Throwable th4) {
                            c14995e.metrica();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    vip();
                    throw th5;
                }
            }
        }
    }

    public final void license(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean metrica;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean z2;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i3;
        int i4;
        long[] jArr8;
        boolean z3 = set instanceof C5456e;
        C0583e c0583e = this.f34288e;
        Object obj = null;
        int i5 = 8;
        if (z3) {
            C12618e c12618e = ((C5456e) set).f11727e;
            Object[] objArr = c12618e.vip;
            long[] jArr9 = c12618e.ad;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i6];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c2 = c3;
                                if (obj2 instanceof C2846e) {
                                    ((C2846e) obj2).metrica(obj);
                                    jArr7 = jArr9;
                                    j8 = j9;
                                    i3 = length;
                                } else {
                                    metrica(obj2, z);
                                    Object billing = c0583e.billing(obj2);
                                    if (billing != null) {
                                        if (billing instanceof C12618e) {
                                            C12618e c12618e2 = (C12618e) billing;
                                            Object[] objArr2 = c12618e2.vip;
                                            long[] jArr10 = c12618e2.ad;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = i5;
                                                i3 = length;
                                                int i10 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i10];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i12 = 0;
                                                        while (i12 < i11) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                metrica((C6656e) objArr2[(i10 << 3) + i12], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i9;
                                                            i12++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i11 != i9) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i9 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i3 = length;
                                            metrica((C6656e) billing, z);
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    jArr7 = jArr9;
                                    j8 = j9;
                                    i3 = length;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                i4 = 8;
                            } else {
                                jArr7 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c3 = c2;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c3;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr9 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C2846e) {
                    ((C2846e) obj3).metrica(null);
                } else {
                    metrica(obj3, z);
                    Object billing2 = c0583e.billing(obj3);
                    if (billing2 != null) {
                        if (billing2 instanceof C12618e) {
                            C12618e c12618e3 = (C12618e) billing2;
                            Object[] objArr3 = c12618e3.vip;
                            long[] jArr12 = c12618e3.ad;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr12[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                metrica((C6656e) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    if (i14 == length3) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        } else {
                            metrica((C6656e) billing2, z);
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        }
        C0583e c0583e2 = this.f34305e;
        C12618e c12618e4 = this.f34296e;
        if (z) {
            C12618e c12618e5 = this.f34302e;
            if (c12618e5.startapp()) {
                long[] jArr13 = c0583e2.ad;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = c0583e2.vip[i20];
                                    Object obj5 = c0583e2.metrica[i20];
                                    if (obj5 instanceof C12618e) {
                                        C12618e c12618e6 = (C12618e) obj5;
                                        Object[] objArr4 = c12618e6.vip;
                                        long[] jArr14 = c12618e6.ad;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            C2846e c2846e = (C2846e) objArr4[i24];
                                                            if (c12618e5.metrica(c2846e) || c12618e4.metrica(c2846e)) {
                                                                c12618e6.amazon(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        z2 = c12618e6.yandex();
                                    } else {
                                        jArr5 = jArr13;
                                        i = length4;
                                        j6 = j12;
                                        C2846e c2846e2 = (C2846e) obj5;
                                        z2 = c12618e5.metrica(c2846e2) || c12618e4.metrica(c2846e2);
                                    }
                                    if (z2) {
                                        c0583e2.smaato(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                c12618e5.vip();
                startapp();
                return;
            }
        }
        if (c12618e4.startapp()) {
            long[] jArr15 = c0583e2.ad;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = c0583e2.vip[i29];
                                Object obj7 = c0583e2.metrica[i29];
                                if (obj7 instanceof C12618e) {
                                    C12618e c12618e7 = (C12618e) obj7;
                                    Object[] objArr5 = c12618e7.vip;
                                    long[] jArr16 = c12618e7.ad;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (c12618e4.metrica((C2846e) objArr6[i33])) {
                                                            c12618e7.amazon(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    metrica = c12618e7.yandex();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    metrica = c12618e4.metrica((C2846e) obj7);
                                }
                                if (metrica) {
                                    c0583e2.smaato(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            startapp();
            c12618e4.vip();
        }
    }

    public final void loadAd() {
        AtomicReference atomicReference = this.f34287e;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC7890e.billing(andSet, AbstractC8294e.ad)) {
            return;
        }
        if (andSet instanceof Set) {
            license((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                license(set, false);
            }
            return;
        }
        if (andSet != null) {
            AbstractC1889e.vip("corrupt pendingModifications drain: " + atomicReference);
            throw new C14803e(9);
        }
        if (this.f34293e == null) {
            AbstractC1889e.ad("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void metrica(Object obj, boolean z) {
        int i;
        Object billing = this.f34305e.billing(obj);
        if (billing == null) {
            return;
        }
        boolean z2 = billing instanceof C12618e;
        C12618e c12618e = this.f34296e;
        C12618e c12618e2 = this.f34302e;
        C0583e c0583e = this.f34285e;
        if (!z2) {
            C2846e c2846e = (C2846e) billing;
            if (AbstractC16565e.appmetrica(c0583e, obj, c2846e) || c2846e.metrica(obj) == 1) {
                return;
            }
            if (c2846e.billing == null || z) {
                c12618e.ad(c2846e);
                return;
            } else {
                c12618e2.ad(c2846e);
                return;
            }
        }
        C12618e c12618e3 = (C12618e) billing;
        Object[] objArr = c12618e3.vip;
        long[] jArr = c12618e3.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        C2846e c2846e2 = (C2846e) objArr[(i2 << 3) + i5];
                        if (!AbstractC16565e.appmetrica(c0583e, obj, c2846e2)) {
                            i = i3;
                            if (c2846e2.metrica(obj) != 1) {
                                if (c2846e2.billing == null || z) {
                                    c12618e.ad(c2846e2);
                                } else {
                                    c12618e2.ad(c2846e2);
                                }
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                        }
                    }
                    i = i3;
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void mopub(Function2 function2) {
        try {
            synchronized (this.f34300e) {
                amazon();
                C0583e c0583e = this.f34290e;
                this.f34290e = AbstractC16565e.license();
                try {
                    C13770e c13770e = this.f34298e;
                    InterfaceC15992e interfaceC15992e = this.f34295e;
                    if (!c13770e.appmetrica.metrica.startapp()) {
                        AbstractC1889e.ad("Expected applyChanges() to have been called");
                    }
                    c13770e.f27285break = interfaceC15992e;
                    try {
                        c13770e.amazon(c0583e, function2);
                        c13770e.f27285break = null;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        c13770e.f27285break = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f34290e = c0583e;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f34284e.f10228e.yandex()) {
                    C14995e c14995e = this.f34289e;
                    try {
                        c14995e.mopub(this.f34284e, this.f34298e.applovin());
                        c14995e.license();
                        c14995e.metrica();
                    } catch (Throwable th4) {
                        c14995e.metrica();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                vip();
                throw th5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int pro(defpackage.C2846e r22, defpackage.C3155e r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17489e.pro(eؔۚۥ, eؕؗٞ, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x0083, B:31:0x0090, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(defpackage.C14608e r34) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17489e.purchase(eٌۣٔ):void");
    }

    public final int remoteconfig(C2846e c2846e, Object obj) {
        C17489e c17489e;
        int i = c2846e.vip;
        if ((i & 2) != 0) {
            c2846e.vip = i | 4;
        }
        C3155e c3155e = c2846e.metrica;
        if (c3155e == null || !c3155e.ad()) {
            return 1;
        }
        C18516e c18516e = this.f34306e;
        c18516e.getClass();
        C3155e c3155e2 = c2846e.metrica;
        if (c3155e2 != null && c18516e.advert(AbstractC12184e.metrica(c3155e2))) {
            if (c2846e.license == null) {
                return 1;
            }
            int pro = pro(c2846e, c3155e, obj);
            if (pro != 1) {
                this.f34307e.purchase();
            }
            return pro;
        }
        synchronized (this.f34300e) {
            c17489e = this.f34291e;
        }
        if (c17489e != null) {
            C13770e c13770e = c17489e.f34298e;
            if (c13770e.f27288class && c13770e.m3675static(c2846e, obj)) {
                return 4;
            }
        }
        return 1;
    }

    public final void signatures(Object obj) {
        Object billing = this.f34305e.billing(obj);
        if (billing == null) {
            return;
        }
        boolean z = billing instanceof C12618e;
        C0583e c0583e = this.f34285e;
        if (!z) {
            C2846e c2846e = (C2846e) billing;
            if (c2846e.metrica(obj) == 4) {
                AbstractC16565e.metrica(c0583e, obj, c2846e);
                return;
            }
            return;
        }
        C12618e c12618e = (C12618e) billing;
        Object[] objArr = c12618e.vip;
        long[] jArr = c12618e.ad;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C2846e c2846e2 = (C2846e) objArr[(i << 3) + i3];
                        if (c2846e2.metrica(obj) == 4) {
                            AbstractC16565e.metrica(c0583e, obj, c2846e2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void smaato() {
        C14995e c14995e;
        synchronized (this.f34300e) {
            try {
                if (this.f34293e != null) {
                    AbstractC6536e.vip("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f34306e.f36304e == 0;
                try {
                    try {
                        if (z) {
                            if (!this.f34284e.f10228e.yandex()) {
                            }
                            this.f34305e.ad();
                            this.f34288e.ad();
                            this.f34290e.ad();
                            this.f34297e.license();
                            this.f34286e.license();
                            C13770e c13770e = this.f34298e;
                            c13770e.firebase.clear();
                            c13770e.remoteconfig.clear();
                            c13770e.appmetrica.license();
                            c13770e.tapsense = null;
                            this.f34301e = 1;
                            Unit unit = Unit.INSTANCE;
                        }
                        c14995e.mopub(this.f34284e, this.f34298e.applovin());
                        if (!z) {
                            C18516e c18516e = this.f34306e;
                            C14995e c14995e2 = this.f34289e;
                            C14479e adcel = c18516e.adcel();
                            try {
                                adcel.amazon(adcel.pro, new C17785e(c14995e2, adcel, 6));
                                Unit unit2 = Unit.INSTANCE;
                                adcel.appmetrica(true);
                                this.f34292e.loadAd();
                                c14995e.appmetrica();
                            } catch (Throwable th) {
                                adcel.appmetrica(false);
                                throw th;
                            }
                        }
                        c14995e.license();
                        c14995e.metrica();
                        Unit unit3 = Unit.INSTANCE;
                        this.f34305e.ad();
                        this.f34288e.ad();
                        this.f34290e.ad();
                        this.f34297e.license();
                        this.f34286e.license();
                        C13770e c13770e2 = this.f34298e;
                        c13770e2.firebase.clear();
                        c13770e2.remoteconfig.clear();
                        c13770e2.appmetrica.license();
                        c13770e2.tapsense = null;
                        this.f34301e = 1;
                        Unit unit4 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        c14995e.metrica();
                        throw th2;
                    }
                    c14995e = this.f34289e;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void startapp() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        int i3;
        long j7;
        C0583e c0583e = this.f34288e;
        long[] jArr3 = c0583e.ad;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = c0583e.vip[i8];
                            Object obj2 = c0583e.metrica[i8];
                            boolean z2 = obj2 instanceof C12618e;
                            C0583e c0583e2 = this.f34305e;
                            if (z2) {
                                C12618e c12618e = (C12618e) obj2;
                                Object[] objArr = c12618e.vip;
                                long[] jArr4 = c12618e.ad;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!c0583e2.metrica((C6656e) objArr[i13])) {
                                                        c12618e.amazon(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z = c12618e.yandex();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                z = !c0583e2.metrica((C6656e) obj2);
                            }
                            if (z) {
                                c0583e.smaato(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        C12618e c12618e2 = this.f34302e;
        if (!c12618e2.startapp()) {
            return;
        }
        Object[] objArr2 = c12618e2.vip;
        long[] jArr5 = c12618e2.ad;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((C2846e) objArr2[i18]).billing != null)) {
                            c12618e2.amazon(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void subscription(ArrayList arrayList) {
        C4799e c4799e = this.f34284e;
        C13770e c13770e = this.f34298e;
        if (arrayList.size() > 0) {
            ((AbstractC14546e) ((C6571e) arrayList.get(0)).f13544e).getClass();
            throw null;
        }
        try {
            c13770e.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c13770e.premium(arrayList);
                    c13770e.startapp();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    c13770e.ad();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!c4799e.f10228e.yandex()) {
                    C14995e c14995e = this.f34289e;
                    try {
                        c14995e.mopub(c4799e, c13770e.applovin());
                        c14995e.license();
                        c14995e.metrica();
                    } catch (Throwable th3) {
                        c14995e.metrica();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                vip();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tapsense(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof defpackage.C5456e
            eؑ۟ؖ r3 = r0.f34288e
            eؑ۟ؖ r4 = r0.f34305e
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            eؘؘؙ r1 = (defpackage.C5456e) r1
            eّٜٝ r1 = r1.f11727e
            java.lang.Object[] r2 = r1.vip
            long[] r1 = r1.ad
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.metrica(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.metrica(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.metrica(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.metrica(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17489e.tapsense(java.util.Set):boolean");
    }

    public final void vip() {
        this.f34287e.set(null);
        this.f34297e.license();
        this.f34286e.license();
        C4799e c4799e = this.f34284e;
        if (c4799e.f10228e.yandex()) {
            return;
        }
        C14995e c14995e = this.f34289e;
        try {
            c14995e.mopub(c4799e, this.f34298e.applovin());
            c14995e.license();
        } finally {
            c14995e.metrica();
        }
    }

    public final void yandex() {
        C14995e c14995e;
        synchronized (this.f34300e) {
            try {
                this.f34298e.tapsense = null;
                if (!this.f34284e.f10228e.yandex()) {
                    c14995e = this.f34289e;
                    try {
                        c14995e.mopub(this.f34284e, this.f34298e.applovin());
                        c14995e.license();
                        c14995e.metrica();
                    } finally {
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.f34284e.f10228e.yandex()) {
                        c14995e = this.f34289e;
                        try {
                            c14995e.mopub(this.f34284e, this.f34298e.applovin());
                            c14995e.license();
                            c14995e.metrica();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    vip();
                    throw th2;
                }
            }
        }
    }
}
