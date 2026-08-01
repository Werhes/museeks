package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13228e {
    public final C0912e ad;
    public final C4956e metrica;
    public final InterfaceC7845e vip;

    static {
        C5401e.crashlytics("WMFgUpdater");
    }

    public C13228e(WorkDatabase workDatabase, C9327e c9327e, C0912e c0912e) {
        this.vip = c9327e;
        this.ad = c0912e;
        this.metrica = workDatabase.amazon();
    }
}
