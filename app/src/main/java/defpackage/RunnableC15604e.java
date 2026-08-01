package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC15604e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Pair f30778e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17669e f30779e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C0807e f30780e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30781e;

    public /* synthetic */ RunnableC15604e(C17669e c17669e, Pair pair, C0807e c0807e, int i) {
        this.f30781e = i;
        this.f30779e = c17669e;
        this.f30778e = pair;
        this.f30780e = c0807e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30781e) {
            case 0:
                C4174e c4174e = (C4174e) this.f30779e.f34628e.startapp;
                Pair pair = this.f30778e;
                int intValue = ((Integer) pair.first).intValue();
                C18208e c18208e = (C18208e) pair.second;
                c18208e.getClass();
                c4174e.yandex(intValue, c18208e, this.f30780e);
                return;
            default:
                C4174e c4174e2 = (C4174e) this.f30779e.f34628e.startapp;
                Pair pair2 = this.f30778e;
                c4174e2.billing(((Integer) pair2.first).intValue(), (C18208e) pair2.second, this.f30780e);
                return;
        }
    }
}
