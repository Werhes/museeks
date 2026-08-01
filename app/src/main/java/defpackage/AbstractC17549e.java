package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17549e {
    public final Size ad;
    public final C8487e appmetrica;
    public final C4996e billing;
    public final C17560e license;
    public final String metrica;
    public final C8469e purchase;
    public final int vip;

    public AbstractC17549e(Size size, int i, String str, C17560e c17560e, C8487e c8487e, C8469e c8469e, C4996e c4996e) {
        this.ad = size;
        this.vip = i;
        this.metrica = str;
        this.license = c17560e;
        this.appmetrica = c8487e;
        this.purchase = c8469e;
        this.billing = c4996e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.ad);
        sb.append(", format=");
        sb.append((Object) C0299e.vip(this.vip));
        sb.append(", camera=");
        String str = this.metrica;
        sb.append((Object) (str == null ? "null" : C5060e.vip(str)));
        sb.append(", mirrorMode=");
        sb.append(this.license);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.appmetrica);
        sb.append(", streamUseCase=");
        sb.append(this.purchase);
        sb.append(", streamUseHint=");
        sb.append(this.billing);
        sb.append(", sensorPixelModes=");
        sb.append(C13664e.f27089e);
        sb.append(')');
        return sb.toString();
    }
}
