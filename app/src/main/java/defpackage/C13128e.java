package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13128e {
    public final Function1 ad;
    public boolean metrica;
    public C14040e startapp;
    public C2007e yandex;
    public final AtomicReference vip = new AtomicReference(null);
    public final C3450e license = new C3450e(9, this);
    public final C17955e appmetrica = new C17955e(0, this);
    public final C12431e purchase = new C12431e(0, new C14040e[16]);
    public final Object billing = new Object();
    public long adcel = -1;

    public C13128e(Function1 function1) {
        this.ad = function1;
    }

    public final void ad() {
        synchronized (this.billing) {
            try {
                C12431e c12431e = this.purchase;
                Object[] objArr = c12431e.f24870e;
                int i = c12431e.f24868e;
                for (int i2 = 0; i2 < i; i2++) {
                    C14040e c14040e = (C14040e) objArr[i2];
                    c14040e.appmetrica.ad();
                    c14040e.purchase.ad();
                    c14040e.advert.ad();
                    c14040e.smaato.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    public final void license() {
        C3450e c3450e = this.license;
        AbstractC12909e.appmetrica(AbstractC12909e.ad);
        synchronized (AbstractC12909e.metrica) {
            AbstractC12909e.yandex = AbstractC13480e.m3572catch(c3450e, AbstractC12909e.yandex);
            Unit unit = Unit.INSTANCE;
        }
        this.yandex = new C2007e(10, c3450e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void metrica(java.lang.Object r22, kotlin.jvm.functions.Function1 r23, kotlin.jvm.functions.Function0 r24) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13128e.metrica(java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean vip() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.billing) {
            z = this.metrica;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.vip;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC1889e.vip("Unexpected notification");
                        throw new C14803e(9);
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.billing) {
                try {
                    C12431e c12431e = this.purchase;
                    Object[] objArr = c12431e.f24870e;
                    int i = c12431e.f24868e;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!((C14040e) objArr[i2]).ad(set) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
