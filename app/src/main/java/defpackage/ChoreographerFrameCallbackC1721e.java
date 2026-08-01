package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1721e implements Choreographer.FrameCallback, Runnable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C4377e f4678e;

    public ChoreographerFrameCallbackC1721e(C4377e c4377e) {
        this.f4678e = c4377e;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4678e.f9533e.removeCallbacks(this);
        C4377e.m1625e(this.f4678e);
        C4377e c4377e = this.f4678e;
        synchronized (c4377e.f9527e) {
            if (c4377e.f9530e) {
                c4377e.f9530e = false;
                ArrayList arrayList = c4377e.f9535e;
                c4377e.f9535e = c4377e.f9531e;
                c4377e.f9531e = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4377e.m1625e(this.f4678e);
        C4377e c4377e = this.f4678e;
        synchronized (c4377e.f9527e) {
            try {
                if (c4377e.f9535e.isEmpty()) {
                    c4377e.f9529e.removeFrameCallback(this);
                    c4377e.f9530e = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
