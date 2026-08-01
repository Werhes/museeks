package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3757e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f8350e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f8351e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f8352e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f8353e;

    public AbstractC3757e() {
        if (C10914e.f21618e == null) {
            C10914e.f21618e = new C10914e(12);
        }
    }

    public int ad(int i) {
        if (i < this.f8350e) {
            return ((ByteBuffer) this.f8352e).getShort(this.f8351e + i);
        }
        return 0;
    }

    public abstract void appmetrica(View view, Object obj);

    public void billing(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f8351e) {
            appmetrica(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f8351e) {
            tag = metrica(view);
        } else {
            tag = view.getTag(this.f8353e);
            if (!((Class) this.f8352e).isInstance(tag)) {
                tag = null;
            }
        }
        if (yandex(tag, obj)) {
            View.AccessibilityDelegate appmetrica = AbstractC2016e.appmetrica(view);
            C2187e c2187e = appmetrica == null ? null : appmetrica instanceof C0195e ? ((C0195e) appmetrica).ad : new C2187e(appmetrica);
            if (c2187e == null) {
                c2187e = new C2187e();
            }
            AbstractC2016e.loadAd(view, c2187e);
            view.setTag(this.f8353e, obj);
            AbstractC2016e.startapp(view, this.f8350e);
        }
    }

    public boolean hasNext() {
        return this.f8353e < ((C1239e) this.f8352e).f3920e;
    }

    public abstract Object metrica(View view);

    public void purchase() {
        while (true) {
            int i = this.f8353e;
            C1239e c1239e = (C1239e) this.f8352e;
            if (i >= c1239e.f3920e || c1239e.f3911e[i] >= 0) {
                return;
            } else {
                this.f8353e = i + 1;
            }
        }
    }

    public void remove() {
        C1239e c1239e = (C1239e) this.f8352e;
        vip();
        if (this.f8351e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c1239e.metrica();
        c1239e.adcel(this.f8351e);
        this.f8351e = -1;
        this.f8350e = c1239e.f3914e;
    }

    public void vip() {
        if (((C1239e) this.f8352e).f3914e != this.f8350e) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract boolean yandex(Object obj, Object obj2);
}
