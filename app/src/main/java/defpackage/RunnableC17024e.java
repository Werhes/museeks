package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC17024e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C14635e f33349e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9290e f33350e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33351e;

    public /* synthetic */ RunnableC17024e(C9290e c9290e, C14635e c14635e, int i) {
        this.f33351e = i;
        this.f33350e = c9290e;
        this.f33349e = c14635e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33351e) {
            case 0:
                this.f33350e.ad(this.f33349e);
                return;
            case 1:
                C9290e c9290e = this.f33350e;
                ArrayList arrayList = c9290e.vip;
                C14635e c14635e = this.f33349e;
                if (arrayList.contains(c14635e)) {
                    AbstractC1786e.yandex(c14635e.ad, c14635e.metrica.f35098e, c9290e.ad);
                    return;
                }
                return;
            default:
                C9290e c9290e2 = this.f33350e;
                ArrayList arrayList2 = c9290e2.vip;
                C14635e c14635e2 = this.f33349e;
                arrayList2.remove(c14635e2);
                c9290e2.metrica.remove(c14635e2);
                return;
        }
    }
}
