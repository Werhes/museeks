package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4377e extends AbstractC3743e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C5363e f9525e = new C5363e(C17121e.f33482e);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C6121e f9526e = new C6121e(5);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C4886e f9528e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Choreographer f9529e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f9530e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Handler f9533e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f9534e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f9527e = new Object();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12718e f9536e = new C12718e();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ArrayList f9535e = new ArrayList();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ArrayList f9531e = new ArrayList();

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final ChoreographerFrameCallbackC1721e f9532e = new ChoreographerFrameCallbackC1721e(this);

    public C4377e(Choreographer choreographer, Handler handler) {
        this.f9529e = choreographer;
        this.f9533e = handler;
        this.f9528e = new C4886e(choreographer, this);
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public static final void m1625e(C4377e c4377e) {
        boolean z;
        do {
            Runnable m1626e = c4377e.m1626e();
            while (m1626e != null) {
                m1626e.run();
                m1626e = c4377e.m1626e();
            }
            synchronized (c4377e.f9527e) {
                if (c4377e.f9536e.isEmpty()) {
                    z = false;
                    c4377e.f9534e = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        synchronized (this.f9527e) {
            try {
                this.f9536e.addLast(runnable);
                if (!this.f9534e) {
                    this.f9534e = true;
                    this.f9533e.post(this.f9532e);
                    if (!this.f9530e) {
                        this.f9530e = true;
                        this.f9529e.postFrameCallback(this.f9532e);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public final Runnable m1626e() {
        Runnable runnable;
        synchronized (this.f9527e) {
            C12718e c12718e = this.f9536e;
            runnable = (Runnable) (c12718e.isEmpty() ? null : c12718e.removeFirst());
        }
        return runnable;
    }
}
