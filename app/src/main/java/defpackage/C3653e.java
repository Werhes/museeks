package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3653e {
    public final C0583e ad;

    public /* synthetic */ C3653e(C0583e c0583e) {
        this.ad = c0583e;
    }

    public static final Object ad(C0583e c0583e) {
        Object billing = c0583e.billing(null);
        if (billing == null) {
            return null;
        }
        if (!(billing instanceof C12328e)) {
            c0583e.advert(null);
            return billing;
        }
        C12328e c12328e = (C12328e) billing;
        if (c12328e.adcel()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = c12328e.vip - 1;
        Object yandex = c12328e.yandex(i);
        c12328e.smaato(i);
        if (c12328e.adcel()) {
            c0583e.advert(null);
        }
        if (c12328e.vip == 1) {
            c0583e.amazon(null, c12328e.billing());
        }
        return yandex;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3653e) {
            return AbstractC7890e.billing(this.ad, ((C3653e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.ad + ')';
    }
}
