package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C15499e implements ComponentCallbacks2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30616e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30617e;

    public /* synthetic */ ComponentCallbacks2C15499e(int i, Object obj) {
        this.f30617e = i;
        this.f30616e = obj;
    }

    private final void ad(Configuration configuration) {
    }

    private final void vip() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.f30617e) {
            case 0:
                return;
            default:
                C12344e c12344e = (C12344e) this.f30616e;
                synchronized (c12344e) {
                    if (((C0624e) ((WeakReference) c12344e.f24749e).get()) == null) {
                        c12344e.ads();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.f30617e) {
            case 0:
                return;
            default:
                onTrimMemory(80);
                return;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C4421e license;
        switch (this.f30617e) {
            case 0:
                if (i >= 40) {
                    C4446e.license((C4446e) this.f30616e);
                    return;
                }
                return;
            default:
                C12344e c12344e = (C12344e) this.f30616e;
                synchronized (c12344e) {
                    try {
                        C0624e c0624e = (C0624e) ((WeakReference) c12344e.f24749e).get();
                        if (c0624e != null) {
                            C11307e c11307e = c0624e.ad;
                            if (i >= 40) {
                                C4421e license2 = c0624e.license();
                                if (license2 != null) {
                                    license2.ad();
                                }
                            } else if (i >= 20) {
                                ((C10733e) c12344e.f24751e).ad(c11307e.ad);
                            } else if (i >= 10 && (license = c0624e.license()) != null) {
                                license.purchase(license.metrica() / 2);
                            }
                        } else {
                            c12344e.ads();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
