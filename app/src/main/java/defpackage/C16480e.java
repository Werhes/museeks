package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16480e implements InterfaceC4843e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f32308e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C11980e f32309e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayDeque f32311e = new ArrayDeque();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f32310e = false;

    public C16480e(C10215e c10215e) {
        AbstractC13062e.metrica();
        this.f32308e = new ArrayList();
    }

    @Override // defpackage.InterfaceC4843e
    public final void ad(AbstractC1816e abstractC1816e) {
        AbstractC3062e.amazon().execute(new RunnableC1352e(7, this));
    }

    public final void metrica() {
        int isVip;
        AbstractC13062e.metrica();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.f32310e) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        C11980e c11980e = this.f32309e;
        c11980e.getClass();
        AbstractC13062e.metrica();
        C0909e c0909e = (C0909e) c11980e.f23949e;
        c0909e.getClass();
        AbstractC13062e.metrica();
        AbstractC4265e.yandex("The ImageReader is not initialized.", ((C4052e) c0909e.f3323e) != null);
        C4052e c4052e = (C4052e) c0909e.f3323e;
        synchronized (c4052e.f9000e) {
            isVip = ((InterfaceC8668e) c4052e.f9002e).isVip() - c4052e.f9001e;
        }
        if (isVip == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
        } else {
            if (this.f32311e.poll() != null) {
                throw new ClassCastException();
            }
            Log.d("TakePictureManagerImpl", "No new request.");
        }
    }

    public final void vip() {
        AbstractC13062e.metrica();
        new C11793e(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.f32311e;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.f32308e).iterator();
        if (it2.hasNext()) {
            AbstractC1786e.applovin(it2.next());
            throw null;
        }
    }
}
