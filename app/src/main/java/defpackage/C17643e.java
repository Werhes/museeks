package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17643e implements InterfaceC7048e {
    public final AbstractC11062e ad;
    public final C5363e appmetrica;
    public final C5625e license;
    public final C17706e metrica;
    public final C2362e vip;
    public static final LinkedHashSet purchase = new LinkedHashSet();
    public static final C10914e billing = new C10914e(10);

    public C17643e(AbstractC11062e abstractC11062e, C2362e c2362e, C5625e c5625e) {
        C17706e c17706e = new C17706e(4);
        this.ad = abstractC11062e;
        this.vip = c2362e;
        this.metrica = c17706e;
        this.license = c5625e;
        this.appmetrica = new C5363e(new C16515e(this, 1));
    }

    @Override // defpackage.InterfaceC7048e
    public final InterfaceC2885e ad() {
        String remoteconfig = ((C10675e) this.appmetrica.getValue()).f21024e.remoteconfig();
        synchronized (billing) {
            LinkedHashSet linkedHashSet = purchase;
            if (linkedHashSet.contains(remoteconfig)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + remoteconfig + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(remoteconfig);
        }
        return new C17590e(this.ad, (C10675e) this.appmetrica.getValue(), this.vip, (InterfaceC4417e) this.metrica.invoke((C10675e) this.appmetrica.getValue(), this.ad), new C16515e(this, 0));
    }
}
