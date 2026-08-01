package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4455e {
    public final C10775e ad;

    public AbstractC4455e(Function0 function0) {
        this.ad = new C10775e(function0);
    }

    public abstract C14815e ad(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC6502e metrica(C14815e c14815e, InterfaceC6502e interfaceC6502e) {
        C8777e c8777e = null;
        if (interfaceC6502e instanceof C8777e) {
            if (c14815e.f29339e) {
                c8777e = (C8777e) interfaceC6502e;
                c8777e.ad.setValue(c14815e.metrica());
            }
        } else if (interfaceC6502e instanceof C14448e) {
            if ((c14815e.f29337e || c14815e.f29338e != null) && !c14815e.f29339e) {
                C14448e c14448e = (C14448e) interfaceC6502e;
                if (AbstractC7890e.billing(c14815e.metrica(), c14448e.ad)) {
                    c8777e = c14448e;
                }
            }
        } else if (interfaceC6502e instanceof C4779e) {
            c14815e.getClass();
        }
        if (c8777e != null) {
            return c8777e;
        }
        if (!c14815e.f29339e) {
            return new C14448e(c14815e.metrica());
        }
        Object obj = c14815e.f29338e;
        InterfaceC1589e interfaceC1589e = (InterfaceC1589e) c14815e.f29340e;
        if (interfaceC1589e == null) {
            interfaceC1589e = C12575e.f25232e;
        }
        return new C8777e(new C0576e(obj, interfaceC1589e));
    }

    public InterfaceC6502e vip() {
        return this.ad;
    }
}
