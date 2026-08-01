package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4885e {
    public final int ad;
    public final /* synthetic */ C7513e metrica;
    public final ArrayList vip = new ArrayList();

    public C4885e(C7513e c7513e, int i) {
        this.metrica = c7513e;
        this.ad = i;
    }

    public final void ad(int i) {
        C7513e c7513e = this.metrica;
        C5609e c5609e = c7513e.metrica;
        if (c5609e == null) {
            return;
        }
        this.vip.add(new C5492e(c5609e, i, c7513e.vip, null));
    }
}
