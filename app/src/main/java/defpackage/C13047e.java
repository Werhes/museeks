package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13047e {
    public final C1296e license;
    public final C1296e metrica;
    public final LinkedHashMap ad = new LinkedHashMap();
    public final TreeMap vip = new TreeMap(new C14912e(false));

    public C13047e(C8397e c8397e, int i) {
        C18525e c18525e = C18525e.appmetrica;
        Iterator it = new ArrayList(C18525e.smaato).iterator();
        while (true) {
            C1296e c1296e = null;
            if (!it.hasNext()) {
                break;
            }
            C18525e c18525e2 = (C18525e) it.next();
            AbstractC4265e.yandex("Currently only support ConstantQuality", c18525e2 instanceof C18525e);
            InterfaceC16104e license = c8397e.license(c18525e2.ad(i));
            if (license != null) {
                AbstractC9464e.yandex("CapabilitiesByQuality", "profiles = " + license);
                if (!license.license().isEmpty()) {
                    int ad = license.ad();
                    int vip = license.vip();
                    List metrica = license.metrica();
                    List license2 = license.license();
                    AbstractC4265e.license(!license2.isEmpty(), "Should contain at least one VideoProfile.");
                    c1296e = new C1296e(ad, vip, DesugarCollections.unmodifiableList(new ArrayList(metrica)), DesugarCollections.unmodifiableList(new ArrayList(license2)), metrica.isEmpty() ? null : (C0194e) metrica.get(0), (C1900e) license2.get(0));
                }
                if (c1296e == null) {
                    AbstractC9464e.remoteconfig("CapabilitiesByQuality", "EncoderProfiles of quality " + c18525e2 + " has no video validated profiles.");
                } else {
                    this.vip.put(c1296e.purchase.ad(), c18525e2);
                    this.ad.put(c18525e2, c1296e);
                }
            }
        }
        if (this.ad.isEmpty()) {
            AbstractC9464e.adcel("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.license = null;
            this.metrica = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.ad.values());
            this.metrica = (C1296e) arrayDeque.peekFirst();
            this.license = (C1296e) arrayDeque.peekLast();
        }
    }

    public final C1296e ad(Size size) {
        Object value;
        Size size2 = AbstractC2084e.ad;
        TreeMap treeMap = this.vip;
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = treeMap.floorEntry(size);
            value = floorEntry != null ? floorEntry.getValue() : null;
        }
        C18525e c18525e = (C18525e) value;
        if (c18525e == null) {
            c18525e = C18525e.mopub;
        }
        AbstractC9464e.yandex("CapabilitiesByQuality", "Using supported quality of " + c18525e + " for size " + size);
        if (c18525e == C18525e.mopub) {
            return null;
        }
        C1296e vip = vip(c18525e);
        if (vip != null) {
            return vip;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public final C1296e vip(C18525e c18525e) {
        AbstractC4265e.license(C18525e.advert.contains(c18525e), "Unknown quality: " + c18525e);
        return c18525e == C18525e.adcel ? this.metrica : c18525e == C18525e.startapp ? this.license : (C1296e) this.ad.get(c18525e);
    }
}
