package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17018e extends AbstractC11185e {
    public final C13875e adcel = new C13875e(6);
    public boolean mopub = true;
    public final StringBuilder advert = new StringBuilder();
    public boolean smaato = false;
    public final ArrayList amazon = new ArrayList();

    public final void ad(C11469e c11469e) {
        C9937e c9937e = c11469e.billing;
        int i = c9937e.metrica;
        C17015e c17015e = c9937e.vip;
        C10379e c10379e = this.vip;
        if (i != -1) {
            this.smaato = true;
            int i2 = c10379e.f20509e;
            List list = C11469e.adcel;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            c10379e.f20509e = i;
        }
        Range ad = c9937e.ad();
        Range range = C6884e.yandex;
        boolean equals = ad.equals(range);
        StringBuilder sb = this.advert;
        if (!equals) {
            if (c10379e.applovin().equals(range)) {
                ((C4069e) c10379e.f20510e).yandex(C9937e.purchase, ad);
            } else if (!c10379e.applovin().equals(ad)) {
                this.mopub = false;
                String str = "Different ExpectedFrameRateRange values; current = " + c10379e.applovin() + ", new = " + ad;
                AbstractC9464e.adcel("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        C14326e c14326e = InterfaceC12438e.f24900e;
        Integer num = (Integer) c17015e.smaato(c14326e, 0);
        Objects.requireNonNull(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            c10379e.getClass();
            if (intValue != 0) {
                ((C4069e) c10379e.f20510e).yandex(c14326e, num);
            }
        }
        C14326e c14326e2 = InterfaceC12438e.f24896e;
        Integer num2 = (Integer) c17015e.smaato(c14326e2, 0);
        Objects.requireNonNull(num2);
        int intValue2 = num2.intValue();
        if (intValue2 != 0) {
            c10379e.getClass();
            if (intValue2 != 0) {
                ((C4069e) c10379e.f20510e).yandex(c14326e2, num2);
            }
        }
        C18543e c18543e = c9937e.appmetrica;
        C5489e c5489e = (C5489e) c10379e.f20512e;
        HashSet hashSet = (HashSet) c10379e.f20508e;
        c5489e.ad.putAll((Map) c18543e.ad);
        this.metrica.addAll(c11469e.metrica);
        this.license.addAll(c11469e.license);
        c10379e.mopub(c9937e.license);
        this.appmetrica.addAll(c11469e.appmetrica);
        InterfaceC2784e interfaceC2784e = c11469e.purchase;
        if (interfaceC2784e != null) {
            this.amazon.add(interfaceC2784e);
        }
        InputConfiguration inputConfiguration = c11469e.startapp;
        if (inputConfiguration != null) {
            this.billing = inputConfiguration;
        }
        ArrayList arrayList = c11469e.ad;
        LinkedHashSet<C1673e> linkedHashSet = this.ad;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(DesugarCollections.unmodifiableList(c9937e.ad));
        ArrayList arrayList2 = new ArrayList();
        for (C1673e c1673e : linkedHashSet) {
            arrayList2.add(c1673e.ad);
            Iterator it = c1673e.vip.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC5113e) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            AbstractC9464e.yandex("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.mopub = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = c11469e.yandex;
        int i4 = this.yandex;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            AbstractC9464e.yandex("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.mopub = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.yandex = i3;
        }
        C1673e c1673e2 = c11469e.vip;
        if (c1673e2 != null) {
            C1673e c1673e3 = this.startapp;
            if (c1673e3 == c1673e2 || c1673e3 == null) {
                this.startapp = c1673e2;
            } else {
                AbstractC9464e.yandex("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.mopub = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        c10379e.pro(c17015e);
    }

    public final boolean metrica() {
        return this.smaato && this.mopub;
    }

    public final C11469e vip() {
        if (!this.mopub) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.ad);
        C13875e c13875e = this.adcel;
        if (c13875e.f27485e) {
            Collections.sort(arrayList, new C15401e(4, c13875e));
        }
        int i = this.yandex;
        C10379e c10379e = this.vip;
        if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC7890e.billing(((C1673e) it.next()).ad.adcel, MediaCodec.class)) {
                    HashSet hashSet = (HashSet) c10379e.f20508e;
                    if (!hashSet.isEmpty()) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC7890e.billing(((AbstractC5113e) it2.next()).adcel, MediaCodec.class)) {
                                break;
                            }
                        }
                    }
                    Range applovin = c10379e.applovin();
                    if (applovin != null) {
                        if (((Number) applovin.getUpper()).intValue() < 120 || !AbstractC7890e.billing(applovin.getLower(), applovin.getUpper())) {
                            applovin = null;
                        }
                        if (applovin != null) {
                            Range range = new Range(30, applovin.getUpper());
                            AbstractC9464e.yandex("HighSpeedFpsModifier", "Modified high-speed FPS range from " + applovin + " to " + range);
                            ((C4069e) c10379e.f20510e).yandex(C9937e.purchase, range);
                        }
                    }
                }
            }
        }
        return new C11469e(arrayList, new ArrayList(this.metrica), new ArrayList(this.license), new ArrayList(this.appmetrica), c10379e.tapsense(), this.amazon.isEmpty() ? null : new C3084e(2, this), this.billing, this.yandex, this.startapp);
    }
}
