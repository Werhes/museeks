package defpackage;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5274e extends SegmentFinder {
    public final /* synthetic */ C3168e ad;

    public C5274e(C3168e c3168e) {
        this.ad = c3168e;
    }

    public final int nextEndBoundary(int i) {
        return this.ad.smaato(i);
    }

    public final int nextStartBoundary(int i) {
        return this.ad.ad(i);
    }

    public final int previousEndBoundary(int i) {
        return this.ad.metrica(i);
    }

    public final int previousStartBoundary(int i) {
        return this.ad.appmetrica(i);
    }
}
