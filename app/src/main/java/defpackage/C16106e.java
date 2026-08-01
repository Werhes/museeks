package defpackage;

import android.view.WindowId;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16106e {
    public boolean billing;
    public WindowId license;
    public final C0576e ad = AbstractC14533e.startapp(new C2152e(9205357640488583168L));
    public final C0576e vip = AbstractC14533e.startapp(new C2108e(9205357640488583168L));
    public final C2616e metrica = new C2616e(0.0f);
    public final C9929e appmetrica = new C9929e();
    public final C0576e purchase = AbstractC14533e.startapp(null);

    public final C16446e ad() {
        return (C16446e) this.purchase.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("positionOnScreen=" + C2152e.mopub(vip()) + ", ");
        sb.append("size=" + C2108e.startapp(((C2108e) this.vip.getValue()).ad) + ", ");
        sb.append("zIndex=" + this.metrica.purchase() + ", ");
        sb.append("contentLayer=" + ad() + ", ");
        sb.append("contentDrawing=" + this.billing);
        sb.append(")");
        return sb.toString();
    }

    public final long vip() {
        return ((C2152e) this.ad.getValue()).ad;
    }
}
