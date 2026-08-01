package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9963e {
    public final C11980e ad;
    public final C9271e license;
    public final C6029e metrica;
    public C11467e vip;

    public C9963e() {
        C11980e c11980e = new C11980e(23);
        this.ad = c11980e;
        this.vip = ((C11467e) c11980e.f23949e).m3217protected();
        this.metrica = new C6029e((byte) 0, 12);
        this.license = new C9271e();
        final int i = 1;
        Callable callable = new Callable(this) { // from class: eؔۨ۠
            public final /* synthetic */ C9963e vip;

            {
                this.vip = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new C6021e(this.vip.metrica);
                    default:
                        return new C6021e(this.vip.license);
                }
            }
        };
        C7850e c7850e = (C7850e) c11980e.f23948e;
        ((HashMap) c7850e.f15896e).put("internal.registerCallback", callable);
        final int i2 = 0;
        ((HashMap) c7850e.f15896e).put("internal.eventLogger", new Callable(this) { // from class: eؔۨ۠
            public final /* synthetic */ C9963e vip;

            {
                this.vip = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i2) {
                    case 0:
                        return new C6021e(this.vip.metrica);
                    default:
                        return new C6021e(this.vip.license);
                }
            }
        });
    }

    public final boolean ad(C6354e c6354e) {
        C6029e c6029e = this.metrica;
        try {
            c6029e.f12699e = c6354e;
            c6029e.f12698e = c6354e.clone();
            ((ArrayList) c6029e.f12700e).clear();
            ((C11467e) this.ad.f23951e).m3211default("runtime.counter", new C6020e(Double.valueOf(0.0d)));
            this.license.metrica(this.vip.m3217protected(), c6029e);
            if (((C6354e) c6029e.f12698e).equals((C6354e) c6029e.f12699e)) {
                return !((ArrayList) c6029e.f12700e).isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final void vip(C17226e c17226e) {
        AbstractC10200e abstractC10200e;
        try {
            C11980e c11980e = this.ad;
            this.vip = ((C11467e) c11980e.f23949e).m3217protected();
            if (c11980e.m3296import(this.vip, (C7298e[]) c17226e.signatures().toArray(new C7298e[0])) instanceof C8466e) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C18154e c18154e : c17226e.tapsense().signatures()) {
                List tapsense = c18154e.tapsense();
                String signatures = c18154e.signatures();
                Iterator it = tapsense.iterator();
                while (it.hasNext()) {
                    InterfaceC2268e m3296import = c11980e.m3296import(this.vip, (C7298e) it.next());
                    if (!(m3296import instanceof C18357e)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C11467e c11467e = this.vip;
                    if (c11467e.m3207abstract(signatures)) {
                        InterfaceC2268e m3209case = c11467e.m3209case(signatures);
                        if (!(m3209case instanceof AbstractC10200e)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(signatures)));
                        }
                        abstractC10200e = (AbstractC10200e) m3209case;
                    } else {
                        abstractC10200e = null;
                    }
                    if (abstractC10200e == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(signatures)));
                    }
                    abstractC10200e.ad(this.vip, Collections.singletonList(m3296import));
                }
            }
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
