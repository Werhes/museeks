package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10538e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7031e f20806e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20807e;

    public /* synthetic */ RunnableC10538e(C7031e c7031e, int i) {
        this.f20807e = i;
        this.f20806e = c7031e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20807e) {
            case 0:
                this.f20806e.admob();
                return;
            default:
                C7031e c7031e = this.f20806e;
                C9271e c9271e = c7031e.appmetrica;
                if (((C10085e) c9271e.f18485e) == null) {
                    c9271e.f18485e = C10085e.license((Context) c9271e.f18486e);
                }
                C10085e c10085e = (C10085e) c9271e.f18485e;
                if (c10085e != null) {
                    c10085e.yandex(c7031e);
                    return;
                }
                return;
        }
    }
}
