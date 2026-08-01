package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16864e extends AbstractC16510e {

    /* renamed from: class, reason: not valid java name */
    public static final C6885e f33040class = new Object();
    public Rect ads;
    public C11980e applovin;
    public C12417e crashlytics;
    public final C17449e firebase;
    public C6122e inmobi;
    public int isPro;
    public C9689e isVip;
    public int premium;
    public C4753e pro;
    public AbstractC5113e remoteconfig;
    public C17343e signatures;
    public C14023e subs;
    public C16990e tapsense;

    /* JADX WARN: Type inference failed for: r2v2, types: [eؘٗٓ, eٌُۖ] */
    public C16864e(C5186e c5186e) {
        super(c5186e);
        this.signatures = C17343e.metrica;
        this.tapsense = new AbstractC11185e();
        this.isVip = null;
        this.isPro = 3;
        Map map = Collections.EMPTY_MAP;
        this.firebase = new C17449e(2, this);
    }

    /* renamed from: default, reason: not valid java name */
    public static InterfaceC18315e m4184default(C13410e c13410e, C1296e c1296e, C18247e c18247e, C14677e c14677e) {
        InterfaceC18315e ad = c13410e.ad(AbstractC14417e.metrica(c18247e, c14677e, c1296e).ad);
        if (ad != null) {
            return AbstractC16773e.vip(ad, c1296e != null ? c1296e.purchase.ad() : null);
        }
        AbstractC9464e.remoteconfig("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m4185goto(HashSet hashSet, int i, int i2, Size size, InterfaceC18315e interfaceC18315e) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) interfaceC18315e.mo380e(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            AbstractC9464e.pro("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) interfaceC18315e.mo381e(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            AbstractC9464e.pro("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public static int m4186this(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m4187abstract() {
        if (license() == null) {
            return;
        }
        m4189extends();
        C5186e c5186e = (C5186e) this.yandex;
        C6884e c6884e = this.startapp;
        c6884e.getClass();
        C16990e m4193throw = m4193throw(c5186e, c6884e);
        this.tapsense = m4193throw;
        m4191native(m4193throw, this.signatures, this.startapp);
        Object[] objArr = {this.tapsense.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        admob();
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC16100e advert(InterfaceC12330e interfaceC12330e) {
        return new C3186e(C4069e.purchase(interfaceC12330e), 3);
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e applovin(C6884e c6884e, C6884e c6884e2) {
        Size size = c6884e.ad;
        AbstractC9464e.yandex("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c6884e + ", secondaryStreamSpec " + c6884e2);
        C5186e c5186e = (C5186e) this.yandex;
        c5186e.getClass();
        ArrayList vip = AbstractC14100e.vip(c5186e);
        if (vip != null && !vip.contains(size)) {
            AbstractC9464e.remoteconfig("VideoCapture", "suggested resolution " + size + " is not in custom ordered resolutions " + vip);
        }
        return c6884e;
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e) {
        f33040class.getClass();
        C5186e c5186e = C6885e.ad;
        c5186e.getClass();
        InterfaceC12330e ad = interfaceC4311e.ad(AbstractC8647e.ad(c5186e), 1);
        if (z) {
            ad = AbstractC13501e.remoteconfig(ad, c5186e);
        }
        if (ad == null) {
            return null;
        }
        return new C5186e(C17015e.vip(((C3186e) advert(ad)).f7297e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r5 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r5.booleanValue() != false) goto L42;
     */
    /* renamed from: break, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4188break(defpackage.InterfaceC2881e r4, defpackage.C5186e r5, int r6, android.graphics.Rect r7, android.util.Size r8, defpackage.C14677e r9) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L5
            return r0
        L5:
            boolean r6 = r4.loadAd()
            if (r6 == 0) goto L29
            r5.getClass()
            eٓۢۜ r6 = defpackage.C5186e.f11092e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            eؚّٚ r5 = r5.mopub()
            eٗٔۥ r5 = (defpackage.C17015e) r5
            java.lang.Object r5 = r5.smaato(r6, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            j$.util.Objects.requireNonNull(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L29
            goto L9e
        L29:
            boolean r5 = r4.loadAd()
            if (r5 == 0) goto L46
            eۣؖؗ r5 = defpackage.AbstractC12904e.ad
            boolean r5 = defpackage.AbstractC1786e.subs(r5)
            if (r5 != 0) goto L9e
            eِّٔ r5 = r4.subscription()
            eۣؖؗ r5 = r5.firebase()
            boolean r5 = defpackage.AbstractC1786e.subs(r5)
            if (r5 == 0) goto L46
            goto L9e
        L46:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk> r5 = androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk.class
            eۣؖؗ r6 = defpackage.AbstractC12904e.ad
            eٕۗۜ r5 = r6.vip(r5)
            androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk r5 = (androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk) r5
            boolean r6 = r4.loadAd()
            if (r6 == 0) goto L76
            if (r5 == 0) goto L76
            eّٖٔ r5 = defpackage.C14677e.license
            if (r9 == r5) goto L5e
            r5 = r1
            goto L5f
        L5e:
            r5 = r0
        L5f:
            java.lang.String r6 = "samsung"
            java.lang.String r9 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L76
            java.lang.String r6 = "pa3q"
            java.lang.String r9 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r9)
            if (r6 == 0) goto L76
            if (r5 == 0) goto L76
            goto L9e
        L76:
            int r5 = r8.getWidth()
            int r6 = r7.width()
            if (r5 != r6) goto L9e
            int r5 = r8.getHeight()
            int r6 = r7.height()
            if (r5 == r6) goto L8b
            goto L9e
        L8b:
            boolean r5 = r4.loadAd()
            if (r5 == 0) goto L98
            boolean r4 = r3.amazon(r4)
            if (r4 == 0) goto L98
            return r1
        L98:
            eٍٗۢ r4 = r3.signatures
            r4.getClass()
            return r0
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16864e.m4188break(eؔۜۚ, eؗ۟ٙ, int, android.graphics.Rect, android.util.Size, eّٖٔ):boolean");
    }

    @Override // defpackage.AbstractC16510e
    public final void crashlytics(Rect rect) {
        this.mopub = rect;
        m4190implements();
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m4189extends() {
        AbstractC13062e.metrica();
        C12417e c12417e = this.crashlytics;
        if (c12417e != null) {
            c12417e.vip();
            this.crashlytics = null;
        }
        AbstractC5113e abstractC5113e = this.remoteconfig;
        if (abstractC5113e != null) {
            abstractC5113e.ad();
            this.remoteconfig = null;
        }
        C11980e c11980e = this.applovin;
        if (c11980e != null) {
            c11980e.m3299private();
            this.applovin = null;
        }
        C4753e c4753e = this.pro;
        if (c4753e != null) {
            c4753e.metrica();
            this.pro = null;
        }
        this.ads = null;
        this.inmobi = null;
        this.signatures = C17343e.metrica;
        this.premium = 0;
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m4190implements() {
        InterfaceC2881e license = license();
        C4753e c4753e = this.pro;
        if (license == null || c4753e == null) {
            return;
        }
        int m4195while = m4195while(license);
        this.premium = m4195while;
        AbstractC13062e.billing(new RunnableC2490e(c4753e, m4195while, ((InterfaceC13842e) this.yandex).mo1770switch()));
    }

    @Override // defpackage.AbstractC16510e
    public final void inmobi() {
        AbstractC9464e.yandex("VideoCapture", "VideoCapture#onStateDetached");
        AbstractC4265e.yandex("VideoCapture can only be detached on the main thread.", AbstractC13062e.purchase());
        if (this.subs != null) {
            m4192protected().purchase().loadAd(this.subs);
            this.subs.vip();
            this.subs = null;
        }
        if (3 != this.isPro) {
            this.isPro = 3;
            m4192protected().license(3);
        }
        m4192protected().appmetrica().loadAd(this.firebase);
        C9689e c9689e = this.isVip;
        if (c9689e != null && c9689e.cancel(false)) {
            AbstractC9464e.yandex("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        m4189extends();
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e isPro(InterfaceC12330e interfaceC12330e) {
        this.tapsense.ad(interfaceC12330e);
        Object[] objArr = {this.tapsense.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        C6884e c6884e = this.startapp;
        Objects.requireNonNull(c6884e);
        C10017e vip = c6884e.vip();
        vip.f19790e = interfaceC12330e;
        return vip.ad();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, eٓٗ] */
    @Override // defpackage.AbstractC16510e
    public final void isVip() {
        AbstractC9464e.yandex("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + purchase());
        C6884e c6884e = this.startapp;
        if (c6884e == null || this.inmobi != null) {
            return;
        }
        InterfaceC11659e appmetrica = m4192protected().appmetrica();
        Object obj = C17343e.metrica;
        ListenableFuture startapp = appmetrica.startapp();
        if (startapp.isDone()) {
            try {
                obj = startapp.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.signatures = (C17343e) obj;
        C16990e m4193throw = m4193throw((C5186e) this.yandex, c6884e);
        this.tapsense = m4193throw;
        m4191native(m4193throw, this.signatures, c6884e);
        Object[] objArr = {this.tapsense.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        Signature();
        m4192protected().appmetrica().metrica(AbstractC3062e.amazon(), this.firebase);
        C14023e c14023e = this.subs;
        if (c14023e != null) {
            c14023e.vip();
        }
        InterfaceC3958e appmetrica2 = appmetrica();
        ?? obj3 = new Object();
        obj3.vip = false;
        obj3.ad = appmetrica2;
        this.subs = obj3;
        m4192protected().purchase().metrica(AbstractC3062e.amazon(), this.subs);
        if (2 != this.isPro) {
            this.isPro = 2;
            m4192protected().license(2);
        }
    }

    @Override // defpackage.AbstractC16510e
    public final Set mopub() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m4191native(C16990e c16990e, C17343e c17343e, C6884e c6884e) {
        AbstractC5113e abstractC5113e;
        boolean z = c17343e.ad == -1;
        boolean z2 = c17343e.vip == 1;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        c16990e.ad.clear();
        ((HashSet) c16990e.vip.f20508e).clear();
        C14677e c14677e = c6884e.metrica;
        if (!z && (abstractC5113e = this.remoteconfig) != null) {
            if (z2) {
                c16990e.vip(abstractC5113e, c14677e, -1);
            } else {
                C18464e ad = C1673e.ad(abstractC5113e);
                if (c14677e == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                ad.f36194e = c14677e;
                c16990e.ad.add(ad.m4518e());
            }
        }
        C9689e c9689e = this.isVip;
        if (c9689e != null && c9689e.cancel(false)) {
            AbstractC9464e.yandex("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        C9689e purchase = AbstractC5750e.purchase(new C2007e(this, c16990e));
        this.isVip = purchase;
        purchase.ad(new RunnableC17144e(purchase, new C12309e(this, purchase, z2, 15), 0), AbstractC3062e.amazon());
    }

    /* renamed from: protected, reason: not valid java name */
    public final InterfaceC16798e m4192protected() {
        C5186e c5186e = (C5186e) this.yandex;
        c5186e.getClass();
        InterfaceC16798e interfaceC16798e = (InterfaceC16798e) AbstractC0054e.loadAd(c5186e, C5186e.f11091e);
        Objects.requireNonNull(interfaceC16798e);
        return interfaceC16798e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [int, java.util.Collection, java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v17, types: [int, java.util.HashMap] */
    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e signatures(InterfaceC12424e interfaceC12424e, InterfaceC16100e interfaceC16100e) {
        Object obj;
        C18247e c18247e;
        C14013e c14013e;
        Range range;
        int i;
        ArrayList<C18525e> arrayList;
        C18247e c18247e2;
        List mo3341class;
        LinkedHashMap linkedHashMap;
        C18247e c18247e3;
        HashMap hashMap;
        InterfaceC18315e interfaceC18315e;
        Map.Entry entry;
        Iterator it;
        ListenableFuture startapp = m4192protected().metrica().startapp();
        if (startapp.isDone()) {
            try {
                obj = startapp.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            obj = null;
        }
        C18247e c18247e4 = (C18247e) obj;
        if (c18247e4 == null) {
            throw new IllegalArgumentException("MediaSpec can't be null");
        }
        C10354e c10354e = c18247e4.ad;
        C16108e m4194try = m4194try();
        if (m4194try == null) {
            m4194try = c10354e.ad;
        }
        C5186e c5186e = (C5186e) interfaceC16100e.mo819interface();
        if (((C17015e) c5186e.mopub()).mo812extends(InterfaceC13842e.f27420extends)) {
            AbstractC4265e.license(m4192protected().billing(), "Custom ordered resolutions and QualitySelector can't both be set");
            AbstractC4265e.license(m4194try() == null, "Can't set both custom ordered resolutions and QualitySelector  through a groupable feature (e.g. GroupableFeatures.UHD_RECORDING)");
        } else {
            C14677e ad = AbstractC0869e.ad(c5186e);
            int yandex = AbstractC8647e.yandex(c5186e);
            Range advert = AbstractC8647e.advert(c5186e, C6884e.yandex);
            Objects.requireNonNull(advert);
            InterfaceC14020e vip = m4192protected().vip(yandex, interfaceC12424e);
            C14013e ad2 = m4192protected().ad(yandex, interfaceC12424e);
            AbstractC9464e.yandex("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + ad + ", sessionType = " + yandex + ", targetFrameRate = " + advert);
            List mo818import = vip.mo818import(ad);
            StringBuilder sb = new StringBuilder("supportedQualities = ");
            sb.append(mo818import);
            AbstractC9464e.yandex("VideoCapture", sb.toString());
            if (mo818import.isEmpty() && yandex == 1) {
                throw new IllegalArgumentException("No supported quality on the device for high-speed capture.");
            }
            if (mo818import.isEmpty()) {
                AbstractC9464e.remoteconfig("VideoCapture", "Can't find any supported quality on the device.");
            } else {
                m4194try.getClass();
                if (mo818import.isEmpty()) {
                    AbstractC9464e.remoteconfig("QualitySelector", "No supported quality on the device.");
                    arrayList = new ArrayList();
                    c18247e = c18247e4;
                    i = yandex;
                    range = advert;
                    c14013e = ad2;
                } else {
                    AbstractC9464e.yandex("QualitySelector", "supportedQualities = " + mo818import);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = m4194try.ad.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C18525e c18525e = (C18525e) it2.next();
                        Iterator it3 = it2;
                        if (c18525e == C18525e.adcel) {
                            linkedHashSet.addAll(mo818import);
                            break;
                        }
                        if (c18525e == C18525e.startapp) {
                            ArrayList arrayList2 = new ArrayList(mo818import);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (mo818import.contains(c18525e)) {
                            linkedHashSet.add(c18525e);
                            c18247e2 = c18247e4;
                        } else {
                            c18247e2 = c18247e4;
                            AbstractC9464e.remoteconfig("QualitySelector", "quality is not supported and will be ignored: " + c18525e);
                        }
                        it2 = it3;
                        c18247e4 = c18247e2;
                    }
                    c18247e = c18247e4;
                    C13371e c13371e = m4194try.vip;
                    if (!mo818import.isEmpty() && !linkedHashSet.containsAll(mo818import)) {
                        AbstractC9464e.yandex("QualitySelector", "Select quality by fallbackStrategy = " + c13371e);
                        if (c13371e != C13371e.metrica) {
                            AbstractC4265e.yandex("Currently only support type RuleStrategy", c13371e instanceof C13371e);
                            ArrayList arrayList3 = new ArrayList(C18525e.smaato);
                            C18525e c18525e2 = c13371e.ad;
                            c14013e = ad2;
                            if (c18525e2 == C18525e.adcel) {
                                c18525e2 = (C18525e) arrayList3.get(0);
                            } else if (c18525e2 == C18525e.startapp) {
                                c18525e2 = (C18525e) AbstractC17861e.mopub(1, arrayList3);
                            }
                            AbstractC4265e.yandex(null, arrayList3.indexOf(c18525e2) != -1);
                            ArrayList arrayList4 = new ArrayList();
                            int i2 = 0 - 1;
                            while (i2 >= 0) {
                                int i3 = i2;
                                C18525e c18525e3 = (C18525e) arrayList3.get(i2);
                                if (mo818import.contains(c18525e3)) {
                                    arrayList4.add(c18525e3);
                                }
                                i2 = i3 - 1;
                            }
                            ?? arrayList5 = new ArrayList();
                            range = advert;
                            i = yandex;
                            for (int i4 = arrayList5 + 1; i4 < arrayList3.size(); i4++) {
                                C18525e c18525e4 = (C18525e) arrayList3.get(i4);
                                if (mo818import.contains(c18525e4)) {
                                    arrayList5.add(c18525e4);
                                }
                            }
                            AbstractC9464e.yandex("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + c18525e2 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + ((Object) arrayList5));
                            int i5 = c13371e.vip;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    throw new AssertionError("Unhandled fallback strategy: " + c13371e);
                                }
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                    }
                    i = yandex;
                    range = advert;
                    c14013e = ad2;
                    arrayList = new ArrayList(linkedHashSet);
                }
                AbstractC9464e.yandex("VideoCapture", "Found selectedQualities " + arrayList + " by " + m4194try);
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Unable to find selected quality");
                }
                C13410e c13410e = (C13410e) AbstractC0054e.loadAd(c5186e, C5186e.f11090e);
                Objects.requireNonNull(c13410e);
                int i6 = c10354e.vip;
                HashMap hashMap2 = new HashMap();
                for (C18525e c18525e5 : vip.mo818import(ad)) {
                    Size purchase = vip.purchase(c18525e5, ad);
                    Objects.requireNonNull(purchase);
                    hashMap2.put(c18525e5, purchase);
                }
                int i7 = i;
                if (i7 == 1) {
                    Range range2 = range;
                    mo3341class = C6884e.yandex.equals(range2) ? interfaceC12424e.applovin() : interfaceC12424e.adcel(range2);
                } else {
                    mo3341class = interfaceC12424e.mo3341class(this.yandex.advert());
                }
                C9266e c9266e = new C9266e(mo3341class, hashMap2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C18525e c18525e6 : arrayList) {
                    List list = (List) c9266e.ad.get(new C14283e(c18525e6, i6));
                    linkedHashMap2.put(c18525e6, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry2.getValue());
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Size size = (Size) it5.next();
                            if (!hashMap2.containsValue(size)) {
                                C14013e c14013e2 = c14013e;
                                C13047e ad3 = c14013e2.ad(ad);
                                C1296e ad4 = ad3 != null ? ad3.ad(size) : null;
                                if (ad4 != null) {
                                    if (ad.vip()) {
                                        c18247e3 = c18247e;
                                        interfaceC18315e = m4184default(c13410e, ad4, c18247e3, ad);
                                        hashMap = hashMap2;
                                    } else {
                                        c18247e3 = c18247e;
                                        hashMap = hashMap2;
                                        int i8 = Integer.MIN_VALUE;
                                        InterfaceC18315e interfaceC18315e2 = null;
                                        for (C1900e c1900e : ad4.license) {
                                            Iterator it6 = it4;
                                            if (AbstractC6814e.ad(c1900e, ad)) {
                                                entry = entry2;
                                                int i9 = c1900e.adcel;
                                                ?? r7 = AbstractC6814e.license;
                                                it = it5;
                                                AbstractC4265e.metrica(r7.containsKey(Integer.valueOf((int) r7)));
                                                Integer num = (Integer) r7.get(Integer.valueOf((int) r7));
                                                Objects.requireNonNull(num);
                                                int intValue = num.intValue();
                                                int i10 = c1900e.yandex;
                                                HashMap hashMap3 = AbstractC6814e.metrica;
                                                boolean containsKey = hashMap3.containsKey(Integer.valueOf(i10));
                                                AbstractC4265e.metrica(containsKey);
                                                Integer num2 = (Integer) hashMap3.get(Integer.valueOf(containsKey ? 1 : 0));
                                                Objects.requireNonNull(num2);
                                                InterfaceC18315e m4184default = m4184default(c13410e, ad4, c18247e3, new C14677e(intValue, num2.intValue()));
                                                if (m4184default != null) {
                                                    int intValue2 = ((Integer) m4184default.mo388e().getUpper()).intValue();
                                                    int intValue3 = ((Integer) m4184default.mo383e().getUpper()).intValue();
                                                    Size size2 = AbstractC2084e.ad;
                                                    int i11 = intValue2 * intValue3;
                                                    if (i11 > i8) {
                                                        interfaceC18315e2 = m4184default;
                                                        i8 = i11;
                                                    }
                                                }
                                            } else {
                                                entry = entry2;
                                                it = it5;
                                            }
                                            it4 = it6;
                                            entry2 = entry;
                                            it5 = it;
                                        }
                                        interfaceC18315e = interfaceC18315e2;
                                    }
                                    Iterator it7 = it4;
                                    Map.Entry entry3 = entry2;
                                    Iterator it8 = it5;
                                    if (interfaceC18315e != null && !interfaceC18315e.mo386e(size.getWidth(), size.getHeight())) {
                                        it8.remove();
                                    }
                                    it4 = it7;
                                    c18247e = c18247e3;
                                    hashMap2 = hashMap;
                                    entry2 = entry3;
                                    it5 = it8;
                                }
                                c14013e = c14013e2;
                            }
                        }
                        Iterator it9 = it4;
                        Map.Entry entry4 = entry2;
                        C14013e c14013e3 = c14013e;
                        C18247e c18247e5 = c18247e;
                        HashMap hashMap4 = hashMap2;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap3.put((C18525e) entry4.getKey(), arrayList6);
                        }
                        it4 = it9;
                        c18247e = c18247e5;
                        hashMap2 = hashMap4;
                        c14013e = c14013e3;
                    }
                    linkedHashMap = linkedHashMap3;
                }
                C14013e c14013e4 = c14013e;
                if (i7 == 1) {
                    InterfaceC13659e isVip = interfaceC16100e.isVip();
                    C14326e c14326e = InterfaceC12438e.f24890e;
                    HashMap hashMap5 = new HashMap();
                    for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                        C18525e c18525e7 = (C18525e) entry5.getKey();
                        C13047e ad5 = c14013e4.ad(ad);
                        C1296e vip2 = ad5 != null ? ad5.vip(c18525e7) : null;
                        Objects.requireNonNull(vip2);
                        int i12 = vip2.purchase.license;
                        Iterator it10 = ((List) entry5.getValue()).iterator();
                        while (it10.hasNext()) {
                            hashMap5.put((Size) it10.next(), Integer.valueOf(i12));
                        }
                    }
                    ((C4069e) isVip).yandex(c14326e, hashMap5);
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it11 = linkedHashMap.values().iterator();
                while (it11.hasNext()) {
                    arrayList7.addAll((List) it11.next());
                }
                AbstractC9464e.yandex("VideoCapture", "Set custom ordered resolutions = " + arrayList7);
                ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC13842e.f27420extends, arrayList7);
            }
        }
        return interfaceC16100e.mo819interface();
    }

    @Override // defpackage.AbstractC16510e
    public final boolean smaato() {
        return true;
    }

    @Override // defpackage.AbstractC16510e
    public final void tapsense(int i) {
        if (subs(i)) {
            m4190implements();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: throw, reason: not valid java name */
    public final C16990e m4193throw(C5186e c5186e, C6884e c6884e) {
        Object obj;
        InterfaceC2881e interfaceC2881e;
        int i;
        C14677e c14677e;
        int i2;
        C11980e c11980e;
        boolean z;
        C5186e c5186e2;
        AbstractC13062e.metrica();
        InterfaceC2881e license = license();
        license.getClass();
        Size size = c6884e.ad;
        RunnableC1352e runnableC1352e = new RunnableC1352e(14, this);
        Range range = c6884e.appmetrica;
        if (Objects.equals(range, C6884e.yandex)) {
            range = c6884e.license == 1 ? C6885e.metrica : C6885e.vip;
        }
        Range range2 = range;
        ListenableFuture startapp = m4192protected().metrica().startapp();
        if (startapp.isDone()) {
            try {
                obj = startapp.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            obj = null;
        }
        C18247e c18247e = (C18247e) obj;
        Objects.requireNonNull(c18247e);
        int i3 = c6884e.license;
        C14013e ad = m4192protected().ad(i3, license.vip());
        C14677e c14677e2 = c6884e.metrica;
        C13047e ad2 = ad.ad(c14677e2);
        C1296e ad3 = ad2 != null ? ad2.ad(size) : null;
        c5186e.getClass();
        C13410e c13410e = (C13410e) AbstractC0054e.loadAd(c5186e, C5186e.f11090e);
        Objects.requireNonNull(c13410e);
        InterfaceC18315e m4184default = m4184default(c13410e, ad3, c18247e, c14677e2);
        this.premium = m4195while(license);
        Rect rect = this.mopub;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        int i4 = 3;
        if (m4184default == null || m4184default.mo386e(rect.width(), rect.height())) {
            interfaceC2881e = license;
            i = i3;
            c14677e = c14677e2;
            i2 = 0;
        } else {
            AbstractC9464e.yandex("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", AbstractC8261e.billing(rect), Integer.valueOf(m4184default.mo382e()), Integer.valueOf(m4184default.mo387e()), m4184default.mo388e(), m4184default.mo383e()));
            InterfaceC18315e c6378e = (!(m4184default.mo388e().contains((Range) Integer.valueOf(rect.width())) && m4184default.mo383e().contains((Range) Integer.valueOf(rect.height()))) && m4184default.mo385e() && m4184default.mo383e().contains((Range) Integer.valueOf(rect.width())) && m4184default.mo388e().contains((Range) Integer.valueOf(rect.height()))) ? new C6378e(m4184default) : m4184default;
            int mo382e = c6378e.mo382e();
            int mo387e = c6378e.mo387e();
            Range mo388e = c6378e.mo388e();
            interfaceC2881e = license;
            Range mo383e = c6378e.mo383e();
            i = i3;
            int m4186this = m4186this(true, rect.width(), mo382e, mo388e);
            c14677e = c14677e2;
            int m4186this2 = m4186this(false, rect.width(), mo382e, mo388e);
            int m4186this3 = m4186this(true, rect.height(), mo387e, mo383e);
            int m4186this4 = m4186this(false, rect.height(), mo387e, mo383e);
            HashSet hashSet = new HashSet();
            m4185goto(hashSet, m4186this, m4186this3, size, c6378e);
            m4185goto(hashSet, m4186this, m4186this4, size, c6378e);
            m4185goto(hashSet, m4186this2, m4186this3, size, c6378e);
            m4185goto(hashSet, m4186this2, m4186this4, size, c6378e);
            if (hashSet.isEmpty()) {
                AbstractC9464e.remoteconfig("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                AbstractC9464e.yandex("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new C15401e(5, rect));
                AbstractC9464e.yandex("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    AbstractC9464e.yandex("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    AbstractC4265e.yandex(null, width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        int max = Math.max(0, rect.centerX() - (width / 2));
                        rect2.left = max;
                        int i5 = max + width;
                        rect2.right = i5;
                        if (i5 > size.getWidth()) {
                            int width2 = size.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != rect.height()) {
                        i2 = 0;
                        int max2 = Math.max(0, rect.centerY() - (height / 2));
                        rect2.top = max2;
                        int i6 = max2 + height;
                        rect2.bottom = i6;
                        if (i6 > size.getHeight()) {
                            int height2 = size.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    } else {
                        i2 = 0;
                    }
                    AbstractC9464e.yandex("VideoCapture", "Adjust cropRect from " + AbstractC8261e.billing(rect) + " to " + AbstractC8261e.billing(rect2));
                    rect = rect2;
                }
            }
            i2 = 0;
        }
        this.signatures.getClass();
        this.ads = rect;
        this.signatures.getClass();
        this.signatures.getClass();
        Rect rect3 = this.ads;
        int i7 = this.premium;
        InterfaceC2881e interfaceC2881e2 = interfaceC2881e;
        int i8 = i;
        C14677e c14677e3 = c14677e;
        boolean m4188break = m4188break(interfaceC2881e2, c5186e, i8, rect3, size, c14677e3);
        if (((SizeCannotEncodeVideoQuirk) AbstractC12904e.ad.vip(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!m4188break) {
                i7 = i2;
            }
            Size yandex = AbstractC8261e.yandex(i7, AbstractC8261e.purchase(rect3));
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(yandex)) {
                int mo387e2 = m4184default != null ? m4184default.mo387e() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == yandex.getHeight()) {
                    rect4.left += mo387e2;
                    rect4.right -= mo387e2;
                } else {
                    rect4.top += mo387e2;
                    rect4.bottom -= mo387e2;
                }
                rect3 = rect4;
            }
        }
        this.ads = rect3;
        if (m4188break(interfaceC2881e2, c5186e, i8, rect3, size, c14677e3)) {
            AbstractC9464e.yandex("VideoCapture", "Surface processing is enabled.");
            InterfaceC2881e license2 = license();
            Objects.requireNonNull(license2);
            c11980e = new C11980e(license2, new C6681e(c14677e3), "VideoCapture");
        } else {
            c11980e = null;
        }
        this.applovin = c11980e;
        boolean z2 = (interfaceC2881e2.loadAd() && this.applovin == null) ? false : true;
        EnumC14627e remoteconfig = (this.applovin == null && interfaceC2881e2.loadAd()) ? EnumC14627e.f28861e : interfaceC2881e2.subscription().remoteconfig();
        AbstractC9464e.yandex("VideoCapture", "camera timebase = " + interfaceC2881e2.subscription().remoteconfig() + ", processing timebase = " + remoteconfig);
        C10017e vip = c6884e.vip();
        vip.f19786e = size;
        if (range2 == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        vip.f19791e = range2;
        C6884e ad4 = vip.ad();
        AbstractC4265e.yandex(null, this.pro == null);
        C4753e c4753e = new C4753e(2, 34, ad4, this.advert, interfaceC2881e2.loadAd(), this.ads, this.premium, ((InterfaceC13842e) this.yandex).mo1770switch(), interfaceC2881e2.loadAd() && amazon(interfaceC2881e2));
        this.pro = c4753e;
        c4753e.ad(runnableC1352e);
        if (this.applovin != null) {
            C4753e c4753e2 = this.pro;
            int i9 = c4753e2.purchase;
            int i10 = c4753e2.ad;
            Rect rect5 = c4753e2.license;
            C4170e c4170e = new C4170e(UUID.randomUUID(), i9, i10, rect5, AbstractC8261e.yandex(c4753e2.startapp, AbstractC8261e.purchase(rect5)), c4753e2.startapp, c4753e2.appmetrica);
            C4753e c4753e3 = (C4753e) this.applovin.m3303transient(new C12195e(this.pro, Collections.singletonList(c4170e))).get(c4170e);
            Objects.requireNonNull(c4753e3);
            z = z2;
            c5186e2 = c5186e;
            c4753e3.ad(new RunnableC16478e(this, c4753e3, interfaceC2881e2, c5186e, remoteconfig, z, 1));
            this.inmobi = c4753e3.license(interfaceC2881e2, true);
            C4753e c4753e4 = this.pro;
            c4753e4.getClass();
            AbstractC13062e.metrica();
            c4753e4.vip();
            AbstractC4265e.yandex("Consumer can only be linked once.", !c4753e4.adcel);
            c4753e4.adcel = true;
            C16887e c16887e = c4753e4.advert;
            this.remoteconfig = c16887e;
            AbstractC15792e.smaato(c16887e.appmetrica).ad(new RunnableC11247e(this, c16887e, 15), AbstractC3062e.amazon());
        } else {
            z = z2;
            c5186e2 = c5186e;
            C6122e license3 = this.pro.license(interfaceC2881e2, true);
            this.inmobi = license3;
            this.remoteconfig = license3.smaato;
        }
        InterfaceC16798e interfaceC16798e = (InterfaceC16798e) AbstractC0054e.loadAd(c5186e2, C5186e.f11091e);
        Objects.requireNonNull(interfaceC16798e);
        interfaceC16798e.yandex(this.inmobi, remoteconfig, z);
        m4190implements();
        this.remoteconfig.adcel = MediaCodec.class;
        C16990e license4 = C16990e.license(c5186e2, c6884e.ad);
        license4.yandex = i8;
        ad(license4, c6884e);
        int smaato = AbstractC8647e.smaato(c5186e2);
        if (smaato != 0) {
            C10379e c10379e = license4.vip;
            c10379e.getClass();
            if (smaato != 0) {
                ((C4069e) c10379e.f20510e).yandex(InterfaceC12438e.f24896e, Integer.valueOf(smaato));
            }
        }
        C12417e c12417e = this.crashlytics;
        if (c12417e != null) {
            c12417e.vip();
        }
        C12417e c12417e2 = new C12417e(new C3084e(i4, this));
        this.crashlytics = c12417e2;
        license4.purchase = c12417e2;
        InterfaceC12330e interfaceC12330e = c6884e.purchase;
        if (interfaceC12330e != null) {
            license4.vip.pro(interfaceC12330e);
        }
        return license4;
    }

    public final String toString() {
        return "VideoCapture:".concat(yandex());
    }

    /* renamed from: try, reason: not valid java name */
    public final C16108e m4194try() {
        HashSet<AbstractC3677e> hashSet = this.billing;
        if (hashSet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC3677e abstractC3677e : hashSet) {
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C16108e c16108e = C16108e.metrica;
        return C16108e.ad(arrayList, C13371e.metrica);
    }

    /* renamed from: while, reason: not valid java name */
    public final int m4195while(InterfaceC2881e interfaceC2881e) {
        int startapp = startapp(interfaceC2881e, amazon(interfaceC2881e));
        this.signatures.getClass();
        return startapp;
    }
}
