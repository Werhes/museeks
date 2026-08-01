package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3682e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17527e f8253e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8254e;

    public /* synthetic */ RunnableC3682e(C17527e c17527e, int i) {
        this.f8254e = i;
        this.f8253e = c17527e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8254e) {
            case 0:
                SparseArray sparseArray = this.f8253e.yandex;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((C11995e) sparseArray.valueAt(i)).getClass();
                    C11995e.ad(null, null);
                }
                sparseArray.clear();
                return;
            default:
                C17527e c17527e = this.f8253e;
                ServiceConnectionC12367e serviceConnectionC12367e = c17527e.startapp;
                if (serviceConnectionC12367e.f24797e == c17527e) {
                    serviceConnectionC12367e.adcel();
                    return;
                }
                return;
        }
    }
}
