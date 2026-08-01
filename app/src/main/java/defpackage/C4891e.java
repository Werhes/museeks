package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4891e extends AbstractC0003e {
    public final C1615e adcel;
    public final WeakReference appmetrica;
    public boolean billing;
    public EnumC7785e license;
    public C9833e metrica;
    public int purchase;
    public final ArrayList startapp;
    public final boolean vip;
    public boolean yandex;

    public C4891e(InterfaceC16400e interfaceC16400e, boolean z) {
        this.ad = new C15816e(3);
        this.vip = z;
        this.metrica = new C9833e();
        EnumC7785e enumC7785e = EnumC7785e.f15778e;
        this.license = enumC7785e;
        this.startapp = new ArrayList();
        this.appmetrica = new WeakReference(interfaceC16400e);
        this.adcel = AbstractC9180e.metrica(enumC7785e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eً۟ٔ] */
    @Override // defpackage.AbstractC0003e
    public final void ad(InterfaceC12066e interfaceC12066e) {
        InterfaceC12179e interfaceC12179e;
        Object obj;
        InterfaceC16400e interfaceC16400e;
        license("addObserver");
        EnumC7785e enumC7785e = this.license;
        EnumC7785e enumC7785e2 = EnumC7785e.f15780e;
        if (enumC7785e != enumC7785e2) {
            enumC7785e2 = EnumC7785e.f15778e;
        }
        ?? obj2 = new Object();
        HashMap hashMap = AbstractC9740e.ad;
        boolean z = interfaceC12066e instanceof InterfaceC12179e;
        boolean z2 = interfaceC12066e instanceof InterfaceC13619e;
        int i = 2;
        Object obj3 = null;
        if (z && z2) {
            interfaceC12179e = new C5462e((InterfaceC13619e) interfaceC12066e, (InterfaceC12179e) interfaceC12066e, r6);
        } else if (z2) {
            interfaceC12179e = new C5462e((InterfaceC13619e) interfaceC12066e, obj3, r6);
        } else if (z) {
            interfaceC12179e = (InterfaceC12179e) interfaceC12066e;
        } else {
            Class<?> cls = interfaceC12066e.getClass();
            if (AbstractC9740e.vip(cls) == 2) {
                List list = (List) AbstractC9740e.vip.get(cls);
                if (list.size() == 1) {
                    AbstractC9740e.ad((Constructor) list.get(0), interfaceC12066e);
                    interfaceC12179e = new Object();
                } else {
                    int size = list.size();
                    InterfaceC3823e[] interfaceC3823eArr = new InterfaceC3823e[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        AbstractC9740e.ad((Constructor) list.get(i2), interfaceC12066e);
                        interfaceC3823eArr[i2] = null;
                    }
                    interfaceC12179e = new C18149e(i, interfaceC3823eArr);
                }
            } else {
                interfaceC12179e = new C5462e(interfaceC12066e);
            }
        }
        obj2.vip = interfaceC12179e;
        obj2.ad = enumC7785e2;
        C9833e c9833e = this.metrica;
        C18091e appmetrica = c9833e.appmetrica(interfaceC12066e);
        if (appmetrica != null) {
            obj = appmetrica.f35478e;
        } else {
            HashMap hashMap2 = c9833e.f19424e;
            C18091e c18091e = new C18091e(interfaceC12066e, obj2);
            c9833e.f27009e++;
            C18091e c18091e2 = c9833e.f27008e;
            if (c18091e2 == null) {
                c9833e.f27010e = c18091e;
                c9833e.f27008e = c18091e;
            } else {
                c18091e2.f35477e = c18091e;
                c18091e.f35479e = c18091e2;
                c9833e.f27008e = c18091e;
            }
            hashMap2.put(interfaceC12066e, c18091e);
            obj = null;
        }
        if (((C8243e) obj) == null && (interfaceC16400e = (InterfaceC16400e) this.appmetrica.get()) != null) {
            r6 = (this.purchase != 0 || this.billing) ? 1 : 0;
            EnumC7785e metrica = metrica(interfaceC12066e);
            this.purchase++;
            while (obj2.ad.compareTo(metrica) < 0 && this.metrica.f19424e.containsKey(interfaceC12066e)) {
                EnumC7785e enumC7785e3 = obj2.ad;
                ArrayList arrayList = this.startapp;
                arrayList.add(enumC7785e3);
                C13978e c13978e = EnumC14621e.Companion;
                EnumC7785e enumC7785e4 = obj2.ad;
                c13978e.getClass();
                int ordinal = enumC7785e4.ordinal();
                EnumC14621e enumC14621e = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC14621e.ON_RESUME : EnumC14621e.ON_START : EnumC14621e.ON_CREATE;
                if (enumC14621e == null) {
                    throw new IllegalStateException("no event up from " + obj2.ad);
                }
                obj2.ad(interfaceC16400e, enumC14621e);
                arrayList.remove(arrayList.size() - 1);
                metrica = metrica(interfaceC12066e);
            }
            if (r6 == 0) {
                billing();
            }
            this.purchase--;
        }
    }

    public final void appmetrica(EnumC14621e enumC14621e) {
        license("handleLifecycleEvent");
        purchase(enumC14621e.ad());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r11.yandex = false;
        r11.adcel.advert(r11.license);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4891e.billing():void");
    }

    public final void license(String str) {
        if (this.vip) {
            C9129e.m2520class().adcel.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC5087e.m1746extends("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final EnumC7785e metrica(InterfaceC12066e interfaceC12066e) {
        HashMap hashMap = this.metrica.f19424e;
        C18091e c18091e = hashMap.containsKey(interfaceC12066e) ? ((C18091e) hashMap.get(interfaceC12066e)).f35479e : null;
        EnumC7785e enumC7785e = c18091e != null ? ((C8243e) c18091e.f35478e).ad : null;
        ArrayList arrayList = this.startapp;
        EnumC7785e enumC7785e2 = arrayList.isEmpty() ? null : (EnumC7785e) AbstractC17861e.mopub(1, arrayList);
        EnumC7785e enumC7785e3 = this.license;
        if (enumC7785e == null || enumC7785e.compareTo(enumC7785e3) >= 0) {
            enumC7785e = enumC7785e3;
        }
        return (enumC7785e2 == null || enumC7785e2.compareTo(enumC7785e) >= 0) ? enumC7785e : enumC7785e2;
    }

    public final void purchase(EnumC7785e enumC7785e) {
        if (this.license == enumC7785e) {
            return;
        }
        InterfaceC16400e interfaceC16400e = (InterfaceC16400e) this.appmetrica.get();
        EnumC7785e enumC7785e2 = this.license;
        EnumC7785e enumC7785e3 = EnumC7785e.f15778e;
        EnumC7785e enumC7785e4 = EnumC7785e.f15780e;
        if (enumC7785e2 == enumC7785e3 && enumC7785e == enumC7785e4) {
            throw new IllegalStateException(("State must be at least '" + EnumC7785e.f15777e + "' to be moved to '" + enumC7785e + "' in component " + interfaceC16400e).toString());
        }
        if (enumC7785e2 == enumC7785e4 && enumC7785e2 != enumC7785e) {
            throw new IllegalStateException(("State is '" + enumC7785e4 + "' and cannot be moved to `" + enumC7785e + "` in component " + interfaceC16400e).toString());
        }
        this.license = enumC7785e;
        if (this.billing || this.purchase != 0) {
            this.yandex = true;
            return;
        }
        this.billing = true;
        billing();
        this.billing = false;
        if (this.license == enumC7785e4) {
            this.metrica = new C9833e();
        }
    }

    @Override // defpackage.AbstractC0003e
    public final void vip(InterfaceC12066e interfaceC12066e) {
        license("removeObserver");
        this.metrica.billing(interfaceC12066e);
    }
}
