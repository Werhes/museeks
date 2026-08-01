package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12810e implements InterfaceC7865e {
    public static final C8823e advert = AbstractC16565e.ad(new C4405e(4, null));
    public static final C8823e smaato;
    public final InterfaceC16964e ad;
    public final C5363e adcel;
    public final C8591e appmetrica;
    public volatile boolean billing;
    public final InterfaceC16964e license;
    public final C12383e metrica;
    public final LinkedHashMap mopub;
    public final C4373e purchase;
    public final C5363e startapp;
    public final InterfaceC16964e vip;
    public final C5363e yandex;

    static {
        C8823e c8823e = new C8823e();
        c8823e.Signature(null);
        smaato = c8823e;
    }

    public C12810e(InterfaceC16964e interfaceC16964e, InterfaceC16964e interfaceC16964e2, C12383e c12383e, InterfaceC16964e interfaceC16964e3, C8591e c8591e, C4373e c4373e) {
        this.ad = interfaceC16964e;
        this.vip = interfaceC16964e2;
        this.metrica = c12383e;
        this.license = interfaceC16964e3;
        this.appmetrica = c8591e;
        this.purchase = c4373e;
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i = 0;
        this.yandex = new C5363e(new Function0(this) { // from class: eؙۙ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12810e f13691e;

            {
                this.f13691e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (InterfaceC1373e) this.f13691e.ad.get();
                    case 1:
                        return (C11728e) this.f13691e.license.get();
                    default:
                        return (C16170e) this.f13691e.vip.get();
                }
            }
        });
        final int i2 = 1;
        this.startapp = new C5363e(new Function0(this) { // from class: eؙۙ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12810e f13691e;

            {
                this.f13691e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (InterfaceC1373e) this.f13691e.ad.get();
                    case 1:
                        return (C11728e) this.f13691e.license.get();
                    default:
                        return (C16170e) this.f13691e.vip.get();
                }
            }
        });
        final int i3 = 2;
        this.adcel = new C5363e(new Function0(this) { // from class: eؙۙ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C12810e f13691e;

            {
                this.f13691e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (InterfaceC1373e) this.f13691e.ad.get();
                    case 1:
                        return (C11728e) this.f13691e.license.get();
                    default:
                        return (C16170e) this.f13691e.vip.get();
                }
            }
        });
        this.mopub = new LinkedHashMap();
    }

    public static final Object advert(C12810e c12810e, EnumC4385e enumC4385e, Map map, EnumC13734e enumC13734e, AbstractC7185e abstractC7185e) {
        LinkedHashMap linkedHashMap = c12810e.mopub;
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + enumC4385e + "] values = " + map + ", optionPriority = " + enumC13734e);
        }
        Object obj = linkedHashMap.get(enumC4385e);
        if (obj == null) {
            obj = new C15388e((C13935e) null, (LinkedHashMap) null, (C18217e) null, 15);
            linkedHashMap.put(enumC4385e, obj);
        }
        C15388e c15388e = (C15388e) obj;
        C13935e c13935e = new C13935e(5);
        c13935e.m3731class((C4069e) c15388e.ad.f27641e);
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            ((C4069e) c13935e.f27641e).billing(AbstractC15428e.ad(key), enumC13734e, entry.getValue());
        }
        linkedHashMap.put(enumC4385e, new C15388e(c13935e, new LinkedHashMap(c15388e.vip), AbstractC13480e.m3581e(c15388e.metrica), c15388e.license));
        return c12810e.loadAd(smaato(linkedHashMap), null, abstractC7185e);
    }

    public static C15388e smaato(LinkedHashMap linkedHashMap) {
        C15388e c15388e = new C15388e((C13935e) null, (LinkedHashMap) null, new C18217e(1), 7);
        C1630e c1630e = new C1630e(0, EnumC4385e.f9553e);
        while (c1630e.hasNext()) {
            C15388e c15388e2 = (C15388e) linkedHashMap.get((EnumC4385e) c1630e.next());
            if (c15388e2 != null) {
                c15388e.ad.m3731class((C4069e) c15388e2.ad.f27641e);
                c15388e.vip.putAll(c15388e2.vip);
                c15388e.metrica.addAll(c15388e2.metrica);
                C18217e c18217e = c15388e2.license;
                if (c18217e != null) {
                    c15388e.license = new C18217e(c18217e.ad);
                }
            }
        }
        return c15388e;
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e ad(List list, List list2, List list3, C12236e c12236e, C6510e c6510e, long j) {
        C8823e amazon = !this.billing ? amazon(new C6222e(this, list, list2, list3, c12236e, c6510e, j, null)) : null;
        return amazon == null ? advert : amazon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e adcel(Map map, EnumC13734e enumC13734e) {
        C8823e c8823e = null;
        Object[] objArr = 0;
        if (!this.billing) {
            c8823e = amazon(new C12602e(this, map, enumC13734e, objArr == true ? 1 : 0, 5));
        }
        return c8823e == null ? smaato : c8823e;
    }

    public final C8823e amazon(Function1 function1) {
        C8591e c8591e = this.appmetrica;
        int i = AbstractC7890e.billing(c8591e.metrica.get(), Boolean.TRUE) ? 4 : 1;
        C8823e c8823e = new C8823e();
        AbstractC5336e.purchase(c8591e.appmetrica, null, i, new C7195e(function1, c8823e, (InterfaceC5083e) null), 1);
        return c8823e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e appmetrica(C11456e c11456e, Map map) {
        C8823e c8823e = null;
        Object[] objArr = 0;
        if (!this.billing) {
            c8823e = amazon(new C12602e(this, c11456e, map, objArr == true ? 1 : 0, 6));
        }
        return c8823e == null ? smaato : c8823e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e billing(List list) {
        C8823e amazon = this.billing ? null : amazon(new C17212e(this, list, 0 == true ? 1 : 0, 11));
        return amazon == null ? smaato : amazon;
    }

    @Override // defpackage.InterfaceC7865e
    public final void close() {
        this.billing = true;
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        C16170e c16170e = (C16170e) this.adcel.getValue();
        synchronized (c16170e.metrica) {
            try {
                if (c16170e.billing) {
                    c16170e.billing = false;
                    C8823e c8823e = c16170e.license;
                    if (c8823e != null) {
                        c8823e.m2503e(new CancellationException("UseCaseCameraState closed"));
                    }
                    c16170e.license = null;
                }
                while (!c16170e.purchase.isEmpty()) {
                    ((C8823e) ((C16837e) c16170e.purchase.removeFirst()).vip).m2503e(new CancellationException("UseCaseCameraState closed"));
                    c16170e.admob.ad();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7865e
    public final Object license(AbstractC7185e abstractC7185e) {
        C11728e c11728e = (C11728e) this.startapp.getValue();
        c11728e.getClass();
        return C11728e.metrica(c11728e, abstractC7185e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(defpackage.C15388e r11, java.util.LinkedHashSet r12, defpackage.AbstractC10731e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.C1880e
            if (r0 == 0) goto L14
            r0 = r13
            eٍؓ٘ r0 = (defpackage.C1880e) r0
            int r1 = r0.f5018e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5018e = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            eٍؓ٘ r0 = new eٍؓ٘
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.f5017e
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            int r1 = r7.f5018e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r13)
            goto Lae
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.AbstractC2003e.purchase(r13)
            boolean r13 = r10.billing
            r1 = 0
            if (r13 != 0) goto Lb8
            eؖۚۨ r13 = r10.purchase
            eٓۢۜ r3 = defpackage.AbstractC18189e.ad
            eٗٔۥ r13 = r13.f9518e
            eٓۢۜ r3 = defpackage.AbstractC18189e.ad
            java.lang.Object r13 = r13.smaato(r3, r1)
            if (r13 != 0) goto Lb2
            eؘؒؐ r13 = r10.yandex
            java.lang.Object r13 = r13.getValue()
            eٖؒ۠ r13 = (defpackage.InterfaceC1373e) r13
            eٛۢ r1 = r11.license
            int r1 = r1.ad
            r3 = -1
            if (r1 == r3) goto L58
            goto L59
        L58:
            r1 = r2
        L59:
            r13.ad(r1)
            eؘؒؐ r13 = r10.adcel
            java.lang.Object r13 = r13.getValue()
            r1 = r13
            eْٖٓ r1 = (defpackage.C16170e) r1
            eّّٓ r13 = r11.ad
            eِؒؖ r13 = r13.applovin()
            java.util.LinkedHashMap r13 = defpackage.AbstractC15428e.purchase(r13)
            eْؑۨ r3 = defpackage.AbstractC9212e.ad
            eؘؙۤ r4 = defpackage.C5489e.ad()
            java.util.Map r5 = r11.vip
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L7f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r6.getValue()
            android.util.ArrayMap r9 = r4.ad
            r9.put(r8, r6)
            goto L7f
        L9b:
            java.util.Map r3 = java.util.Collections.singletonMap(r3, r4)
            eٛۢ r5 = r11.license
            java.util.Set r6 = r11.metrica
            r7.f5018e = r2
            r4 = r12
            r2 = r13
            java.lang.Object r13 = r1.metrica(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto Lae
            return r0
        Lae:
            r1 = r13
            eؙؓٚ r1 = (defpackage.InterfaceC1908e) r1
            goto Lb8
        Lb2:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        Lb8:
            if (r1 != 0) goto Lbd
            eٌٝؐ r11 = defpackage.C12810e.smaato
            return r11
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12810e.loadAd(eُٕٚ, java.util.LinkedHashSet, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e metrica(List list, List list2, List list3) {
        C8823e amazon = !this.billing ? amazon(new C17237e(this, list, list2, list3, null)) : null;
        return amazon == null ? advert : amazon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e mopub() {
        C8823e amazon = this.billing ? null : amazon(new C17212e((Object) this, (InterfaceC5083e) (0 == true ? 1 : 0), 10));
        return amazon == null ? advert : amazon;
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e purchase(int i) {
        C8823e amazon = this.billing ? null : amazon(new C11033e(this, i, null));
        return amazon == null ? advert : amazon;
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e startapp(Map map, EnumC4385e enumC4385e, EnumC13734e enumC13734e) {
        if (this.billing) {
            return smaato;
        }
        if (AbstractC7890e.billing(this.appmetrica.metrica.get(), Boolean.TRUE)) {
            return AbstractC5336e.vip(1, null, this.appmetrica.appmetrica, new C7914e(this, enumC4385e, map, enumC13734e, null, 9));
        }
        throw new IllegalStateException(("Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: " + Thread.currentThread().getName()).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e vip() {
        C8823e amazon = this.billing ? null : amazon(new C0593e(this, 0 == true ? 1 : 0, 9));
        return amazon == null ? advert : amazon;
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e yandex(LinkedHashSet linkedHashSet, boolean z) {
        C8823e amazon = this.billing ? null : amazon(new C18301e(linkedHashSet, z, this, null));
        return amazon == null ? smaato : amazon;
    }
}
