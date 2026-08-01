package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3597e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C0807e f8128e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Pair f8129e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17669e f8130e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C6913e f8131e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8132e;

    public /* synthetic */ RunnableC3597e(C17669e c17669e, Pair pair, C6913e c6913e, C0807e c0807e, int i) {
        this.f8132e = i;
        this.f8130e = c17669e;
        this.f8129e = pair;
        this.f8131e = c6913e;
        this.f8128e = c0807e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8132e) {
            case 0:
                C4174e c4174e = (C4174e) this.f8130e.f34628e.startapp;
                Pair pair = this.f8129e;
                c4174e.remoteconfig(((Integer) pair.first).intValue(), (C18208e) pair.second, this.f8131e, this.f8128e);
                return;
            default:
                C4174e c4174e2 = (C4174e) this.f8130e.f34628e.startapp;
                Pair pair2 = this.f8129e;
                c4174e2.tapsense(((Integer) pair2.first).intValue(), (C18208e) pair2.second, this.f8131e, this.f8128e);
                return;
        }
    }
}
