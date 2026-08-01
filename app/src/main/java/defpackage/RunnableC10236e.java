package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10236e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Pair f20238e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17669e f20239e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20240e;

    public /* synthetic */ RunnableC10236e(C17669e c17669e, Pair pair, int i) {
        this.f20240e = i;
        this.f20239e = c17669e;
        this.f20238e = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20240e) {
            case 0:
                C4174e c4174e = (C4174e) this.f20239e.f34628e.startapp;
                Pair pair = this.f20238e;
                c4174e.mo1496protected(((Integer) pair.first).intValue(), (C18208e) pair.second);
                return;
            default:
                C4174e c4174e2 = (C4174e) this.f20239e.f34628e.startapp;
                Pair pair2 = this.f20238e;
                c4174e2.applovin(((Integer) pair2.first).intValue(), (C18208e) pair2.second);
                return;
        }
    }
}
