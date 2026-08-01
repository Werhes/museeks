package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9142e {
    public float ad;
    public Object appmetrica;
    public Object license;
    public Object metrica;
    public Object vip;

    public C9142e ad(InterfaceC7781e interfaceC7781e) {
        ((ArrayList) this.appmetrica).add(interfaceC7781e);
        return this;
    }

    public C9142e license() {
        C18051e c18051e = (C18051e) this.vip;
        c18051e.smaato.startapp = 1.0f;
        c18051e.license();
        Iterator it = ((ArrayList) this.license).iterator();
        while (it.hasNext()) {
            ((InterfaceC2425e) it.next()).vip();
        }
        return this;
    }

    public AbstractC3424e metrica(long j, AbstractC3424e abstractC3424e, AbstractC3424e abstractC3424e2) {
        if (((AbstractC3424e) this.license) == null) {
            this.license = abstractC3424e.metrica();
        }
        AbstractC3424e abstractC3424e3 = (AbstractC3424e) this.license;
        if (abstractC3424e3 == null) {
            abstractC3424e3 = null;
        }
        int vip = abstractC3424e3.vip();
        for (int i = 0; i < vip; i++) {
            AbstractC3424e abstractC3424e4 = (AbstractC3424e) this.license;
            if (abstractC3424e4 == null) {
                abstractC3424e4 = null;
            }
            InterfaceC4317e interfaceC4317e = (InterfaceC4317e) this.vip;
            abstractC3424e.getClass();
            abstractC3424e4.appmetrica(i, interfaceC4317e.purchase(abstractC3424e2.ad(i), j));
        }
        AbstractC3424e abstractC3424e5 = (AbstractC3424e) this.license;
        if (abstractC3424e5 == null) {
            return null;
        }
        return abstractC3424e5;
    }

    public void vip() {
        C18051e c18051e = (C18051e) this.vip;
        c18051e.getClass();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (c18051e.purchase) {
            c18051e.ad(true);
        }
        ((ArrayList) ((C6594e) this.metrica).f13613e).remove(this);
    }
}
