package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16108e {
    public static final C16108e metrica = new C16108e(Collections.EMPTY_LIST, C13371e.metrica);
    public final List ad;
    public final C13371e vip;

    public C16108e(List list, C13371e c13371e) {
        this.ad = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.vip = c13371e;
    }

    public static C16108e ad(List list, C13371e c13371e) {
        AbstractC4265e.billing(list, "qualities cannot be null");
        AbstractC4265e.billing(c13371e, "fallbackStrategy cannot be null");
        AbstractC4265e.license(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18525e c18525e = (C18525e) it.next();
            AbstractC4265e.license(C18525e.advert.contains(c18525e), "qualities contain invalid quality: " + c18525e);
        }
        return new C16108e(list, c13371e);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.ad + ", fallbackStrategy=" + this.vip + "}";
    }
}
