package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۧۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14402e extends AbstractC16510e {
    public C4753e ads;
    public C4753e applovin;
    public C16990e crashlytics;
    public C12417e firebase;
    public C18464e inmobi;
    public C4753e isPro;
    public C11980e isVip;
    public C4753e premium;
    public final C8200e pro;
    public final C10413e remoteconfig;
    public final C13391e signatures;
    public C16990e subs;
    public final C13391e tapsense;

    public C14402e(InterfaceC2881e interfaceC2881e, InterfaceC2881e interfaceC2881e2, C13391e c13391e, C13391e c13391e2, HashSet hashSet, InterfaceC4311e interfaceC4311e) {
        super(m3795throw(hashSet));
        this.remoteconfig = m3795throw(hashSet);
        this.signatures = c13391e;
        this.tapsense = c13391e2;
        this.pro = new C8200e(interfaceC2881e, interfaceC2881e2, hashSet, interfaceC4311e, new C12582e(24));
        HashSet hashSet2 = ((AbstractC16510e) hashSet.iterator().next()).billing;
        this.billing = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    /* renamed from: throw, reason: not valid java name */
    public static C10413e m3795throw(HashSet hashSet) {
        C4069e license = C4069e.license();
        new C2362e(license);
        license.yandex(InterfaceC14405e.isPro, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            if (abstractC16510e.yandex.mo812extends(InterfaceC12438e.f24886e)) {
                arrayList.add(abstractC16510e.yandex.mo844while());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        license.yandex(C10413e.f20583e, arrayList);
        license.yandex(InterfaceC13842e.firebase, 2);
        license.yandex(InterfaceC12438e.f24891e, EnumC2392e.PREVIEW_VIDEO_STILL);
        return new C10413e(C17015e.vip(license));
    }

    @Override // defpackage.AbstractC16510e
    public final void ads() {
        m3797goto();
        C8200e c8200e = this.pro;
        Iterator it = c8200e.f16692e.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            C6701e c6701e = (C6701e) c8200e.f16685e.get(abstractC16510e);
            Objects.requireNonNull(c6701e);
            abstractC16510e.firebase(c6701e);
        }
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC16100e advert(InterfaceC12330e interfaceC12330e) {
        return new C2362e(C4069e.purchase(interfaceC12330e));
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e applovin(C6884e c6884e, C6884e c6884e2) {
        AbstractC9464e.yandex("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c6884e + ", secondaryStreamSpec " + c6884e2);
        m4158class(m3799this(purchase(), adcel() == null ? null : adcel().subscription().billing(), this.yandex, c6884e, c6884e2));
        Signature();
        return c6884e;
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e) {
        C10413e c10413e = this.remoteconfig;
        c10413e.getClass();
        InterfaceC12330e ad = interfaceC4311e.ad(AbstractC8647e.ad(c10413e), 1);
        if (z) {
            ad = AbstractC13501e.remoteconfig(ad, c10413e.f20584e);
        }
        if (ad == null) {
            return null;
        }
        return ((C2362e) advert(ad)).mo819interface();
    }

    /* renamed from: extends, reason: not valid java name */
    public final C16990e m3796extends(C4753e c4753e, InterfaceC12438e interfaceC12438e, C6884e c6884e) {
        C16990e license = C16990e.license(interfaceC12438e, c6884e.ad);
        C10379e c10379e = license.vip;
        C8200e c8200e = this.pro;
        Iterator it = c8200e.f16692e.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((AbstractC16510e) it.next()).yandex.remoteconfig().billing.metrica;
            List list = C11469e.adcel;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            c10379e.f20509e = i;
        }
        Size size = c6884e.ad;
        Iterator it2 = c8200e.f16692e.iterator();
        while (it2.hasNext()) {
            C11469e metrica = C16990e.license(((AbstractC16510e) it2.next()).yandex, size).metrica();
            C9937e c9937e = metrica.billing;
            c10379e.mopub(c9937e.license);
            List<AbstractC1037e> list2 = metrica.appmetrica;
            ArrayList arrayList = license.appmetrica;
            for (AbstractC1037e abstractC1037e : list2) {
                c10379e.amazon(abstractC1037e);
                if (!arrayList.contains(abstractC1037e)) {
                    arrayList.add(abstractC1037e);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : metrica.license) {
                ArrayList arrayList2 = license.license;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : metrica.metrica) {
                ArrayList arrayList3 = license.metrica;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            c10379e.pro(c9937e.vip);
        }
        c4753e.getClass();
        AbstractC13062e.metrica();
        c4753e.vip();
        AbstractC4265e.yandex("Consumer can only be linked once.", !c4753e.adcel);
        c4753e.adcel = true;
        license.vip(c4753e.advert, c6884e.metrica, -1);
        c10379e.amazon(c8200e.f16688e);
        InterfaceC12330e interfaceC12330e = c6884e.purchase;
        if (interfaceC12330e != null) {
            c10379e.pro(interfaceC12330e);
        }
        license.yandex = c6884e.license;
        ad(license, c6884e);
        return license;
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3797goto() {
        C12417e c12417e = this.firebase;
        if (c12417e != null) {
            c12417e.vip();
            this.firebase = null;
        }
        C4753e c4753e = this.isPro;
        if (c4753e != null) {
            c4753e.metrica();
            this.isPro = null;
        }
        C4753e c4753e2 = this.applovin;
        if (c4753e2 != null) {
            c4753e2.metrica();
            this.applovin = null;
        }
        C4753e c4753e3 = this.ads;
        if (c4753e3 != null) {
            c4753e3.metrica();
            this.ads = null;
        }
        C4753e c4753e4 = this.premium;
        if (c4753e4 != null) {
            c4753e4.metrica();
            this.premium = null;
        }
        C11980e c11980e = this.isVip;
        if (c11980e != null) {
            c11980e.m3299private();
            this.isVip = null;
        }
        C18464e c18464e = this.inmobi;
        if (c18464e != null) {
            ((InterfaceC13297e) c18464e.f36191e).release();
            AbstractC13062e.billing(new RunnableC2783e(3, c18464e));
            this.inmobi = null;
        }
    }

    @Override // defpackage.AbstractC16510e
    public final void inmobi() {
        Iterator it = this.pro.f16692e.iterator();
        while (it.hasNext()) {
            ((AbstractC16510e) it.next()).inmobi();
        }
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e isPro(InterfaceC12330e interfaceC12330e) {
        this.subs.ad(interfaceC12330e);
        Object[] objArr = {this.subs.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        C10017e vip = this.startapp.vip();
        vip.f19790e = interfaceC12330e;
        return vip.ad();
    }

    @Override // defpackage.AbstractC16510e
    public final void isVip() {
        Iterator it = this.pro.f16692e.iterator();
        while (it.hasNext()) {
            ((AbstractC16510e) it.next()).isVip();
        }
    }

    @Override // defpackage.AbstractC16510e
    public final Set mopub() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    /* renamed from: native, reason: not valid java name */
    public final C4753e m3798native(String str, String str2, InterfaceC12438e interfaceC12438e, C6884e c6884e, C6884e c6884e2) {
        Matrix matrix = this.advert;
        InterfaceC2881e license = license();
        Objects.requireNonNull(license);
        boolean loadAd = license.loadAd();
        Size size = c6884e.ad;
        Rect rect = this.mopub;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        InterfaceC2881e license2 = license();
        Objects.requireNonNull(license2);
        int startapp = startapp(license2, false);
        InterfaceC2881e license3 = license();
        Objects.requireNonNull(license3);
        C4753e c4753e = new C4753e(3, 34, c6884e, matrix, loadAd, rect, startapp, -1, amazon(license3));
        this.isPro = c4753e;
        Objects.requireNonNull(license());
        this.ads = c4753e;
        C16990e m3796extends = m3796extends(this.isPro, interfaceC12438e, c6884e);
        this.subs = m3796extends;
        C12417e c12417e = this.firebase;
        if (c12417e != null) {
            c12417e.vip();
        }
        C12417e c12417e2 = new C12417e(new C6076e(this, str, str2, interfaceC12438e, c6884e, c6884e2));
        this.firebase = c12417e2;
        m3796extends.purchase = c12417e2;
        return this.ads;
    }

    @Override // defpackage.AbstractC16510e
    public final void pro() {
        Iterator it = this.pro.f16692e.iterator();
        while (it.hasNext()) {
            ((AbstractC16510e) it.next()).pro();
        }
    }

    @Override // defpackage.AbstractC16510e
    public final void remoteconfig() {
        C8200e c8200e = this.pro;
        Iterator it = c8200e.f16692e.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            C6701e c6701e = (C6701e) c8200e.f16685e.get(abstractC16510e);
            Objects.requireNonNull(c6701e);
            abstractC16510e.vip(c6701e, null, null, abstractC16510e.billing(true, c8200e.f16683e));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        if (r14 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    @Override // defpackage.AbstractC16510e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC12438e signatures(defpackage.InterfaceC12424e r18, defpackage.InterfaceC16100e r19) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14402e.signatures(eِّٔ, eٍٖۡ):eّّٗ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: this, reason: not valid java name */
    public final List m3799this(String str, String str2, InterfaceC12438e interfaceC12438e, C6884e c6884e, C6884e c6884e2) {
        C14677e c14677e = c6884e.metrica;
        AbstractC13062e.metrica();
        C8200e c8200e = this.pro;
        if (c6884e2 == null) {
            C4753e m3798native = m3798native(str, str2, interfaceC12438e, c6884e, null);
            InterfaceC2881e license = license();
            Objects.requireNonNull(license);
            C11980e c11980e = new C11980e(license, new C6681e(c14677e), "StreamSharing");
            this.isVip = c11980e;
            boolean z = this.mopub != null;
            int mo1768else = ((InterfaceC13842e) this.yandex).mo1768else(0);
            c8200e.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = c8200e.f16692e.iterator();
            while (it.hasNext()) {
                AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                C0092e c0092e = c8200e.f16689e;
                InterfaceC2881e interfaceC2881e = c8200e.f16694e;
                C8200e c8200e2 = c8200e;
                boolean z2 = z;
                C4170e remoteconfig = c8200e2.remoteconfig(abstractC16510e, c0092e, interfaceC2881e, m3798native, mo1768else, z2);
                int signatures = c8200e2.f16694e.vip().signatures(((InterfaceC13842e) abstractC16510e.yandex).mo1768else(0));
                C6701e c6701e = (C6701e) c8200e2.f16685e.get(abstractC16510e);
                Objects.requireNonNull(c6701e);
                c6701e.f13844e.f1507e = signatures;
                hashMap.put(abstractC16510e, remoteconfig);
                z = z2;
                c8200e = c8200e2;
            }
            C8200e c8200e3 = c8200e;
            boolean z3 = z;
            C0679e m3303transient = c11980e.m3303transient(new C12195e(m3798native, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((AbstractC16510e) entry.getKey(), (C4753e) m3303transient.get(entry.getValue()));
            }
            c8200e3.isPro(hashMap2, c8200e3.tapsense(m3798native, z3));
            Object[] objArr = {this.subs.metrica()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return DesugarCollections.unmodifiableList(arrayList);
        }
        C8200e c8200e4 = c8200e;
        C4753e m3798native2 = m3798native(str, str2, interfaceC12438e, c6884e, c6884e2);
        Matrix matrix = this.advert;
        InterfaceC2881e adcel = adcel();
        Objects.requireNonNull(adcel);
        boolean loadAd = adcel.loadAd();
        Size size = c6884e2.ad;
        Rect rect = this.mopub;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        InterfaceC2881e adcel2 = adcel();
        Objects.requireNonNull(adcel2);
        int startapp = startapp(adcel2, false);
        InterfaceC2881e adcel3 = adcel();
        Objects.requireNonNull(adcel3);
        C4753e c4753e = new C4753e(3, 34, c6884e2, matrix, loadAd, rect2, startapp, -1, amazon(adcel3));
        this.applovin = c4753e;
        Objects.requireNonNull(adcel());
        this.premium = c4753e;
        C16990e m3796extends = m3796extends(this.applovin, interfaceC12438e, c6884e2);
        this.crashlytics = m3796extends;
        C12417e c12417e = this.firebase;
        if (c12417e != null) {
            c12417e.vip();
        }
        C12417e c12417e2 = new C12417e(new C6076e(this, str, str2, interfaceC12438e, c6884e, c6884e2));
        this.firebase = c12417e2;
        m3796extends.purchase = c12417e2;
        C4753e c4753e2 = this.premium;
        this.inmobi = new C18464e(license(), adcel(), new C12799e(c14677e, this.signatures, this.tapsense));
        boolean z4 = this.mopub != null;
        int mo1768else2 = ((InterfaceC13842e) this.yandex).mo1768else(0);
        c8200e4.getClass();
        HashMap hashMap3 = new HashMap();
        Iterator it2 = c8200e4.f16692e.iterator();
        while (it2.hasNext()) {
            AbstractC16510e abstractC16510e2 = (AbstractC16510e) it2.next();
            C8200e c8200e5 = c8200e4;
            C4753e c4753e3 = m3798native2;
            C4170e remoteconfig2 = c8200e5.remoteconfig(abstractC16510e2, c8200e4.f16689e, c8200e4.f16694e, c4753e3, mo1768else2, z4);
            C0092e c0092e2 = c8200e5.f16684e;
            Objects.requireNonNull(c0092e2);
            InterfaceC2881e interfaceC2881e2 = c8200e5.f16693e;
            Objects.requireNonNull(interfaceC2881e2);
            C4753e c4753e4 = c4753e2;
            C4170e remoteconfig3 = c8200e5.remoteconfig(abstractC16510e2, c0092e2, interfaceC2881e2, c4753e4, mo1768else2, z4);
            int signatures2 = c8200e5.f16694e.vip().signatures(((InterfaceC13842e) abstractC16510e2.yandex).mo1768else(0));
            C6701e c6701e2 = (C6701e) c8200e5.f16685e.get(abstractC16510e2);
            Objects.requireNonNull(c6701e2);
            c6701e2.f13844e.f1507e = signatures2;
            hashMap3.put(abstractC16510e2, new C5013e(remoteconfig2, remoteconfig3));
            c4753e2 = c4753e4;
            m3798native2 = c4753e3;
            c8200e4 = c8200e5;
        }
        C4753e c4753e5 = c4753e2;
        C8200e c8200e6 = c8200e4;
        C4753e c4753e6 = m3798native2;
        C18464e c18464e = this.inmobi;
        ArrayList arrayList2 = new ArrayList(hashMap3.values());
        C9961e c9961e = new C9961e(c4753e6, c4753e5, arrayList2);
        c18464e.getClass();
        AbstractC13062e.metrica();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        InterfaceC13297e interfaceC13297e = (InterfaceC13297e) c18464e.f36191e;
        sb.append(interfaceC13297e);
        sb.append("\n   primary input = ");
        sb.append(c4753e6);
        sb.append("\n   secondary input = ");
        sb.append(c4753e5);
        AbstractC9464e.yandex("DualSurfaceProcessorNode", sb.toString());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC9464e.yandex("SurfaceProcessorNode", "   outputConfig = " + ((C5013e) it3.next()));
        }
        c18464e.f36194e = c9961e;
        c18464e.f36189e = new HashMap();
        C9961e c9961e2 = (C9961e) c18464e.f36194e;
        C4753e c4753e7 = c9961e2.ad;
        C4753e c4753e8 = c9961e2.vip;
        Iterator it4 = c9961e2.metrica.iterator();
        while (it4.hasNext()) {
            C5013e c5013e = (C5013e) it4.next();
            C0679e c0679e = (C0679e) c18464e.f36189e;
            C4170e c4170e = c5013e.ad;
            Rect rect3 = c4170e.license;
            int i = c4170e.purchase;
            boolean z5 = c4170e.billing;
            Iterator it5 = it4;
            HashMap hashMap4 = hashMap3;
            Matrix matrix2 = new Matrix(c4753e7.vip);
            RectF rectF = new RectF(rect3);
            Size size2 = c4170e.appmetrica;
            matrix2.postConcat(AbstractC8261e.ad(rectF, AbstractC8261e.startapp(size2), i, z5));
            AbstractC4265e.metrica(AbstractC8261e.license(AbstractC8261e.yandex(i, AbstractC8261e.purchase(rect3)), false, size2));
            Rect rect4 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            C10017e vip = c4753e7.billing.vip();
            vip.f19786e = size2;
            c0679e.put(c5013e, new C4753e(c4170e.vip, c4170e.metrica, vip.ad(), matrix2, false, rect4, c4753e7.startapp - i, -1, c4753e7.appmetrica != z5));
            it4 = it5;
            hashMap3 = hashMap4;
        }
        HashMap hashMap5 = hashMap3;
        interfaceC13297e.ad(c4753e7.license((InterfaceC2881e) c18464e.f36190e, true));
        interfaceC13297e.ad(c4753e8.license((InterfaceC2881e) c18464e.f36192e, false));
        InterfaceC2881e interfaceC2881e3 = (InterfaceC2881e) c18464e.f36190e;
        InterfaceC2881e interfaceC2881e4 = (InterfaceC2881e) c18464e.f36192e;
        for (Map.Entry entry2 : ((C0679e) c18464e.f36189e).entrySet()) {
            C4753e c4753e9 = c4753e7;
            C4753e c4753e10 = c4753e8;
            c18464e.m4500e(interfaceC2881e3, interfaceC2881e4, c4753e9, c4753e10, entry2);
            C4753e c4753e11 = (C4753e) entry2.getValue();
            InterfaceC2881e interfaceC2881e5 = interfaceC2881e4;
            InterfaceC2881e interfaceC2881e6 = interfaceC2881e3;
            C18464e c18464e2 = c18464e;
            RunnableC5555e runnableC5555e = new RunnableC5555e(c18464e2, interfaceC2881e6, interfaceC2881e5, c4753e9, c4753e10, entry2, 1);
            c18464e = c18464e2;
            interfaceC2881e3 = interfaceC2881e6;
            interfaceC2881e4 = interfaceC2881e5;
            c4753e11.ad(runnableC5555e);
            c4753e7 = c4753e9;
            c4753e8 = c4753e10;
        }
        C0679e c0679e2 = (C0679e) c18464e.f36189e;
        HashMap hashMap6 = new HashMap();
        for (Map.Entry entry3 : hashMap5.entrySet()) {
            hashMap6.put((AbstractC16510e) entry3.getKey(), (C4753e) c0679e2.get(entry3.getValue()));
        }
        c8200e6.isPro(hashMap6, c8200e6.tapsense(c4753e6, z4));
        Object[] objArr2 = {this.subs.metrica(), this.crashlytics.metrica()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj2 = objArr2[i2];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }
}
