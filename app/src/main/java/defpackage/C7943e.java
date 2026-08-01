package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7943e {
    public final int ad;
    public final C5363e license = new C5363e(new C5671e(29, this));
    public final float metrica;
    public final List vip;
    public static final C7943e appmetrica = new C7943e(1.0f, 50, Collections.singletonList(new C13459e(-1728053248, 3)));
    public static final C7943e purchase = new C7943e(1.0f, 50, Collections.singletonList(new C13459e(1761607680, 3)));
    public static final C7943e billing = new C7943e(1.0f, 50, Collections.singletonList(new C13459e(1107296256, 3)));
    public static final C7943e yandex = new C7943e(1.0f, 50, Collections.singletonList(new C13459e(436207616, 3)));
    public static final C7943e startapp = new C7943e(1.3f, 20, Collections.singletonList(new C13459e(-870967786, 3)));
    public static final C7943e adcel = new C7943e(1.3f, 20, Collections.singletonList(new C13459e(-283304675, 3)));
    public static final C7943e mopub = new C7943e(1.0f, 50, AbstractC6874e.startapp(new C13459e(-687865857, 3), new C13459e(1476395007, 12)));
    public static final C7943e advert = new C7943e(1.21f, 50, AbstractC6874e.startapp(new C13459e(-1711276033, 3), new C13459e(1090519039, 12)));
    public static final C7943e smaato = new C7943e(1.45f, 50, AbstractC6874e.startapp(new C13459e(1728053247, 3), new C13459e(234881023, 3)));
    public static final C7943e amazon = new C7943e(1.0f, 30, AbstractC6874e.startapp(new C13459e(536870911, 3), new C13459e(486539263, 3)));
    public static final C7943e loadAd = new C7943e(2.0f, 20, Collections.singletonList(new C13459e(-856164361, 3)));
    public static final C7943e Signature = new C7943e(2.0f, 20, Collections.singletonList(new C13459e(-268830215, 3)));

    public C7943e(float f, int i, List list) {
        this.ad = i;
        this.vip = list;
        this.metrica = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7943e)) {
            return false;
        }
        C7943e c7943e = (C7943e) obj;
        return this.ad == c7943e.ad && this.vip.equals(c7943e.vip) && Float.compare(this.metrica, c7943e.metrica) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.metrica) + AbstractC17861e.billing(this.ad * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VibrancyMaterial(radius=");
        sb.append(this.ad);
        sb.append(", overlays=");
        sb.append(this.vip);
        sb.append(", saturation=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, ')');
    }
}
