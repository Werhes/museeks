package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16000e implements InterfaceC8588e {
    public static final String license = C5401e.crashlytics("WorkConstraintsTracker");
    public final InterfaceC6882e ad;
    public final Object metrica;
    public final AbstractC8112e[] vip;

    public C16000e(Context context, C0912e c0912e, InterfaceC6882e interfaceC6882e) {
        Context applicationContext = context.getApplicationContext();
        this.ad = interfaceC6882e;
        this.vip = new AbstractC8112e[]{new C16050e((C16505e) C11980e.m3290implements(c0912e, applicationContext).f23950e, 0), new C16050e((C17427e) C11980e.m3290implements(c0912e, applicationContext).f23949e, 1), new C16050e((C5683e) C11980e.m3290implements(c0912e, applicationContext).f23948e, 4), new C16050e((C9551e) C11980e.m3290implements(c0912e, applicationContext).f23951e, 2), new C16050e((C9551e) C11980e.m3290implements(c0912e, applicationContext).f23951e, 3), new AbstractC8112e((C9551e) C11980e.m3290implements(c0912e, applicationContext).f23951e), new AbstractC8112e((C9551e) C11980e.m3290implements(c0912e, applicationContext).f23951e)};
        this.metrica = new Object();
    }

    public final boolean ad(String str) {
        synchronized (this.metrica) {
            try {
                for (AbstractC8112e abstractC8112e : this.vip) {
                    Object obj = abstractC8112e.vip;
                    if (obj != null && abstractC8112e.vip(obj) && abstractC8112e.ad.contains(str)) {
                        C5401e.loadAd().smaato(license, "Work " + str + " constrained by " + abstractC8112e.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license() {
        synchronized (this.metrica) {
            try {
                for (AbstractC8112e abstractC8112e : this.vip) {
                    ArrayList arrayList = abstractC8112e.ad;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC8112e.metrica.vip(abstractC8112e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(Collection collection) {
        synchronized (this.metrica) {
            try {
                for (AbstractC8112e abstractC8112e : this.vip) {
                    if (abstractC8112e.license != null) {
                        abstractC8112e.license = null;
                        abstractC8112e.license(null, abstractC8112e.vip);
                    }
                }
                for (AbstractC8112e abstractC8112e2 : this.vip) {
                    abstractC8112e2.metrica(collection);
                }
                for (AbstractC8112e abstractC8112e3 : this.vip) {
                    if (abstractC8112e3.license != this) {
                        abstractC8112e3.license = this;
                        abstractC8112e3.license(this, abstractC8112e3.vip);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(ArrayList arrayList) {
        synchronized (this.metrica) {
            try {
                InterfaceC6882e interfaceC6882e = this.ad;
                if (interfaceC6882e != null) {
                    interfaceC6882e.ad(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
