package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۠ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4421e {
    public final C7699e ad;
    public final Object metrica = new Object();
    public final C13572e vip;

    public C4421e(C7699e c7699e, C13572e c13572e) {
        this.ad = c7699e;
        this.vip = c13572e;
    }

    public final void ad() {
        synchronized (this.metrica) {
            ((C18524e) this.ad.f15623e).billing(-1L);
            C13572e c13572e = this.vip;
            c13572e.f26879e = 0;
            ((LinkedHashMap) c13572e.f26878e).clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void appmetrica(long j) {
        synchronized (this.metrica) {
            C18524e c18524e = (C18524e) this.ad.f15623e;
            c18524e.f36318e = j;
            c18524e.billing(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void license(C15695e c15695e) {
        synchronized (this.metrica) {
            C18524e c18524e = (C18524e) this.ad.f15623e;
            Object remove = ((LinkedHashMap) c18524e.f36317e).remove(c15695e);
            if (remove != null) {
                c18524e.f36319e = c18524e.license() - c18524e.purchase(c15695e, remove);
                c18524e.metrica(c15695e, remove, null);
            }
            if (remove != null) {
            }
            if (((LinkedHashMap) this.vip.f26878e).remove(c15695e) != null) {
            }
        }
    }

    public final long metrica() {
        long license;
        synchronized (this.metrica) {
            license = ((C18524e) this.ad.f15623e).license();
        }
        return license;
    }

    public final void purchase(long j) {
        synchronized (this.metrica) {
            ((C18524e) this.ad.f15623e).billing(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final C4123e vip(C15695e c15695e) {
        C4123e c4123e;
        synchronized (this.metrica) {
            try {
                C8732e c8732e = (C8732e) ((LinkedHashMap) ((C18524e) this.ad.f15623e).f36317e).get(c15695e);
                C4123e c4123e2 = null;
                c4123e = c8732e != null ? new C4123e(c8732e.ad, c8732e.vip) : null;
                if (c4123e == null) {
                    C13572e c13572e = this.vip;
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) c13572e.f26878e).get(c15695e);
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            C3120e c3120e = (C3120e) arrayList.get(i);
                            InterfaceC4082e interfaceC4082e = (InterfaceC4082e) c3120e.ad.get();
                            C4123e c4123e3 = interfaceC4082e != null ? new C4123e(interfaceC4082e, c3120e.vip) : null;
                            if (c4123e3 != null) {
                                c4123e2 = c4123e3;
                                break;
                            }
                            i++;
                        }
                        c13572e.startapp();
                    }
                    c4123e = c4123e2;
                }
                if (c4123e != null && !c4123e.ad.purchase()) {
                    license(c15695e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4123e;
    }
}
