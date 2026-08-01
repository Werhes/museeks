package defpackage;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4177e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8988e f9211e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9212e;

    public /* synthetic */ RunnableC4177e(int i, C8988e c8988e) {
        this.f9212e = i;
        this.f9211e = c8988e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9212e) {
            case 0:
                if (this.f9211e.metrica(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                C11909e.license.vip("get checkbox consent timed out", new Object[0]);
                this.f9211e.license(Boolean.FALSE);
                return;
        }
    }
}
